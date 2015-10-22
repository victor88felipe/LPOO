/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.ContatoDTO;
import DAO.Conexao;
import DTO.AgendaDTO;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author uliwe_000
 */
public class ContatoDAO {
    public void inserir(ContatoDTO contatoDTO, int agenda) { 
        try {

            Connection connection = Conexao.getlnstance().getConnection();

            String sql = "INSERT INTO tb_contato("
                    + "idContato, "
                    + "nomeContato, "
                    + "enderecoContato, "
                    + "telefoneContato, "
                    + "emailContato, "
                    + "idAgenda)"
                    + "VALUES(?, ?, ?, ?, ?, ?)";

            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setInt(1, contatoDTO.getIdContato()) ; 
            statement.setString(2, contatoDTO.getNomeContato());
            statement.setString(3, contatoDTO.getEnderecoContato());
            statement.setString(4, contatoDTO.getTelefoneContato());
            statement.setString(5, contatoDTO.getEmailContato());
            statement.setInt(6, agenda);
            statement.execute(); 
            connection.close();
            System.out.println("Cadastro Feito");
            System.out.println(contatoDTO+" ID:  "+agenda);

            } catch (Exception e){ 
                e.printStackTrace();
            }

    }

   public void remover(int idContato) { 
    try {

            Connection connection = Conexao.getlnstance().getConnection();

            String sql = "DELETE FROM tb_contato WHERE idContato = ?";

            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setInt(1, idContato);

            statement.execute(); 
            statement.close () ;
            System.out.println("Excluido");

    } catch (Exception e) { 
        e.printStackTrace();

    }
}
public List<ContatoDTO> listarBusca(String contato){
   List<ContatoDTO> ListarBusca = new ArrayList<ContatoDTO>(); 
   try {
       // ContatoDTO contatoDTO = new ContatoDTO();
        Connection connection = Conexao.getlnstance().getConnection();
        String sql = "SELECT * FROM tb_contato WHERE nomeContato LIKE ?";

    PreparedStatement statement = connection.prepareStatement(sql);
    statement.setString(1, '%'+contato+'%');
    System.out.println(statement);
   
    ResultSet resultset = statement.executeQuery();

        while(resultset.next()) {

        ContatoDTO contatoDTO = new ContatoDTO();

        contatoDTO.setIdContato(resultset.getInt("idContato")); 
        contatoDTO.setNomeContato(resultset.getString("nomeContato"));
        contatoDTO.setEnderecoContato(resultset.getString("enderecoContato"));
        contatoDTO.setTelefoneContato(resultset.getString("telefoneContato"));
        contatoDTO.setEmailContato(resultset.getString("emailContato"));        
        contatoDTO.setIdAgenda(resultset.getInt("idAgenda"));
        
        ListarBusca.add(contatoDTO) ;
        System.out.println(ListarBusca+"\n");
        }
        connection.close() ;       
   } catch (Exception e) { 
        e.printStackTrace();

    }
        return ListarBusca;
}
   
public List<ContatoDTO> listarTodos() {

List<ContatoDTO> ListaContato = new ArrayList<ContatoDTO>(); 
try {

        Connection connection = Conexao.getlnstance().getConnection();
        String sql = "SELECT * FROM tb_contato";

    PreparedStatement statement = connection.prepareStatement(sql);

    ResultSet resultset = statement.executeQuery();

        while(resultset.next()) {

        ContatoDTO contatoDTO = new ContatoDTO();
            

        contatoDTO.setIdContato(resultset.getInt("idContato")); 
        contatoDTO.setNomeContato(resultset.getString("nomeContato"));
        contatoDTO.setEnderecoContato(resultset.getString("enderecoContato"));
        contatoDTO.setTelefoneContato(resultset.getString("telefoneContato"));
        contatoDTO.setEmailContato(resultset.getString("emailContato"));        
        contatoDTO.setIdAgenda(resultset.getInt("idAgenda"));
                
        ListaContato.add(contatoDTO) ;
        //System.out.println(contatoDTO);
        }
        connection.close() ;
    } catch (Exception e) { 
        e.printStackTrace();

    }
        return ListaContato;
}    
    
    
public void atualizar(ContatoDTO contatoDTO) { 
    try {
        
        int index = listarTodos().indexOf(contatoDTO);
        //listarTodos().set(index, contatoDTO);

        Connection connection = Conexao.getlnstance().getConnection();

        String sql = "UPDATE tb_contato SET "
                + "nomeContato = ?, "
                + "enderecoContato = ?, "
                + "telefoneContato = ?, "
                + "emailContato = ?, "
                + "idAgenda = ? "
                + "WHERE idContato = ?";

        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setString(1, contatoDTO.getNomeContato()); 
        statement.setString(2, contatoDTO.getEnderecoContato());
        statement.setString(3, contatoDTO.getTelefoneContato());
        statement.setString(4, contatoDTO.getEmailContato());
        statement.setInt(5, contatoDTO.getIdAgenda());
        statement.setInt(6, contatoDTO.getIdContato());

statement.execute(); 

statement.close();
System.out.println(contatoDTO);

    } catch(Exception e) {
       e.printStackTrace ();
    }

}
    
    
//// 
//    public static void main(String[] args) {
//        ContatoDTO contatoDTO = new ContatoDTO(); 
//        ContatoDAO contatoDAO = new ContatoDAO();
//    //
//    //  Inserindo:
//        contatoDTO.setIdContato(1);
//        contatoDTO.setNomeContato("Ulisess Weyl Costa");
//        contatoDTO.setEnderecoContato("Casa do Weyl");
//        contatoDTO.setTelefoneContato("(00) 0000-0000");
//        contatoDTO.setEmailContato("ulissesweyl@gmail.com");
//    //  chamando metodo de Cadastro
//    //            contatoDAO.inserir(contatoDTO);
//    //            
//    //  Chamanddo Método para Atualizar Contato
//    //            contatoDAO.atualizar(contatoDTO);
//        
//    //  contatoDAO.remover(1);
//    //  Lista os valores
//    //            List<ContatoDTO> listaContato = new ArrayList<>();
//    //
//    //            listaContato = contatoDAO.listarTodos();
//    //
//    //            for(int i = 0; i < listaContato.size (); i++){ 
//    //                System.out.println(listaContato.get(i));
//    //
//    //            }
//
//
//    }


    
}
