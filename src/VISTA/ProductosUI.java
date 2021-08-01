 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VISTA;

import CONTROLADOR.ProductoDAO;
import MODELO.Producto;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.swing.JOptionPane;
import DB.Conexion;
import Graficas.GraficaDeBarras;
import MODELO.Pedido;
import NEGOCIO.ComboProveedor;
import NEGOCIO.ComboTipoProducto;
import NEGOCIO.productoNegocio;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author pablo
 */
public class ProductosUI extends javax.swing.JFrame {

       TableRowSorter trs;
    
    ProductoDAO combo = new ProductoDAO();
    private productoNegocio de = new productoNegocio();
    
    // ComboProveedor comboPro = new ComboProveedor(); 
    
    
    
    public ProductosUI() {
       
        initComponents();
        ListarProd();
        setLocationRelativeTo(null);
        idMax();
        cerrar();
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/logoServi2.png")).getImage());
        
        combo.consultar_TipoProducto(comboTipoProducto);
        
        combo.consultar_Proveedor(ComboProveedores);
        
        txtcodigopro.setEditable(false);
        txtCodificador.setEditable(false);
        
        txtstock.setEditable(false);
        txtstockcritico.setEditable(false);
        
        btnRegistrar.setEnabled(false);
        
      //  btnGraficar();
        
        
    }
    
        public int sumaPrecioCompra()
    {
        int contar=tablaProductos.getRowCount(); 
        int suma=0; 
        for(int i = 0; i < contar; i++){
            suma = suma+Integer.parseInt(tablaProductos.getValueAt(i, 3).toString());
        }
        
        return suma; 
    }
        
       public int sumaStockCritico()
    {
        int contar=tablaProductos.getRowCount(); 
        int suma=0; 
        for(int i = 0; i < contar; i++){
            suma = suma+Integer.parseInt(tablaProductos.getValueAt(i, 5).toString());
        }
        
        return suma; 
    }
       
         public int sumaStockTotal()
    {
        int contar=tablaProductos.getRowCount(); 
        int suma=0; 
        for(int i = 0; i < contar; i++){
            suma = suma+Integer.parseInt(tablaProductos.getValueAt(i, 6).toString());
        }
        
        return suma; 
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
       
    public void btnGraficar()
    {
           GraficaDeBarras a = new GraficaDeBarras(); 
        a.setVisible(true);
        String info = LabelPrecioCompraT.getText(); 
        GraficaDeBarras.txt_rojo.setText(info);
        
        String info2 = LabelStockCriticoT.getText(); 
        GraficaDeBarras.txt_verde.setText(info2);
        
        String info3 = LabelStockProT.getText(); 
        GraficaDeBarras.txt_azul.setText(info3); 
        
        dispose();
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
        txtcodigopro.setText(de.getMaxID()+"");
    }
    
        public void ListarProd(){
        
        ProductoDAO daoPr = new ProductoDAO(); 
        tablaProductos.setModel(daoPr.listarProductos());
        
        LabelPrecioCompraT.setText(Integer.toString(sumaPrecioCompra()));
        LabelStockCriticoT.setText(Integer.toString(sumaStockCritico()));
        LabelStockProT.setText(Integer.toString(sumaStockTotal()));
        
    }
        
    public void HabilitarBotonGuardarPro()
    {
        if(!txtstockcritico.getText().isEmpty() && 
            !txtstock.getText().isEmpty() && 
              !txtprecioventa.getText().isEmpty() && 
                !txtpreciocompra.getText().isEmpty() && 
                 !txtmarcapro.getText().isEmpty() && 
                   !txtcodigopro.getText().isEmpty() && 
                    !txtDescrippro.getText().isEmpty() &&
                     !ComboProveedores.getSelectedItem().toString().isEmpty() &&
                      !comboTipoProducto.getSelectedItem().toString().isEmpty())
            
        {
            btnRegistrar.setEnabled(true);
        }
        else
        {
            btnRegistrar.setEnabled(false);
        }
    }
        
    public void LimpiarProducto()
    {
        txtcodigopro.setText("");
        txtmarcapro.setText("");
        txtDescrippro.setText("");
        txtpreciocompra.setText("");
        txtstock.setText("0000");
        txtstockcritico.setText("0000");
        txtprecioventa.setText("");
        fechaVenciPro.setDate(new Date());
        comboTipoProducto.setSelectedIndex(-1);
        ComboProveedores.setSelectedIndex(-1);
        txtCodificador.setText("");
   //     fechaVenciPro.setLocale(Locale.ENGLISH);
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtcodigopro = new javax.swing.JTextField();
        txtmarcapro = new javax.swing.JTextField();
        txtpreciocompra = new javax.swing.JTextField();
        txtprecioventa = new javax.swing.JTextField();
        txtstockcritico = new javax.swing.JTextField();
        txtstock = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescrippro = new javax.swing.JTextArea();
        fechaVenciPro = new com.toedter.calendar.JDateChooser();
        comboTipoProducto = new javax.swing.JComboBox<>();
        btnRegistrar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        LabelPrecioCompraT = new javax.swing.JLabel();
        LabelStockCriticoT = new javax.swing.JLabel();
        LabelStockProT = new javax.swing.JLabel();
        btnGraficoEnviar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        ComboProveedores = new javax.swing.JComboBox<>();
        txtCodificador = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtFiltrarporMarca = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaProductos.setBackground(new java.awt.Color(102, 255, 102));
        tablaProductos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        tablaProductos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaProductos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 830, 130));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Productos Taller Mecánico  ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 57, 799, 7));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Codigo:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Marca:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Descripción:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("Precio Compra:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("Stock Producto: ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText("Stock critico:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setText("Precio Venta: ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(240, 240, 240));
        jLabel9.setText("Fecha Vencimiento: ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(240, 240, 240));
        jLabel11.setText("Codigo Verificador: ");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, -1, 20));

        txtcodigopro.setBackground(new java.awt.Color(102, 255, 204));
        txtcodigopro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtcodigopro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 204)));
        txtcodigopro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcodigoproKeyReleased(evt);
            }
        });
        jPanel1.add(txtcodigopro, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 80, -1));

        txtmarcapro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtmarcapro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 204)));
        txtmarcapro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtmarcaproKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtmarcaproKeyTyped(evt);
            }
        });
        jPanel1.add(txtmarcapro, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 80, -1));

        txtpreciocompra.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtpreciocompra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 204)));
        txtpreciocompra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpreciocompraKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpreciocompraKeyTyped(evt);
            }
        });
        jPanel1.add(txtpreciocompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 60, -1));

        txtprecioventa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtprecioventa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 204)));
        txtprecioventa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtprecioventaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtprecioventaKeyTyped(evt);
            }
        });
        jPanel1.add(txtprecioventa, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 60, -1));

        txtstockcritico.setBackground(new java.awt.Color(102, 255, 204));
        txtstockcritico.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtstockcritico.setForeground(new java.awt.Color(0, 0, 0));
        txtstockcritico.setText("0000");
        txtstockcritico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 204)));
        txtstockcritico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtstockcriticoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtstockcriticoKeyTyped(evt);
            }
        });
        jPanel1.add(txtstockcritico, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 60, -1));

        txtstock.setBackground(new java.awt.Color(102, 255, 204));
        txtstock.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtstock.setForeground(new java.awt.Color(0, 0, 0));
        txtstock.setText("0000");
        txtstock.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 204)));
        txtstock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtstockKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtstockKeyTyped(evt);
            }
        });
        jPanel1.add(txtstock, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, 60, -1));

        txtDescrippro.setColumns(20);
        txtDescrippro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtDescrippro.setRows(5);
        txtDescrippro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 204)));
        txtDescrippro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDescripproKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescripproKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(txtDescrippro);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 170, 100));
        jPanel1.add(fechaVenciPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 90, 150, -1));

        comboTipoProducto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        comboTipoProducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 204)));
        comboTipoProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                comboTipoProductoKeyReleased(evt);
            }
        });
        jPanel1.add(comboTipoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 120, 150, -1));

        btnRegistrar.setBackground(new java.awt.Color(102, 102, 255));
        btnRegistrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 140, 40));

        btnEditar.setBackground(new java.awt.Color(102, 102, 255));
        btnEditar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEditar.setText("Actualizar");
        btnEditar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 360, 120, 40));

        jButton1.setBackground(new java.awt.Color(102, 102, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Nuevo");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 260, 120, 40));

        btnBuscar.setBackground(new java.awt.Color(102, 102, 255));
        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 310, 120, 40));

        jLabel12.setForeground(new java.awt.Color(240, 240, 240));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_exit_40px_1.png"))); // NOI18N
        jLabel12.setText("Salir");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, -1, -1));

        LabelPrecioCompraT.setForeground(new java.awt.Color(51, 51, 51));
        LabelPrecioCompraT.setText("LabelPrecioCompraTotal");
        jPanel1.add(LabelPrecioCompraT, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, -1, -1));

        LabelStockCriticoT.setForeground(new java.awt.Color(51, 51, 51));
        LabelStockCriticoT.setText("LabelStockCriticoTotal");
        jPanel1.add(LabelStockCriticoT, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 430, -1, -1));

        LabelStockProT.setForeground(new java.awt.Color(51, 51, 51));
        LabelStockProT.setText("LabelStockProductoTotal");
        jPanel1.add(LabelStockProT, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 430, -1, -1));

        btnGraficoEnviar.setBackground(new java.awt.Color(102, 102, 255));
        btnGraficoEnviar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnGraficoEnviar.setText("Graficar");
        btnGraficoEnviar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        btnGraficoEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraficoEnviarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGraficoEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 410, 120, 40));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(240, 240, 240));
        jLabel13.setText("Tipo Producto: ");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(240, 240, 240));
        jLabel14.setText("Proveedor: ");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, -1, -1));

        ComboProveedores.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ComboProveedores.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 204)));
        ComboProveedores.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ComboProveedoresKeyReleased(evt);
            }
        });
        jPanel1.add(ComboProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 150, 150, -1));

        txtCodificador.setBackground(new java.awt.Color(102, 255, 204));
        txtCodificador.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtCodificador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 204)));
        jPanel1.add(txtCodificador, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 190, 150, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Filtrar por marca: ");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 450, -1, -1));

        txtFiltrarporMarca.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtFiltrarporMarca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 204)));
        txtFiltrarporMarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFiltrarporMarcaKeyTyped(evt);
            }
        });
        jPanel1.add(txtFiltrarporMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 449, 190, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 984, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
       
        int i = JOptionPane.showConfirmDialog(this, "¿Estas seguro que desea registrar este nuevo producto? "); 
        
          SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault());
        String date = formato.format(fechaVenciPro.getDate());
       
        if(i==0)
        {
             if(txtcodigopro.getText().isEmpty() || txtmarcapro.getText().isEmpty() || txtDescrippro.getText().isEmpty() || 
           txtpreciocompra.getText().isEmpty() || txtstock.getText().isEmpty() || txtstockcritico.getText().isEmpty() || 
           txtprecioventa.getText().isEmpty() || comboTipoProducto.equals(null)) 
        {
            JOptionPane.showMessageDialog(null, "Llene todos los campos");
        }
        
        else
        {
            
      
     
        
        Producto modelP = new Producto(); 
        ProductoDAO daoP = new ProductoDAO(); 
        
        modelP.setIdPro(Integer.parseInt(txtcodigopro.getText()));
        modelP.setMarcaPro(txtmarcapro.getText());
        modelP.setDescriPro(txtDescrippro.getText());
        modelP.setPrecioCompPro(Integer.parseInt(txtpreciocompra.getText()));
        modelP.setStockPro(Integer.parseInt(txtstock.getText()));
        modelP.setStockCriPro(Integer.parseInt(txtstockcritico.getText()));
        modelP.setPrecioVentaPro(Integer.parseInt(txtprecioventa.getText()));
        modelP.setFechaVenciPro(date);
        
        ComboTipoProducto combotp = (ComboTipoProducto) comboTipoProducto.getSelectedItem();
        String id = combotp.getIdTipo();
        modelP.setTipoPro(Integer.parseInt(id));
        
        ComboProveedor combopv = (ComboProveedor)ComboProveedores.getSelectedItem(); 
        String idd = combopv.getRutPro();
        modelP.setRutProveedor(idd);
        
        modelP.setCodificacion(txtCodificador.getText());
        
        if(daoP.registroProductoNuevo(modelP))
        {
            JOptionPane.showMessageDialog(null, "Se Registro un nuevo Producto con exito");
            ListarProd();           
            HabilitarBotonGuardarPro();
            
             LabelPrecioCompraT.setText(Integer.toString(sumaPrecioCompra()));
             LabelStockCriticoT.setText(Integer.toString(sumaStockCritico()));
             LabelStockProT.setText(Integer.toString(sumaStockTotal()));
        }
            
            
            
            
        }
            
        }
        else if(i==1)
        {
         
            JOptionPane.showMessageDialog(this, "Se registro el producto con exito");
            
        }
        
        
        
       
        
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void tablaProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProductosMouseClicked
        
        int seleccion = tablaProductos.rowAtPoint(evt.getPoint()); 
        
        SimpleDateFormat formatter = new SimpleDateFormat("dd-M-yyyy");
        Date date = new Date();
        String formattedDate = formatter.format(date);
        try {
            Date parsedDate = formatter.parse(formattedDate);
        } catch (ParseException ex) {
            Logger.getLogger(ProductosUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        txtcodigopro.setText(tablaProductos.getValueAt(seleccion, 0)+"");
        txtmarcapro.setText(tablaProductos.getValueAt(seleccion, 1)+"");
        txtDescrippro.setText(tablaProductos.getValueAt(seleccion, 2)+"");
        txtpreciocompra.setText(tablaProductos.getValueAt(seleccion, 3)+"");
        txtstock.setText(tablaProductos.getValueAt(seleccion, 4)+"");
        txtstockcritico.setText(tablaProductos.getValueAt(seleccion, 5)+"");
        txtprecioventa.setText(tablaProductos.getValueAt(seleccion, 6)+"");
        fechaVenciPro.setDate(date);
        comboTipoProducto.setSelectedItem(tablaProductos.getValueAt(seleccion, 8)+"");
        ComboProveedores.setSelectedItem(tablaProductos.getValueAt(seleccion, 9)+"");
        txtCodificador.setText(tablaProductos.getValueAt(seleccion, 10)+"");
        
         LabelPrecioCompraT.setText(Integer.toString(sumaPrecioCompra()));
        LabelStockCriticoT.setText(Integer.toString(sumaStockCritico()));
        LabelStockProT.setText(Integer.toString(sumaStockTotal()));
        
        
    }//GEN-LAST:event_tablaProductosMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        LimpiarProducto(); 
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
   
        if(txtcodigopro.getText().isEmpty())
        {
            String mensaje = "Debe haber un codigo asociado"; 
            JOptionPane.showMessageDialog(null, mensaje);
        }
        else
        {
            
                 
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault());
        String date = formato.format(fechaVenciPro.getDate());
     
        
        Producto modelP = new Producto(); 
        ProductoDAO daoP = new ProductoDAO(); 
        
        modelP.setIdPro(Integer.parseInt(txtcodigopro.getText()));
        modelP.setMarcaPro(txtmarcapro.getText());
        modelP.setDescriPro(txtDescrippro.getText());
        modelP.setPrecioCompPro(Integer.parseInt(txtpreciocompra.getText()));
        modelP.setStockPro(Integer.parseInt(txtstock.getText()));
        modelP.setStockCriPro(Integer.parseInt(txtstockcritico.getText()));
        modelP.setPrecioVentaPro(Integer.parseInt(txtprecioventa.getText()));
        modelP.setFechaVenciPro(date);
        
        ComboTipoProducto combotp = (ComboTipoProducto) comboTipoProducto.getSelectedItem();
        String id = combotp.getIdTipo();
        modelP.setTipoPro(Integer.parseInt(id));
        
        if(daoP.modificarProducto(modelP))
        {
            JOptionPane.showMessageDialog(null, "Se Actualizo el producto con exito");
            ListarProd();
             LabelPrecioCompraT.setText(Integer.toString(sumaPrecioCompra()));
        LabelStockCriticoT.setText(Integer.toString(sumaStockCritico()));
        LabelStockProT.setText(Integer.toString(sumaStockTotal()));
            
        }
            
            
        }
        
        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void txtmarcaproKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmarcaproKeyTyped
      
           int numerocaracteres = 30; 
        
        if(txtmarcapro.getText().length() >= numerocaracteres) {
            evt.consume();
   
            JOptionPane.showMessageDialog(rootPane, "No debe posar los 30 caracteres");
        }
        
        
    }//GEN-LAST:event_txtmarcaproKeyTyped

    private void txtDescripproKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripproKeyTyped
        
           int numerocaracteres = 80; 
        
        if(txtDescrippro.getText().length() >= numerocaracteres) {
            evt.consume();
   
            JOptionPane.showMessageDialog(rootPane, "No debe posar los 80 caracteres");
        }
        
        
    }//GEN-LAST:event_txtDescripproKeyTyped

    private void txtpreciocompraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpreciocompraKeyTyped
        
          char c = evt.getKeyChar(); 
        
        if(!Character.isDigit(c)){
            evt.consume();
        }
        
        int numerocaracteres = 9; 
        
        if(txtpreciocompra.getText().length() >= numerocaracteres) {
            evt.consume();
   
            JOptionPane.showMessageDialog(rootPane, "solo 9 digitos");
        }
        
        
        
        
    }//GEN-LAST:event_txtpreciocompraKeyTyped

    private void txtprecioventaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprecioventaKeyTyped
        
         char c = evt.getKeyChar(); 
        
        if(!Character.isDigit(c)){
            evt.consume();
        }
        
        int numerocaracteres = 10; 
        
        if(txtprecioventa.getText().length() >= numerocaracteres) {
            evt.consume();
   
            JOptionPane.showMessageDialog(rootPane, "solo 10 digitos");
        }
        
        
        
    }//GEN-LAST:event_txtprecioventaKeyTyped

    private void txtstockcriticoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtstockcriticoKeyTyped
       
         char c = evt.getKeyChar(); 
        
        if(!Character.isDigit(c)){
            evt.consume();
        }
        
        int numerocaracteres = 10; 
        
        if(txtstockcritico.getText().length() >= numerocaracteres) {
            evt.consume();
   
            JOptionPane.showMessageDialog(rootPane, "solo 10 digitos");
        }
        
        
        
    }//GEN-LAST:event_txtstockcriticoKeyTyped

    private void txtstockKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtstockKeyTyped
        
          char c = evt.getKeyChar(); 
        
        if(!Character.isDigit(c)){
            evt.consume();
        }
        
        int numerocaracteres = 9; 
        
        if(txtstock.getText().length() >= numerocaracteres) {
            evt.consume();
   
            JOptionPane.showMessageDialog(rootPane, "solo 9 digitos");
        }
        
        
        
    }//GEN-LAST:event_txtstockKeyTyped

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
      ProductoDAO s = new ProductoDAO(); 
      
      int precio = s.buscarPrecioPorMarca(txtprecioventa.getText()); 
      
      txtprecioventa.setText(String.valueOf(precio));
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked

        ModuloBodegaUI s = new ModuloBodegaUI();
        s.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jLabel12MouseClicked

    private void btnGraficoEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraficoEnviarActionPerformed
        
     btnGraficar(); 
        
    }//GEN-LAST:event_btnGraficoEnviarActionPerformed

    private void txtcodigoproKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodigoproKeyReleased
        HabilitarBotonGuardarPro();
    }//GEN-LAST:event_txtcodigoproKeyReleased

    private void txtmarcaproKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmarcaproKeyReleased
        HabilitarBotonGuardarPro();
    }//GEN-LAST:event_txtmarcaproKeyReleased

    private void txtDescripproKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripproKeyReleased
       HabilitarBotonGuardarPro();
    }//GEN-LAST:event_txtDescripproKeyReleased

    private void txtpreciocompraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpreciocompraKeyReleased
       HabilitarBotonGuardarPro();
    }//GEN-LAST:event_txtpreciocompraKeyReleased

    private void txtprecioventaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprecioventaKeyReleased
      HabilitarBotonGuardarPro();
    }//GEN-LAST:event_txtprecioventaKeyReleased

    private void txtstockcriticoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtstockcriticoKeyReleased
        HabilitarBotonGuardarPro();
    }//GEN-LAST:event_txtstockcriticoKeyReleased

    private void txtstockKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtstockKeyReleased
        HabilitarBotonGuardarPro();
    }//GEN-LAST:event_txtstockKeyReleased

    private void comboTipoProductoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboTipoProductoKeyReleased
        HabilitarBotonGuardarPro();
    }//GEN-LAST:event_comboTipoProductoKeyReleased

    private void ComboProveedoresKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ComboProveedoresKeyReleased
        HabilitarBotonGuardarPro();
    }//GEN-LAST:event_ComboProveedoresKeyReleased

    private void txtFiltrarporMarcaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltrarporMarcaKeyTyped
        
        txtFiltrarporMarca.addKeyListener(new KeyAdapter()
        {
            @Override
            public void keyTyped(KeyEvent e) {
              
                trs.setRowFilter(RowFilter.regexFilter("(?i)"+txtFiltrarporMarca.getText(),1));
                
            }  
            
        });
        
        trs = new TableRowSorter(tablaProductos.getModel()); 
        tablaProductos.setRowSorter(trs);
        
    }//GEN-LAST:event_txtFiltrarporMarcaKeyTyped

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
            java.util.logging.Logger.getLogger(ProductosUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductosUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductosUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductosUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductosUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboProveedores;
    private javax.swing.JLabel LabelPrecioCompraT;
    private javax.swing.JLabel LabelStockCriticoT;
    private javax.swing.JLabel LabelStockProT;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnGraficoEnviar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> comboTipoProducto;
    private com.toedter.calendar.JDateChooser fechaVenciPro;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTable tablaProductos;
    private javax.swing.JTextField txtCodificador;
    private javax.swing.JTextArea txtDescrippro;
    private javax.swing.JTextField txtFiltrarporMarca;
    private javax.swing.JTextField txtcodigopro;
    private javax.swing.JTextField txtmarcapro;
    private javax.swing.JTextField txtpreciocompra;
    private javax.swing.JTextField txtprecioventa;
    private javax.swing.JTextField txtstock;
    private javax.swing.JTextField txtstockcritico;
    // End of variables declaration//GEN-END:variables
}
