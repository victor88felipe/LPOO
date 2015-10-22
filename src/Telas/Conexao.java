/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author uliwe_000
 */
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

return DriverManager.getConnection("jdbc:mysql://192.168.3.65:3306/cadastroaula", "root", "root");
}

public static void main(String[]args) { 
    try {

        System.out.println(getlnstance().getConnection());

        } catch (Exception e) { 
            e.printStackTrace();

        }

    }

}
