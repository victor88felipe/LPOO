package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private static Conexao conexao;
    public static Conexao getlnstance() { 
        if (conexao == null) {

            conexao = new Conexao();
        }

    return conexao;

    }
 
public Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");

        
        //Trocar localhost pelo IP do servidor MySql:192.168.3.65
        //Trocar o nome do banco de acordo com o banco criado: seu_nomeAPOO
return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/cadastroaula", "root", "");
}

public static void main(String[]args) { 
    try {

        System.out.println(getlnstance().getConnection());

        } catch (Exception e) { 
            e.printStackTrace();
        }

    }

}
