/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import DAO.ContatoDAO;
import DTO.ContatoDTO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author uliwe_000
 */
public class RelatorioContato extends javax.swing.JFrame {
    private CadastroContato telaPrincipal;


    /**
     * Creates new form TelaRelatorios
     */
    private RelatorioContato() {
        initComponents();
        
        
        // see more:
        // http://docs.oracle.com/javase/tutorial/uiswing/components/table.html#modelchange
        
        carregarJTable();

        
    }
    
    
    public RelatorioContato(CadastroContato telaPrincipal) {
        this();
        
        this.telaPrincipal = telaPrincipal;
        
        
    }
    
    private void carregarJTable() {
        ContatoDTO contatoDTO = new ContatoDTO(); 
        ContatoDAO contatoDAO = new ContatoDAO();
        
        String buscar = this.buscarContato.getText();
        System.out.println(buscar);
        
        List<ContatoDTO> listaContato = new ArrayList<>();
        listaContato = contatoDAO.listarBusca(buscar);       
        
    
        
        DefaultTableModel modelo = new javax.swing.table.DefaultTableModel();
        modelo.addColumn("Código");
        modelo.addColumn("Nome");
        modelo.addColumn("Endereço");
        modelo.addColumn("Telefone");
        modelo.addColumn("Email");

        if (listaContato.size() == 0) {
            modelo.addRow(new String[]{"Sem dados",
                        null,
                        null,
                        null,
                        null});
        }
        
        for (int i = 0; i < listaContato.size(); i++) {
            ContatoDTO p = listaContato.get(i);
            //System.out.println(p.toString());


            // Alimenta as linhas de dados  
            modelo.addRow(new Object[]{
                        p.getIdContato(),
                        p.getNomeContato(),
                        p.getEnderecoContato()+ "",
                        p.getTelefoneContato()+ "",
                        p.getEmailContato()+ ""});
        }

        tabelaContato.setModel(modelo);

    }

   
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelTitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        painelTabela = new javax.swing.JPanel();
        painelBusca = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        buscarContato = new javax.swing.JTextField();
        botaoBuscarContato = new javax.swing.JButton();
        painelRelatorio = new javax.swing.JPanel();
        scrollTababela = new javax.swing.JScrollPane();
        tabelaContato = new javax.swing.JTable();
        painelBotoes = new javax.swing.JPanel();
        botaoEditarContato = new javax.swing.JButton();
        botaoExcluirContato = new javax.swing.JButton();
        botaoSairRelContato = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel1.setText("Relatório de Contatos");
        PainelTitulo.add(jLabel1);

        getContentPane().add(PainelTitulo, java.awt.BorderLayout.NORTH);

        painelTabela.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Contatos", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 0, 14))); // NOI18N
        painelTabela.setLayout(new java.awt.BorderLayout());

        painelBusca.setLayout(new java.awt.BorderLayout());

        jLabel2.setText("Buscar Contato:");
        painelBusca.add(jLabel2, java.awt.BorderLayout.WEST);

        buscarContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarContatoActionPerformed(evt);
            }
        });
        painelBusca.add(buscarContato, java.awt.BorderLayout.CENTER);

        botaoBuscarContato.setText("Buscar");
        botaoBuscarContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoBuscarContatoActionPerformed(evt);
            }
        });
        painelBusca.add(botaoBuscarContato, java.awt.BorderLayout.LINE_END);

        painelTabela.add(painelBusca, java.awt.BorderLayout.NORTH);

        tabelaContato.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Título 5"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelaContato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabelaContatoMousePressed(evt);
            }
        });
        scrollTababela.setViewportView(tabelaContato);

        javax.swing.GroupLayout painelRelatorioLayout = new javax.swing.GroupLayout(painelRelatorio);
        painelRelatorio.setLayout(painelRelatorioLayout);
        painelRelatorioLayout.setHorizontalGroup(
            painelRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelRelatorioLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(scrollTababela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        painelRelatorioLayout.setVerticalGroup(
            painelRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelRelatorioLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(scrollTababela, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        painelTabela.add(painelRelatorio, java.awt.BorderLayout.SOUTH);

        getContentPane().add(painelTabela, java.awt.BorderLayout.CENTER);

        botaoEditarContato.setText("Editar");
        botaoEditarContato.setEnabled(false);
        botaoEditarContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEditarContatoActionPerformed(evt);
            }
        });
        painelBotoes.add(botaoEditarContato);

        botaoExcluirContato.setText("Excluir");
        botaoExcluirContato.setEnabled(false);
        botaoExcluirContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirContatoActionPerformed(evt);
            }
        });
        painelBotoes.add(botaoExcluirContato);

        botaoSairRelContato.setText("Sair");
        botaoSairRelContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairRelContatoActionPerformed(evt);
            }
        });
        painelBotoes.add(botaoSairRelContato);

        getContentPane().add(painelBotoes, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSairRelContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairRelContatoActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_botaoSairRelContatoActionPerformed

    private void botaoEditarContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditarContatoActionPerformed
        // TODO add your handling code here:
        try {
            
            int linha = tabelaContato.getSelectedRow();
            ContatoDAO contatoDAO = new ContatoDAO();
            List<ContatoDTO> listaContato = new ArrayList<>();


            ContatoDTO c = contatoDAO.listarTodos().get(linha);
            System.out.println(c.toString());

            this.setEnabled(false);
            botaoEditarContato.setEnabled(false);

            new CadastroContato(this, c).setVisible(true);
            
            } catch (Exception e) {
            
            JOptionPane.showMessageDialog(this, "Selecione um Contato!");
            botaoEditarContato.setEnabled(false);
        }
    }//GEN-LAST:event_botaoEditarContatoActionPerformed

    private void botaoExcluirContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirContatoActionPerformed
        // TODO add your handling code here:
   
        int confirm = JOptionPane.showConfirmDialog (null,
        "Deseja Realmente Excluir?",
        "Sair - Confirmação",
        JOptionPane.YES_NO_OPTION,
        JOptionPane.QUESTION_MESSAGE);
        if (confirm == JOptionPane.YES_OPTION) {
            ContatoDAO contato = new ContatoDAO();
            ContatoDTO contatoDTO = new ContatoDTO();
            int row = tabelaContato.getSelectedRow();  
                //if (row > -1) { //então tem ítem selecionado  
                    int column = tabelaContato.getColumnModel().getColumnIndex("Código"); 
                    Object value = tabelaContato.getValueAt(row, column);  
                    //System.out.println("Value: " + value); 
                    Integer numero = (Integer)value;
                //}
            
        contato.remover(numero);
        carregarJTable();

        }

  

    }//GEN-LAST:event_botaoExcluirContatoActionPerformed

    private void buscarContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarContatoActionPerformed
    }//GEN-LAST:event_buscarContatoActionPerformed

    private void botaoBuscarContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoBuscarContatoActionPerformed
        // TODO add your handling code here:
        //ContatoDTO busca = new ContatoDTO();
        String buscar = buscarContato.getText();
        System.out.println(buscar);
        ContatoDAO contatoDAO = new ContatoDAO();
        contatoDAO.listarBusca(buscar);
        carregarJTable();
    }//GEN-LAST:event_botaoBuscarContatoActionPerformed

    private void tabelaContatoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaContatoMousePressed
        // TODO add your handling code here:
        botaoEditarContato.setEnabled(true);
        botaoExcluirContato.setEnabled(true);
    }//GEN-LAST:event_tabelaContatoMousePressed

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
            java.util.logging.Logger.getLogger(RelatorioContato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RelatorioContato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RelatorioContato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RelatorioContato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RelatorioContato().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelTitulo;
    private javax.swing.JButton botaoBuscarContato;
    private javax.swing.JButton botaoEditarContato;
    private javax.swing.JButton botaoExcluirContato;
    private javax.swing.JButton botaoSairRelContato;
    private javax.swing.JTextField buscarContato;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel painelBotoes;
    private javax.swing.JPanel painelBusca;
    private javax.swing.JPanel painelRelatorio;
    private javax.swing.JPanel painelTabela;
    private javax.swing.JScrollPane scrollTababela;
    private javax.swing.JTable tabelaContato;
    // End of variables declaration//GEN-END:variables
}
