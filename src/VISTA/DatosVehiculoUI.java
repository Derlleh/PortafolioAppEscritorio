/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VISTA;

import CONTROLADOR.VehiculoDAO;
import MODELO.Vehiculo;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import java.time.DateTimeException;
import javax.swing.ImageIcon;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author pablo
 */
public class DatosVehiculoUI extends javax.swing.JFrame {

     TableRowSorter trs;
    
    VehiculoDAO cargarCombo = new VehiculoDAO(); 
    
    
    public DatosVehiculoUI() {
       initComponents();
       setLocationRelativeTo(null);
       ListarVehiculos();
       cargarCombo.consultar_cliente(comborutDuenoAUTO);
        cerrar();
       setIconImage(new ImageIcon(getClass().getResource("/Imagenes/logoServi2.png")).getImage());
       
       btnRegistrarAUTO.setEnabled(false);
       btnEditarVehiculo.setEnabled(false);
       btnEliminarVehiculo.setEnabled(false);
       
     // cargarCombo.consultar_EstadoVehiculo(ComboEstadoVehiculo);
       
    }
    
    
    
    public void HabilitarBotonGuardarVehiculo()
    {
        
        if( !txtPATENTEEEE.getText().isEmpty() &&              
                  !txtMODELLOOO.getText().isEmpty() && 
                  !txtMarcaVehiculo.getText().isEmpty() &&
                    !txtCOLORRR.getText().isEmpty() && 
                      !txtANOOO.getText().isEmpty() && 
                        !txtKilometraje.getText().isEmpty() && 
                         !comborutDuenoAUTO.getSelectedItem().toString().isEmpty() &&
                             !ComboEstadoVehiculo.getSelectedItem().toString().isEmpty())
        {
            btnRegistrarAUTO.setEnabled(true);
        }
        else
        {
            btnRegistrarAUTO.setEnabled(false);
        }
        
        
    }
    
    public void HabilitarBotonEditarVehiculo()
    {
         if( !txtPATENTEEEE.getText().isEmpty() &&              
                  !txtMODELLOOO.getText().isEmpty() && 
                  !txtMarcaVehiculo.getText().isEmpty() &&
                    !txtCOLORRR.getText().isEmpty() && 
                      !txtANOOO.getText().isEmpty() && 
                        !txtKilometraje.getText().isEmpty() && 
                         !comborutDuenoAUTO.getSelectedItem().toString().isEmpty() &&
                           !ComboEstadoVehiculo.getSelectedItem().toString().isEmpty())
        {
            btnEditarVehiculo.setEnabled(true);
        }
        else
        {
           btnEditarVehiculo.setEnabled(false);
        }
        
    }
    
    public void habilitarbotonElimarVehiculo()
    {
        if( !txtPATENTEEEE.getText().isEmpty() &&              
                  !txtMODELLOOO.getText().isEmpty() && 
                  !txtMarcaVehiculo.getText().isEmpty() && 
                    !txtCOLORRR.getText().isEmpty() && 
                      !txtANOOO.getText().isEmpty() && 
                        !txtKilometraje.getText().isEmpty() && 
                         !comborutDuenoAUTO.getSelectedItem().toString().isEmpty() &&
                           !ComboEstadoVehiculo.getSelectedItem().toString().isEmpty())
        {
            btnEliminarVehiculo.setEnabled(true);
        }
        else
        {
           btnEliminarVehiculo.setEnabled(false);
        }
    }
    
    private void LimpiarVehiculos()
    {
        
        txtPATENTEEEE.setText("");
        txtANOOO.setText("");
        txtMODELLOOO.setText("");
        txtCOLORRR.setText("");
        txtKilometraje.setText("");
        comborutDuenoAUTO.setSelectedIndex(-1);
        txtMarcaVehiculo.setText("");
        ComboEstadoVehiculo.setSelectedIndex(-1);
     
        
    }
    
    private void ListarVehiculos(){
        
        VehiculoDAO vv = new VehiculoDAO(); 
        TablitaVehiculosLista.setModel(vv.listarVehiculos());
       
        
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablitaVehiculosLista = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        comborutDuenoAUTO = new javax.swing.JComboBox<>();
        txtPATENTEEEE = new javax.swing.JTextField();
        txtMODELLOOO = new javax.swing.JTextField();
        txtCOLORRR = new javax.swing.JTextField();
        txtANOOO = new javax.swing.JTextField();
        btnRegistrarAUTO = new javax.swing.JButton();
        btnEditarVehiculo = new javax.swing.JButton();
        btnEliminarVehiculo = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtKilometraje = new javax.swing.JTextField();
        ComboEstadoVehiculo = new javax.swing.JComboBox<>();
        txtMarcaVehiculo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtFiltrarPatente = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Recepción Vehiculo ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));

        TablitaVehiculosLista.setAutoCreateRowSorter(true);
        TablitaVehiculosLista.setBackground(new java.awt.Color(102, 255, 102));
        TablitaVehiculosLista.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        TablitaVehiculosLista.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TablitaVehiculosLista.setModel(new javax.swing.table.DefaultTableModel(
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
        TablitaVehiculosLista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablitaVehiculosListaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablitaVehiculosLista);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 530, 150));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 670, 10));

        jButton1.setBackground(new java.awt.Color(102, 102, 255));
        jButton1.setText("Imprimir tabla");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 440, 110, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(240, 240, 240));
        jLabel11.setText("Patente:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 126, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(240, 240, 240));
        jLabel13.setText("marca:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(240, 240, 240));
        jLabel14.setText("modelo:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 88, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(240, 240, 240));
        jLabel15.setText("color:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(240, 240, 240));
        jLabel12.setText("Año:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(566, 88, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(240, 240, 240));
        jLabel16.setText("kilometraje:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 120, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(240, 240, 240));
        jLabel17.setText("Rut Dueño actual:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 88, -1, -1));

        comborutDuenoAUTO.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        comborutDuenoAUTO.setToolTipText("Rut dueño vehiculo");
        comborutDuenoAUTO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 204)));
        comborutDuenoAUTO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                comborutDuenoAUTOKeyReleased(evt);
            }
        });
        jPanel1.add(comborutDuenoAUTO, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 88, 145, -1));

        txtPATENTEEEE.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtPATENTEEEE.setToolTipText("Ingreso de la patente del Vehiculo ");
        txtPATENTEEEE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 204)));
        txtPATENTEEEE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPATENTEEEEKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPATENTEEEEKeyTyped(evt);
            }
        });
        jPanel1.add(txtPATENTEEEE, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 126, 140, 20));

        txtMODELLOOO.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtMODELLOOO.setToolTipText("Modelo del vehiculo ");
        txtMODELLOOO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 204)));
        txtMODELLOOO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMODELLOOOKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMODELLOOOKeyTyped(evt);
            }
        });
        jPanel1.add(txtMODELLOOO, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 88, 93, -1));

        txtCOLORRR.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtCOLORRR.setToolTipText("Color del vehiculo");
        txtCOLORRR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 204)));
        txtCOLORRR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCOLORRRKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCOLORRRKeyTyped(evt);
            }
        });
        jPanel1.add(txtCOLORRR, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 93, -1));

        txtANOOO.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtANOOO.setToolTipText("año del vehiculo ");
        txtANOOO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 204)));
        txtANOOO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtANOOOKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtANOOOKeyTyped(evt);
            }
        });
        jPanel1.add(txtANOOO, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 90, 80, -1));

        btnRegistrarAUTO.setBackground(new java.awt.Color(102, 102, 255));
        btnRegistrarAUTO.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRegistrarAUTO.setText("Registrar");
        btnRegistrarAUTO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        btnRegistrarAUTO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarAUTOActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrarAUTO, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 110, 30));

        btnEditarVehiculo.setBackground(new java.awt.Color(102, 102, 255));
        btnEditarVehiculo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEditarVehiculo.setText("Actualizar");
        btnEditarVehiculo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        btnEditarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarVehiculoActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditarVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 310, 110, 30));

        btnEliminarVehiculo.setBackground(new java.awt.Color(102, 102, 255));
        btnEliminarVehiculo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEliminarVehiculo.setText("Eliminar");
        btnEliminarVehiculo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        btnEliminarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarVehiculoActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminarVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 360, 110, 30));

        btnLimpiar.setBackground(new java.awt.Color(102, 102, 255));
        btnLimpiar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLimpiar.setText("Nuevo");
        btnLimpiar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 260, 110, 30));

        jLabel10.setForeground(new java.awt.Color(240, 240, 240));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_exit_40px_1.png"))); // NOI18N
        jLabel10.setText("Salir");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jLabel10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jLabel10KeyTyped(evt);
            }
        });
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, -1, -1));

        btnBuscar.setBackground(new java.awt.Color(102, 102, 255));
        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 400, 110, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Prioridad estado:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, -1, 20));

        txtKilometraje.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtKilometraje.setToolTipText("Kilometraje con cual ingreso el vehiculo ");
        txtKilometraje.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 204)));
        txtKilometraje.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtKilometrajeKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtKilometrajeKeyTyped(evt);
            }
        });
        jPanel1.add(txtKilometraje, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 120, 80, -1));

        ComboEstadoVehiculo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ComboEstadoVehiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2" }));
        ComboEstadoVehiculo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 204)));
        ComboEstadoVehiculo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ComboEstadoVehiculoKeyReleased(evt);
            }
        });
        jPanel1.add(ComboEstadoVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 160, 80, -1));

        txtMarcaVehiculo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtMarcaVehiculo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 204)));
        jPanel1.add(txtMarcaVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 140, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Filtrar por patente: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, -1, -1));

        txtFiltrarPatente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtFiltrarPatente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 204)));
        txtFiltrarPatente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFiltrarPatenteKeyTyped(evt);
            }
        });
        jPanel1.add(txtFiltrarPatente, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 430, 120, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 727, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarAUTOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarAUTOActionPerformed
      
        int i = JOptionPane.showConfirmDialog(this, "¿Estas seguro que deseas Registrar este Vehiculo"); 
       if(i==0)
       {
            if(comborutDuenoAUTO.getSelectedItem().toString().isEmpty() || 
           txtPATENTEEEE.getText().isEmpty() || 
           txtMarcaVehiculo.getText().isEmpty() ||
            txtANOOO.getText().isEmpty() || 
            txtMODELLOOO.getText().isEmpty() || 
            txtCOLORRR.getText().isEmpty() ||
           ComboEstadoVehiculo.getSelectedItem().toString().isEmpty() || 
            txtKilometraje.getText().isEmpty()) 
        {
        
                                JOptionPane.showMessageDialog(null, "Llene todos los campos");
           }
        else
        {
            
              Vehiculo modelA = new Vehiculo(); 
              VehiculoDAO daoA= new VehiculoDAO(); 
        
              modelA.setPatenteVehi(txtPATENTEEEE.getText()); 
              modelA.setAnnoVehi(Integer.parseInt(txtANOOO.getText()));
              modelA.setMarcaVehi(txtMarcaVehiculo.getText());
              modelA.setModeloVehi(txtMODELLOOO.getText()); 
              modelA.setColorVehi(txtCOLORRR.getText()); 
              modelA.setKilometra(Integer.parseInt(txtKilometraje.getText()));
              modelA.setRutClien(comborutDuenoAUTO.getItemAt(comborutDuenoAUTO.getSelectedIndex()));   
              
              modelA.setEstado(Integer.parseInt(ComboEstadoVehiculo.getItemAt(ComboEstadoVehiculo.getSelectedIndex())));
              
              
              if(daoA.registroVehiculo(modelA))
              {
                JOptionPane.showMessageDialog(null, "Se registro al Vehiculo con exito");
                ListarVehiculos();
                LimpiarVehiculos();
                HabilitarBotonGuardarVehiculo();
              
              } 
        }
           
           
       }else if(i==1)
       {
           
            JOptionPane.showMessageDialog(this, "Se cancelo el registro del vehiculo");
           
       }
        
       
        
        
        
    }//GEN-LAST:event_btnRegistrarAUTOActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
      
        
        
        LimpiarVehiculos();
        HabilitarBotonGuardarVehiculo();
        habilitarbotonElimarVehiculo();
        HabilitarBotonEditarVehiculo();
       
        
        
        
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnEditarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarVehiculoActionPerformed
        
           int i = JOptionPane.showConfirmDialog(this, "¿Estas seguro que deseas actualizar los datos del vehiculo?"); 
         if(i==0) 
         {
             
            if(txtPATENTEEEE.getText().isEmpty())
            {
                
                String mensaje = "Debe tener una patente asociada";
                JOptionPane.showMessageDialog(null, mensaje);
            } 
            else{
                      
             Vehiculo modelA = new Vehiculo(); 
             VehiculoDAO daoA= new VehiculoDAO(); 
        
              modelA.setPatenteVehi(txtPATENTEEEE.getText()); 
              modelA.setAnnoVehi(Integer.parseInt(txtANOOO.getText()));
              modelA.setMarcaVehi(txtMarcaVehiculo.getText()); 
              modelA.setModeloVehi(txtMODELLOOO.getText()); 
              modelA.setColorVehi(txtCOLORRR.getText()); 
              modelA.setKilometra(Integer.parseInt(txtKilometraje.getText()));
               modelA.setRutClien(comborutDuenoAUTO.getItemAt(comborutDuenoAUTO.getSelectedIndex()));  
               
               modelA.setEstado(Integer.parseInt(ComboEstadoVehiculo.getItemAt(ComboEstadoVehiculo.getSelectedIndex())));
               
               
               
              if(daoA.ModificarVehiculo(modelA))
             {
                JOptionPane.showMessageDialog(null, "Se Modifico al Vehiculo con exito");
                ListarVehiculos();

              
            } 
         
         else if(i==1)
         {
              JOptionPane.showMessageDialog(this, "Se cancelo la actualizacion de datos del vehiculo"); 
         }
        
      }
            }
       
        
    }//GEN-LAST:event_btnEditarVehiculoActionPerformed

    private void btnEliminarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarVehiculoActionPerformed
       
        int i = JOptionPane.showConfirmDialog(this, "¿Estas seguro que deseas eliminar el vehiculo");
        if(i==0) 
        {
             Vehiculo modelA = new Vehiculo(); 
             VehiculoDAO daoA= new VehiculoDAO(); 
             
              modelA.setAnnoVehi(Integer.parseInt(txtANOOO.getText()));
              modelA.setMarcaVehi(txtMarcaVehiculo.getText());
              modelA.setModeloVehi(txtMODELLOOO.getText()); 
              modelA.setColorVehi(txtCOLORRR.getText()); 
              modelA.setKilometra(Integer.parseInt(txtKilometraje.getText()));
              modelA.setRutClien(comborutDuenoAUTO.getItemAt(comborutDuenoAUTO.getSelectedIndex()));  
              
              modelA.setEstado(Integer.parseInt(ComboEstadoVehiculo.getItemAt(ComboEstadoVehiculo.getSelectedIndex())));
              
             
          
             modelA.setPatenteVehi(txtPATENTEEEE.getText()); 
             if(daoA.eliminarVehiculo(modelA))
             {
                 JOptionPane.showMessageDialog(null, "Se Elimino al Vehiculo con exito");
                 ListarVehiculos();  
                 LimpiarVehiculos();
        }        

        } else if(i==1)
        {
            JOptionPane.showMessageDialog(this, "Se cancelo la eliminacion del vehiculo");
        }
        
    }//GEN-LAST:event_btnEliminarVehiculoActionPerformed

    private void TablitaVehiculosListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablitaVehiculosListaMouseClicked
        
        int seleccion = TablitaVehiculosLista.rowAtPoint(evt.getPoint()); 
        
        
     
        txtPATENTEEEE.setText(TablitaVehiculosLista.getValueAt(seleccion, 0)+"");
        txtANOOO.setText(TablitaVehiculosLista.getValueAt(seleccion, 1)+"");
        txtMarcaVehiculo.setText(TablitaVehiculosLista.getValueAt(seleccion, 2)+"");
        txtMODELLOOO.setText(TablitaVehiculosLista.getValueAt(seleccion, 3)+"");
        txtCOLORRR.setText(TablitaVehiculosLista.getValueAt(seleccion, 4)+"");
        txtKilometraje.setText(TablitaVehiculosLista.getValueAt(seleccion, 5)+"");
        comborutDuenoAUTO.setSelectedItem(TablitaVehiculosLista.getValueAt(seleccion, 6)+"");
        ComboEstadoVehiculo.setSelectedItem(TablitaVehiculosLista.getValueAt(seleccion, 7)+""); 
        
       // HabilitarBotonGuardarVehiculo();
       
       HabilitarBotonEditarVehiculo();
       habilitarbotonElimarVehiculo();
        
        
    }//GEN-LAST:event_TablitaVehiculosListaMouseClicked

    private void txtANOOOKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtANOOOKeyTyped
        
          char c = evt.getKeyChar(); 
        
        if(!Character.isDigit(c)){
            evt.consume();
        }
        
        int numerocaracteres = 4; 
        
        if(txtANOOO.getText().length() >= numerocaracteres) {
            evt.consume();
   
            JOptionPane.showMessageDialog(rootPane, "el año consta de 4 cifras");
        }
        
        
        
        
    }//GEN-LAST:event_txtANOOOKeyTyped

    private void txtMODELLOOOKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMODELLOOOKeyTyped
        
       int numerocaracteres = 15; 
        
        if(txtMODELLOOO.getText().length() >= numerocaracteres) {
            evt.consume();
   
            JOptionPane.showMessageDialog(rootPane, "No debe posar los 15 caracteres");
        }
        
        
        
    }//GEN-LAST:event_txtMODELLOOOKeyTyped

    private void txtCOLORRRKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCOLORRRKeyTyped
        
         int numerocaracteres = 15; 
        
        if(txtCOLORRR.getText().length() >= numerocaracteres) {
            evt.consume();
   
            JOptionPane.showMessageDialog(rootPane, "No debe posar los 15 caracteres");
        }
        
        
        
    }//GEN-LAST:event_txtCOLORRRKeyTyped

    private void txtPATENTEEEEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPATENTEEEEKeyTyped
        
        int numerocaracteres = 6; 
        
        if(txtPATENTEEEE.getText().length() >= numerocaracteres) {
            evt.consume();
   
            JOptionPane.showMessageDialog(rootPane, "Patente tiene 6 digitos");
        }
        
        
        
    }//GEN-LAST:event_txtPATENTEEEEKeyTyped

    private void jLabel10KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel10KeyTyped
        
        MenuUI s = new MenuUI(); 
        s.setEnabled(true);
        this.setVisible(false);
        
        
    }//GEN-LAST:event_jLabel10KeyTyped

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
        VehiculoDAO a = new VehiculoDAO();
        
        int anno = a.buscarVehiculoPorPatente(txtPATENTEEEE.getText()); 
        txtANOOO.setText(String.valueOf(anno));
        
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtKilometrajeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKilometrajeKeyTyped
     
              char c = evt.getKeyChar(); 
        
        if(!Character.isDigit(c)){
            evt.consume();
        }
        
        int numerocaracteres = 25; 
        
        if(txtANOOO.getText().length() >= numerocaracteres) {
            evt.consume();
   
            JOptionPane.showMessageDialog(rootPane, "No compatible");
        }
        
        
    }//GEN-LAST:event_txtKilometrajeKeyTyped

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        MenuUI s = new MenuUI(); 
        s.setVisible(true); 
        this.setVisible(false);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void comborutDuenoAUTOKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comborutDuenoAUTOKeyReleased
       HabilitarBotonGuardarVehiculo();
       HabilitarBotonEditarVehiculo();
    }//GEN-LAST:event_comborutDuenoAUTOKeyReleased

    private void txtPATENTEEEEKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPATENTEEEEKeyReleased
     HabilitarBotonGuardarVehiculo();
      HabilitarBotonEditarVehiculo();
    }//GEN-LAST:event_txtPATENTEEEEKeyReleased

    private void txtMODELLOOOKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMODELLOOOKeyReleased
        HabilitarBotonGuardarVehiculo();
         HabilitarBotonEditarVehiculo();
    }//GEN-LAST:event_txtMODELLOOOKeyReleased

    private void txtCOLORRRKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCOLORRRKeyReleased
        HabilitarBotonGuardarVehiculo();
         HabilitarBotonEditarVehiculo();
    }//GEN-LAST:event_txtCOLORRRKeyReleased

    private void txtANOOOKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtANOOOKeyReleased
        HabilitarBotonGuardarVehiculo();
         HabilitarBotonEditarVehiculo();
    }//GEN-LAST:event_txtANOOOKeyReleased

    private void txtKilometrajeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKilometrajeKeyReleased
        HabilitarBotonGuardarVehiculo();
         HabilitarBotonEditarVehiculo();
    }//GEN-LAST:event_txtKilometrajeKeyReleased

    private void ComboEstadoVehiculoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ComboEstadoVehiculoKeyReleased
        HabilitarBotonGuardarVehiculo();
        HabilitarBotonEditarVehiculo();
    }//GEN-LAST:event_ComboEstadoVehiculoKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtFiltrarPatenteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltrarPatenteKeyTyped
       
        txtFiltrarPatente.addKeyListener(new KeyAdapter()
        {
            @Override
            public void keyTyped(KeyEvent e) {
               
                trs.setRowFilter(RowFilter.regexFilter("(?)"+ txtFiltrarPatente.getText(),0));
            }
            
        }); 
        
        trs = new TableRowSorter(TablitaVehiculosLista.getModel()); 
        TablitaVehiculosLista.setRowSorter(trs);
        
        
        
    }//GEN-LAST:event_txtFiltrarPatenteKeyTyped

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
            java.util.logging.Logger.getLogger(DatosVehiculoUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DatosVehiculoUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DatosVehiculoUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DatosVehiculoUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DatosVehiculoUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboEstadoVehiculo;
    private javax.swing.JTable TablitaVehiculosLista;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditarVehiculo;
    private javax.swing.JButton btnEliminarVehiculo;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRegistrarAUTO;
    private javax.swing.JComboBox<String> comborutDuenoAUTO;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtANOOO;
    private javax.swing.JTextField txtCOLORRR;
    private javax.swing.JTextField txtFiltrarPatente;
    private javax.swing.JTextField txtKilometraje;
    private javax.swing.JTextField txtMODELLOOO;
    private javax.swing.JTextField txtMarcaVehiculo;
    private javax.swing.JTextField txtPATENTEEEE;
    // End of variables declaration//GEN-END:variables
}
