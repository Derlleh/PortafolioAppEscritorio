/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VISTA;

import CONTROLADOR.BoletaDAO;
import CONTROLADOR.DetalleDAO;
import CONTROLADOR.FacturaDAO;
import MODELO.Boleta;
import MODELO.Detalle;
import MODELO.Factura;
import NEGOCIO.ComboDetalleProductoBoleta;
import NEGOCIO.ComboProductoDetalle;
import NEGOCIO.ComboProveedor;
import NEGOCIO.TipoPagoNegocio;
import NEGOCIO.negocioBoleta;
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
public class FacturasBoletasUI extends javax.swing.JFrame {


    DetalleDAO comboP = new DetalleDAO();
    
    BoletaDAO comboB = new BoletaDAO(); 
    
    private negocioBoleta bole = new negocioBoleta();  
    
    
    public FacturasBoletasUI() {
        initComponents();
           setLocationRelativeTo(null);
           ListarDetalleProductos();
         //  idMaxBoleta();
            cerrar();
            setIconImage(new ImageIcon(getClass().getResource("/Imagenes/logoServi2.png")).getImage());
            
            
          //  txtCodigoBolleta.setEditable(false);
            txtCostoDelServicio.setEditable(false);
            txtTipoServicio.setEditable(false);
            
            
            comboP.consultar_Proveedor(COMBOPROVEEDOR);
            comboP.consultar_producto(COMBOPRODUCTO);
     //       comboP.consultar_productoValor(COMBOValorDelProducto);
            comboB.consultar_TipoPagoBoleta(ComboTipoPago);
    }
    
    public void ListarDetalleProductos()
    {
        DetalleDAO dao = new DetalleDAO(); 
    //    TablaDetalleCalcularValor.setModel(dao.listarDetalle());
    }
    
    public void idMaxBoleta()
    {
         txtCodigoBolleta.setText(bole.getMaxID()+"");
    }
    
   //   public int suma()
  //  {
      //  int contar=TablaDetalleCalcularValor.getRowCount(); 
     //   int suma=0; 
     //   for(int i = 0; i < contar; i++){
     //       suma = suma+Integer.parseInt(TablaDetalleCalcularValor.getValueAt(i, 1).toString());
       // }
   //  /  
     //   return suma; 
   // }
      
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

        jLabel13 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtValorProducto = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCodigoBolleta = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        FechaBoleta = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtTipoServicio = new javax.swing.JTextField();
        txtCostoDelServicio = new javax.swing.JTextField();
        COMBOPROVEEDOR = new javax.swing.JComboBox<>();
        COMBOPRODUCTO = new javax.swing.JComboBox<>();
        ComboTipoPago = new javax.swing.JComboBox<>();
        txtCantidadProductosUsados = new javax.swing.JTextField();
        txtTotalBoletaPrecioPro = new javax.swing.JTextField();
        txtPrecioNeto = new javax.swing.JTextField();
        txtIva = new javax.swing.JTextField();
        txtTotalBoleta = new javax.swing.JTextField();
        btnGuardarYsumarDETALLE = new javax.swing.JButton();
        btncalcularproductosmulti = new javax.swing.JButton();
        txtValorProductoReal = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtServicio = new javax.swing.JTextArea();

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(240, 240, 240));
        jLabel13.setText("Valor: ");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(240, 240, 240));
        jLabel17.setText("Cant. Productos");

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

        txtValorProducto.setBackground(new java.awt.Color(51, 51, 51));
        txtValorProducto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setForeground(new java.awt.Color(240, 240, 240));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_exit_40px_1.png"))); // NOI18N
        jLabel10.setText("Salir");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        txtValorProducto.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Codigo de venta:");
        txtValorProducto.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, -1, -1));

        txtCodigoBolleta.setBackground(new java.awt.Color(102, 255, 102));
        txtCodigoBolleta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtValorProducto.add(txtCodigoBolleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 70, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Fecha: ");
        txtValorProducto.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));
        txtValorProducto.add(FechaBoleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 122, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Precio Neto: ");
        txtValorProducto.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 150, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("IVA: ");
        txtValorProducto.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 180, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("Total a pagar: ");
        txtValorProducto.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 270, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText("Tipo de Pago: ");
        txtValorProducto.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setText("Precio Productos:");
        txtValorProducto.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 120, -1, -1));
        txtValorProducto.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 45, 138, 0));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(240, 240, 240));
        jLabel9.setText("Codigo Servicio: ");
        txtValorProducto.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(240, 240, 240));
        jLabel12.setText("Servicio Valor Total: ");
        txtValorProducto.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 90, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(240, 240, 240));
        jLabel14.setText("Producto Utilizado: ");
        txtValorProducto.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(240, 240, 240));
        jLabel15.setText("Proveedor:");
        txtValorProducto.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(240, 240, 240));
        jLabel16.setText("Cant. Productos:");
        txtValorProducto.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(240, 240, 240));
        jLabel18.setText("Valor Producto: ");
        txtValorProducto.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, -1, -1));

        txtTipoServicio.setBackground(new java.awt.Color(102, 255, 102));
        txtTipoServicio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtValorProducto.add(txtTipoServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 70, -1));

        txtCostoDelServicio.setBackground(new java.awt.Color(102, 255, 102));
        txtCostoDelServicio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtValorProducto.add(txtCostoDelServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 90, 80, -1));

        COMBOPROVEEDOR.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        COMBOPROVEEDOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                COMBOPROVEEDORActionPerformed(evt);
            }
        });
        txtValorProducto.add(COMBOPROVEEDOR, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, 160, -1));

        COMBOPRODUCTO.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtValorProducto.add(COMBOPRODUCTO, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, 163, -1));

        ComboTipoPago.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ComboTipoPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboTipoPagoActionPerformed(evt);
            }
        });
        txtValorProducto.add(ComboTipoPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 160, -1));

        txtCantidadProductosUsados.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtCantidadProductosUsados.setText("0");
        txtValorProducto.add(txtCantidadProductosUsados, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, 160, 24));

        txtTotalBoletaPrecioPro.setBackground(new java.awt.Color(102, 255, 102));
        txtTotalBoletaPrecioPro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtValorProducto.add(txtTotalBoletaPrecioPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 120, 80, -1));

        txtPrecioNeto.setBackground(new java.awt.Color(102, 255, 102));
        txtPrecioNeto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtValorProducto.add(txtPrecioNeto, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 150, 80, -1));

        txtIva.setBackground(new java.awt.Color(102, 255, 102));
        txtIva.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtIva.setText("0");
        txtValorProducto.add(txtIva, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 180, 80, -1));

        txtTotalBoleta.setBackground(new java.awt.Color(102, 255, 102));
        txtTotalBoleta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtValorProducto.add(txtTotalBoleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 270, 215, -1));

        btnGuardarYsumarDETALLE.setBackground(new java.awt.Color(102, 102, 255));
        btnGuardarYsumarDETALLE.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGuardarYsumarDETALLE.setText("Registrar ");
        btnGuardarYsumarDETALLE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarYsumarDETALLEActionPerformed(evt);
            }
        });
        txtValorProducto.add(btnGuardarYsumarDETALLE, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 300, 142, 47));

        btncalcularproductosmulti.setBackground(new java.awt.Color(102, 102, 255));
        btncalcularproductosmulti.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btncalcularproductosmulti.setText("Calcular Total ");
        btncalcularproductosmulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncalcularproductosmultiActionPerformed(evt);
            }
        });
        txtValorProducto.add(btncalcularproductosmulti, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 220, 141, -1));

        txtValorProductoReal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtValorProducto.add(txtValorProductoReal, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, 163, 24));
        txtValorProducto.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 940, -1));
        txtValorProducto.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 412, 960, 10));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(240, 240, 240));
        jLabel11.setText("Detalle Servicio y productos ");
        txtValorProducto.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, -1, -1));

        jButton1.setBackground(new java.awt.Color(102, 102, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Ver Boleta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        txtValorProducto.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 370, 100, 30));

        jButton2.setBackground(new java.awt.Color(102, 102, 255));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton2.setText("Ver Factura");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        txtValorProducto.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 370, 100, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Servicio: ");
        txtValorProducto.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        txtServicio.setBackground(new java.awt.Color(102, 255, 102));
        txtServicio.setColumns(20);
        txtServicio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtServicio.setRows(5);
        jScrollPane1.setViewportView(txtServicio);

        txtValorProducto.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 180, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtValorProducto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1007, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtValorProducto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        MenuUI mm = new MenuUI();
        mm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void btnGuardarYsumarDETALLEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarYsumarDETALLEActionPerformed

        
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault());
        String date = formato.format(FechaBoleta.getDate());


        
        BoletaDAO daoBO = new BoletaDAO(); 
        Boleta modelB = new Boleta(); 
        
        DetalleDAO daoDE = new DetalleDAO(); 
        Detalle modelD = new Detalle(); 
        
        FacturaDAO daoFA = new FacturaDAO(); 
        Factura modelF = new Factura();
        
        modelD.setCantProduc(Integer.parseInt(txtCantidadProductosUsados.getText()));
        
        modelD.setValor(Integer.parseInt(txtValorProductoReal.getText()));
        
        ComboProductoDetalle comboProdD = (ComboProductoDetalle)COMBOPRODUCTO.getSelectedItem(); 
        String id2 = comboProdD.getIdProducto(); 
        modelD.setProducto(Integer.parseInt(id2));
        
        ComboProveedor comboProv = (ComboProveedor)COMBOPROVEEDOR.getSelectedItem(); 
        String id3 = comboProv.getRutPro(); 
        modelD.setProducProveedor(id3);
        
        modelD.setBoleta(Integer.parseInt(txtCodigoBolleta.getText()));
        modelD.setCodServicio(Integer.parseInt(txtTipoServicio.getText()));
        
 
        
        
        //------Boleta Dataos-------// 
        
        modelB.setIddocCompra(Integer.parseInt(txtCodigoBolleta.getText()));
      //  modelB.setFecha(date);
        modelB.setNeto(Integer.parseInt(txtPrecioNeto.getText()));
        modelB.setIva(Integer.parseInt(txtIva.getText()));
      //  modelB.setTotalBoleta(Integer.parseInt(txtTotalBoletaPrecioPro.getText()));
        
        TipoPagoNegocio comboPago = (TipoPagoNegocio)ComboTipoPago.getSelectedItem(); 
        String id4 = comboPago.getCodTipoPago();
      //  modelB.setTipoPago(Integer.parseInt(id4));
        
        modelB.setTotal(Integer.parseInt(txtTotalBoleta.getText()));
        
        
        
        ////Factura Datos// 
        
        modelF.setIdFactura(Integer.parseInt(txtCodigoBolleta.getText()));
//        modelF.setFechaFactura(date);
        modelF.setNeto(Integer.parseInt(txtPrecioNeto.getText()));
        modelF.setIva(Integer.parseInt(txtIva.getText()));
        modelF.setTotalFactura(Integer.parseInt(txtTotalBoleta.getText()));
        
        TipoPagoNegocio combopagof = (TipoPagoNegocio)ComboTipoPago.getSelectedItem(); 
        String id5 = combopagof.getCodTipoPago();
 //       modelF.setTipoPagoFactura(Integer.parseInt(id5));
        
    //    modelF.setPrecioServicios(Integer.parseInt(txtCostoDelServicio.getText()));
   //     modelF.setPrecioProductos(Integer.parseInt(txtTotalBoletaPrecioPro.getText()));
        
        
        
        
        if( daoBO.registroBoleta(modelB) && daoDE.registroDetalle(modelD) && daoFA.registroFactura(modelF))
        {
              JOptionPane.showMessageDialog(null, "Se registraron los datos con exito");
           
         //   txtTotalBoletaPrecioPro.setText(Integer.toString(suma()));
          
            
        }
        
        
        
        
      
                
    }//GEN-LAST:event_btnGuardarYsumarDETALLEActionPerformed

    private void btncalcularproductosmultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncalcularproductosmultiActionPerformed
        
        String cadena1, cadena2; 
        int entero1, entero2;
        
        cadena1 = txtValorProductoReal.getText();
        cadena2 = txtCantidadProductosUsados.getText(); 
        
        entero1 = Integer.parseInt(cadena1); 
        entero2 = Integer.parseInt(cadena2); 
        
        entero1=entero1*entero2; 
        
        cadena1 = Integer.toString(entero1); 
        
        txtTotalBoletaPrecioPro.setText(cadena1);
        
        ///////-----Suma Neto-------////
        
        String cadenaA, cadenaB; 
        int enteroA, enteroB; 
        
        cadenaA = txtCostoDelServicio.getText(); 
        cadenaB = txtTotalBoletaPrecioPro.getText(); 
        
        enteroA = Integer.parseInt(cadenaA); 
        enteroB = Integer.parseInt(cadenaB); 
        
        enteroA = enteroA+enteroB;
        
        cadenaA =  Integer.toString(enteroA); 
        
        txtPrecioNeto.setText(cadenaA);
        txtTotalBoleta.setText(cadenaA);
        
        ///---calcular TODO CON IVA---///
        
        ListarDetalleProductos();
        
      
        
        
    }//GEN-LAST:event_btncalcularproductosmultiActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault());
        String date = formato.format(FechaBoleta.getDate());
        
        
        BoletaDeVentaUI a = new BoletaDeVentaUI(); 
        a.setVisible(true);
        this.setVisible(true);
        
        String info1 = txtCodigoBolleta.getText(); 
//        BoletaDeVentaUI.LabelIDboleta.setText(info1);
        
   //     BoletaDeVentaUI.LabelFecha.setText(date);
        
        String info2 = txtCantidadProductosUsados.getText(); 
   //     BoletaDeVentaUI.LabelCantProductos.setText(info2);
        
        String info3 = COMBOPRODUCTO.getSelectedItem().toString(); 
    //    BoletaDeVentaUI.labelNombreProduc.setText(info3);
        
        String info7 = txtTotalBoletaPrecioPro.getText(); 
    //    BoletaDeVentaUI.LabelCostoProductosTotal.setText(info7);
        
        String info4 = txtServicio.getText(); 
    //    BoletaDeVentaUI.labelNombreServicio.setText(info4);
        
        String info5 = txtCostoDelServicio.getText(); 
    //    BoletaDeVentaUI.LabelTotalServicio.setText(info5);
        
        String info6 = txtTotalBoleta.getText(); 
  //      BoletaDeVentaUI.labeltotalBoleta.setText(info6);
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault());
        String date = formato.format(FechaBoleta.getDate());
        
        FacturaUI f = new FacturaUI(); 
        f.setVisible(true);
        this.setVisible(true);
        
        String info1 = txtCodigoBolleta.getText(); 
        FacturaUI.LabelNumeroDeFactura.setText(info1);
        
        FacturaUI.LabelFechaFactura.setText(date);
        
        String info2 = ComboTipoPago.getSelectedItem().toString(); 
        FacturaUI.LabelTipoPagoFac.setText(info2);
        
        String info3 = txtCostoDelServicio.getText(); 
        FacturaUI.LabelTotalFactura.setText(info3);
        
        String info4 = txtTotalBoletaPrecioPro.getText(); 
        FacturaUI.LabelTotalProductos.setText(info4);
        
        String info5 = txtPrecioNeto.getText(); 
        FacturaUI.LabelNeto.setText(info5);
        
        String info6 = txtIva.getText(); 
        FacturaUI.LabelIVA.setText(info6);
        
        String info7 = txtTotalBoleta.getText(); 
        FacturaUI.LabelTotalFINAL.setText(info7);
        
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ComboTipoPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboTipoPagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboTipoPagoActionPerformed

    private void COMBOPROVEEDORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_COMBOPROVEEDORActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_COMBOPROVEEDORActionPerformed

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
            java.util.logging.Logger.getLogger(FacturasBoletasUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FacturasBoletasUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FacturasBoletasUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FacturasBoletasUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FacturasBoletasUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> COMBOPRODUCTO;
    private javax.swing.JComboBox<String> COMBOPROVEEDOR;
    private javax.swing.JComboBox<String> ComboTipoPago;
    private com.toedter.calendar.JDateChooser FechaBoleta;
    private javax.swing.JButton btnGuardarYsumarDETALLE;
    private javax.swing.JButton btncalcularproductosmulti;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtCantidadProductosUsados;
    private javax.swing.JTextField txtCodigoBolleta;
    public static javax.swing.JTextField txtCostoDelServicio;
    private javax.swing.JTextField txtIva;
    private javax.swing.JTextField txtPrecioNeto;
    public static javax.swing.JTextArea txtServicio;
    public static javax.swing.JTextField txtTipoServicio;
    private javax.swing.JTextField txtTotalBoleta;
    private javax.swing.JTextField txtTotalBoletaPrecioPro;
    private javax.swing.JPanel txtValorProducto;
    private javax.swing.JTextField txtValorProductoReal;
    // End of variables declaration//GEN-END:variables
}
