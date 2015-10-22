package DAO;

import DTO.AgendaDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AgendaDAO {
    public void inserir(AgendaDTO agendaDTO){
        try {
            Connection connection = Conexao.getlnstance().getConnection();
            
            String sql = "INSERT INTO tb_agenda (idAgenda, "
                    + "nomeAgenda) "
                    + "VALUES (?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, agendaDTO.getIdAgenda());
            statement.setString(2, agendaDTO.getNomeAgenda());
            statement.execute();
            System.out.println("Cadastro Realizado");
            connection.close();
            
            } catch (Exception e){ 
                e.printStackTrace();
            }
        
    }
    
        public void atualizar(AgendaDTO agendaDTO){
        try {
            Connection connection = Conexao.getlnstance().getConnection();
            
            String sql = "UPDATE tb_agenda SET nomeAgenda = ? WHERE idAgenda = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, agendaDTO.getNomeAgenda());
            statement.setInt(2, agendaDTO.getIdAgenda());
            statement.execute();
            System.out.println("Cadastro atualizado");
            connection.close();
            
            } catch (Exception e){ 
                e.printStackTrace();
            }
        
    }
    
    public void remover(int idAgenda){
        try{
        Connection connection = Conexao.getlnstance().getConnection();
        String sql = "DELETE FROM tb_agenda WHERE idAgenda = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, idAgenda);
        statement.execute();
            System.out.println("Agenda "+idAgenda+" Excluida");
        connection.close();
        } catch(Exception e) {
            e.printStackTrace();
            
        }
    }
    
        public List<AgendaDTO> pegacombo(int idAgenda){
        List<AgendaDTO> ListaCombo = new ArrayList<>();
        try{
        Connection connection = Conexao.getlnstance().getConnection();
        String sql = "SELECT * FROM tb_agenda WHERE idAgenda = ?";
        //PreparedStatement statement = connection.prepareStatement(sql);
        

    PreparedStatement statement = connection.prepareStatement(sql);
    statement.setInt(1, idAgenda);
    ResultSet resultset = statement.executeQuery();

        while(resultset.next()) {

        AgendaDTO agendaDTO = new AgendaDTO();

        agendaDTO.setIdAgenda(resultset.getInt("idAgenda")); 
        agendaDTO.setNomeAgenda(resultset.getString("nomeAgenda"));
       

        ListaCombo.add(agendaDTO) ;

        }
        connection.close();
        
        
        } catch(Exception e) {
            e.printStackTrace();
            
        }
        return ListaCombo;
    }
    
    public List<AgendaDTO> listarAgendas() {

    List<AgendaDTO> ListaAgenda = new ArrayList<>(); 
    try {

        Connection connection = Conexao.getlnstance().getConnection();
        String sql = "SELECT * FROM tb_agenda";

    PreparedStatement statement = connection.prepareStatement(sql);

    ResultSet resultset = statement.executeQuery();

        while(resultset.next()) {

        AgendaDTO agendaDTO = new AgendaDTO();

        agendaDTO.setIdAgenda(resultset.getInt("idAgenda")); 
        agendaDTO.setNomeAgenda(resultset.getString("nomeAgenda"));
       

        ListaAgenda.add(agendaDTO) ;

        }
        connection.close() ;
    } catch (Exception e) { 
        e.printStackTrace();

    }
    return ListaAgenda;
}    
}