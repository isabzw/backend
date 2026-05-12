import javax.swing.*;

void main() {
    // 1. CONFIGURAÇÃO DA JANELA PRINCIPAL
    JFrame janela = new JFrame("cadastrar");
    janela.setSize(800, 500);
    janela.setLayout(null);

    // 2. CRIAÇÃO DOS COMPONENTES DE INTERFACE (NOME)
    JLabel labelproduto = new JLabel("Nome:");
    labelproduto.setBounds(200, 60, 400, 48); //
    JTextField inputProduto = new JTextField();
    inputProduto.setBounds(200, 90, 400, 40);

    // 3. COMPONENTES DE PREÇO
    JLabel labelPreco = new JLabel("Preço");
    labelPreco.setBounds(200, 130, 150, 48);
    JTextField inputpreco = new JTextField();
    inputpreco.setBounds(200, 160, 400, 40);

    // 4. COMPONENTES DE QUANTIDADE
    JLabel labelQuantidade = new JLabel("Quantidade");
    labelQuantidade.setBounds(200, 200, 150, 48);
    JTextField inputquantidade = new JTextField();
    inputquantidade.setBounds(200, 230, 400, 40);

    // 5. BOTÃO CADASTRAR E LÓGICA DE VALIDAÇÃO
    JButton botaoCadastrar = new JButton("Cadastrar");
    botaoCadastrar.setBounds(200, 300, 150, 40);

    botaoCadastrar.addActionListener(e -> {
        // Verifica se algum campo está vazio
        if ("".equals(inputProduto.getText()) || "".equals(inputpreco.getText()) || "".equals(inputquantidade.getText())) {
            JOptionPane.showMessageDialog(null, "Preencha os campos.");
        }
        // Converte o texto para número e verifica se são positivos
        else if (Double.parseDouble(inputpreco.getText()) <= 0 || Integer.parseInt(inputquantidade.getText()) <= 0) {
            JOptionPane.showMessageDialog(null, "Quantidade e preço devem ser maiores que zero. ");
        }
        // Exibir os dados
        else {
            JOptionPane.showMessageDialog(null,
                    "Nome: Mouse\n" +
                            "Preço: R$ 50.00\n" +
                            "Quantidade: 8\n" +
                            "Valor total em estoque: R$ 400.00\n " +
                            "Cadastrado com sucesso!");
        }
    });

    // 6. BOTÃO LIMPAR
    JButton botaoLimpar = new JButton("Limpar");
    botaoLimpar.setBounds(400, 300, 150, 40);

    // Define a ação de apagar o texto
    botaoLimpar.addActionListener(e -> {
        inputpreco.setText("");
        inputquantidade.setText("");
        inputProduto.setText("");
    });

    // 7. ADICIONANDO COMPONENTES NA JANELA
    janela.add(labelproduto);
    janela.add(inputProduto);
    janela.add(labelPreco);
    janela.add(inputpreco);
    janela.add(labelQuantidade);
    janela.add(inputquantidade);
    janela.add(botaoCadastrar);
    janela.add(botaoLimpar);

    // 8. TORNAR VISÍVEL
    janela.setVisible(true);
}