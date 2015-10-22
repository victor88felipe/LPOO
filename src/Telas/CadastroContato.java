/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import DAO.ContatoDAO;
import DTO.ContatoDTO;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author uliwe_000
 */
public class CadastroContato extends javax.swing.JFrame {
private ContatoDTO contato;
private RelatorioContato relatoriosContato;
    /**
     * Creates new form contatoFrame
     */
    public CadastroContato() {
        initComponents();
    }
    public CadastroContato(RelatorioContato relatoriosContato, ContatoDTO c) {
        this();
        
        this.relatoriosContato = relatoriosContato;
        this.contato = c;
        
        

    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelTitulo = new javax.swing.JPanel();
        tituloLabel = new javax.swing.JLabel();
        painelFormulario = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nomeContato = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        enderecoContato = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        telefoneContato = new javax.swing.JTextField(40);
        jLabel4 = new javax.swing.JLabel();
        emailContato = new javax.swing.JTextField();
        painelBotoes = new javax.swing.JPanel();
        botaoSalvar = new javax.swing.JButton();
        botaoLimpar = new javax.swing.JButton();
        botaoFechar = new javax.swing.JButton();
        barra = new javax.swing.JMenuBar();
        menuCadastro = new javax.swing.JMenu();
        cadastroNovo = new javax.swing.JMenuItem();
        cadastroSalvar = new javax.swing.JMenuItem();
        cadastroFechar = new javax.swing.JMenuItem();
        menuAgenda = new javax.swing.JMenu();
        novaAgenda = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        relatorioContato = new javax.swing.JMenuItem();
        ajudaAjuda = new javax.swing.JMenu();
        menuSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(530, 260));
        setSize(new java.awt.Dimension(500, 300));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        tituloLabel.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        tituloLabel.setText("Cadastro de Contatos");
        painelTitulo.add(tituloLabel);

        getContentPane().add(painelTitulo, java.awt.BorderLayout.NORTH);

        painelFormulario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Preencha", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 0, 10))); // NOI18N
        painelFormulario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        painelFormulario.setInheritsPopupMenu(true);
        painelFormulario.setMinimumSize(new java.awt.Dimension(400, 120));
        painelFormulario.setSize(100,100);
        painelFormulario.setName(""); // NOI18N
        painelFormulario.setPreferredSize(new java.awt.Dimension(400, 120));
        painelFormulario.setLayout(new java.awt.GridLayout(4, 2, 0, 10));

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Nome");
        painelFormulario.add(jLabel1);

        nomeContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeContatoActionPerformed(evt);
            }
        });
        painelFormulario.add(nomeContato);

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Endereço");
        painelFormulario.add(jLabel2);
        painelFormulario.add(enderecoContato);

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Telefone");
        painelFormulario.add(jLabel3);

        telefoneContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefoneContatoActionPerformed(evt);
            }
        });
        painelFormulario.add(telefoneContato);

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("E-Mail");
        jLabel4.setToolTipText("");
        painelFormulario.add(jLabel4);

        emailContato.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        emailContato.setPreferredSize(new java.awt.Dimension(6, 10));
        emailContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailContatoActionPerformed(evt);
            }
        });
        painelFormulario.add(emailContato);

        getContentPane().add(painelFormulario, java.awt.BorderLayout.CENTER);

        painelBotoes.setMinimumSize(new java.awt.Dimension(400, 50));
        painelBotoes.setPreferredSize(new java.awt.Dimension(530, 60));

        botaoSalvar.setText("Salvar");
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });
        painelBotoes.add(botaoSalvar);

        botaoLimpar.setText("Limpar");
        botaoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparActionPerformed(evt);
            }
        });
        painelBotoes.add(botaoLimpar);

        botaoFechar.setText("Fechar");
        botaoFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFecharActionPerformed(evt);
            }
        });
        painelBotoes.add(botaoFechar);

        getContentPane().add(painelBotoes, java.awt.BorderLayout.SOUTH);

        menuCadastro.setText("Cadastro");

        cadastroNovo.setText("Novo");
        cadastroNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroNovoActionPerformed(evt);
            }
        });
        menuCadastro.add(cadastroNovo);

        cadastroSalvar.setText("Salvar");
        cadastroSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroSalvarActionPerformed(evt);
            }
        });
        menuCadastro.add(cadastroSalvar);

        cadastroFechar.setText("Fachar");
        cadastroFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroFecharActionPerformed(evt);
            }
        });
        menuCadastro.add(cadastroFechar);

        barra.add(menuCadastro);

        menuAgenda.setText("Agenda");

        novaAgenda.setText("Nova Agenda");
        novaAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novaAgendaActionPerformed(evt);
            }
        });
        menuAgenda.add(novaAgenda);

        barra.add(menuAgenda);

        jMenu1.setText("Relatórios");

        relatorioContato.setText("Contato");
        relatorioContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relatorioContatoActionPerformed(evt);
            }
        });
        jMenu1.add(relatorioContato);

        barra.add(jMenu1);

        ajudaAjuda.setText("Ajuda");

        menuSobre.setText("Sobre");
        menuSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSobreActionPerformed(evt);
            }
        });
        ajudaAjuda.add(menuSobre);

        barra.add(ajudaAjuda);

        setJMenuBar(barra);

        setBounds(0, 0, 546, 339);
    }// </editor-fold>//GEN-END:initComponents

    private void cadastroFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroFecharActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_cadastroFecharActionPerformed
    
    private void cadastroNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroNovoActionPerformed
        // TODO add your handling code here:
        nomeContato.setText(""); 
        enderecoContato.setText("");
        telefoneContato.setText("");
        emailContato.setText("");
    }//GEN-LAST:event_cadastroNovoActionPerformed

    private void nomeContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeContatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeContatoActionPerformed

    private void emailContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailContatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailContatoActionPerformed

    private void cadastroSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroSalvarActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_cadastroSalvarActionPerformed

    private void novaAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novaAgendaActionPerformed
        // TODO add your handling code here:
        CadastroAgenda agenda = new CadastroAgenda();
        agenda.setVisible(true);
    }//GEN-LAST:event_novaAgendaActionPerformed

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
                    
            
        String nome = nomeContato.getText();
        String endereco = enderecoContato.getText();
        String telefone = telefoneContato.getText(); 
        String email = emailContato.getText(); 

            ContatoDTO contatoDTO = new ContatoDTO(); 
            ContatoDAO contatoDAO = new ContatoDAO();

                    ContatoDTO c = this.contato;
        

         if (this.contato == null) {
            System.out.println("Salvar aqui");
            contatoDTO.setNomeContato(nome);
            contatoDTO.setEnderecoContato(endereco);
            contatoDTO.setTelefoneContato(telefone);
            contatoDTO.setEmailContato(email);

//            contatoDAO.inserir(contatoDTO);
            JOptionPane.showMessageDialog(null, "Cadastro Salvo com sucesso", "Cadastro", JOptionPane.PLAIN_MESSAGE);
            limpaCampos();

        } else {
            int idContato = this.contato.getIdContato();
            System.out.println("Atualiza aqui");
            contatoDTO.setNomeContato(nome);
            contatoDTO.setEnderecoContato(endereco);
            contatoDTO.setTelefoneContato(telefone);
            contatoDTO.setEmailContato(email);
            contatoDTO.setIdContato(idContato);

            contatoDAO.atualizar(contatoDTO);
            JOptionPane.showMessageDialog(null, 
                    "Cadastro Atualizado com sucesso", 
                    "Alualizar", JOptionPane.PLAIN_MESSAGE);
            dispose();
       

            
        }           
            
            
            
            
    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void menuSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSobreActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Sistema de Cadastro Agenda", "Sobre", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_menuSobreActionPerformed

    private void botaoFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoFecharActionPerformed
        // TODO add your handling code here:
        
        System.exit(0);
    }//GEN-LAST:event_botaoFecharActionPerformed

    private void telefoneContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefoneContatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefoneContatoActionPerformed

    private void botaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparActionPerformed
        // TODO add your handling code here:
        limpaCampos();

    }//GEN-LAST:event_botaoLimparActionPerformed

    private void relatorioContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relatorioContatoActionPerformed
        // TODO add your handling code here:
        RelatorioContato telaRelatorio = new RelatorioContato(this);
        telaRelatorio.setVisible(true);
    }//GEN-LAST:event_relatorioContatoActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        if (this.contato != null) {
            carregarProdutoNosCampos();
        }
    }//GEN-LAST:event_formWindowActivated

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroContato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroContato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroContato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroContato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroContato().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu ajudaAjuda;
    private javax.swing.JMenuBar barra;
    private javax.swing.JButton botaoFechar;
    private javax.swing.JButton botaoLimpar;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JMenuItem cadastroFechar;
    private javax.swing.JMenuItem cadastroNovo;
    private javax.swing.JMenuItem cadastroSalvar;
    private javax.swing.JTextField emailContato;
    private javax.swing.JTextField enderecoContato;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu menuAgenda;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenuItem menuSobre;
    public javax.swing.JTextField nomeContato;
    private javax.swing.JMenuItem novaAgenda;
    private javax.swing.JPanel painelBotoes;
    private javax.swing.JPanel painelFormulario;
    private javax.swing.JPanel painelTitulo;
    private javax.swing.JMenuItem relatorioContato;
    private javax.swing.JTextField telefoneContato;
    private javax.swing.JLabel tituloLabel;
    // End of variables declaration//GEN-END:variables
    private int idContato;
    private void carregarProdutoNosCampos() {
        
        int idContato = this.contato.getIdContato();  
        nomeContato.setText(this.contato.getNomeContato());
        enderecoContato.setText(this.contato.getEnderecoContato()+"");
        telefoneContato.setText(this.contato.getTelefoneContato()+"");
        emailContato.setText(this.contato.getEmailContato());
               
    }
   private void limpaCampos(){
        nomeContato.setText("");
        enderecoContato.setText("");
        telefoneContato.setText("");
        emailContato.setText("");      
       
   }

}
