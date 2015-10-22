    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author uliwe_000
 */
public class ContatoDTO {
    private int IdContato;
    private String nomeContato;
    private String enderecoContato;
    private String telefoneContato;
    private String emailContato;
    private String buscarContato;
    private int idAgenda;

    public int getIdAgenda() {
        return idAgenda;
    }

    public void setIdAgenda(int idAgenda) {
        this.idAgenda = idAgenda;
    }



//        public ContatoDTO (int IdContato, String nomeContato, String enderecoContato, String telefoneContato, String emailContato) {
//        this.IdContato = IdContato;
//        this.nomeContato = nomeContato;
//        this.enderecoContato = enderecoContato;
//        this.telefoneContato = telefoneContato;
//        this.emailContato = emailContato;
//    }

    public String getBuscarContato() {
        return buscarContato;
    }

    public void setBuscarContato(String buscarContato) {
        this.buscarContato = buscarContato;
    }


    
    
    public int getIdContato() {
        return IdContato;
    }

    public void setIdContato(int IdContato) {
        this.IdContato = IdContato;
    }

    public String getNomeContato() {
        return nomeContato;
    }

    public void setNomeContato(String nomeContato) {
        this.nomeContato = nomeContato;
    }

    public String getEnderecoContato() {
        return enderecoContato;
    }

    public void setEnderecoContato(String enderecoContato) {
        this.enderecoContato = enderecoContato;
    }

    public String getTelefoneContato() {
        return telefoneContato;
    }

    public void setTelefoneContato(String telefoneContato) {
        this.telefoneContato = telefoneContato;
    }

    public String getEmailContato() {
        return emailContato;
    }

    public void setEmailContato(String emailContato) {
        this.emailContato = emailContato;
    }
    
    @Override
    public String toString() {
        String valores = "codigo="+IdContato+
                         ", Nome do Conato="+nomeContato+
                         ", Endereço="+enderecoContato+
                         ", Telefone="+telefoneContato+
                         ", E-Mail="+emailContato+
                         ", Agenda="+idAgenda;
        
        return valores;
    }
}
