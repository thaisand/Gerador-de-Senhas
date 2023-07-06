import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GeradorGUI extends JFrame {
    private JTextField comprimentoTextField;
    private JCheckBox letrasCheckBox;
    private JCheckBox numerosCheckBox;
    private JCheckBox simbolosCheckBox;
    private JButton gerarButton;
    private JTextArea senhaTextArea;

    public GeradorGUI() {
        setTitle("Gerador de Senhas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setResizable(false);

        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = GridBagConstraints.RELATIVE;
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(5, 5, 5, 5);

        JLabel comprimentoLabel = new JLabel("Comprimento:");
        comprimentoTextField = new JTextField(10);

        JLabel caracteresLabel = new JLabel("Caracteres:");
        letrasCheckBox = new JCheckBox("Letras");
        numerosCheckBox = new JCheckBox("Números");
        simbolosCheckBox = new JCheckBox("Símbolos");

        gerarButton = new JButton("Gerar");
        senhaTextArea = new JTextArea(4, 20);
        senhaTextArea.setEditable(false);

        gerarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                gerarSenha();
            }
        });

        panel.add(comprimentoLabel, constraints);
        panel.add(comprimentoTextField, constraints);
        panel.add(caracteresLabel, constraints);
        panel.add(letrasCheckBox, constraints);
        panel.add(numerosCheckBox, constraints);
        panel.add(simbolosCheckBox, constraints);
        panel.add(gerarButton, constraints);

        add(panel, BorderLayout.NORTH);
        add(new JScrollPane(senhaTextArea), BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void gerarSenha() {
        int comprimento = Integer.parseInt(comprimentoTextField.getText());
        boolean usarLetras = letrasCheckBox.isSelected();
        boolean usarNumeros = numerosCheckBox.isSelected();
        boolean usarSimbolos = simbolosCheckBox.isSelected();

        String senhaGerada = gerarSenhaAleatoria(comprimento, usarLetras, usarNumeros, usarSimbolos);
        senhaTextArea.setText(senhaGerada);
    }

    private String gerarSenhaAleatoria(int comprimento, boolean usarLetras, boolean usarNumeros, boolean usarSimbolos) {
        StringBuilder caracteres = new StringBuilder();
        if (usarLetras) {
            caracteres.append("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ");
        }
        if (usarNumeros) {
            caracteres.append("0123456789");
        }
        if (usarSimbolos) {
            caracteres.append("!@#$%^&*()-_=+[]{}|;:,.<>?");
        }

        StringBuilder senha = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < comprimento; i++) {
            int index = random.nextInt(caracteres.length());
            senha.append(caracteres.charAt(index));
        }

        return senha.toString();
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
               }

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new GeradorGUI();
            }
        });
    }
}
