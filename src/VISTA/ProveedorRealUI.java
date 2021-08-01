/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VISTA;

import CONTROLADOR.ProveedorDAO;
import MODELO.Proveedor;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author pablo
 */
public class ProveedorRealUI extends javax.swing.JFrame {

    /**
     * Creates new form ProveedorRealUI
     */
    public ProveedorRealUI() {
        initComponents();
        setLocationRelativeTo(null);
        ListarPro();
        cerrar();
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/logoServi2.png")).getImage());
        
        btnAgregarProveedor.setEnabled(false);
        btnEditar.setEnabled(false);
        btnEliminar.setEnabled(false);
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
     
        public void habilitarBotonEliminarPro()
    {
          if(!txtRutProveedor.getText().isEmpty() && 
             !txtNombreProveedor.getText().isEmpty() &&
              !txtApellidoProveedor.getText().isEmpty() &&
                !txtCorreoProveedor.getText().isEmpty() &&
                   !txtTelefonoProveedor.getText().isEmpty() &&
                      !txtRubroProveedor.getText().isEmpty() &&
                        !txtRazonSocial.getText().isEmpty()){
              
              btnEliminar.setEnabled(true);
              
          }
          else
          {
              btnEliminar.setEnabled(false);
          }
    }
     
      public void habilitarBotonEditarPro()
    {
          if(!txtRutProveedor.getText().isEmpty() && 
             !txtNombreProveedor.getText().isEmpty() &&
              !txtApellidoProveedor.getText().isEmpty() &&
                !txtCorreoProveedor.getText().isEmpty() &&
                   !txtTelefonoProveedor.getText().isEmpty() &&
                      !txtRubroProveedor.getText().isEmpty() &&
                        !txtRazonSocial.getText().isEmpty()){
              
              btnEditar.setEnabled(true);
              
          }
          else
          {
              btnEditar.setEnabled(false);
          }
    }
    
    public void habilitarBotonGuardarPro()
    {
          if(!txtRutProveedor.getText().isEmpty() && 
             !txtNombreProveedor.getText().isEmpty() &&
              !txtApellidoProveedor.getText().isEmpty() &&
                !txtCorreoProveedor.getText().isEmpty() &&
                   !txtTelefonoProveedor.getText().isEmpty() &&
                      !txtRubroProveedor.getText().isEmpty() &&
                        !txtRazonSocial.getText().isEmpty()){
              
              btnAgregarProveedor.setEnabled(true);
              
          }
          else
          {
              btnAgregarProveedor.setEnabled(false);
          }
    }
    
    private void ListarPro(){
        
        ProveedorDAO daoP = new ProveedorDAO();
        TablaPROVEEDORES.setModel(daoP.listarProveedores());
        
        
    }
    
    
    private void LimpiarProveedor()
    {
                txtRutProveedor.setText("");
                txtNombreProveedor.setText("");
                txtApellidoProveedor.setText("");
                txtCorreoProveedor.setText("");
                txtTelefonoProveedor.setText("");
                txtRubroProveedor.setText("");
                txtRazonSocial.setText("");
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtRutProveedor = new javax.swing.JTextField();
        txtNombreProveedor = new javax.swing.JTextField();
        txtApellidoProveedor = new javax.swing.JTextField();
        txtCorreoProveedor = new javax.swing.JTextField();
        txtTelefonoProveedor = new javax.swing.JTextField();
        txtRubroProveedor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaPROVEEDORES = new javax.swing.JTable();
        btnAgregarProveedor = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        btnbuscar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtRazonSocial = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Rut: ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Apellido: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Razón social: ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("Teléfono: ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("Rubro: ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, -1, -1));

        txtRutProveedor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtRutProveedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 204)));
        txtRutProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRutProveedorKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRutProveedorKeyTyped(evt);
            }
        });
        jPanel1.add(txtRutProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 150, 20));

        txtNombreProveedor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtNombreProveedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 204)));
        txtNombreProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreProveedorKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreProveedorKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombreProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 150, 20));

        txtApellidoProveedor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtApellidoProveedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 204)));
        txtApellidoProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtApellidoProveedorKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoProveedorKeyTyped(evt);
            }
        });
        jPanel1.add(txtApellidoProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 150, 20));

        txtCorreoProveedor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtCorreoProveedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 204)));
        txtCorreoProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCorreoProveedorKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCorreoProveedorKeyTyped(evt);
            }
        });
        jPanel1.add(txtCorreoProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 160, 20));

        txtTelefonoProveedor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtTelefonoProveedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 204)));
        txtTelefonoProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTelefonoProveedorKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoProveedorKeyTyped(evt);
            }
        });
        jPanel1.add(txtTelefonoProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 160, 20));

        txtRubroProveedor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtRubroProveedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 204)));
        txtRubroProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRubroProveedorKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRubroProveedorKeyTyped(evt);
            }
        });
        jPanel1.add(txtRubroProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 160, 20));

        TablaPROVEEDORES.setBackground(new java.awt.Color(102, 255, 102));
        TablaPROVEEDORES.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        TablaPROVEEDORES.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TablaPROVEEDORES.setModel(new javax.swing.table.DefaultTableModel(
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
        TablaPROVEEDORES.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaPROVEEDORESMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaPROVEEDORES);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 520, 170));

        btnAgregarProveedor.setBackground(new java.awt.Color(102, 102, 255));
        btnAgregarProveedor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAgregarProveedor.setText("Registrar");
        btnAgregarProveedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        btnAgregarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProveedorActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregarProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 223, 140, 40));

        btnEditar.setBackground(new java.awt.Color(102, 102, 255));
        btnEditar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEditar.setText("Actualizar");
        btnEditar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 350, 120, 40));

        btnEliminar.setBackground(new java.awt.Color(102, 102, 255));
        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 410, 120, 40));

        btnLimpiar.setBackground(new java.awt.Color(102, 102, 255));
        btnLimpiar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLimpiar.setText("Nuevo");
        btnLimpiar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 290, 120, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText("Gestión Proveedores");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 71, 738, 16));

        jLabel10.setForeground(new java.awt.Color(240, 240, 240));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_exit_40px_1.png"))); // NOI18N
        jLabel10.setText("Salir");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, -1, -1));

        btnbuscar.setBackground(new java.awt.Color(102, 102, 255));
        btnbuscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnbuscar.setText("Buscar");
        btnbuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 230, 120, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setText("Correo: ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, -1, -1));

        txtRazonSocial.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtRazonSocial.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 204)));
        txtRazonSocial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRazonSocialKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRazonSocialKeyTyped(evt);
            }
        });
        jPanel1.add(txtRazonSocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 90, 90, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 774, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProveedorActionPerformed
      
         int i = JOptionPane.showConfirmDialog(this, "¿Estas seguro que deseas Registrar este Proveedor"); 
         if(i==0)
         {
          if(txtRutProveedor.getText().isEmpty() || 
            txtNombreProveedor.getText().isEmpty() ||
              txtApellidoProveedor.getText().isEmpty() ||
                 txtCorreoProveedor.getText().isEmpty() ||
                   txtTelefonoProveedor.getText().isEmpty() ||
                      txtRubroProveedor.getText().isEmpty()|| 
                       txtRazonSocial.getText().isEmpty()) {
                     
            JOptionPane.showMessageDialog(null, "Llene todos los campos");
        }
        else{
            
           
            
            Proveedor ModelPr = new Proveedor();
            ProveedorDAO daoPr = new ProveedorDAO();
            
           ModelPr.setRutPro(txtRutProveedor.getText());
           ModelPr.setNombrePro(txtNombreProveedor.getText());
           ModelPr.setApellidoPro(txtApellidoProveedor.getText());
           ModelPr.setCorreoPro(txtCorreoProveedor.getText());
           ModelPr.setTelefonoPro(Integer.parseInt(txtTelefonoProveedor.getText()));
           ModelPr.setRubroPro(txtRubroProveedor.getText());
           ModelPr.setRazon(txtRazonSocial.getText());
           if(daoPr.registroProveedor(ModelPr))
           {
               JOptionPane.showMessageDialog(null, "Se registro el Proveedor con exito");
               ListarPro();
               LimpiarProveedor(); 
               habilitarBotonGuardarPro();
               
           } 
            
        }
             
         }
         else if(i==1)
         {
              JOptionPane.showMessageDialog(this, "Se cancelo el registro del Proveedor");
         }
        
        
     
        
        
    }//GEN-LAST:event_btnAgregarProveedorActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        
        if(txtRutProveedor.getText().isEmpty())
        {
            String mensaje = "Debe ingresar el rut del proveedor";
            JOptionPane.showMessageDialog(null, mensaje);
                    
        }
        else{
            Proveedor ModelPr = new Proveedor();
            ProveedorDAO daoPr = new ProveedorDAO();
            
           ModelPr.setRutPro(txtRutProveedor.getText());
           ModelPr.setNombrePro(txtNombreProveedor.getText());
           ModelPr.setApellidoPro(txtApellidoProveedor.getText());
           ModelPr.setCorreoPro(txtCorreoProveedor.getText());
           ModelPr.setTelefonoPro(Integer.parseInt(txtTelefonoProveedor.getText()));
           ModelPr.setRubroPro(txtRubroProveedor.getText());
           ModelPr.setRazon(txtRazonSocial.getText());
           if(daoPr.ModificarProveedor(ModelPr))
           {
               JOptionPane.showMessageDialog(null, "Se Modifico el Proveedor con exito");
               ListarPro();
               LimpiarProveedor();
               habilitarBotonEditarPro();
               
           }
           
            
            
        }
        
        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
          if(txtRutProveedor.getText().isEmpty())
          {
              String mensaje = "debe tener un rut para eliminar los datos"; 
              JOptionPane.showMessageDialog(null, mensaje);
          }
          else
          {
              
            Proveedor ModelPr = new Proveedor();
            ProveedorDAO daoPr = new ProveedorDAO();
            ModelPr.setRutPro(txtRutProveedor.getText());
            if(daoPr.eliminarProveedor(ModelPr)){
                
                JOptionPane.showMessageDialog(null, "Proveedor Eliminado con exito");
                ListarPro();
                LimpiarProveedor(); 
                habilitarBotonEliminarPro();
              
              
             }
            
          } 
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
       
            LimpiarProveedor();
            habilitarBotonGuardarPro();
            habilitarBotonEliminarPro();
            habilitarBotonEditarPro();
        
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void TablaPROVEEDORESMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaPROVEEDORESMouseClicked
        
        int seleccion = TablaPROVEEDORES.rowAtPoint(evt.getPoint()); 
        
        txtRutProveedor.setText(TablaPROVEEDORES.getValueAt(seleccion, 0)+"");
        txtNombreProveedor.setText(TablaPROVEEDORES.getValueAt(seleccion, 1)+"");
        txtApellidoProveedor.setText(TablaPROVEEDORES.getValueAt(seleccion, 2)+"");
        txtCorreoProveedor.setText(TablaPROVEEDORES.getValueAt(seleccion, 3)+"");
        txtTelefonoProveedor.setText(TablaPROVEEDORES.getValueAt(seleccion, 4)+"");
        txtRubroProveedor.setText(TablaPROVEEDORES.getValueAt(seleccion, 5)+"");
        txtRazonSocial.setText(TablaPROVEEDORES.getValueAt(seleccion, 6)+"");
        
        habilitarBotonEliminarPro();
        habilitarBotonEditarPro();
        
        
    }//GEN-LAST:event_TablaPROVEEDORESMouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        MenuUI mm = new MenuUI();
        mm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void txtRutProveedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRutProveedorKeyTyped
       
           int numerocaracteres = 10; 
        
        if(txtRutProveedor.getText().length() >= numerocaracteres) {
            evt.consume();
   
            JOptionPane.showMessageDialog(rootPane, "El RUT no puede tener mas de 9 Caracteres");
        }
        
        
    }//GEN-LAST:event_txtRutProveedorKeyTyped

    private void txtNombreProveedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreProveedorKeyTyped
        
          char c = evt.getKeyChar(); 
        
        if(!Character.isLetter(c)){
            evt.consume();
        }
        
        
        
      int numerocaracteres = 30; 
        
        if(txtNombreProveedor.getText().length() >= numerocaracteres) {
            evt.consume();
   
            JOptionPane.showMessageDialog(rootPane, "El Nombre no puede tener mas de 30 Caracteres");
        }
        
        
        
    }//GEN-LAST:event_txtNombreProveedorKeyTyped

    private void txtApellidoProveedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoProveedorKeyTyped
       
         char c = evt.getKeyChar(); 
        
        if(!Character.isLetter(c)){
            evt.consume();
        }
        
        
        
      int numerocaracteres = 30; 
        
        if(txtApellidoProveedor.getText().length() >= numerocaracteres) {
            evt.consume();
   
            JOptionPane.showMessageDialog(rootPane, "El Apellido no puede tener mas de 30 Caracteres");
        }
        
        
    }//GEN-LAST:event_txtApellidoProveedorKeyTyped

    private void txtCorreoProveedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoProveedorKeyTyped
        
         int numerocaracteres = 30; 
        
        if(txtCorreoProveedor.getText().length() >= numerocaracteres) {
            evt.consume();
   
            JOptionPane.showMessageDialog(rootPane, "El Correo no puede tener mas de 30 Caracteres");
        }
        
        
        
    }//GEN-LAST:event_txtCorreoProveedorKeyTyped

    private void txtTelefonoProveedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoProveedorKeyTyped
       
            char c = evt.getKeyChar(); 
        
        if(!Character.isDigit(c)){
            evt.consume();
        }
        
        int numerocaracteres = 9; 
        
        if(txtTelefonoProveedor.getText().length() >= numerocaracteres) {
            evt.consume();
   
            JOptionPane.showMessageDialog(rootPane, "el numero de telefono no puede ser mas de 9 digitos");
        }
        
        
    }//GEN-LAST:event_txtTelefonoProveedorKeyTyped

    private void txtRubroProveedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRubroProveedorKeyTyped
        
           int numerocaracteres = 30; 
        
        if(txtRubroProveedor.getText().length() >= numerocaracteres) {
            evt.consume();
   
            JOptionPane.showMessageDialog(rootPane, "El rubro no puede tener mas de 30 Caracteres");
        }
        
        
        
    }//GEN-LAST:event_txtRubroProveedorKeyTyped

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
       
        ProveedorDAO s = new ProveedorDAO();
        
        int telefono = s.buscarClientePorRut(txtRutProveedor.getText()); 
        
        txtTelefonoProveedor.setText(String.valueOf(telefono));
        
        
        
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void txtRutProveedorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRutProveedorKeyReleased
       habilitarBotonGuardarPro();
       habilitarBotonEliminarPro();
    }//GEN-LAST:event_txtRutProveedorKeyReleased

    private void txtNombreProveedorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreProveedorKeyReleased
       habilitarBotonGuardarPro();
       habilitarBotonEditarPro();
    }//GEN-LAST:event_txtNombreProveedorKeyReleased

    private void txtApellidoProveedorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoProveedorKeyReleased
        habilitarBotonGuardarPro();
        habilitarBotonEditarPro();
    }//GEN-LAST:event_txtApellidoProveedorKeyReleased

    private void txtCorreoProveedorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoProveedorKeyReleased
        habilitarBotonGuardarPro();
        habilitarBotonEditarPro();
    }//GEN-LAST:event_txtCorreoProveedorKeyReleased

    private void txtTelefonoProveedorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoProveedorKeyReleased
        habilitarBotonGuardarPro();
        habilitarBotonEditarPro();
    }//GEN-LAST:event_txtTelefonoProveedorKeyReleased

    private void txtRubroProveedorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRubroProveedorKeyReleased
       habilitarBotonGuardarPro();
       habilitarBotonEditarPro();
    }//GEN-LAST:event_txtRubroProveedorKeyReleased

    private void txtRazonSocialKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRazonSocialKeyReleased
       habilitarBotonGuardarPro();
       habilitarBotonEditarPro();
    }//GEN-LAST:event_txtRazonSocialKeyReleased

    private void txtRazonSocialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRazonSocialKeyTyped
            int numerocaracteres = 80; 
        
        if(txtRazonSocial.getText().length() >= numerocaracteres) {
            evt.consume();
   
            JOptionPane.showMessageDialog(rootPane, "La Razon social no puede tener mas de 80 Caracteres");
        }
    }//GEN-LAST:event_txtRazonSocialKeyTyped

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
            java.util.logging.Logger.getLogger(ProveedorRealUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProveedorRealUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProveedorRealUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProveedorRealUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProveedorRealUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaPROVEEDORES;
    private javax.swing.JButton btnAgregarProveedor;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtApellidoProveedor;
    private javax.swing.JTextField txtCorreoProveedor;
    private javax.swing.JTextField txtNombreProveedor;
    private javax.swing.JTextField txtRazonSocial;
    private javax.swing.JTextField txtRubroProveedor;
    private javax.swing.JTextField txtRutProveedor;
    private javax.swing.JTextField txtTelefonoProveedor;
    // End of variables declaration//GEN-END:variables
}
