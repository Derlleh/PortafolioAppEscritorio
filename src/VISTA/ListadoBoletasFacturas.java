/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VISTA;

import CONTROLADOR.BoletaDAO;
import CONTROLADOR.FacturaDAO;
import DB.Conexion;
import MODELO.Boleta;
import MODELO.Factura;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author pablo
 */
public class ListadoBoletasFacturas extends javax.swing.JFrame {

    public static Connection conexion = null;
    PreparedStatement ps;
    ResultSet rs;
    Conexion c = new Conexion();
    Connection con;
    
    
    
    public ListadoBoletasFacturas() {
        initComponents();
        setLocationRelativeTo(null);
        cerrar();
        ListarBoletas();
        ListarFacturas();
        txtIVAFACTURA.setEditable(false);
        txtIVABoleta.setEditable(false);
        
          {
        
          if(conexion == null){
        
            conexion = new Conexion().obtenerConexion();
    
                }
           }
        
        
       
        
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/logoServi2.png")).getImage());
    }
    
    private void ListarBoletas()
    {
        BoletaDAO daoBo = new BoletaDAO(); 
        TablaBoletas.setModel(daoBo.listarBoleta());
    }
    
    private void ListarFacturas()
    {
        FacturaDAO daoF = new FacturaDAO(); 
        TablaFacturas.setModel(daoF.listarFactura());
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
     
     
    public void LimpiarBoleta()
    {
        txtCodigoBoleta.setText("");
        txtPrecioNetoBoleta.setText("");
        txtIVABoleta.setText("");
        txtTotalBoleta.setText("");
    }
    
    public void LimpiarFactura()
    {
        txtCodigoFactura.setText("");
        txtPrecioNetoFactura.setText("");
        txtIVAFACTURA.setText("");
        txtTotalFactura.setText("");
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaFacturas = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaBoletas = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnEditarBoleta = new javax.swing.JButton();
        btnEliminarBoleta = new javax.swing.JButton();
        txtCodigoBoleta = new javax.swing.JTextField();
        txtPrecioNetoBoleta = new javax.swing.JTextField();
        txtIVABoleta = new javax.swing.JTextField();
        txtTotalBoleta = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtCodigoFactura = new javax.swing.JTextField();
        txtPrecioNetoFactura = new javax.swing.JTextField();
        txtIVAFACTURA = new javax.swing.JTextField();
        txtTotalFactura = new javax.swing.JTextField();
        btnEditarFactura = new javax.swing.JButton();
        btnEliminarFactura = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        TablaFacturas.setBackground(new java.awt.Color(102, 255, 102));
        TablaFacturas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        TablaFacturas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TablaFacturas.setModel(new javax.swing.table.DefaultTableModel(
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
        TablaFacturas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaFacturasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaFacturas);

        TablaBoletas.setBackground(new java.awt.Color(102, 255, 102));
        TablaBoletas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        TablaBoletas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TablaBoletas.setModel(new javax.swing.table.DefaultTableModel(
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
        TablaBoletas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaBoletasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TablaBoletas);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Boletas Emitidas");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Facturas Emitidas");

        jLabel10.setForeground(new java.awt.Color(240, 240, 240));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_exit_40px_1.png"))); // NOI18N
        jLabel10.setText("Salir");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Codigo Boleta: ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Precio Neto $: ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("IVA: ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Total $: ");

        btnEditarBoleta.setBackground(new java.awt.Color(102, 102, 255));
        btnEditarBoleta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEditarBoleta.setText("Editar Boleta");
        btnEditarBoleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarBoletaActionPerformed(evt);
            }
        });

        btnEliminarBoleta.setBackground(new java.awt.Color(102, 102, 255));
        btnEliminarBoleta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEliminarBoleta.setText("Eliminar Boleta");
        btnEliminarBoleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarBoletaActionPerformed(evt);
            }
        });

        txtCodigoBoleta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txtPrecioNetoBoleta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txtIVABoleta.setBackground(new java.awt.Color(102, 255, 204));
        txtIVABoleta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txtTotalBoleta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Codigo Factura: ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Precio Neto $: ");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("IVA: ");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Total $: ");

        txtCodigoFactura.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txtPrecioNetoFactura.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txtIVAFACTURA.setBackground(new java.awt.Color(102, 255, 204));
        txtIVAFACTURA.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtIVAFACTURA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIVAFACTURAActionPerformed(evt);
            }
        });

        txtTotalFactura.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        btnEditarFactura.setBackground(new java.awt.Color(102, 102, 255));
        btnEditarFactura.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEditarFactura.setText("Editar Factura");
        btnEditarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarFacturaActionPerformed(evt);
            }
        });

        btnEliminarFactura.setBackground(new java.awt.Color(102, 102, 255));
        btnEliminarFactura.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEliminarFactura.setText("Eliminar Factura");
        btnEliminarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarFacturaActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(102, 102, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Reporte Boletas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(102, 102, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Reporte Facturas");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel1)
                            .addGap(244, 244, 244)
                            .addComponent(jLabel10))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(48, 48, 48)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator1)
                                .addComponent(jSeparator2)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(8, 8, 8)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel3)
                                                    .addGap(3, 3, 3)
                                                    .addComponent(txtCodigoBoleta, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(26, 26, 26)
                                                    .addComponent(jLabel4)
                                                    .addGap(3, 3, 3)
                                                    .addComponent(txtPrecioNetoBoleta, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel5)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(txtIVABoleta, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jLabel6)
                                                    .addGap(3, 3, 3)
                                                    .addComponent(txtTotalBoleta, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(18, 18, Short.MAX_VALUE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(btnEditarBoleta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnEliminarBoleta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel7)
                                                    .addGap(3, 3, 3)
                                                    .addComponent(txtCodigoFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jLabel8)
                                                    .addGap(1, 1, 1)
                                                    .addComponent(txtPrecioNetoFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jLabel9)
                                                    .addGap(2, 2, 2)
                                                    .addComponent(txtIVAFACTURA, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jLabel11)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(txtTotalFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(26, 26, 26)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(btnEliminarFactura, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btnEditarFactura, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                            .addGap(0, 0, Short.MAX_VALUE)))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(297, 297, 297)
                        .addComponent(jLabel2)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(txtCodigoBoleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecioNetoBoleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIVABoleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalBoleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnEditarBoleta)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarBoleta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11)
                    .addComponent(txtCodigoFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecioNetoFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIVAFACTURA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnEditarFactura)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminarFactura)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)))
                .addContainerGap())
        );

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

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        MenuUI mm = new MenuUI();
        mm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void TablaBoletasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaBoletasMouseClicked
        
        int seleccion = TablaBoletas.rowAtPoint(evt.getPoint()); 
        
        txtCodigoBoleta.setText(TablaBoletas.getValueAt(seleccion, 0)+"");
        txtPrecioNetoBoleta.setText(TablaBoletas.getValueAt(seleccion, 1)+"");
        txtIVABoleta.setText(TablaBoletas.getValueAt(seleccion, 2)+"");
        txtTotalBoleta.setText(TablaBoletas.getValueAt(seleccion, 3)+"");
        
        
    }//GEN-LAST:event_TablaBoletasMouseClicked

    private void TablaFacturasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaFacturasMouseClicked
      
        int seleccion = TablaFacturas.rowAtPoint(evt.getPoint());
        
        txtCodigoFactura.setText(TablaFacturas.getValueAt(seleccion, 0)+"");
        txtPrecioNetoFactura.setText(TablaFacturas.getValueAt(seleccion, 1)+"");
        txtIVAFACTURA.setText(TablaFacturas.getValueAt(seleccion, 2)+"");
        txtTotalFactura.setText(TablaFacturas.getValueAt(seleccion, 3)+"");
        
        
    }//GEN-LAST:event_TablaFacturasMouseClicked

    private void btnEditarBoletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarBoletaActionPerformed
      
        int i = JOptionPane.showConfirmDialog(this, "¿Estas seguro que deseas Modificar la Boleta?");
        
        if(i==0)
        {
         Boleta modelB = new Boleta();
         BoletaDAO daoB = new BoletaDAO();
        
        modelB.setIddocCompra(Integer.parseInt(txtCodigoBoleta.getText()));
        modelB.setNeto(Integer.parseInt(txtPrecioNetoBoleta.getText()));
        modelB.setIva(Integer.parseInt(txtIVABoleta.getText()));
        modelB.setTotal(Integer.parseInt(txtTotalBoleta.getText()));
        
        if(daoB.ModificarBoleta(modelB))
        {
            JOptionPane.showMessageDialog(null, "Se Modifico la boleta con exito");
            LimpiarBoleta();
            ListarBoletas();
        }
            
            
            
        }else if(i==1)
            
        {
            JOptionPane.showMessageDialog(this, "Se cancelo la modificación de la boleta");
        }
        
        
       
        
        
    }//GEN-LAST:event_btnEditarBoletaActionPerformed

    private void btnEliminarBoletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarBoletaActionPerformed
        
         int i = JOptionPane.showConfirmDialog(this, "¿Estas seguro que deseas eliminar el cliente?"); 
       
        if(i==0)
        {
            
        Boleta modelB = new Boleta();
        BoletaDAO daoB = new BoletaDAO();
        
        modelB.setIddocCompra(Integer.parseInt(txtCodigoBoleta.getText()));
        modelB.setNeto(Integer.parseInt(txtPrecioNetoBoleta.getText()));
        modelB.setIva(Integer.parseInt(txtIVABoleta.getText()));
        modelB.setTotal(Integer.parseInt(txtTotalBoleta.getText()));
        
        if(daoB.eliminarBoleta(modelB))
        {
            JOptionPane.showMessageDialog(null, "Se Elimino la Boleta con exito");
            LimpiarBoleta();
            ListarBoletas();
        }
            
            
            
        } else if(i==1)
        {
              JOptionPane.showMessageDialog(this, "Se cancelo la eliminacion de la Boleta");
        }
        
        
        
       
        
        
    }//GEN-LAST:event_btnEliminarBoletaActionPerformed

    private void btnEditarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarFacturaActionPerformed
       
         int i = JOptionPane.showConfirmDialog(this, "¿Estas seguro que deseas actualizar los datos de la Factura?"); 
         if(i==0) 
         {
             
             
        Factura modelF = new Factura(); 
        FacturaDAO daoF = new FacturaDAO(); 
        
        modelF.setIdFactura(Integer.parseInt(txtCodigoFactura.getText()));
        modelF.setNeto(Integer.parseInt(txtPrecioNetoFactura.getText()));
        modelF.setIva(Integer.parseInt(txtIVAFACTURA.getText()));
        modelF.setTotalFactura(Integer.parseInt(txtTotalFactura.getText()));
        
        if(daoF.ModificarFactura(modelF))
        {
              JOptionPane.showMessageDialog(null, "Se Actualizo la Factura con exito");
              LimpiarFactura();
              ListarFacturas();
        }
        
             
         }else if(i==1)
         {
             JOptionPane.showMessageDialog(this, "Se cancelo la actualización de la Factura");
         }
        
      
        
    }//GEN-LAST:event_btnEditarFacturaActionPerformed

    private void btnEliminarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarFacturaActionPerformed
        
          int i = JOptionPane.showConfirmDialog(this, "¿Estas seguro que deseas eliminar los datos de la Factura?"); 
         if(i==0) 
         {
             
             
        Factura modelF = new Factura(); 
        FacturaDAO daoF = new FacturaDAO(); 
        
        modelF.setIdFactura(Integer.parseInt(txtCodigoFactura.getText()));
        modelF.setNeto(Integer.parseInt(txtPrecioNetoFactura.getText()));
        modelF.setIva(Integer.parseInt(txtIVAFACTURA.getText()));
        modelF.setTotalFactura(Integer.parseInt(txtTotalFactura.getText()));
        
        if(daoF.eliminarFactura(modelF))
        {
              JOptionPane.showMessageDialog(null, "Se Elimino la Factura con exito");
              LimpiarFactura();
              ListarFacturas();
        }
        
             
         }else if(i==1)
         {
             JOptionPane.showMessageDialog(this, "Se cancelo la Eliminación de la Factura");
         }
        
        
    }//GEN-LAST:event_btnEliminarFacturaActionPerformed

    private void txtIVAFACTURAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIVAFACTURAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIVAFACTURAActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
        
           
        int i = JOptionPane.showConfirmDialog(this, "¿Deseas Generar un reporte?"); 
        if(i==0)
        {
            
            try {
                
           JasperReport reporte; 
           String path = "C:\\Users\\pablo\\Documents\\NetBeansProjects\\APPServiExpresPortafolio\\src\\Reportes\\BoletaDeVenta.jasper";
           reporte = (JasperReport) JRLoader.loadObjectFromFile(path); 
           JasperPrint jprint = JasperFillManager.fillReport(reporte, null, conexion);     
           JasperViewer view = new JasperViewer(jprint,false);
           view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
           view.setVisible(true);
                    
                
                
                
            } catch (JRException ex) {
                
                  Logger.getLogger(ListadoBoletasFacturas.class.getName()).log(Level.SEVERE, null, ex);
                 System.out.println("fail");
                
            }
            
            
            
        } else if(i==1)
        {
            JOptionPane.showMessageDialog(this, "Se cancelo el proceso");
        }
        
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
             
        int i = JOptionPane.showConfirmDialog(this, "¿Deseas Generar un reporte?"); 
        if(i==0)
        {
            
            try {
                
           JasperReport reporte; 
           String path = "C:\\Users\\pablo\\Documents\\NetBeansProjects\\APPServiExpresPortafolio\\src\\Reportes\\ReporteFacturas.jasper";
           reporte = (JasperReport) JRLoader.loadObjectFromFile(path); 
           JasperPrint jprint = JasperFillManager.fillReport(reporte, null, conexion);     
           JasperViewer view = new JasperViewer(jprint,false);
           view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
           view.setVisible(true);
                    
                
                
                
            } catch (JRException ex) {
                
                  Logger.getLogger(ListadoBoletasFacturas.class.getName()).log(Level.SEVERE, null, ex);
                 System.out.println("fail");
                
            }
            
            
            
        } else if(i==1)
        {
            JOptionPane.showMessageDialog(this, "Se cancelo el proceso");
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
            java.util.logging.Logger.getLogger(ListadoBoletasFacturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListadoBoletasFacturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListadoBoletasFacturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListadoBoletasFacturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListadoBoletasFacturas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaBoletas;
    private javax.swing.JTable TablaFacturas;
    private javax.swing.JButton btnEditarBoleta;
    private javax.swing.JButton btnEditarFactura;
    private javax.swing.JButton btnEliminarBoleta;
    private javax.swing.JButton btnEliminarFactura;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtCodigoBoleta;
    private javax.swing.JTextField txtCodigoFactura;
    private javax.swing.JTextField txtIVABoleta;
    private javax.swing.JTextField txtIVAFACTURA;
    private javax.swing.JTextField txtPrecioNetoBoleta;
    private javax.swing.JTextField txtPrecioNetoFactura;
    private javax.swing.JTextField txtTotalBoleta;
    private javax.swing.JTextField txtTotalFactura;
    // End of variables declaration//GEN-END:variables
}
