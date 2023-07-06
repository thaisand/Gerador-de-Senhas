import java.security.SecureRandom;

public class Gerador {
    private static final String LETRAS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMEROS = "0123456789";
    private static final String SIMBOLOS = "!@#$%^&*()-_=+[]{}|;:,.<>?";

    public static String gerarSenha(int comprimento, boolean usarLetras, boolean usarNumeros, boolean usarSimbolos) {
        StringBuilder caracteres = new StringBuilder();
        if (usarLetras) {
            caracteres.append(LETRAS);
        }
        if (usarNumeros) {
            caracteres.append(NUMEROS);
        }
        if (usarSimbolos) {
            caracteres.append(SIMBOLOS);
        }

        SecureRandom random = new SecureRandom();
        StringBuilder senha = new StringBuilder(comprimento);
        for (int i = 0; i < comprimento; i++) {
            int index = random.nextInt(caracteres.length());
            senha.append(caracteres.charAt(index));
        }

        return senha.toString();
    }

    public static void main(String[] args) {
        int comprimento = 8;
        boolean usarLetras = true;
        boolean usarNumeros = true;
        boolean usarSimbolos = true;

        String senhaGerada = gerarSenha(comprimento, usarLetras, usarNumeros, usarSimbolos);
        System.out.println("Senha gerada: " + senhaGerada);
    }
}
