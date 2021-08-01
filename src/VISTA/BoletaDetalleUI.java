/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VISTA;

import CONTROLADOR.DetalleDAO;
import CONTROLADOR.EjecucionDAO;
import MODELO.Detalle;
import MODELO.Ejecucion;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author pablo
 */
public class BoletaDetalleUI extends javax.swing.JFrame {

    
    public BoletaDetalleUI() {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/logoServi2.png")).getImage());
        cerrar();
        ListarEjecucion();
        
//        txtCODSERVICIO.setEditable(false);
        txtCodigo.setEditable(false);
        txtComentario.setEditable(false);
        txtCostoServicio.setEditable(false);
        txtIDRESERVA.setEditable(false);
        txtRutMecanico.setEditable(false);
        
    //    txtTOTALSERVICIOS.setText(Integer.toString(SumaServiciosTotal()));
    }
    
    /*
    
    public int SumaServiciosTotal()         
    {
        int contar=TablaEjecuciones.getRowCount(); 
        int suma=0; 
        for(int i=0; i< contar; i++){
            suma = suma+Integer.parseInt(TablaEjecuciones.getValueAt(i, 3).toString());
        }
        return suma; 
    }
    */
    
    private void ListarEjecucion()
    {
        EjecucionDAO dao = new EjecucionDAO(); 
        TablaEjecuciones.setModel(dao.listarEjecucion());
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
    
      
     public void confirmarSalida()
    {
        int valor= JOptionPane.showConfirmDialog(this, "¿Esta seguro que desea cerrar la apliación Serviexpress?","Advertencia", JOptionPane.YES_NO_OPTION);
        if(valor==JOptionPane.YES_OPTION)
        {
            JOptionPane.showMessageDialog(null,"Gracias, hasta pronto","Gracias",JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
    }
     
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaEjecuciones = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtIDRESERVA = new javax.swing.JTextField();
        txtCostoServicio = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtComentario = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        txtRutMecanico = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Actividades de Vehiculos ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, -1));

        jLabel10.setForeground(new java.awt.Color(240, 240, 240));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_exit_40px_1.png"))); // NOI18N
        jLabel10.setText("Salir");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 10, -1, -1));

        TablaEjecuciones.setBackground(new java.awt.Color(102, 255, 102));
        TablaEjecuciones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        TablaEjecuciones.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TablaEjecuciones.setModel(new javax.swing.table.DefaultTableModel(
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
        TablaEjecuciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaEjecucionesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaEjecuciones);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 730, 90));

        jButton1.setBackground(new java.awt.Color(102, 102, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Registrar Venta de Servicios ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, -1, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Codigo de Ejecución del Servicio: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 58, 920, 10));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Codigo Reserva del Cliente:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Comentario del Mecánico del Proceso Realizado: ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, -1, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Total $: ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, -1, -1));

        txtCodigo.setBackground(new java.awt.Color(102, 255, 204));
        txtCodigo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtCodigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 204)));
        jPanel1.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 160, -1));

        txtIDRESERVA.setEditable(false);
        txtIDRESERVA.setBackground(new java.awt.Color(102, 255, 204));
        txtIDRESERVA.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtIDRESERVA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 204)));
        jPanel1.add(txtIDRESERVA, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 160, -1));

        txtCostoServicio.setBackground(new java.awt.Color(102, 255, 204));
        txtCostoServicio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtCostoServicio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 204)));
        jPanel1.add(txtCostoServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 161, -1));

        txtComentario.setBackground(new java.awt.Color(102, 255, 204));
        txtComentario.setColumns(20);
        txtComentario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtComentario.setRows(5);
        txtComentario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 204)));
        jScrollPane2.setViewportView(txtComentario);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 330, 100));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Mecánico a cargo del procedimiento: ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        txtRutMecanico.setBackground(new java.awt.Color(102, 255, 204));
        txtRutMecanico.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtRutMecanico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 204)));
        jPanel1.add(txtRutMecanico, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 161, -1));

        jButton2.setBackground(new java.awt.Color(102, 102, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Eliminar Actividad");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 330, -1, 29));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        MenuUI a = new MenuUI();
        a.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jLabel10MouseClicked

    private void TablaEjecucionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaEjecucionesMouseClicked
      
        int seleccion = TablaEjecuciones.rowAtPoint(evt.getPoint()); 
        
        txtCodigo.setText(TablaEjecuciones.getValueAt(seleccion, 0)+"");
        txtComentario.setText(TablaEjecuciones.getValueAt(seleccion, 1)+"");
        txtIDRESERVA.setText(TablaEjecuciones.getValueAt(seleccion, 2)+"");
        txtCostoServicio.setText(TablaEjecuciones.getValueAt(seleccion, 3)+"");
        txtRutMecanico.setText(TablaEjecuciones.getValueAt(seleccion, 4)+"");
        
        
    }//GEN-LAST:event_TablaEjecucionesMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        BoletaDeVentaUI a = new BoletaDeVentaUI(); 
        a.setVisible(true);
        
       // String info = txtComentario.getText(); 
       // FacturasBoletasUI.txtComentariodelServicio.setText(info);
        
        String info = txtIDRESERVA.getText();
        BoletaDeVentaUI.txtBoletaCod.setText(info);
        
        String info2 = txtCostoServicio.getText(); 
        BoletaDeVentaUI.txtPrecioNetoBoleta.setText(info2); 
        
        String info5 = txtCodigo.getText(); 
        BoletaDeVentaUI.txtBoletaCod.setText(info5);
       
        String info4 = txtCostoServicio.getText(); 
        BoletaDeVentaUI.txtTotalBoletaFINAL.setText(info4);        
        
        dispose(); 
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        EjecucionDAO daoE = new EjecucionDAO(); 
        Ejecucion modeloE = new Ejecucion(); 
        
        DetalleDAO daoD = new DetalleDAO(); 
        Detalle modelD = new Detalle(); 
        
        modeloE.setCodEjecucion(Integer.parseInt(txtCodigo.getText())); 
     
        
        if(daoE.EliminarEjecucion(modeloE) && daoD.EliminarDetalle(modelD))
        {
            JOptionPane.showMessageDialog(null, "Se elemino La actividad del Vehiculo");
            ListarEjecucion();
        }
        
                
                
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(BoletaDetalleUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BoletaDetalleUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BoletaDetalleUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BoletaDetalleUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BoletaDetalleUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaEjecuciones;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextArea txtComentario;
    public static javax.swing.JTextField txtCostoServicio;
    private javax.swing.JTextField txtIDRESERVA;
    private javax.swing.JTextField txtRutMecanico;
    // End of variables declaration//GEN-END:variables
}
