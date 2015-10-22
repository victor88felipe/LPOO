package Controle;

import DAO.ContatoDAO;
import DTO.ContatoDTO;
import java.util.ArrayList;
import java.util.List;

public class ContoleContato {
    
    public List<ContatoDTO> loadContatos(String nome) {
        
        ContatoDAO contatoDAO =  new ContatoDAO();
        
        List<ContatoDTO> listaContato = new ArrayList<>();
        listaContato = contatoDAO.listarBusca(nome);
        
        return listaContato;
            }

    public boolean cadastrarContato(ContatoDTO c, int codigo){
        
        boolean result = false;
        ContatoDAO contatoDAO = new ContatoDAO();
        if (c != null && c.getNomeContato().length() > 0
                && c.getEnderecoContato().length() > 0
                && c.getEmailContato().length() > 0
                && c.getTelefoneContato().length() > 0){
            
            // SETA CODIGO VALIDO
            contatoDAO.inserir(c, codigo);
            
            System.out.println(c.toString());
            
            result = true;
        }
        
    }










}

