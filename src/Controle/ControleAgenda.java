
package Controle;

import DAO.AgendaDAO;
import DTO.AgendaDTO;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class ControleAgenda {
    
    public boolean cadastrar(AgendaDTO agendas){
       
        boolean result = false;
        System.out.println(agendas);
        if(agendas!= null && agendas.getNomeAgenda().length()>0){
        AgendaDAO agendaDAO= new AgendaDAO();
        
            agendaDAO.inserir(agendas);
            JOptionPane.showMessageDialog(null,
                    "Cadastro salvo com sucesso",
                    "Cadastro", JOptionPane.PLAIN_MESSAGE);
            System.out.println(agendas.toString());
            
            result =true;
        }else{
            System.out.println("Falta dados");
        }
        return result;
    }
    
}
