/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VISTA;

import CONTROLADOR.DetalleReservaDAO;
import CONTROLADOR.ReservaDAO;
import MODELO.DetalleReserva;
import MODELO.Reserva;
import NEGOCIO.ComboMecanicoNombre;
import NEGOCIO.ComboServiciosEjecutar;
import NEGOCIO.reservaNegocio;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author pablo
 */
public class ReservaUI extends javax.swing.JFrame {
    
    
    ReservaDAO cargarcombobox = new ReservaDAO();
    
    private reservaNegocio ebo = new reservaNegocio();
    
    DetalleReservaDAO cargarcombo = new DetalleReservaDAO();
    
    ArrayList Array = new ArrayList();
    DefaultListModel modelo = new DefaultListModel();
    
         

    /**
     * Creates new form ReservaUI
     */
    public ReservaUI() {
        initComponents();
        setLocationRelativeTo(null);
        idMax();
   //     ListarReserva();
        
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/logoServi2.png")).getImage());
        
        txtIDReserva.setEditable(false);
        
         cargarcombobox.consultar_vehiculo(COMBOVEHICULO);
         cargarcombobox.consultar_cliente(COMBOCLIENTE);
         cargarcombobox.consultar_NombreMecanico(ComboMecanic);
         
         //consultar servicios// 
         
         cargarcombo.consultar_ServicioReserva(comboServiciosReserva);
        
         
         Date date = new Date(); 
         
         FECHADateCalendar.setMinSelectableDate(date);
         
         
         jList1.setModel(modelo);
         
    }
    
    public void HabilitarGUardarReserva()
    {
        
        
        
        
        
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
    
    
    
    public void idMax()
    {
        txtIDReserva.setText(ebo.getMaxID()+"");
        
        
    }
    
    public void LimpiarReserva()
    {
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault());
        String date = formato.format(FECHADateCalendar.getDate());
        
        txtIDReserva.setText("");

       
        txtHorareserva.setText("");
        COMBOCLIENTE.setSelectedIndex(-1);
        COMBOVEHICULO.setSelectedIndex(-1);
        ComboMecanic.setSelectedIndex(-1);
       // FECHADateCalendar.setDate(date);
        
        
        idMax();
        
    }
    


    
 
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        COMBOVEHICULO = new javax.swing.JComboBox<>();
        COMBOCLIENTE = new javax.swing.JComboBox<>();
        txtIDReserva = new javax.swing.JTextField();
        btnRegitsrarReserva = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        txtHorareserva = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        estado = new javax.swing.JLabel();
        FECHADateCalendar = new com.toedter.calendar.JDateChooser();
        btnLimpiarR = new javax.swing.JButton();
        ComboMecanic = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        radioCero = new javax.swing.JRadioButton();
        radioUno = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        comboServiciosReserva = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        btnguardarlistaservicios = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Registro de Reserva ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Codigo:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 97, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Fecha de Ejecución:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("Propietario: ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("Vehiculo:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        COMBOVEHICULO.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        COMBOVEHICULO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 204)));
        jPanel1.add(COMBOVEHICULO, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 135, -1));

        COMBOCLIENTE.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        COMBOCLIENTE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 204)));
        jPanel1.add(COMBOCLIENTE, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 135, -1));

        txtIDReserva.setBackground(new java.awt.Color(102, 255, 204));
        txtIDReserva.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtIDReserva.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 204)));
        txtIDReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDReservaActionPerformed(evt);
            }
        });
        jPanel1.add(txtIDReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 97, 50, 20));

        btnRegitsrarReserva.setBackground(new java.awt.Color(102, 102, 255));
        btnRegitsrarReserva.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRegitsrarReserva.setText("Registrar Datos");
        btnRegitsrarReserva.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        btnRegitsrarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegitsrarReservaActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegitsrarReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 160, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 67, 760, 10));

        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_exit_40px_1.png"))); // NOI18N
        jLabel8.setText("Salir");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, -1, -1));

        txtHorareserva.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtHorareserva.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 204)));
        jPanel1.add(txtHorareserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 100, 70, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText("Hora:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, 42, -1));

        estado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        estado.setForeground(new java.awt.Color(240, 240, 240));
        estado.setText("Estado:");
        jPanel1.add(estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 60, 20));
        jPanel1.add(FECHADateCalendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 150, -1));

        btnLimpiarR.setBackground(new java.awt.Color(102, 102, 255));
        btnLimpiarR.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLimpiarR.setText("Nuevo");
        btnLimpiarR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        btnLimpiarR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarRActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiarR, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, 140, 30));

        ComboMecanic.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ComboMecanic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 204)));
        jPanel1.add(ComboMecanic, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 135, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(240, 240, 240));
        jLabel9.setText("Mecánico:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        radioCero.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        radioCero.setForeground(new java.awt.Color(255, 255, 255));
        radioCero.setText("0");
        jPanel1.add(radioCero, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, -1, -1));

        radioUno.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        radioUno.setForeground(new java.awt.Color(255, 255, 255));
        radioUno.setText("1");
        jPanel1.add(radioUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Pendiente de Pago ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, -1, 20));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("En Ejecución ");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, -1, 20));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Servicios:  ");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, -1, 40));

        comboServiciosReserva.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comboServiciosReserva.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 204)));
        jPanel1.add(comboServiciosReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 150, 180, -1));

        jList1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 204)));
        jList1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jScrollPane1.setViewportView(jList1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 190, 180, 50));

        btnguardarlistaservicios.setBackground(new java.awt.Color(102, 102, 255));
        btnguardarlistaservicios.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnguardarlistaservicios.setText("guardar selección ");
        btnguardarlistaservicios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        btnguardarlistaservicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarlistaserviciosActionPerformed(evt);
            }
        });
        jPanel1.add(btnguardarlistaservicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 260, 160, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegitsrarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegitsrarReservaActionPerformed
     
         int i = JOptionPane.showConfirmDialog(this, "¿Estas seguro que deseas Registrar la Reserva para un Servicio?"); 
         if(i==0){
             
             
         SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault());
         String date = formato.format(FECHADateCalendar.getDate());
        
        
        
        
        //Reserva Datos// 
        
        Reserva modelR = new Reserva(); 
        ReservaDAO daoR = new ReservaDAO();
        
       
        
        modelR.setIdReserva(Integer.parseInt(txtIDReserva.getText()));
        modelR.setFechaReserva(date);
        modelR.setVehiculoPatente(COMBOVEHICULO.getItemAt(COMBOVEHICULO.getSelectedIndex()));
        modelR.setClienteVehRut(COMBOCLIENTE.getItemAt(COMBOCLIENTE.getSelectedIndex()));
      
        if(radioCero.isSelected())
        {
            
            modelR.setEstadoReserv(Integer.parseInt(radioCero.getText()));
        }
        if(radioUno.isSelected())
        {
            modelR.setEstadoReserv(Integer.parseInt(radioUno.getText()));
        }
        
        
        modelR.setHoraReserv(txtHorareserva.getText());
        
        ComboMecanicoNombre comboM = (ComboMecanicoNombre)ComboMecanic.getSelectedItem(); 
        String id1= comboM.getNombreMecanico(); 
        String id2= comboM.getApellidoMecanico(); 
        modelR.setMecanico(id1+" "+id2);
       
        
        
        if(daoR.regitsrarReserva(modelR))
        {
             JOptionPane.showMessageDialog(null, "Se registro la reserva con exito");
         //    ListarReserva();
        }
             
             
             
         }else if(i==1)
         {
               JOptionPane.showMessageDialog(this, "Se cancelo el registro de la Reserva");
         }
             
        
        
        
        
       
        
        
    }//GEN-LAST:event_btnRegitsrarReservaActionPerformed

    private void btnLimpiarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarRActionPerformed
        
        
        LimpiarReserva(); 
        
    }//GEN-LAST:event_btnLimpiarRActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        
        ModuloReservaUI s = new ModuloReservaUI(); 
        s.setVisible(true);
        this.setVisible(false);
        
        
    }//GEN-LAST:event_jLabel8MouseClicked

    private void txtIDReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDReservaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDReservaActionPerformed

    private void btnguardarlistaserviciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarlistaserviciosActionPerformed
      
        //DetalleReserva//  
        
         
       
         
        DetalleReserva modelDR = new DetalleReserva();
        DetalleReservaDAO daoDR = new DetalleReservaDAO();
        
        modelDR.setCodigoDetalleReserva(Integer.parseInt(txtIDReserva.getText()));
        
        modelDR.setCodigoReservaD(Integer.parseInt(txtIDReserva.getText()));
        
        ComboServiciosEjecutar cc = (ComboServiciosEjecutar)comboServiciosReserva.getSelectedItem(); 
        String id = cc.getCodServicio(); 
        modelDR.setCodigoServicioD(Integer.parseInt(id));
        
        if(daoDR.registroDetalleReserva(modelDR))
        {
            
                String dato = comboServiciosReserva.getSelectedItem().toString(); 
           Array.add(dato);
        
        modelo.removeAllElements();
            for(int i = 0; i < Array.size();i++)
            {
                modelo.addElement(Array.get(i));
            }

              JOptionPane.showMessageDialog(null, "Servicio para ejecución guardado con exito");
        }
        
       
        
      
        
    }//GEN-LAST:event_btnguardarlistaserviciosActionPerformed

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
            java.util.logging.Logger.getLogger(ReservaUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReservaUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReservaUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReservaUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReservaUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> COMBOCLIENTE;
    private javax.swing.JComboBox<String> COMBOVEHICULO;
    private javax.swing.JComboBox<String> ComboMecanic;
    private com.toedter.calendar.JDateChooser FECHADateCalendar;
    private javax.swing.JButton btnLimpiarR;
    private javax.swing.JButton btnRegitsrarReserva;
    private javax.swing.JButton btnguardarlistaservicios;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> comboServiciosReserva;
    private javax.swing.JLabel estado;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton radioCero;
    private javax.swing.JRadioButton radioUno;
    private javax.swing.JTextField txtHorareserva;
    private javax.swing.JTextField txtIDReserva;
    // End of variables declaration//GEN-END:variables
}
