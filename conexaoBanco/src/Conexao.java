import java.sql.Connection; //é a função que conecta o banco no java/main
import java.sql.DriverManager; //conecta com o banco
import java.sql.SQLException; //evita erro no mysql

public class Conexao {
    //endereço do banco / ligando o main ao mysql (banco)

    private static final String URL = "jdbc:mysql://localhost:3306/forms";
    private static final String USUARIO = "root";
    private static final String SENHA = "root";

    public static Connection conectar(){
        try {
            return DriverManager.getConnection(URL,USUARIO,SENHA);
        } catch (SQLException e){
            throw new RuntimeException("Erro ao consultar o banco" + e.getMessage()); //exceção CASO aconteça
        }
    }

}