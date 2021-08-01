/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VISTA;

import CONTROLADOR.DetallePedidoDAO;
import CONTROLADOR.PedidoDAO;
import MODELO.DetallePedido;
import MODELO.Pedido;
import NEGOCIO.ComboProducto;
import NEGOCIO.ComboProveedorRutNom;
import NEGOCIO.pedidoNegocio;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author pablo
 */
public class PedidoUI extends javax.swing.JFrame {

    
    
    DetallePedidoDAO cargarcombodetalle = new DetallePedidoDAO();
    PedidoDAO cargacombopedido = new PedidoDAO(); 
    
    private pedidoNegocio ped = new pedidoNegocio(); 
    
     
    
    
    /**
     * Creates new form PedidoUI
     */
    public PedidoUI() {
        initComponents();
        setLocationRelativeTo(null);
        cerrar();
         setIconImage(new ImageIcon(getClass().getResource("/Imagenes/logoServi2.png")).getImage());
        
        idMax();
        
        cargarcombodetalle.consultar_producto(COMBOIDPRODUCTO);
        
        cargacombopedido.consultar_empleado(COMBOEMPLEADORUT);
        
         cargacombopedido.consultar_ProveedorNombre(COMBOPROVEEDOR);
        
         cargarcombodetalle.consultar_ProveedorNombreDETALLE(COMBOPRODETALLEPEDIDO);
         
         txtidPedido.setEditable(false);
         txtestado.setEditable(false);
         txtTotalProduc.setEditable(false);
         
         btnRegistrar.setEnabled(false);
        
    }
    
    public void idMax()
    {
        txtidPedido.setText(ped.getMaxID()+"");
    }
    
    private void LimpiarPedido()
    {
        txtCantidadPro.setText("");
        txtComentario.setText("");
        txtPrecioUnidadPro.setText("");
        txtTotalProduc.setText("");
        COMBOIDPRODUCTO.setSelectedIndex(-1);      
        COMBOPRODETALLEPEDIDO.setSelectedIndex(-1);
        //fecha venci// 
        
        //fechapedido//
        txtDescripcion.setText("");
        COMBOEMPLEADORUT.setSelectedIndex(-1);
        COMBOPROVEEDOR.setSelectedIndex(-1);
        
        idMax();
        
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
     
    public void HabilitarBotonGuardar()
    {
        if(!txtidPedido.getText().isEmpty() && 
            !txtDescripcion.getText().isEmpty() &&
                !COMBOEMPLEADORUT.getSelectedItem().toString().isEmpty() && 
                 !COMBOPROVEEDOR.getSelectedItem().toString().isEmpty() && 
                  !txtCantidadPro.getText().isEmpty() && 
                   !txtestado.getText().isEmpty() && 
                     !txtComentario.getText().isEmpty() &&
                       !txtPrecioUnidadPro.getText().isEmpty() && 
                         !txtTotalProduc.getText().isEmpty() && 
                           !COMBOIDPRODUCTO.getSelectedItem().toString().isEmpty() &&
                            !COMBOPRODETALLEPEDIDO.getSelectedItem().toString().isEmpty())
        {
                    btnRegistrar.setEnabled(true);
        }
        else
        {
            btnRegistrar.setEnabled(false);
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtTotalProduc = new javax.swing.JTextField();
        txtPrecioUnidadPro = new javax.swing.JTextField();
        txtCantidadPro = new javax.swing.JTextField();
        COMBOIDPRODUCTO = new javax.swing.JComboBox<>();
        txtidPedido = new javax.swing.JTextField();
        COMBOEMPLEADORUT = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        COMBOPROVEEDOR = new javax.swing.JComboBox<>();
        txtestado = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtComentario = new javax.swing.JTextArea();
        fechaPedido = new com.toedter.calendar.JDateChooser();
        btnRegistrar = new javax.swing.JButton();
        btnsumartotal = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        COMBOPRODETALLEPEDIDO = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 51));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Registro de Orden Pedido ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 800, 10));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("codigo pedido: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, -1));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(751, 408, 44, 49));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("Cantidad:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, -1, 26));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("Descripción del pedido : ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText("Fecha Orden:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setText("Rut Empleado solicitante: ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(240, 240, 240));
        jLabel9.setText("Confirma Proveedor: ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(240, 240, 240));
        jLabel10.setText("Estado Prioridad: ");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(240, 240, 240));
        jLabel11.setText("Producto:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(240, 240, 240));
        jLabel12.setText("Precio Unitario:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(240, 240, 240));
        jLabel14.setText("Comentario:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, -1, -1));

        txtTotalProduc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtTotalProduc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 204)));
        txtTotalProduc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTotalProducKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTotalProducKeyTyped(evt);
            }
        });
        jPanel1.add(txtTotalProduc, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 290, 200, 30));

        txtPrecioUnidadPro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtPrecioUnidadPro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 204)));
        txtPrecioUnidadPro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPrecioUnidadProKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioUnidadProKeyTyped(evt);
            }
        });
        jPanel1.add(txtPrecioUnidadPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 177, 200, 30));

        txtCantidadPro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtCantidadPro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 204)));
        txtCantidadPro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCantidadProKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadProKeyTyped(evt);
            }
        });
        jPanel1.add(txtCantidadPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, 200, 30));

        COMBOIDPRODUCTO.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        COMBOIDPRODUCTO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 204)));
        COMBOIDPRODUCTO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                COMBOIDPRODUCTOKeyReleased(evt);
            }
        });
        jPanel1.add(COMBOIDPRODUCTO, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 90, 200, -1));

        txtidPedido.setBackground(new java.awt.Color(102, 255, 204));
        txtidPedido.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtidPedido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 204)));
        txtidPedido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtidPedidoKeyReleased(evt);
            }
        });
        jPanel1.add(txtidPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 120, 20));

        COMBOEMPLEADORUT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        COMBOEMPLEADORUT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 204)));
        COMBOEMPLEADORUT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                COMBOEMPLEADORUTKeyReleased(evt);
            }
        });
        jPanel1.add(COMBOEMPLEADORUT, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 180, -1));

        txtDescripcion.setColumns(20);
        txtDescripcion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtDescripcion.setRows(5);
        txtDescripcion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 204)));
        txtDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDescripcionKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescripcionKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(txtDescripcion);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 230, -1));

        COMBOPROVEEDOR.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        COMBOPROVEEDOR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 204)));
        COMBOPROVEEDOR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                COMBOPROVEEDORKeyReleased(evt);
            }
        });
        jPanel1.add(COMBOPROVEEDOR, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 180, -1));

        txtestado.setBackground(new java.awt.Color(102, 255, 204));
        txtestado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtestado.setText("1");
        txtestado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 204)));
        txtestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtestadoActionPerformed(evt);
            }
        });
        txtestado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtestadoKeyReleased(evt);
            }
        });
        jPanel1.add(txtestado, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 120, 20));

        txtComentario.setColumns(20);
        txtComentario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtComentario.setRows(5);
        txtComentario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 204)));
        txtComentario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtComentarioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtComentarioKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(txtComentario);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, 230, 80));

        fechaPedido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 204)));
        jPanel1.add(fechaPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 180, -1));

        btnRegistrar.setBackground(new java.awt.Color(102, 102, 255));
        btnRegistrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRegistrar.setText("Generar Orden");
        btnRegistrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 360, 160, 50));

        btnsumartotal.setBackground(new java.awt.Color(102, 102, 255));
        btnsumartotal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnsumartotal.setText("calcular Total");
        btnsumartotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        btnsumartotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsumartotalActionPerformed(evt);
            }
        });
        jPanel1.add(btnsumartotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 240, 140, 30));

        jLabel15.setForeground(new java.awt.Color(240, 240, 240));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_exit_40px_1.png"))); // NOI18N
        jLabel15.setText("Salir");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, -1, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 0, 160));

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 10, 380));

        COMBOPRODETALLEPEDIDO.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        COMBOPRODETALLEPEDIDO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 204)));
        COMBOPRODETALLEPEDIDO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                COMBOPRODETALLEPEDIDOKeyReleased(evt);
            }
        });
        jPanel1.add(COMBOPRODETALLEPEDIDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 180, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(240, 240, 240));
        jLabel16.setText("Proveedor:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(240, 240, 240));
        jLabel17.setText("Total: ");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, -1, -1));

        jButton2.setBackground(new java.awt.Color(102, 102, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Limpiar");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 430, 160, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 833, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
       
         int i = JOptionPane.showConfirmDialog(this, "¿Estas seguro que deseas crear una orden de pedido?");
        if(i==0) 
        {
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault());
        String date = formato.format(fechaPedido.getDate());
        
        //esto cambie 
        SimpleDateFormat formato2 = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault());
        String date2 = formato2.format(fechaPedido.getDate());
        
        
        Pedido modelPe = new Pedido(); 
        PedidoDAO daoPe = new PedidoDAO();
        
        DetallePedido modelDP = new DetallePedido(); 
        DetallePedidoDAO daoDE = new DetallePedidoDAO();
        
        
        modelPe.setIdPedido(Integer.parseInt(txtidPedido.getText()));
        modelPe.setFechaPedido(date);
        modelPe.setDescripPed(txtDescripcion.getText());
        modelPe.setRutEmplea(COMBOEMPLEADORUT.getItemAt(COMBOEMPLEADORUT.getSelectedIndex()));
       
        ComboProveedorRutNom comboProv = (ComboProveedorRutNom)COMBOPROVEEDOR.getSelectedItem();
        String id3 = comboProv.getRutProv(); 
        modelPe.setRutProvee(id3);
        
        
        modelDP.setCantidad(Integer.parseInt(txtCantidadPro.getText()));
        modelDP.setEstado(Integer.parseInt(txtestado.getText()));
        modelDP.setComentario(txtComentario.getText());
        modelDP.setPrecioUni(Integer.parseInt(txtPrecioUnidadPro.getText()));
        modelDP.setTotal(Integer.parseInt(txtTotalProduc.getText()));
        modelDP.setIdpedido(Integer.parseInt(txtidPedido.getText()));
          
        ComboProducto comboP = (ComboProducto)COMBOIDPRODUCTO.getSelectedItem(); 
        String id = comboP.getIdPro(); 
        modelDP.setIdproducto(Integer.parseInt(id));
        
        modelDP.setFechaVencimiento(date2);
        
        ComboProveedorRutNom comboProvv = (ComboProveedorRutNom)COMBOPRODETALLEPEDIDO.getSelectedItem(); 
        String id2 = comboProvv.getRutProv(); 
        modelDP.setRutProveedor(id2);
        
        
        if(daoPe.registroPedido(modelPe) && (daoDE.registroDetallePedido(modelDP)))
        {
            JOptionPane.showMessageDialog(null, "Se creo la Orden de Pedido con exito");
            LimpiarPedido();
            HabilitarBotonGuardar();
            
        }
            
        }else if(i==1)
        {
            JOptionPane.showMessageDialog(this, "Se Cancelo la creación de una orden de pedido");
        }
        
        
        
                
        
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnsumartotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsumartotalActionPerformed
        
        String cadena1, cadena2;
        int entero1, entero2;
        
        cadena1 = txtCantidadPro.getText();
        cadena2 = txtPrecioUnidadPro.getText();  
        
        entero1 = Integer.parseInt(cadena1);
        entero2 = Integer.parseInt(cadena2);
        
        entero1=entero1*entero2;
        
        cadena1 = Integer.toString(entero1);
        
        
        txtTotalProduc.setText(cadena1);
        
        
        
      
        
        
        
        
    }//GEN-LAST:event_btnsumartotalActionPerformed

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        ModuloBodegaUI mm = new ModuloBodegaUI();
        mm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel15MouseClicked

    private void txtestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtestadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtestadoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        LimpiarPedido();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtCantidadProKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadProKeyTyped
       
        
          char c = evt.getKeyChar(); 
        
        if(!Character.isDigit(c)){
            evt.consume();
        }
        
        int numerocaracteres = 10; 
        
        if(txtCantidadPro.getText().length() >= numerocaracteres) {
            evt.consume();
   
            JOptionPane.showMessageDialog(rootPane, "La cantidad de Productos no puede superar las 10 Cifras");
        }
    }//GEN-LAST:event_txtCantidadProKeyTyped

    private void txtPrecioUnidadProKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioUnidadProKeyTyped
         char c = evt.getKeyChar(); 
        
        if(!Character.isDigit(c)){
            evt.consume();
        }
        
        int numerocaracteres = 10; 
        
        if(txtPrecioUnidadPro.getText().length() >= numerocaracteres) {
            evt.consume();
   
            JOptionPane.showMessageDialog(rootPane, "Precio Unitario Excedido");
        }
    }//GEN-LAST:event_txtPrecioUnidadProKeyTyped

    private void txtTotalProducKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTotalProducKeyTyped
        
          char c = evt.getKeyChar(); 
        
        if(!Character.isDigit(c)){
            evt.consume();
        }
        
        int numerocaracteres = 10; 
        
        if(txtTotalProduc.getText().length() >= numerocaracteres) {
            evt.consume();
   
            JOptionPane.showMessageDialog(rootPane, "Total Excedido");
        }
        
        
    }//GEN-LAST:event_txtTotalProducKeyTyped

    private void txtDescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionKeyTyped
        
         int numerocaracteres = 80; 
        
        if(txtDescripcion.getText().length() >= numerocaracteres) {
            evt.consume();
   
            JOptionPane.showMessageDialog(rootPane, "No puede contener mas de 80 Caracteres");
        }
        
        
    }//GEN-LAST:event_txtDescripcionKeyTyped

    private void txtComentarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtComentarioKeyTyped
       
        
            int numerocaracteres = 40; 
        
        if(txtComentario.getText().length() >= numerocaracteres) {
            evt.consume();
   
            JOptionPane.showMessageDialog(rootPane, "No puede contener mas de 80 Caracteres");
        }
        
        
        
    }//GEN-LAST:event_txtComentarioKeyTyped

    private void txtidPedidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidPedidoKeyReleased
        HabilitarBotonGuardar();
    }//GEN-LAST:event_txtidPedidoKeyReleased

    private void txtestadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtestadoKeyReleased
        HabilitarBotonGuardar();
    }//GEN-LAST:event_txtestadoKeyReleased

    private void COMBOEMPLEADORUTKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_COMBOEMPLEADORUTKeyReleased
         HabilitarBotonGuardar();
    }//GEN-LAST:event_COMBOEMPLEADORUTKeyReleased

    private void COMBOPROVEEDORKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_COMBOPROVEEDORKeyReleased
         HabilitarBotonGuardar();
    }//GEN-LAST:event_COMBOPROVEEDORKeyReleased

    private void COMBOPRODETALLEPEDIDOKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_COMBOPRODETALLEPEDIDOKeyReleased
         HabilitarBotonGuardar();
    }//GEN-LAST:event_COMBOPRODETALLEPEDIDOKeyReleased

    private void txtDescripcionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionKeyReleased
         HabilitarBotonGuardar();
    }//GEN-LAST:event_txtDescripcionKeyReleased

    private void txtComentarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtComentarioKeyReleased
        HabilitarBotonGuardar();
    }//GEN-LAST:event_txtComentarioKeyReleased

    private void COMBOIDPRODUCTOKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_COMBOIDPRODUCTOKeyReleased
         HabilitarBotonGuardar();
    }//GEN-LAST:event_COMBOIDPRODUCTOKeyReleased

    private void txtCantidadProKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadProKeyReleased
        HabilitarBotonGuardar();
    }//GEN-LAST:event_txtCantidadProKeyReleased

    private void txtPrecioUnidadProKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioUnidadProKeyReleased
        HabilitarBotonGuardar();
    }//GEN-LAST:event_txtPrecioUnidadProKeyReleased

    private void txtTotalProducKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTotalProducKeyReleased
         HabilitarBotonGuardar();
    }//GEN-LAST:event_txtTotalProducKeyReleased

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
            java.util.logging.Logger.getLogger(PedidoUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PedidoUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PedidoUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PedidoUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PedidoUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> COMBOEMPLEADORUT;
    private javax.swing.JComboBox<String> COMBOIDPRODUCTO;
    private javax.swing.JComboBox<String> COMBOPRODETALLEPEDIDO;
    private javax.swing.JComboBox<String> COMBOPROVEEDOR;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnsumartotal;
    private com.toedter.calendar.JDateChooser fechaPedido;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField txtCantidadPro;
    private javax.swing.JTextArea txtComentario;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtPrecioUnidadPro;
    private javax.swing.JTextField txtTotalProduc;
    private javax.swing.JTextField txtestado;
    private javax.swing.JTextField txtidPedido;
    // End of variables declaration//GEN-END:variables
}
