/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ec.edu.ups.practica_05_ssuquilanda_jabad.vista.compositor;

import ec.edu.ups.practica_05_ssuquilanda_jabad.controlador.ControladorCompositor;
import ec.edu.ups.practica_05_ssuquilanda_jabad.modelo.Cantante;
import ec.edu.ups.practica_05_ssuquilanda_jabad.modelo.Compositor;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;

/**
 *
 * @author samanthasuquilandaquilli
 */
public class VentanaBuscarCompositor extends javax.swing.JInternalFrame {
     private ControladorCompositor controladorCompositor;
     private ResourceBundle mensajes;
    /**
     * Creates new form VentanaBuscarCompositor
     */
    public VentanaBuscarCompositor(ControladorCompositor controladorCompositor) {
        initComponents();
        this.controladorCompositor= controladorCompositor;
    }
    public void cambiarIdioma(Locale localizacion){
        mensajes = ResourceBundle.getBundle("mensajes.mensaje", localizacion);
        jLabel1.setText(mensajes.getString("txtBuscarCompositor"));
        lblNombreCrearPersona2.setText(mensajes.getString("txtCódigo"));
        lblNombreCrearPersona1.setText(mensajes.getString("txtNombre"));        
        lblFechaNacimientoCrearPersona.setText(mensajes.getString("txtApellido"));        
        lblNombreCrearPersona3.setText(mensajes.getString("txtEdad"));        
        lblNombreCrearPersona4.setText(mensajes.getString("txtNacionalidad"));       
        lblNombreCrearPersona6.setText(mensajes.getString("txtNúmeroDeComposiciónes"));        
        lblNombreCrearPersona11.setText(mensajes.getString("txtSalarioBase"));
        lblNombreCrearPersona10.setText(mensajes.getString("txtSalarioFinal"));
        btnAceptarBuscarCompositor.setText(mensajes.getString("txtBuscar"));
        btnCancelarBuscarCompositor.setText(mensajes.getString("txtCancelar"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        panelCantante = new javax.swing.JPanel();
        lblFechaNacimientoCrearPersona = new javax.swing.JLabel();
        txtCodigoCompositor = new javax.swing.JTextField();
        txtNombreCompositor = new javax.swing.JTextField();
        btnAceptarBuscarCompositor = new javax.swing.JButton();
        btnCancelarBuscarCompositor = new javax.swing.JButton();
        lblicono = new javax.swing.JLabel();
        lblcantantaFondo = new javax.swing.JLabel();
        lblCantante = new javax.swing.JLabel();
        lblNombreCrearPersona1 = new javax.swing.JLabel();
        lblNombreCrearPersona2 = new javax.swing.JLabel();
        lblNombreCrearPersona3 = new javax.swing.JLabel();
        lblNombreCrearPersona4 = new javax.swing.JLabel();
        lblNombreCrearPersona6 = new javax.swing.JLabel();
        txtNumComposicionesCompositor = new javax.swing.JTextField();
        txtApellidoCompositor = new javax.swing.JTextField();
        txtEdadCompositor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lblNombreCrearPersona10 = new javax.swing.JLabel();
        txtSalarioFinalCompositor = new javax.swing.JTextField();
        lblNombreCrearPersona11 = new javax.swing.JLabel();
        txtSalarioCompositor = new javax.swing.JTextField();
        cbxPaisActualizarCompositor = new javax.swing.JComboBox<>();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar compositor por su codigo"));
        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jInternalFrame1.setClosable(true);
        jInternalFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        jInternalFrame1.setIconifiable(true);
        jInternalFrame1.setMaximizable(true);
        jInternalFrame1.setResizable(true);
        jInternalFrame1.addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                jInternalFrame1formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                jInternalFrame1formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jInternalFrame1, new org.netbeans.lib.awtextra.AbsoluteConstraints(451, 309, 0, 0));

        panelCantante.setBackground(new java.awt.Color(255, 255, 255));
        panelCantante.setToolTipText("Crear Nueva Persona");
        panelCantante.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFechaNacimientoCrearPersona.setFont(new java.awt.Font("AkayaTelivigala", 0, 24)); // NOI18N
        lblFechaNacimientoCrearPersona.setText("Apellido:");
        panelCantante.add(lblFechaNacimientoCrearPersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 160, 30));

        txtCodigoCompositor.setToolTipText("Ingrese el codigo del compositor a buscar");
        txtCodigoCompositor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoCompositorActionPerformed(evt);
            }
        });
        panelCantante.add(txtCodigoCompositor, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 240, 30));

        txtNombreCompositor.setToolTipText("Ingrese el nombre del cantante");
        txtNombreCompositor.setEnabled(false);
        txtNombreCompositor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreCompositorActionPerformed(evt);
            }
        });
        panelCantante.add(txtNombreCompositor, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 240, 30));

        btnAceptarBuscarCompositor.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnAceptarBuscarCompositor.setText("Buscar");
        btnAceptarBuscarCompositor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarBuscarCompositorActionPerformed(evt);
            }
        });
        panelCantante.add(btnAceptarBuscarCompositor, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, 106, 32));

        btnCancelarBuscarCompositor.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnCancelarBuscarCompositor.setText("Cancelar");
        btnCancelarBuscarCompositor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarBuscarCompositorActionPerformed(evt);
            }
        });
        panelCantante.add(btnCancelarBuscarCompositor, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 460, 104, 32));

        lblicono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/silue h.png"))); // NOI18N
        panelCantante.add(lblicono, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, -10, 230, 430));

        lblcantantaFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo.jpeg"))); // NOI18N
        lblcantantaFondo.setText("jLabel1");
        panelCantante.add(lblcantantaFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 290, 460));

        lblCantante.setFont(new java.awt.Font("AkayaTelivigala", 1, 36)); // NOI18N
        lblCantante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/My project-1-3.png"))); // NOI18N
        lblCantante.setText("UPS Musik");
        lblCantante.setPreferredSize(new java.awt.Dimension(200, 400));
        panelCantante.add(lblCantante, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 330, 50));

        lblNombreCrearPersona1.setFont(new java.awt.Font("AkayaTelivigala", 0, 24)); // NOI18N
        lblNombreCrearPersona1.setText("Nombre:");
        panelCantante.add(lblNombreCrearPersona1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 140, 30));

        lblNombreCrearPersona2.setFont(new java.awt.Font("AkayaKanadaka", 0, 24)); // NOI18N
        lblNombreCrearPersona2.setText("Codigo:");
        panelCantante.add(lblNombreCrearPersona2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 210, 30));

        lblNombreCrearPersona3.setFont(new java.awt.Font("AkayaKanadaka", 0, 24)); // NOI18N
        lblNombreCrearPersona3.setText("Edad:");
        panelCantante.add(lblNombreCrearPersona3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 110, 30));

        lblNombreCrearPersona4.setFont(new java.awt.Font("AkayaKanadaka", 0, 24)); // NOI18N
        lblNombreCrearPersona4.setText("Nacionalidad:");
        panelCantante.add(lblNombreCrearPersona4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 170, 30));

        lblNombreCrearPersona6.setFont(new java.awt.Font("AkayaKanadaka", 0, 24)); // NOI18N
        lblNombreCrearPersona6.setText("Num. Composiciones");
        panelCantante.add(lblNombreCrearPersona6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 240, 30));

        txtNumComposicionesCompositor.setToolTipText("Ingrese el numero de composiciones ");
        txtNumComposicionesCompositor.setEnabled(false);
        txtNumComposicionesCompositor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumComposicionesCompositorActionPerformed(evt);
            }
        });
        panelCantante.add(txtNumComposicionesCompositor, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 240, 30));

        txtApellidoCompositor.setToolTipText("Ingrese el apellido del cantante");
        txtApellidoCompositor.setEnabled(false);
        txtApellidoCompositor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoCompositorActionPerformed(evt);
            }
        });
        panelCantante.add(txtApellidoCompositor, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 240, 30));

        txtEdadCompositor.setToolTipText("Ingrese le edad del cantante");
        txtEdadCompositor.setEnabled(false);
        txtEdadCompositor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdadCompositorActionPerformed(evt);
            }
        });
        panelCantante.add(txtEdadCompositor, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 240, 30));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel1.setText("Buscar Compositor:");
        panelCantante.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 150, 30));

        lblNombreCrearPersona10.setFont(new java.awt.Font("AkayaKanadaka", 0, 24)); // NOI18N
        lblNombreCrearPersona10.setText("Salario Final:");
        panelCantante.add(lblNombreCrearPersona10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 220, 30));

        txtSalarioFinalCompositor.setToolTipText("Ingrese el salario del Cantante");
        txtSalarioFinalCompositor.setEnabled(false);
        txtSalarioFinalCompositor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalarioFinalCompositorActionPerformed(evt);
            }
        });
        panelCantante.add(txtSalarioFinalCompositor, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, 240, 30));

        lblNombreCrearPersona11.setFont(new java.awt.Font("AkayaKanadaka", 0, 24)); // NOI18N
        lblNombreCrearPersona11.setText("Salario Base:");
        panelCantante.add(lblNombreCrearPersona11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 220, 30));

        txtSalarioCompositor.setToolTipText("Ingrese el salario del Cantante");
        txtSalarioCompositor.setEnabled(false);
        txtSalarioCompositor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalarioCompositorActionPerformed(evt);
            }
        });
        panelCantante.add(txtSalarioCompositor, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, 240, 30));

        cbxPaisActualizarCompositor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Selecciona un País--" }));
        cbxPaisActualizarCompositor.setToolTipText("Selecciona la nacionalidad del Cantante");
        cbxPaisActualizarCompositor.setEnabled(false);
        panelCantante.add(cbxPaisActualizarCompositor, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 240, 30));

        getContentPane().add(panelCantante, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, -4, 900, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameActivated

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        // TODO add your handling code here:
        this.limpiarCampos();
    }//GEN-LAST:event_formInternalFrameClosing

    private void jInternalFrame1formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_jInternalFrame1formInternalFrameActivated
        // TODO add your handling code here:
    }//GEN-LAST:event_jInternalFrame1formInternalFrameActivated

    private void jInternalFrame1formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_jInternalFrame1formInternalFrameClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_jInternalFrame1formInternalFrameClosing

    private void txtCodigoCompositorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoCompositorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoCompositorActionPerformed

    private void txtNombreCompositorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreCompositorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreCompositorActionPerformed

    private void btnAceptarBuscarCompositorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarBuscarCompositorActionPerformed
        String codigo = txtCodigoCompositor.getText();
        if (codigo.isEmpty()) {
            JOptionPane.showMessageDialog(this, "El codigo del compositor a buscar no ha sido ingresado!");
        } else {
            int codiguito = Integer.parseInt(codigo);

            Compositor compositor = controladorCompositor.buscarCompositor(codiguito);
            if (compositor != null) {
                txtNombreCompositor.setText(compositor.getNombre());
                txtApellidoCompositor.setText(compositor.getApellido());
                String edad = String.valueOf(compositor.getEdad());
                txtEdadCompositor.setText(edad);
                cbxPaisActualizarCompositor.setSelectedItem(compositor.getNacionalidad());
                String numComposiciones = String.valueOf(compositor.getNumeroDeComposiciones());
                txtNumComposicionesCompositor.setText(numComposiciones);
                String salarioCom = String.valueOf(compositor.getSalario());
                String salarioComF = String.valueOf(compositor.getSalarioFinal());
                txtSalarioCompositor.setText(salarioCom);
                txtSalarioFinalCompositor.setText(salarioComF);
                JOptionPane.showMessageDialog(this, "El/La compositor con codigo " + codiguito + " ha sido encontrado !:)");

            } else {
                JOptionPane.showMessageDialog(this, "El/La compositor con codigo " + codiguito + " no ha sido encontrado !:(");

                this.limpiarCampos();
            }
        }
    }//GEN-LAST:event_btnAceptarBuscarCompositorActionPerformed
    private void limpiarCampos() {
        this.txtCodigoCompositor.setText("");
        this.txtNombreCompositor.setText("");
        this.txtApellidoCompositor.setText("");
        this.txtEdadCompositor.setText("");
        this.cbxPaisActualizarCompositor.setSelectedItem("--Selecciona un País--");
        this.txtNumComposicionesCompositor.setText("");
        this.txtSalarioFinalCompositor.setText("");

    }
    private void btnCancelarBuscarCompositorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarBuscarCompositorActionPerformed
        // TODO add your handling code here:
        this.limpiarCampos();
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarBuscarCompositorActionPerformed

    private void txtNumComposicionesCompositorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumComposicionesCompositorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumComposicionesCompositorActionPerformed

    private void txtApellidoCompositorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoCompositorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoCompositorActionPerformed

    private void txtEdadCompositorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdadCompositorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdadCompositorActionPerformed

    private void txtSalarioFinalCompositorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalarioFinalCompositorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalarioFinalCompositorActionPerformed

    private void txtSalarioCompositorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalarioCompositorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalarioCompositorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptarBuscarCompositor;
    private javax.swing.JButton btnCancelarBuscarCompositor;
    private javax.swing.JComboBox<String> cbxPaisActualizarCompositor;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCantante;
    private javax.swing.JLabel lblFechaNacimientoCrearPersona;
    private javax.swing.JLabel lblNombreCrearPersona1;
    private javax.swing.JLabel lblNombreCrearPersona10;
    private javax.swing.JLabel lblNombreCrearPersona11;
    private javax.swing.JLabel lblNombreCrearPersona2;
    private javax.swing.JLabel lblNombreCrearPersona3;
    private javax.swing.JLabel lblNombreCrearPersona4;
    private javax.swing.JLabel lblNombreCrearPersona6;
    private javax.swing.JLabel lblcantantaFondo;
    private javax.swing.JLabel lblicono;
    private javax.swing.JPanel panelCantante;
    private javax.swing.JTextField txtApellidoCompositor;
    private javax.swing.JTextField txtCodigoCompositor;
    private javax.swing.JTextField txtEdadCompositor;
    private javax.swing.JTextField txtNombreCompositor;
    private javax.swing.JTextField txtNumComposicionesCompositor;
    private javax.swing.JTextField txtSalarioCompositor;
    private javax.swing.JTextField txtSalarioFinalCompositor;
    // End of variables declaration//GEN-END:variables
}
