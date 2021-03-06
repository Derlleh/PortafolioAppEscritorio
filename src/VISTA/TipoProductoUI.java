/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VISTA;

import CONTROLADOR.TipoProductoDAO;
import MODELO.TipoProducto;
import NEGOCIO.ComboTipoFamilia;
import NEGOCIO.productoNegocio;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author pablo
 */
public class TipoProductoUI extends javax.swing.JFrame {

    /**
     * Creates new form TipoProductoUI
     */
    
    private productoNegocio ebo = new productoNegocio(); 
    
    TipoProductoDAO comboF = new TipoProductoDAO();
    
    public TipoProductoUI() {
        initComponents();
        setLocationRelativeTo(null);
        cerrar();
        ListarTipoProducto();
        idMax();
        
        txtCodigoPro.setEditable(false);
        
        
       setIconImage(new ImageIcon(getClass().getResource("/Imagenes/logoServi2.png")).getImage());
       
       btnGuardarTipo.setEnabled(false);
       btnEliminarTipo.setEnabled(false);
       btnEditarTipo.setEnabled(false);
       
       
       comboF.consultar_Familia(ComboFamilia);
    }
    
    public void HabilitarBotonGuardar()
    {
        if(!txtCodigoPro.getText().isEmpty() && 
            !txtDescripcion.getText().isEmpty() && 
               !ComboFamilia.getSelectedObjects().equals(null))
        {
            btnGuardarTipo.setEnabled(true);
        }
        else
        {
            btnGuardarTipo.setEnabled(false);
        }
    }
    
    public void HabilitarBotonEditar()
    {
         if(!txtCodigoPro.getText().isEmpty() && 
            !txtDescripcion.getText().isEmpty() && 
              !ComboFamilia.getSelectedObjects().equals(null)
              )
        {
           btnEditarTipo.setEnabled(true);
        }
        else
        {
            btnEditarTipo.setEnabled(false);
        }
    }
    
    public void HabilitarBotonEliminar()
    {
         if(!txtCodigoPro.getText().isEmpty() && 
            !txtDescripcion.getText().isEmpty() && 
              !ComboFamilia.getSelectedObjects().equals(null))
        {
            btnEliminarTipo.setEnabled(true);
        }
        else
        {
            btnEliminarTipo.setEnabled(false);
        }
    }
    
    
     public void cerrar()
    {
        try {
            
                this.setDefaultCloseOperation(AgregarClienteVehiculoUI.DO_NOTHING_ON_CLOSE);
                addWindowListener(new WindowAdapter() {
                    public void windowClosing(WindowEvent e){
                        confirmarSalida();
                    }
                });
                this.setVisible(true);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
     
     public void ListarTipoProducto()
     {
         
         TipoProductoDAO daoTP = new TipoProductoDAO();
         tablaTipoProducto.setModel(daoTP.listarTipoProductos());      
     }
     
     public void idMax()
     {
         txtCodigoPro.setText(ebo.getMaxTipoID()+"");
     }
     
     public void Limpiar()
     {
         txtCodigoPro.setText("");
         txtDescripcion.setText("");
         ComboFamilia.setSelectedIndex(-1);
         
         idMax();
     }
    
      
     public void confirmarSalida()
    {
        int valor= JOptionPane.showConfirmDialog(this, "??Esta seguro que desea cerrar la apliaci??n Serviexpress?","Advertencia", JOptionPane.YES_NO_OPTION);
        if(valor==JOptionPane.YES_OPTION)
        {
            JOptionPane.showMessageDialog(null,"Gracias, hasta pronto","Gracias",JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaTipoProducto = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jlabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCodigoPro = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        ComboFamilia = new javax.swing.JComboBox<>();
        btnGuardarTipo = new javax.swing.JButton();
        btnEditarTipo = new javax.swing.JButton();
        btnEliminarTipo = new javax.swing.JButton();
        btnLimpiarTipo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaTipoProducto.setBackground(new java.awt.Color(102, 255, 102));
        tablaTipoProducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        tablaTipoProducto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tablaTipoProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaTipoProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaTipoProductoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaTipoProducto);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 330, 130));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 65, 448, 7));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tipo de Producto");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 20, -1, -1));

        jLabel10.setForeground(new java.awt.Color(240, 240, 240));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_exit_40px_1.png"))); // NOI18N
        jLabel10.setText("Salir");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, -1, -1));

        jlabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlabel.setForeground(new java.awt.Color(255, 255, 255));
        jlabel.setText("Codigo:");
        jPanel1.add(jlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 83, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Familia");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 83, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 83, -1, -1));

        txtCodigoPro.setBackground(new java.awt.Color(102, 255, 204));
        txtCodigoPro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtCodigoPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoProActionPerformed(evt);
            }
        });
        txtCodigoPro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodigoProKeyReleased(evt);
            }
        });
        jPanel1.add(txtCodigoPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 83, 40, 30));

        txtDescripcion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtDescripcion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 204)));
        txtDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDescripcionKeyReleased(evt);
            }
        });
        jPanel1.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 83, 90, 30));

        ComboFamilia.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ComboFamilia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ComboFamiliaKeyReleased(evt);
            }
        });
        jPanel1.add(ComboFamilia, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 84, 90, 30));

        btnGuardarTipo.setBackground(new java.awt.Color(102, 102, 255));
        btnGuardarTipo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnGuardarTipo.setText("Registrar");
        btnGuardarTipo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 0), 1, true));
        btnGuardarTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarTipoActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardarTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 140, 30));

        btnEditarTipo.setBackground(new java.awt.Color(102, 102, 255));
        btnEditarTipo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEditarTipo.setText("Actualizar");
        btnEditarTipo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        btnEditarTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarTipoActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditarTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 110, 30));

        btnEliminarTipo.setBackground(new java.awt.Color(102, 102, 255));
        btnEliminarTipo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEliminarTipo.setText("Eliminar");
        btnEliminarTipo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        btnEliminarTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTipoActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminarTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 110, 30));

        btnLimpiarTipo.setBackground(new java.awt.Color(102, 102, 255));
        btnLimpiarTipo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLimpiarTipo.setText("Nuevo");
        btnLimpiarTipo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        btnLimpiarTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarTipoActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiarTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, 110, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        ModuloBodegaUI mm = new ModuloBodegaUI();
        mm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void txtCodigoProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoProActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoProActionPerformed

    private void btnGuardarTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarTipoActionPerformed
        
           int i = JOptionPane.showConfirmDialog(this, "??Estas seguro que deseas Registrar una nueva Familia de Productos?"); 
           if(i==0){ 
              
              if(txtCodigoPro.getText().isEmpty() && txtDescripcion.getText().isEmpty() && ComboFamilia.getSelectedItem().toString().isEmpty()) 
              {
                   JOptionPane.showMessageDialog(null, "Llene todos los campos"); 
              }
              else
              {
                  TipoProducto modelTP = new TipoProducto(); 
                  TipoProductoDAO daoTP = new TipoProductoDAO(); 
                  
                  modelTP.setIdTipoProducto(Integer.parseInt(txtCodigoPro.getText()));
                  modelTP.setDescripcionTipo(txtDescripcion.getText());
                 
                  
                   ComboTipoFamilia combofa = (ComboTipoFamilia)ComboFamilia.getSelectedItem();
                   String id = combofa.getCodFamilia();
                   modelTP.setCodFamilia(Integer.parseInt(id));
                  
                  if(daoTP.registroTipoProducto(modelTP))
                  {
                      JOptionPane.showMessageDialog(null, "Se registro al tipo de producto con exito");
                      ListarTipoProducto();
                      Limpiar();
                      HabilitarBotonGuardar();
                  }
                  
              }
              
              
          }else if(i==1)
          {
               JOptionPane.showMessageDialog(this, "Se cancelo el registro del tipo de producto");
          }
        
        
        
    }//GEN-LAST:event_btnGuardarTipoActionPerformed

    private void tablaTipoProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaTipoProductoMouseClicked
        
        int seleccion = tablaTipoProducto.rowAtPoint(evt.getPoint()); 
        
        txtCodigoPro.setText(tablaTipoProducto.getValueAt(seleccion, 0)+"");
        txtDescripcion.setText(tablaTipoProducto.getValueAt(seleccion, 1)+"");
        ComboFamilia.setSelectedItem(tablaTipoProducto.getValueAt(seleccion, 2)+"");
        
        HabilitarBotonEditar();
        HabilitarBotonEliminar();
        
    }//GEN-LAST:event_tablaTipoProductoMouseClicked

    private void btnEditarTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarTipoActionPerformed
        
         int i = JOptionPane.showConfirmDialog(this, "??Estas seguro que deseas actualizar los datos del tipo de Producto?"); 
         if(i==0)
         {
             if(txtCodigoPro.getText().isEmpty())
             {
                 String mensaje = "Debe tener Un codigo seleccionado"; 
                 JOptionPane.showMessageDialog(null, mensaje);
             }
             else
             {
                  TipoProducto modelTP = new TipoProducto(); 
                  TipoProductoDAO daoTP = new TipoProductoDAO(); 
                  
                  modelTP.setIdTipoProducto(Integer.parseInt(txtCodigoPro.getText()));
                  modelTP.setDescripcionTipo(txtDescripcion.getText());
                 
                   ComboTipoFamilia combofa = (ComboTipoFamilia)ComboFamilia.getSelectedItem();
                   String id = combofa.getCodFamilia();
                   modelTP.setCodFamilia(Integer.parseInt(id));
                  
                  daoTP.ModificarTipoProducto(modelTP); 
                  
                   JOptionPane.showMessageDialog(this, "Se actualizo el tipo de Producto");
                  ListarTipoProducto();
                  HabilitarBotonEditar();
             }
             
             
             
         }else if(i==1)
         {
              JOptionPane.showMessageDialog(this, "Se cancelo la actualizacion de datos del tipo de Producto");
         }
        
        
    }//GEN-LAST:event_btnEditarTipoActionPerformed

    private void btnEliminarTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTipoActionPerformed
       
          int i = JOptionPane.showConfirmDialog(this, "??Estas seguro que deseas eliminar el tipo de producto?"); 
          if(i==0){
              
                  TipoProducto modelTP = new TipoProducto(); 
                  TipoProductoDAO daoTP = new TipoProductoDAO(); 
                  
                  modelTP.setIdTipoProducto(Integer.parseInt(txtCodigoPro.getText()));
                  modelTP.setDescripcionTipo(txtDescripcion.getText());
                  ComboTipoFamilia combofa = (ComboTipoFamilia)ComboFamilia.getSelectedItem();
                  String id = combofa.getCodFamilia();
                  modelTP.setCodFamilia(Integer.parseInt(id));
                  
                  if(daoTP.EliminarTipoProducto(modelTP))
                  {
                       JOptionPane.showMessageDialog(null, "Se Elimino el tipo de Producto");
                       ListarTipoProducto();
                       Limpiar();
                       HabilitarBotonEliminar();
                  }
              
              
          }else if(i==1)
          {
              JOptionPane.showMessageDialog(this, "Se cancelo la eliminacion del tipo de producto"); 
          }
        
        
        
    }//GEN-LAST:event_btnEliminarTipoActionPerformed

    private void txtCodigoProKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoProKeyReleased
       HabilitarBotonGuardar();
       HabilitarBotonEliminar();
    }//GEN-LAST:event_txtCodigoProKeyReleased

    private void txtDescripcionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionKeyReleased
        HabilitarBotonGuardar();
        HabilitarBotonEditar();
    }//GEN-LAST:event_txtDescripcionKeyReleased

    private void ComboFamiliaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ComboFamiliaKeyReleased
        HabilitarBotonGuardar();
        HabilitarBotonEditar();
    }//GEN-LAST:event_ComboFamiliaKeyReleased

    private void btnLimpiarTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarTipoActionPerformed
        Limpiar();
        HabilitarBotonEditar();
        HabilitarBotonEliminar();
        HabilitarBotonGuardar();
    }//GEN-LAST:event_btnLimpiarTipoActionPerformed

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
            java.util.logging.Logger.getLogger(TipoProductoUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TipoProductoUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TipoProductoUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TipoProductoUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TipoProductoUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboFamilia;
    private javax.swing.JButton btnEditarTipo;
    private javax.swing.JButton btnEliminarTipo;
    private javax.swing.JButton btnGuardarTipo;
    private javax.swing.JButton btnLimpiarTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jlabel;
    private javax.swing.JTable tablaTipoProducto;
    private javax.swing.JTextField txtCodigoPro;
    private javax.swing.JTextField txtDescripcion;
    // End of variables declaration//GEN-END:variables
}
