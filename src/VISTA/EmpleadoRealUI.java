/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VISTA;

import CONTROLADOR.EmpleadoDAO;
import MODELO.Empleado;
import Validaciones.ValidarRut;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.text.MessageFormat;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author pablo
 */
public class EmpleadoRealUI extends javax.swing.JFrame {

    
      
      TableRowSorter trs;
      
    
    
    
    public EmpleadoRealUI() {
        initComponents();
        ListarEmple();
        setLocationRelativeTo(null);
        cerrar();
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/logoServi2.png")).getImage());
        
      
        
        
        
       BtnAgregarEmpleado1.setEnabled(false);
       btnEliminarEmple1.setEnabled(false);
       btnModificar1.setEnabled(false);
        
    }
    
    

    
 
    
    
      
    public void ListarEmple(){
        
        EmpleadoDAO daoEm = new EmpleadoDAO(); 
        TablaEmpleados.setModel(daoEm.listarEmpleados());
    }
    
    
    public void HabilitarBotonGuardarEmpleado()
    {
        if(!txtRutEmpleado.getText().isEmpty() && 
            !txtNombreEmpleado.getText().isEmpty() && 
              !txtApellEmpleado.getText().isEmpty() &&
                !txtDireccEmpleado.getText().isEmpty() && 
                  !txtTelefonoEmpleado.getText().isEmpty() && 
                   !txtCorreoEmpleado.getText().isEmpty() && 
                    !ComboRol.getSelectedItem().toString().isEmpty() &&
                      !combboxCARGO.getSelectedItem().toString().isEmpty() &&
                      !txtpassEmpleado.getText().isEmpty() && 
                       !txtUserNameEmpleado.getText().isEmpty())
        {
            BtnAgregarEmpleado1.setEnabled(true);
        }
        else
        {
            BtnAgregarEmpleado1.setEnabled(false);
        }
    }
    
    public void HabilitarBotonEditarEmpleado()
    {
        
          if(!txtRutEmpleado.getText().isEmpty() && 
            !txtNombreEmpleado.getText().isEmpty() && 
              !txtApellEmpleado.getText().isEmpty() &&
                !txtDireccEmpleado.getText().isEmpty() && 
                  !txtTelefonoEmpleado.getText().isEmpty() && 
                   !txtCorreoEmpleado.getText().isEmpty() && 
                      !ComboRol.getSelectedItem().toString().isEmpty() &&
                       !combboxCARGO.getSelectedItem().toString().isEmpty() &&
                       !txtpassEmpleado.getText().isEmpty() && 
                        !txtUserNameEmpleado.getText().isEmpty())
        {
            btnModificar1.setEnabled(true);
        }
        else
        {
           btnModificar1.setEnabled(false);
        }
    }
    
    public void HabilitarBotonEliminarEmpleado()
    {
          if(!txtRutEmpleado.getText().isEmpty() && 
            !txtNombreEmpleado.getText().isEmpty() && 
              !txtApellEmpleado.getText().isEmpty() &&
                !txtDireccEmpleado.getText().isEmpty() && 
                  !txtTelefonoEmpleado.getText().isEmpty() && 
                   !txtCorreoEmpleado.getText().isEmpty() && 
                      !ComboRol.getSelectedItem().toString().isEmpty() &&
                      !combboxCARGO.getSelectedItem().toString().isEmpty() &&
                       !txtpassEmpleado.getText().isEmpty() && 
                        !txtUserNameEmpleado.getText().isEmpty())
        {
            btnEliminarEmple1.setEnabled(true);
        }
        else
        {
           btnEliminarEmple1.setEnabled(false);
        }
    }
        
    
    
    public void LimpiarEmpleado()
    {
           txtRutEmpleado.setText("");
           txtNombreEmpleado.setText("");
           txtApellEmpleado.setText("");
           txtDireccEmpleado.setText("");
           txtTelefonoEmpleado.setText("");
           txtCorreoEmpleado.setText(""); 
           txtpassEmpleado.setText("");
           txtUserNameEmpleado.setText("");
           ComboRol.setSelectedIndex(-1);
           combboxCARGO.setSelectedIndex(-1);
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

        jPanel3 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtNombreEmple = new javax.swing.JTextField();
        txtCorreoEmple = new javax.swing.JTextField();
        txtCargoEmple = new javax.swing.JTextField();
        txtRolemple = new javax.swing.JTextField();
        txtUserNameEmple = new javax.swing.JTextField();
        txtpassEmple = new javax.swing.JTextField();
        txtApellEmple = new javax.swing.JTextField();
        txtDireccEmple = new javax.swing.JTextField();
        txtTelefonoEmple = new javax.swing.JTextField();
        BtnAgregarEmpleado = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminarEmple = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaEmpleados = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtRutEmpleado = new javax.swing.JTextField();
        txtNombreEmpleado = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtApellEmpleado = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtDireccEmpleado = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtCorreoEmpleado = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtUserNameEmpleado = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtTelefonoEmpleado = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtpassEmpleado = new javax.swing.JTextField();
        BtnAgregarEmpleado1 = new javax.swing.JButton();
        btnModificar1 = new javax.swing.JButton();
        btnEliminarEmple1 = new javax.swing.JButton();
        ComboRol = new javax.swing.JComboBox<>();
        btnLimpiar = new javax.swing.JButton();
        combboxCARGO = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel22 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtFiltrarNombnre = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel4.setText("Nombre: ");

        jLabel5.setText("Apellido:");

        jLabel6.setText("Dirección:");

        jLabel7.setText("Telefono:");

        jLabel8.setText("Correo: ");

        jLabel9.setText("Cargo Taller:");

        jLabel10.setText("Rol de Usuario:");

        jLabel11.setText("Nombre de Usuario: ");

        jLabel12.setText("Contraseña: ");

        BtnAgregarEmpleado.setText("Agregar");
        BtnAgregarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarEmpleadoActionPerformed(evt);
            }
        });

        btnModificar.setText("Editar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminarEmple.setText("Eliminar");
        btnEliminarEmple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarEmpleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombreEmple)
                            .addComponent(txtApellEmple)
                            .addComponent(txtDireccEmple)
                            .addComponent(txtTelefonoEmple, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(BtnAgregarEmpleado)
                        .addGap(21, 21, 21)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCorreoEmple)
                            .addComponent(txtCargoEmple)
                            .addComponent(txtRolemple)
                            .addComponent(txtUserNameEmple)
                            .addComponent(txtpassEmple, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(btnModificar)
                        .addGap(50, 50, 50)
                        .addComponent(btnEliminarEmple)))
                .addContainerGap(155, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtCorreoEmple, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9)
                    .addComponent(txtNombreEmple, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCargoEmple, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10)
                    .addComponent(txtRolemple, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellEmple, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel11)
                    .addComponent(txtUserNameEmple, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDireccEmple, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel12)
                    .addComponent(txtpassEmple, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefonoEmple, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnAgregarEmpleado)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminarEmple))
                .addGap(24, 24, 24))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TablaEmpleados.setBackground(new java.awt.Color(102, 255, 102));
        TablaEmpleados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        TablaEmpleados.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TablaEmpleados.setModel(new javax.swing.table.DefaultTableModel(
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
        TablaEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaEmpleadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaEmpleados);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 520, 158));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Gestión Empleados");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, -1, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Rut Empleado: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 90, -1, -1));

        txtRutEmpleado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtRutEmpleado.setToolTipText("Ingresar Rut sin puntos y con guión");
        txtRutEmpleado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 204)));
        txtRutEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRutEmpleadoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRutEmpleadoKeyTyped(evt);
            }
        });
        jPanel1.add(txtRutEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 88, 100, -1));

        txtNombreEmpleado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtNombreEmpleado.setToolTipText("Nombre del Empleado");
        txtNombreEmpleado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 204)));
        txtNombreEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreEmpleadoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreEmpleadoKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombreEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 117, 100, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(240, 240, 240));
        jLabel13.setText("Nombre: ");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 114, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(240, 240, 240));
        jLabel14.setText("Apellido:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 150, -1, -1));

        txtApellEmpleado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtApellEmpleado.setToolTipText("Apellido del Empleado");
        txtApellEmpleado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 204)));
        txtApellEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellEmpleadoActionPerformed(evt);
            }
        });
        txtApellEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtApellEmpleadoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellEmpleadoKeyTyped(evt);
            }
        });
        jPanel1.add(txtApellEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 148, 100, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(240, 240, 240));
        jLabel15.setText("Dirección:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 181, -1, -1));

        txtDireccEmpleado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtDireccEmpleado.setToolTipText("Dirección Empleado");
        txtDireccEmpleado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 204)));
        txtDireccEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDireccEmpleadoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccEmpleadoKeyTyped(evt);
            }
        });
        jPanel1.add(txtDireccEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 179, 100, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(240, 240, 240));
        jLabel16.setText("Correo: ");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, -1, 20));

        txtCorreoEmpleado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtCorreoEmpleado.setToolTipText("Correo del Empleado");
        txtCorreoEmpleado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 204)));
        txtCorreoEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCorreoEmpleadoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCorreoEmpleadoKeyTyped(evt);
            }
        });
        jPanel1.add(txtCorreoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 119, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(240, 240, 240));
        jLabel17.setText("Cargo Taller:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(240, 240, 240));
        jLabel18.setText("Rol de Usuario:");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(240, 240, 240));
        jLabel19.setText("Nombre de Usuario: ");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 90, -1, -1));

        txtUserNameEmpleado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtUserNameEmpleado.setToolTipText("Nombre de Usuario para el sistema");
        txtUserNameEmpleado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 204)));
        txtUserNameEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUserNameEmpleadoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUserNameEmpleadoKeyTyped(evt);
            }
        });
        jPanel1.add(txtUserNameEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 90, 110, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(240, 240, 240));
        jLabel20.setText("Telefono:");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, -1, -1));

        txtTelefonoEmpleado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtTelefonoEmpleado.setToolTipText("Telefono del Empleado");
        txtTelefonoEmpleado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 204)));
        txtTelefonoEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTelefonoEmpleadoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoEmpleadoKeyTyped(evt);
            }
        });
        jPanel1.add(txtTelefonoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, 119, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(240, 240, 240));
        jLabel21.setText("Contraseña: ");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 120, -1, -1));

        txtpassEmpleado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtpassEmpleado.setToolTipText("Contraseña del usuario para el sistema");
        txtpassEmpleado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 204)));
        txtpassEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpassEmpleadoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpassEmpleadoKeyTyped(evt);
            }
        });
        jPanel1.add(txtpassEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 120, 109, -1));

        BtnAgregarEmpleado1.setBackground(new java.awt.Color(102, 102, 255));
        BtnAgregarEmpleado1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnAgregarEmpleado1.setText("Registrar");
        BtnAgregarEmpleado1.setToolTipText("Boton que registra los datos del empleado del formulario");
        BtnAgregarEmpleado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarEmpleado1ActionPerformed(evt);
            }
        });
        jPanel1.add(BtnAgregarEmpleado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 120, 30));

        btnModificar1.setBackground(new java.awt.Color(102, 102, 255));
        btnModificar1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnModificar1.setText("Actualizar");
        btnModificar1.setToolTipText("Actualiza los datos de un Empleado ya ingresado en el sistema");
        btnModificar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 330, 110, -1));

        btnEliminarEmple1.setBackground(new java.awt.Color(102, 102, 255));
        btnEliminarEmple1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEliminarEmple1.setText("Eliminar");
        btnEliminarEmple1.setToolTipText("Elimina a un empleado del sistema");
        btnEliminarEmple1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarEmple1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminarEmple1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 390, 110, 30));

        ComboRol.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ComboRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MEC", "BOD", "ADM" }));
        ComboRol.setToolTipText("Rol del Usuario en el sistema");
        ComboRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboRolActionPerformed(evt);
            }
        });
        ComboRol.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ComboRolKeyReleased(evt);
            }
        });
        jPanel1.add(ComboRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 119, -1));

        btnLimpiar.setBackground(new java.awt.Color(102, 102, 255));
        btnLimpiar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLimpiar.setText("Nuevo");
        btnLimpiar.setToolTipText("Limpia los datos del formulario para el ingreso de uno  nuevo");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 270, 110, 30));

        combboxCARGO.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        combboxCARGO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Supervisor", "Lavadores", "Mecanico " }));
        combboxCARGO.setToolTipText("Seleccionar Cargo del taller Mecanico ");
        combboxCARGO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                combboxCARGOKeyReleased(evt);
            }
        });
        jPanel1.add(combboxCARGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 119, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 750, -1));

        jLabel22.setForeground(new java.awt.Color(240, 240, 240));
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_exit_40px_1_1.png"))); // NOI18N
        jLabel22.setText("Salir");
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 10, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Filtrar por Nombre:  ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, -1, -1));

        txtFiltrarNombnre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtFiltrarNombnre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 204)));
        txtFiltrarNombnre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFiltrarNombnreKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFiltrarNombnreKeyTyped(evt);
            }
        });
        jPanel1.add(txtFiltrarNombnre, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 440, 130, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TablaEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaEmpleadosMouseClicked

        int seleccion = TablaEmpleados.rowAtPoint(evt.getPoint());

       txtRutEmpleado.setText(TablaEmpleados.getValueAt(seleccion, 0)+"");
      txtNombreEmpleado.setText(TablaEmpleados.getValueAt(seleccion, 1)+"");
     txtApellEmpleado.setText(TablaEmpleados.getValueAt(seleccion, 2)+"");
       txtDireccEmpleado.setText(TablaEmpleados.getValueAt(seleccion, 3)+"");
      txtTelefonoEmpleado.setText(TablaEmpleados.getValueAt(seleccion, 4)+"");
      txtCorreoEmpleado.setText(TablaEmpleados.getValueAt(seleccion, 5)+"");
        combboxCARGO.setSelectedItem(TablaEmpleados.getValueAt(seleccion, 6)+"");
        ComboRol.setSelectedItem(TablaEmpleados.getValueAt(seleccion, 7)+"");
        txtpassEmpleado.setText(TablaEmpleados.getValueAt(seleccion, 8)+"");
        txtUserNameEmpleado.setText(TablaEmpleados.getValueAt(seleccion, 9)+"");
      
      HabilitarBotonEditarEmpleado();
      HabilitarBotonEliminarEmpleado();

    }//GEN-LAST:event_TablaEmpleadosMouseClicked

    private void BtnAgregarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarEmpleadoActionPerformed


    }//GEN-LAST:event_BtnAgregarEmpleadoActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

     

    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarEmpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarEmpleActionPerformed

     

    }//GEN-LAST:event_btnEliminarEmpleActionPerformed

    private void BtnAgregarEmpleado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarEmpleado1ActionPerformed
       
        
          int i = JOptionPane.showConfirmDialog(this, "¿Estas seguro que deseas Registrar este empleado"); 
          if(i==0){
              
                  if(txtRutEmpleado.getText().isEmpty() || 
                txtNombreEmpleado.getText().isEmpty() ||
                    txtApellEmpleado.getText().isEmpty() ||
                        txtDireccEmpleado.getText().isEmpty() || 
                            txtTelefonoEmpleado.getText().isEmpty() ||
                                txtCorreoEmpleado.getText().isEmpty() ||
                                    ComboRol.getSelectedItem().toString().isEmpty() ||
                                        combboxCARGO.getSelectedItem().toString().isEmpty() ||
                                            txtpassEmpleado.getText().isEmpty() ||
                                                       txtUserNameEmpleado.getText().isEmpty())
        {
            
           JOptionPane.showMessageDialog(null, "Llene todos los campos"); 
            
        }
        
        else
        {
        ValidarRut vr = new ValidarRut();    
        if(vr.ValidarRut(txtRutEmpleado.getText())){    
            
        Empleado modelE = new Empleado();
        EmpleadoDAO daoEm = new EmpleadoDAO();

        modelE.setRutEm(txtRutEmpleado.getText());
        modelE.setNomEm(txtNombreEmpleado.getText());
        modelE.setApellEm(txtApellEmpleado.getText());
        modelE.setDirEm(txtDireccEmpleado.getText());
        modelE.setTelefoEm(Integer.parseInt(txtTelefonoEmpleado.getText()));
        modelE.setCorreoEm(txtCorreoEmpleado.getText());
        modelE.setCargoEm(combboxCARGO.getItemAt(combboxCARGO.getSelectedIndex()));
        modelE.setRolEm(ComboRol.getItemAt(ComboRol.getSelectedIndex()));
        modelE.setPassEm(txtpassEmpleado.getText());
        modelE.setUsernameEm(txtUserNameEmpleado.getText());

        if(daoEm.registroEmpleado(modelE)){

            JOptionPane.showMessageDialog(null, "Se registro al empleado con exito");
            ListarEmple();
            LimpiarEmpleado();
            HabilitarBotonGuardarEmpleado();

          } 
            
        }
        
     }  
       
              
              
              
          } else if(i==1)
          {
              JOptionPane.showMessageDialog(this, "Se cancelo el registro del empleado");
          }
        
        
    

        
    }//GEN-LAST:event_BtnAgregarEmpleado1ActionPerformed

    private void btnModificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificar1ActionPerformed

        int i = JOptionPane.showConfirmDialog(this, "¿Estas seguro que deseas actualizar los datos del empleado?"); 
        if(i==0) {
            
               if(txtRutEmpleado.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Se debe tener un rut para editar");
        }
        
        else
        {
            
        Empleado modelE = new Empleado();
        EmpleadoDAO daoEm = new EmpleadoDAO();

        modelE.setRutEm(txtRutEmpleado.getText());
        modelE.setNomEm(txtNombreEmpleado.getText());
        modelE.setApellEm(txtApellEmpleado.getText());
        modelE.setDirEm(txtDireccEmpleado.getText());
        modelE.setTelefoEm(Integer.parseInt(txtTelefonoEmpleado.getText()));
        modelE.setCorreoEm(txtCorreoEmpleado.getText());
        modelE.setCargoEm(combboxCARGO.getItemAt(combboxCARGO.getSelectedIndex()));
        modelE.setRolEm(ComboRol.getItemAt(ComboRol.getSelectedIndex()));
        modelE.setPassEm(txtpassEmpleado.getText());
        modelE.setUsernameEm(txtUserNameEmpleado.getText());

        if(daoEm.ModificarEmpleado(modelE)){
 
         JOptionPane.showMessageDialog(null, "Se modifico al personal con exito");
         ListarEmple();
         HabilitarBotonEditarEmpleado();

        }
            
            
        }
            
            
        } else if(i==1)
        {
            
             JOptionPane.showMessageDialog(this, "Se cancelo la actualizacion de datos del empleado");
            
        }
        
        
     
        
      
    }//GEN-LAST:event_btnModificar1ActionPerformed

    private void btnEliminarEmple1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarEmple1ActionPerformed

        int i = JOptionPane.showConfirmDialog(this, "¿Estas seguro que deseas eliminar el empleado"); 
       
        if(i==0) {
            
            
        Empleado modelE = new Empleado();
        EmpleadoDAO daoEm = new EmpleadoDAO();
        
        modelE.setNomEm(txtNombreEmpleado.getText());
        modelE.setApellEm(txtApellEmpleado.getText());
        modelE.setDirEm(txtDireccEmpleado.getText());
        modelE.setTelefoEm(Integer.parseInt(txtTelefonoEmpleado.getText()));
        modelE.setCorreoEm(txtCorreoEmpleado.getText());
        modelE.setCargoEm(combboxCARGO.getItemAt(combboxCARGO.getSelectedIndex()));
        modelE.setRolEm(ComboRol.getItemAt(ComboRol.getSelectedIndex()));
        modelE.setPassEm(txtpassEmpleado.getText());
        modelE.setUsernameEm(txtUserNameEmpleado.getText());

        modelE.setRutEm(txtRutEmpleado.getText());
        if(daoEm.EliminarEmpleado(modelE)){

            JOptionPane.showMessageDialog(null, "Personal Eliminado con exito");
            HabilitarBotonEliminarEmpleado();
            ListarEmple();

        }
      
      } else if(i==1)
      {
           JOptionPane.showMessageDialog(this, "Se cancelo la eliminacion del Empleado");
      }
        
        
        
      
    }//GEN-LAST:event_btnEliminarEmple1ActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
       
       LimpiarEmpleado();
       HabilitarBotonEditarEmpleado();
       HabilitarBotonGuardarEmpleado();
       HabilitarBotonEliminarEmpleado();
           
           
        
        
        
        
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtRutEmpleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRutEmpleadoKeyTyped
       
        
         int numerocaracteres = 10; 
        
        if(txtRutEmpleado.getText().length() >= numerocaracteres) {
            evt.consume();
   
            JOptionPane.showMessageDialog(rootPane, "No puede tener mas de 10 caracteres");
        }
        
        
    }//GEN-LAST:event_txtRutEmpleadoKeyTyped

    private void txtNombreEmpleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreEmpleadoKeyTyped
             
        char c = evt.getKeyChar(); 
        
        if(!Character.isLetter(c)){
            evt.consume();
        }
          
         int numerocaracteres = 30; 
        
        if(txtNombreEmpleado.getText().length() >= numerocaracteres) {
            evt.consume();
   
            JOptionPane.showMessageDialog(rootPane, "No puede tener mas de 30 caracteres");
        }
        
        
        
        
    }//GEN-LAST:event_txtNombreEmpleadoKeyTyped

    private void txtApellEmpleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellEmpleadoKeyTyped
        
             
        char c = evt.getKeyChar(); 
        
        if(!Character.isLetter(c)){
            evt.consume();
        }
        
           int numerocaracteres = 30; 
        
        if(txtApellEmpleado.getText().length() >= numerocaracteres) {
            evt.consume();
   
            JOptionPane.showMessageDialog(rootPane, "No puede tener mas de 30 caracteres");
        }
        
        
        
    }//GEN-LAST:event_txtApellEmpleadoKeyTyped

    private void txtDireccEmpleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccEmpleadoKeyTyped
      
           int numerocaracteres = 50; 
        
        if(txtDireccEmpleado.getText().length() >= numerocaracteres) {
            evt.consume();
   
            JOptionPane.showMessageDialog(rootPane, "No puede tener mas de 50 caracteres");
        }
        
        
    }//GEN-LAST:event_txtDireccEmpleadoKeyTyped

    private void txtCorreoEmpleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoEmpleadoKeyTyped
       
           int numerocaracteres = 30; 
        
        if(txtCorreoEmpleado.getText().length() >= numerocaracteres) {
            evt.consume();
   
            JOptionPane.showMessageDialog(rootPane, "No puede tener mas de 50 caracteres");
        }
        
        
    }//GEN-LAST:event_txtCorreoEmpleadoKeyTyped

    private void txtTelefonoEmpleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoEmpleadoKeyTyped
     
          char c = evt.getKeyChar(); 
        
        if(!Character.isDigit(c)){
            evt.consume();
        }
        
        int numerocaracteres = 9; 
        
        if(txtTelefonoEmpleado.getText().length() >= numerocaracteres) {
            evt.consume();
   
            JOptionPane.showMessageDialog(rootPane, "el numero de telefono no puede ser mas de 9 digitos");
        }
        
        
        
    }//GEN-LAST:event_txtTelefonoEmpleadoKeyTyped

    private void txtUserNameEmpleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserNameEmpleadoKeyTyped
      
         int numerocaracteres = 30; 
        
        if(txtUserNameEmpleado.getText().length() >= numerocaracteres) {
            evt.consume();
   
            JOptionPane.showMessageDialog(rootPane, "No puede tener mas de 30 caracteres");
        }
        
        
        
    }//GEN-LAST:event_txtUserNameEmpleadoKeyTyped

    private void txtpassEmpleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpassEmpleadoKeyTyped
       
              
         int numerocaracteres = 30; 
        
        if(txtpassEmpleado.getText().length() >= numerocaracteres) {
            evt.consume();
   
            JOptionPane.showMessageDialog(rootPane, "No puede tener mas de 30 caracteres");
        }
        
        
        
        
        
    }//GEN-LAST:event_txtpassEmpleadoKeyTyped

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        
               MenuUI mm = new MenuUI(); 
                mm.setVisible(true);
                this.setVisible(false);
        
        
    }//GEN-LAST:event_jLabel22MouseClicked

    private void txtRutEmpleadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRutEmpleadoKeyReleased
       HabilitarBotonGuardarEmpleado();
       HabilitarBotonEditarEmpleado();
    }//GEN-LAST:event_txtRutEmpleadoKeyReleased

    private void txtNombreEmpleadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreEmpleadoKeyReleased
       HabilitarBotonGuardarEmpleado();
       HabilitarBotonEditarEmpleado();
    }//GEN-LAST:event_txtNombreEmpleadoKeyReleased

    private void txtApellEmpleadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellEmpleadoKeyReleased
       HabilitarBotonGuardarEmpleado();
       HabilitarBotonEditarEmpleado();
    }//GEN-LAST:event_txtApellEmpleadoKeyReleased

    private void txtDireccEmpleadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccEmpleadoKeyReleased
        HabilitarBotonGuardarEmpleado();
        HabilitarBotonEditarEmpleado();
    }//GEN-LAST:event_txtDireccEmpleadoKeyReleased

    private void txtCorreoEmpleadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoEmpleadoKeyReleased
      HabilitarBotonGuardarEmpleado();
      HabilitarBotonEditarEmpleado();
    }//GEN-LAST:event_txtCorreoEmpleadoKeyReleased

    private void combboxCARGOKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_combboxCARGOKeyReleased
      HabilitarBotonEditarEmpleado();
      HabilitarBotonGuardarEmpleado();
    }//GEN-LAST:event_combboxCARGOKeyReleased

    private void ComboRolKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ComboRolKeyReleased
      HabilitarBotonEditarEmpleado();
      HabilitarBotonGuardarEmpleado();
    }//GEN-LAST:event_ComboRolKeyReleased

    private void txtTelefonoEmpleadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoEmpleadoKeyReleased
        HabilitarBotonGuardarEmpleado();
        HabilitarBotonEditarEmpleado();
    }//GEN-LAST:event_txtTelefonoEmpleadoKeyReleased

    private void txtUserNameEmpleadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserNameEmpleadoKeyReleased
        HabilitarBotonGuardarEmpleado();
        HabilitarBotonEditarEmpleado();
    }//GEN-LAST:event_txtUserNameEmpleadoKeyReleased

    private void txtpassEmpleadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpassEmpleadoKeyReleased
        HabilitarBotonGuardarEmpleado();
        HabilitarBotonEditarEmpleado();
    }//GEN-LAST:event_txtpassEmpleadoKeyReleased

    private void ComboRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboRolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboRolActionPerformed

    private void txtApellEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellEmpleadoActionPerformed

    private void txtFiltrarNombnreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltrarNombnreKeyTyped
        
        txtFiltrarNombnre.addKeyListener(new KeyAdapter()
        {
            @Override
            public void keyTyped(KeyEvent e) {

                
                trs.setRowFilter(RowFilter.regexFilter("(?i)"+txtFiltrarNombnre.getText(),1));
            }
        });
  
        trs = new TableRowSorter(TablaEmpleados.getModel()); 
        TablaEmpleados.setRowSorter(trs);
       
        
                
        
    }//GEN-LAST:event_txtFiltrarNombnreKeyTyped

    private void txtFiltrarNombnreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltrarNombnreKeyReleased
        
        
        
    }//GEN-LAST:event_txtFiltrarNombnreKeyReleased

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
            java.util.logging.Logger.getLogger(EmpleadoRealUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmpleadoRealUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmpleadoRealUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmpleadoRealUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmpleadoRealUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgregarEmpleado;
    private javax.swing.JButton BtnAgregarEmpleado1;
    private javax.swing.JComboBox<String> ComboRol;
    private javax.swing.JTable TablaEmpleados;
    private javax.swing.JButton btnEliminarEmple;
    private javax.swing.JButton btnEliminarEmple1;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnModificar1;
    private javax.swing.JComboBox<String> combboxCARGO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField txtApellEmple;
    private javax.swing.JTextField txtApellEmpleado;
    private javax.swing.JTextField txtCargoEmple;
    private javax.swing.JTextField txtCorreoEmple;
    private javax.swing.JTextField txtCorreoEmpleado;
    private javax.swing.JTextField txtDireccEmple;
    private javax.swing.JTextField txtDireccEmpleado;
    private javax.swing.JTextField txtFiltrarNombnre;
    private javax.swing.JTextField txtNombreEmple;
    private javax.swing.JTextField txtNombreEmpleado;
    private javax.swing.JTextField txtRolemple;
    private javax.swing.JTextField txtRutEmpleado;
    private javax.swing.JTextField txtTelefonoEmple;
    private javax.swing.JTextField txtTelefonoEmpleado;
    private javax.swing.JTextField txtUserNameEmple;
    private javax.swing.JTextField txtUserNameEmpleado;
    private javax.swing.JTextField txtpassEmple;
    private javax.swing.JTextField txtpassEmpleado;
    // End of variables declaration//GEN-END:variables
}
