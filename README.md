# Gerador de Senhas
O projeto consiste em uma aplicação Java de desktop que permite gerar senhas aleatórias com base em critérios definidos pelo usuário, como comprimento da senha e os tipos de caracteres a serem incluídos (letras, números e símbolos).

### Funcionalidades
- Interface gráfica: A aplicação utiliza a biblioteca Swing do Java para criar uma interface gráfica amigável, permitindo ao usuário interagir com a aplicação de forma intuitiva.
- Personalização da senha: O usuário pode definir o comprimento da senha desejada e escolher quais tipos de caracteres serão incluídos na senha (letras, números e símbolos). As opções são apresentadas como caixas de seleção na interface.
- Geração de senha aleatória: Com base nas preferências do usuário, a aplicação utiliza um algoritmo de geração de números aleatórios seguro (SecureRandom) ou um gerador de números aleatórios padrão (Random) para criar uma senha aleatória que atenda aos critérios definidos. A senha gerada é exibida em uma área de texto na interface.

### Uso
Para utilizar a aplicação, siga as seguintes etapas:
1. Execução: Execute o programa GeradorGUI, isso abrirá a interface gráfica da aplicação.
2. Defina as preferências da senha: Na interface, você encontrará um campo de texto para inserir o comprimento desejado da senha. Você também pode selecionar ou desmarcar as caixas de seleção para incluir ou excluir os tipos de caracteres desejados na senha (letras, números e símbolos).
3. Gere a senha: Clique no botão "Gerar" para gerar a senha aleatória com base nas preferências definidas.
4. Visualize a senha gerada: A senha gerada será exibida em uma área de texto na interface. Você pode copiar a senha para a área de transferência ou usar conforme necessário.
5. Repita o processo: Se desejar gerar outra senha, você pode ajustar as preferências e clicar novamente no botão "Gerar".
