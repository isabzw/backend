import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;

void main(){

    //nome
    //criar janela
    JFrame tela = new JFrame("Tela de cadastro");
    //tamanho
    tela.setSize(500,400);
    tela.setLayout(null);

    //definir o texto
    JLabel labelNome = new JLabel("Nome");
    labelNome.setBounds(20,50,150,40);
    tela.add(labelNome);

    JTextField nome = new JTextField();
    nome.setBounds(20,80,250,40);
    tela.add(nome);

    //email
    JLabel labelEmail = new JLabel("Email");
    labelEmail.setBounds(20,120,150,40);
    tela.add(labelEmail);

    JTextField email = new JTextField();
    email.setBounds(20,150,250,40);
    tela.add(email);

    //botão enviar
    JButton enviar = new JButton("Enviar");
    enviar.setBounds(80,200,150,40);
    tela.add(enviar);

    //
    enviar.addActionListener(e ->{
        String sql = "INSERT INTO usuario (nome,email) VALUES (?,?)";
        //pegar a variável que o usuário digitou
        String nomeCompleto = nome.getText();
        String emailUser = email.getText();

        try { //preparando conexão
            PreparedStatement ps = Conexao.conectar().prepareStatement(sql);

            ps.setString(1,nomeCompleto);
            ps.setString(2,emailUser);
            ps.executeUpdate();

            JOptionPane.showMessageDialog(null,"Usuário salvo com sucesso!");
            ps.close();

            //conexão com o banco

        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    });
    //mostrar o que foi escrito
    tela.setVisible(true);
}