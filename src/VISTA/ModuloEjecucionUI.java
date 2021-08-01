/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VISTA;

import CONTROLADOR.DetalleDAO;
import CONTROLADOR.DetalleReservaDAO;
import CONTROLADOR.EjecucionDAO;
import MODELO.Detalle;
import MODELO.Ejecucion;
import MODELO.modeloComboPrecio;
import MODELO.modeloComboServicio;
import NEGOCIO.ComboDetalleProductoBoleta;
import NEGOCIO.ComboMecanicoNombre;
import NEGOCIO.ComboProductoDetalle;
import NEGOCIO.ComboProveedor;
import NEGOCIO.ComboServicioPrecio;
import NEGOCIO.ComboServiciosEjecutar;
import NEGOCIO.ejecucionNegocio;
import java.awt.Image;
import java.awt.event.ItemEvent;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author pablo
 */
public class ModuloEjecucionUI extends javax.swing.JFrame {
    
 
    
    ArrayList Array = new ArrayList();
    DefaultListModel modelo = new DefaultListModel();
    
    ArrayList Array2 = new ArrayList(); 
    
    
    
    DefaultListModel modelo2 = new DefaultListModel();

  
    EjecucionDAO cargarComboReserva = new EjecucionDAO(); 
    
    private ejecucionNegocio ejenego = new ejecucionNegocio();
    
    DetalleDAO cargarcomboDetalle = new DetalleDAO();
    
    DetalleReservaDAO comboDD = new DetalleReservaDAO();
    
    public ModuloEjecucionUI() {
        initComponents();
        
        
        //para cargar los combos para servicio e id//
        
         modeloComboServicio cc = new modeloComboServicio(); 
        DefaultComboBoxModel modelServi = new DefaultComboBoxModel(cc.mostrarServicios());
        ComboIDServicio.setModel(modelServi);
        
        comboDD.consultar_ServicioDetalle(ComboDetallReserSer);
        
        cargarcomboDetalle.consultar_productoEjecucion(ComboProductoValor);
        cargarcomboDetalle.consultar_producto(comboProductoID);
        cargarcomboDetalle.consultar_Proveedor(ComboProveedorDetalle);
      //  cargarcomboDetalle.consultar_Servicio(ComboIDServicio);
//        cargarcomboDetalle.consultar_boleta(ComboCodigoBoleta);
        
      //  cargarComboReserva.consultar_NombreMecanico(ComboMecanicoEjecucion);
        
      //  JListServicioCOD.setModel(modelo);
     //   JListProductos.setModel(modelo2);
        
        JListaServicios.setModel(modelo);
        
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/logoServi2.png")).getImage());
        
        EjecucionIDMAX();
        txtCodigoEjecucion.setEditable(false);
        txtCodigoreal.setEditable(false);
        txtRUTEJECUCION.setEditable(false);
        txtPatenteEnEjecucion.setEditable(false);
        txtHoraEjecucion.setEditable(false);
        btnGuardar.setEnabled(true);
      //  txtCostoProductos.setEditable(false);
     //   txtCostoTotalServicios.setEditable(false);
        
  //      cargarComboReserva.consultar_codigoOrden(ComboCodigoReserva);
        cargarComboReserva.consultar_rutEmpleado(ComboMecanicoEjecucion);
      //  cargarComboReserva.consultar_Servicio(ComboIDServicio); //estas fue las que puse como comentario 
    //    cargarComboReserva.consultar_ServicioPrecio(ComboPrecioServicio); //esta la puse como comentario 
        
       // cargarcomboDetalle.consultar_Proveedor(ComboProveedor);
        //cargarcomboDetalle.consultar_producto(ComboProductos);
        
        cantidadProductos();
        
    }
    
    public void EjecucionIDMAX()
    {
        txtCodigoEjecucion.setText(ejenego.getMaxID()+"");
    }
    
    public void cantidadProductos()
    {
       for(int i=0;i <Array2.size();i++)
       {
         Array2.get(i);
       }
       
   
    }
    
    public void HabititarBotonGuardar()
    {
        if(!txtCodigoEjecucion.getText().isEmpty() && 
            !txtCodigoreal.getText().isEmpty() && 
             !txtComentario.getText().isEmpty() && 
             //  !txtCostoTotalServicios.getText().isEmpty() &&
                 !txtHoraEjecu.getText().isEmpty())
            
        {
            btnGuardar.setEnabled(true);
        }
        else
        {
            btnGuardar.setEnabled(false);
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtCodigoEjecucion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ComboMecanicoEjecucion = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        FechaActividad = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        txtHoraEjecu = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtComentario = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        ComboIDServicio = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        txtCodigoreal = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        txtRUTEJECUCION = new javax.swing.JTextField();
        txtPatenteEnEjecucion = new javax.swing.JTextField();
        BuscarAttackbuton = new javax.swing.JButton();
        txt_filename = new javax.swing.JTextField();
        lbl_image = new javax.swing.JLabel();
        ComboPrecioServicio = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        ComboProveedorDetalle = new javax.swing.JComboBox<>();
        ComboProductoValor = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        comboProductoID = new javax.swing.JComboBox<>();
        txtCantidadproductosDetalle = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        JListaServicios = new javax.swing.JList<>();
        btnAñadirServiciosLista = new javax.swing.JButton();
        BtnCalcularLista = new javax.swing.JButton();
        txtTotalCostoTotalServicios = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtHoraEjecucion = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtMecEje = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        ComboDetallReserSer = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();

        jLabel11.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Cantidad Productos Usados: ");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setForeground(new java.awt.Color(240, 240, 240));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_exit_40px_1.png"))); // NOI18N
        jLabel10.setText("Salir");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 20, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Ejecución de servicio  ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Confirmar Mecánico: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 72, 1200, 10));

        txtCodigoEjecucion.setBackground(new java.awt.Color(102, 255, 204));
        txtCodigoEjecucion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtCodigoEjecucion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 204)));
        txtCodigoEjecucion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodigoEjecucionKeyReleased(evt);
            }
        });
        jPanel1.add(txtCodigoEjecucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 90, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Mecánico a cargo: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, -1, -1));

        ComboMecanicoEjecucion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ComboMecanicoEjecucion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 204)));
        jPanel1.add(ComboMecanicoEjecucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 240, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Codigo de Reserva : ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Fecha Ejecución: ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 540, -1, -1));

        FechaActividad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 204)));
        jPanel1.add(FechaActividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 530, 200, 30));

        jLabel6.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Valor Total Servicios: ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 570, -1, -1));

        txtHoraEjecu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtHoraEjecu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 204)));
        txtHoraEjecu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtHoraEjecuKeyReleased(evt);
            }
        });
        jPanel1.add(txtHoraEjecu, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 590, 200, 30));

        jLabel7.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Confirmar Servicio: ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, -1, -1));

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
        jScrollPane1.setViewportView(txtComentario);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 530, 290, 100));

        jLabel8.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Comentario del trabajo realizado por el Mecánico ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 500, -1, -1));

        ComboIDServicio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ComboIDServicio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 204)));
        ComboIDServicio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboIDServicioItemStateChanged(evt);
            }
        });
        jPanel1.add(ComboIDServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 240, 30));

        btnGuardar.setBackground(new java.awt.Color(102, 102, 255));
        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnGuardar.setText("Registrar Actividad");
        btnGuardar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 640, 189, 36));

        jLabel16.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Servicios Disponibles: ");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, -1, 50));

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 210, 30, 370));

        txtCodigoreal.setBackground(new java.awt.Color(102, 255, 204));
        txtCodigoreal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtCodigoreal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 204)));
        txtCodigoreal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodigorealKeyReleased(evt);
            }
        });
        jPanel1.add(txtCodigoreal, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 90, 30));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 218, 750, 0));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Rut Dueño: ");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Patente: ");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, -1, -1));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 182, 1240, 10));

        txtRUTEJECUCION.setBackground(new java.awt.Color(102, 255, 204));
        txtRUTEJECUCION.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtRUTEJECUCION.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 204)));
        jPanel1.add(txtRUTEJECUCION, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 90, 30));

        txtPatenteEnEjecucion.setBackground(new java.awt.Color(102, 255, 204));
        txtPatenteEnEjecucion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtPatenteEnEjecucion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 204)));
        jPanel1.add(txtPatenteEnEjecucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 90, 30));

        BuscarAttackbuton.setBackground(new java.awt.Color(102, 102, 255));
        BuscarAttackbuton.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        BuscarAttackbuton.setText("Adjuntar Imagen  Vehiculo");
        BuscarAttackbuton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        BuscarAttackbuton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarAttackbutonActionPerformed(evt);
            }
        });
        jPanel1.add(BuscarAttackbuton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 450, 160, 20));

        txt_filename.setBackground(new java.awt.Color(102, 255, 204));
        txt_filename.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_filename.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_filenameKeyTyped(evt);
            }
        });
        jPanel1.add(txt_filename, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 400, 170, 30));

        lbl_image.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_image.setForeground(new java.awt.Color(255, 255, 255));
        lbl_image.setText("Imagen ");
        lbl_image.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 204)));
        jPanel1.add(lbl_image, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 210, 270, 170));

        ComboPrecioServicio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ComboPrecioServicio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 204)));
        jPanel1.add(ComboPrecioServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 240, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Codigo Ejecución:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, -1, -1));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 350, -1, 70));

        jSeparator8.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 310, 40, -1));

        jSeparator9.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, 10, 390));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Proveedor: ");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 190, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Confirmar Producto:  ");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 360, -1, -1));

        ComboProveedorDetalle.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ComboProveedorDetalle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 204)));
        jPanel1.add(ComboProveedorDetalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 220, 180, 30));

        ComboProductoValor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ComboProductoValor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 204)));
        jPanel1.add(ComboProductoValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 390, 410, 30));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Productos Disponibles: ");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 280, -1, -1));

        comboProductoID.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        comboProductoID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 204)));
        comboProductoID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboProductoIDActionPerformed(evt);
            }
        });
        jPanel1.add(comboProductoID, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 310, 270, 30));

        txtCantidadproductosDetalle.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtCantidadproductosDetalle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 204)));
        jPanel1.add(txtCantidadproductosDetalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 460, 180, 30));

        JListaServicios.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jScrollPane3.setViewportView(JListaServicios);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 470, 250, 80));

        btnAñadirServiciosLista.setBackground(new java.awt.Color(102, 102, 255));
        btnAñadirServiciosLista.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAñadirServiciosLista.setText("registrar servicio ");
        btnAñadirServiciosLista.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        btnAñadirServiciosLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirServiciosListaActionPerformed(evt);
            }
        });
        jPanel1.add(btnAñadirServiciosLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 230, 30));

        BtnCalcularLista.setBackground(new java.awt.Color(102, 102, 255));
        BtnCalcularLista.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnCalcularLista.setText("Calcular Total");
        BtnCalcularLista.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        BtnCalcularLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCalcularListaActionPerformed(evt);
            }
        });
        jPanel1.add(BtnCalcularLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 570, 200, 30));

        txtTotalCostoTotalServicios.setBackground(new java.awt.Color(102, 255, 204));
        txtTotalCostoTotalServicios.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(txtTotalCostoTotalServicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 630, 260, 30));

        jLabel20.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Hora de Ejecución :");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 600, -1, -1));

        txtHoraEjecucion.setBackground(new java.awt.Color(102, 255, 204));
        txtHoraEjecucion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(txtHoraEjecucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 90, 110, 30));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Servicio a ejecutar por codigo de reserva");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 100, -1, -1));

        txtMecEje.setBackground(new java.awt.Color(102, 255, 204));
        txtMecEje.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(txtMecEje, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 140, 110, 30));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Cantidad: ");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 470, -1, -1));

        ComboDetallReserSer.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ComboDetallReserSer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 204)));
        jPanel1.add(ComboDetallReserSer, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 134, 380, 30));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Hora Programada: ");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCalcularListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCalcularListaActionPerformed
        int suma=0;
        for (int i = 0; i < modelo.getSize(); i++) {
            suma+=Integer.parseInt(modelo.getElementAt(i).toString());

        }
        txtTotalCostoTotalServicios.setText(""+suma);
    }//GEN-LAST:event_BtnCalcularListaActionPerformed

    private void btnAñadirServiciosListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirServiciosListaActionPerformed
        String dato = ComboPrecioServicio.getSelectedItem().toString();
        Array.add(dato);
        
          modelo.removeAllElements();
         for(int i = 0; i < Array.size();i++){
            modelo.addElement(Array.get(i));
        }
        
        JOptionPane.showMessageDialog(null, "Dato Guardado con exito");
    }//GEN-LAST:event_btnAñadirServiciosListaActionPerformed

    private void txt_filenameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_filenameKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_filenameKeyTyped

    private void BuscarAttackbutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarAttackbutonActionPerformed

        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String filename = f.getAbsolutePath();
        txt_filename.setText(filename);
        Image getAbsolutePath = null;
        ImageIcon icon = new ImageIcon(filename);
        Image image = icon.getImage().getScaledInstance(lbl_image.getWidth(), lbl_image.getHeight(), Image.SCALE_SMOOTH);
        lbl_image.setIcon(icon);
    }//GEN-LAST:event_BuscarAttackbutonActionPerformed

    private void txtCodigorealKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigorealKeyReleased
        HabititarBotonGuardar();
    }//GEN-LAST:event_txtCodigorealKeyReleased

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        int i = JOptionPane.showConfirmDialog(this, "¿Estas seguro que deseas Registrar este registro de servicio?");
        if(i==0)
        {

            SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault());
            String date = formato.format(FechaActividad.getDate());

            Ejecucion modelE = new Ejecucion();
            EjecucionDAO daoE = new EjecucionDAO();

            DetalleDAO daoDE = new DetalleDAO();
            Detalle modelD = new Detalle();

            //Detalle de boleta//

            modelD.setCantProduc(Integer.parseInt(txtCantidadproductosDetalle.getText()));

            ComboDetalleProductoBoleta comboD = (ComboDetalleProductoBoleta)ComboProductoValor.getSelectedItem();
            String id2 = comboD.getPrecioPro();
            modelD.setPrecioproducto(Integer.parseInt(id2));

            modelD.setValor(Integer.parseInt(txtTotalCostoTotalServicios.getText()));

            ComboProductoDetalle comboDD = (ComboProductoDetalle)comboProductoID.getSelectedItem();
            String idd3 = comboDD.getIdProducto();
            modelD.setProducto(Integer.parseInt(idd3));

            ComboProveedor comboPro = (ComboProveedor)ComboProveedorDetalle.getSelectedItem();
            String id4 = comboPro.getRutPro();
            modelD.setProducProveedor(id4);

            modelD.setCodServicio(Integer.parseInt(txtCodigoEjecucion.getText()));

            //  ComboServiciosEjecutar comboSerD = (ComboServiciosEjecutar)ComboIDServicio.getSelectedItem();
            //   String id5 = comboSerD.getCodServicio();
            //   modelD.setCodServicio(Integer.parseInt(id5));

            modelD.setFecha(date);

            modelD.setPrecioServicio(Integer.parseInt(txtTotalCostoTotalServicios.getText()));

            //Ejecucion datos//

            modelE.setCodEjecucion(Integer.parseInt(txtCodigoEjecucion.getText()));
            modelE.setFechaActividad(date);
            modelE.setHora(txtHoraEjecu.getText());
            modelE.setComentario(txtComentario.getText());
            modelE.setIdReserva(Integer.parseInt(txtCodigoreal.getText()));

            modelE.setCostoTotal(Integer.parseInt(txtTotalCostoTotalServicios.getText()));

            modelE.setRutEmpleado(ComboMecanicoEjecucion.getItemAt(ComboMecanicoEjecucion.getSelectedIndex()));

            String image = txt_filename.getText();
            image = image.replace("\\","\\\\");

                modelE.setFoto(txt_filename.getText());

                ///Ejecucion del detalle y productos usados//

                if(daoE.registrarEjecucion(modelE) && daoDE.registroDetalle(modelD))
                {
                    JOptionPane.showMessageDialog(null, "Se registro La ejecución de servicio con exito");
                    HabititarBotonGuardar();
                }

            }else if(i==1)
            {
                JOptionPane.showMessageDialog(this, "Se cancelo el registro de la ejecución del Servicio");
            }

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void ComboIDServicioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboIDServicioItemStateChanged

        if(evt.getStateChange() == ItemEvent.SELECTED)
        {
            modeloComboServicio est = (modeloComboServicio)ComboIDServicio.getSelectedItem();
            modeloComboPrecio mm = new modeloComboPrecio();
            DefaultComboBoxModel modPrecio = new DefaultComboBoxModel(mm.mostrarPrecios(est.getId()));

            ComboPrecioServicio.setModel(modPrecio);
        }

    }//GEN-LAST:event_ComboIDServicioItemStateChanged

    private void txtComentarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtComentarioKeyTyped

        int numerocaracteres = 80;

        if(txtComentario.getText().length() >= numerocaracteres) {
            evt.consume();

            JOptionPane.showMessageDialog(rootPane, "El Comentario no puede tener mas de 80 Caracteres");
        }

    }//GEN-LAST:event_txtComentarioKeyTyped

    private void txtComentarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtComentarioKeyReleased
        HabititarBotonGuardar();
    }//GEN-LAST:event_txtComentarioKeyReleased

    private void txtHoraEjecuKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHoraEjecuKeyReleased
        HabititarBotonGuardar();
    }//GEN-LAST:event_txtHoraEjecuKeyReleased

    private void txtCodigoEjecucionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoEjecucionKeyReleased
        HabititarBotonGuardar();
    }//GEN-LAST:event_txtCodigoEjecucionKeyReleased

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        VistaPrueba2UI a = new VistaPrueba2UI();
        a.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jLabel10MouseClicked

    private void comboProductoIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboProductoIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboProductoIDActionPerformed

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
            java.util.logging.Logger.getLogger(ModuloEjecucionUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModuloEjecucionUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModuloEjecucionUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModuloEjecucionUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModuloEjecucionUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCalcularLista;
    private javax.swing.JButton BuscarAttackbuton;
    private javax.swing.JComboBox<String> ComboDetallReserSer;
    private javax.swing.JComboBox<String> ComboIDServicio;
    private javax.swing.JComboBox<String> ComboMecanicoEjecucion;
    private javax.swing.JComboBox<String> ComboPrecioServicio;
    private javax.swing.JComboBox<String> ComboProductoValor;
    private javax.swing.JComboBox<String> ComboProveedorDetalle;
    private com.toedter.calendar.JDateChooser FechaActividad;
    private javax.swing.JList<String> JListaServicios;
    private javax.swing.JButton btnAñadirServiciosLista;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> comboProductoID;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lbl_image;
    private javax.swing.JTextField txtCantidadproductosDetalle;
    private javax.swing.JTextField txtCodigoEjecucion;
    public static javax.swing.JTextField txtCodigoreal;
    private javax.swing.JTextArea txtComentario;
    private javax.swing.JTextField txtHoraEjecu;
    public static javax.swing.JTextField txtHoraEjecucion;
    public static javax.swing.JTextField txtMecEje;
    public static javax.swing.JTextField txtPatenteEnEjecucion;
    public static javax.swing.JTextField txtRUTEJECUCION;
    private javax.swing.JTextField txtTotalCostoTotalServicios;
    private javax.swing.JTextField txt_filename;
    // End of variables declaration//GEN-END:variables
}
