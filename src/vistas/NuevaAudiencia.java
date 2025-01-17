/*
 * NuevaAudiencia.java
 *
 * Created on 30 de octubre de 2009, 08:23
 */

package vistas;

import facades.AudienciaFacade;
import facades.ComisariaFacade;
import facades.UnidadJudicialFacade;
import entidades.Audiencia;
import entidades.Comisaria;
import entidades.Expediente;
import entidades.Menor;
import entidades.UnidadJudicial;
import facades.MenorFacade;
import includes.Constructor;
import java.awt.Color;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.help.HelpBroker;
import javax.help.HelpSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author  Yorch
 */
public class NuevaAudiencia extends javax.swing.JFrame {

    Audiencia au = new Audiencia();
    boolean f1 = false, f2 = false, f3 = false, f4 = false;
    private int type = -1;
    private File fichero = new File("help/help_set.hs");
    private Menor menor = new Menor();
    private MenorFacade menorFacade = new MenorFacade();
    private ComisariaFacade comisariaFacade = new ComisariaFacade();
    private UnidadJudicialFacade ujf = new UnidadJudicialFacade();
    private List<Audiencia> listaAudiencias = new ArrayList();

    /** Creates new form NuevaAudiencia */
    public NuevaAudiencia(int tipo) {
        initComponents();
        inicializarComponentes(tipo);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jXDatePicker1 = new org.jdesktop.swingx.JXDatePicker();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jComboBox3 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agregar Audiencia");
        setBackground(new java.awt.Color(204, 204, 255));
        setBounds(new java.awt.Rectangle(5, 5, 10, 10));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(204, 204, 255));
        setResizable(false);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Menor");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Fecha");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("Hora");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("Nro. Expte.");

        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                borrarLabel(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "08:00", "09:00", "10:00", "11:00", "12:00" }));
        jComboBox1.setSelectedIndex(-1);
        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                borrarLabel(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/iconos16px/save_16.png"))); // NOI18N
        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarAudiencia(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/iconos16px/help_16.png"))); // NOI18N
        jButton2.setText("?");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirAyuda(evt);
            }
        });

        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("<< Seleccionar una opción en caso de ser actuación");

        jCheckBox1.setText("Alojado");

        jCheckBox2.setText("Comisaría");
        jCheckBox2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox2MouseClicked(evt);
            }
        });

        jCheckBox3.setText("Unidad Judicial");
        jCheckBox3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox3MouseClicked(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("ingresar \"Apellidos, Nombres\"");

        jButton3.setText("Buscar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jCheckBox3, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                            .addComponent(jCheckBox2, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                            .addComponent(jComboBox1, 0, 110, Short.MAX_VALUE)
                                            .addComponent(jComboBox3, 0, 110, Short.MAX_VALUE)
                                            .addComponent(jXDatePicker1, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
                                        .addGap(52, 52, 52)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jCheckBox1))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())))))
            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jXDatePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox2)
                    .addComponent(jLabel10)
                    .addComponent(jCheckBox1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox3)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void guardarAudiencia(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarAudiencia
    AudienciaFacade audienciaFacade = new AudienciaFacade();
    this.ejecutarControles(); //una vez realizado todos los controles se pueden introducir los datos en la clase
    if (f1 & f2 & f3 & f4) {
        if (jCheckBox1.isSelected()) {
            au.setAlojado(true);
        } else {
            au.setAlojado(false);
        }
        if (jCheckBox2.isSelected()) {
            au.setComisaria((Comisaria) jComboBox2.getSelectedItem());
        } else {
            au.setUnidadJudicial((UnidadJudicial) jComboBox2.getSelectedItem());
        }
        au.setMenor(menor);
        au.setFechaAudiencia(jXDatePicker1.getDate()); 
        au.setExpte((Expediente)jComboBox3.getSelectedItem()); //un único expediente en la lista de exptes del menor: el q se eligió en el dialogo
        au.setHoraAudiencia((String) jComboBox1.getSelectedItem());
        //se verifica si se trata de audiencia penal o asistencial para ingresar los datos
        if (type == 1) { //agregar audiencia penal
            au.setFueroSecretaria("Penal");
            if (audienciaFacade.altaAudiencia(au)) {
                ingresarAudienciaMenor();
                confirmarIngreso();
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo guardar la audiencia", "Operación Fallida", JOptionPane.ERROR_MESSAGE);
            }
        } else { //agregar audiencia asistencial
            au.setFueroSecretaria("Asistencial");
            if (audienciaFacade.altaAudiencia(au)) {
                ingresarAudienciaMenor();
                confirmarIngreso();
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo guardar la audiencia", "Operación Fallida", JOptionPane.ERROR_MESSAGE);
            }
        }
    } else {
        JOptionPane.showMessageDialog(this, "Verificar los campos incompletos.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}//GEN-LAST:event_guardarAudiencia

private void borrarLabel(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borrarLabel
    verificarCampo();
}//GEN-LAST:event_borrarLabel

private void abrirAyuda(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirAyuda
    try {
        // Carga el fichero de ayuda con File fichero = new File("help/help_set.hs");
        URL hsURL = fichero.toURI().toURL();
        // Crea el HelpSet y el HelpBroker
        HelpSet helpset = new HelpSet(getClass().getClassLoader(), hsURL);
        HelpBroker hb = helpset.createHelpBroker();
        // Pone ayuda a boton "?"
        hb.enableHelpOnButton(jButton2, "inicio", helpset);
    } catch (java.net.MalformedURLException ex) {
        JOptionPane.showMessageDialog(rootPane, ex.toString(), "Error", JOptionPane.ERROR_MESSAGE);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(rootPane, e.toString(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}//GEN-LAST:event_abrirAyuda

private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    dialogBuscarMenor buscarMenor = new dialogBuscarMenor(this, true);
    Constructor.centrarDialog(buscarMenor);
    buscarMenor.setVisible(true);
    menor = buscarMenor.getMenor();
    if (menor != null) {
        llenarCamposAudiencia();
    }
}//GEN-LAST:event_jButton3ActionPerformed

private void jCheckBox2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox2MouseClicked
    verificarCasillas(1);
}//GEN-LAST:event_jCheckBox2MouseClicked

private void jCheckBox3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox3MouseClicked
    verificarCasillas(2);
}//GEN-LAST:event_jCheckBox3MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker1;
    // End of variables declaration//GEN-END:variables

    private void inicializarComponentes(int tipo) {
        this.setIconImage (new ImageIcon(getClass().getResource("/iconos/iconos16px/icon_16.png")).getImage());
        this.setBackground(Color.blue);
        jTextField1.grabFocus();
        jComboBox2.setVisible(false);
        jCheckBox1.setVisible(false);
        verificarCampo();
        type = tipo;
        if(type == 2) {
            this.setTitle("Agregar audiencia - Sec. asistencial");
            jCheckBox2.setVisible(false);
            jCheckBox3.setVisible(false);
            jLabel10.setVisible(false);
        }
    }

    private void verificarCasillas(int i) {
        if (i == 1) { //si se elige la casilla de verificación de Comisaría
            if (jCheckBox2.isSelected()) {
                jCheckBox3.setSelected(false);
                jComboBox2.setVisible(true);
                Constructor.cargarJCombo(jComboBox2, comisariaFacade.getTodos());
            } else if (!jCheckBox3.isSelected()){
                jComboBox2.setVisible(false);
            }
        } else { //si se elige la casilla de verificación de Unidad Judicial
            if (jCheckBox3.isSelected()) {
                jCheckBox2.setSelected(false);
                jComboBox2.setVisible(true);
                Constructor.cargarJCombo(jComboBox2, ujf.getTodos());
            } else if (!jCheckBox2.isSelected()) {
                jComboBox2.setVisible(false);
            }
        }
    }

    private void ejecutarControles() { //para que no puedan ingresarse datos incorrectos
        if (!jTextField1.getText().equals("")) {
            f1 = true;
        } else {
            jLabel7.setText("Verificar dato introducido en campo Menor.");
        }
        if (jComboBox3.getSelectedIndex() != -1) {
            f2 = true;
        } else {
            jLabel7.setText("Verificar Nro. Expte.");
        }
        if (!jXDatePicker1.getDate().toString().equals("") || !jXDatePicker1.getDate().toString().isEmpty()) {
            f3 = true;
        }
        if (jComboBox1.getSelectedIndex() != -1) {
            f4 = true;
        } else {
            jLabel7.setText("Verificar hora seleccionada.");
        }
    }
    
    private void confirmarIngreso() {
        jLabel7.setText("Operación realizada.");
        vaciarCampos();
        this.verificarCampo();
    }

    private void vaciarCampos() {
        jTextField1.setText("");
        jXDatePicker1.updateUI();
        jComboBox1.setSelectedIndex(-1);
        jComboBox2.setSelectedIndex(-1);
        jComboBox3.setSelectedIndex(-1);
    }

    private void verificarCampo() {
        if (jTextField1.isFocusOwner()) {
            jLabel7.setText("");
        }
        if (jComboBox3.getSelectedIndex() != -1) {
            jLabel7.setText("");
        }
        if (jComboBox1.isFocusOwner()) {
            jLabel7.setText("");
        }
    }

    private void llenarCamposAudiencia() {
        jTextField1.setText(menor.toString());
        Constructor.cargarJCombo(jComboBox3, menor.getExpedientes());
        for (Expediente expte : menor.getExpedientes()) {
            if (expte.getComisaria() != null) {
                jCheckBox2.setSelected(true);
                ComisariaFacade comisariaFacade = new ComisariaFacade();
                Constructor.cargarJCombo(jComboBox2, comisariaFacade.getTodos());
                jComboBox2.setVisible(true);
                for (int index = 0; index < jComboBox2.getItemCount(); index++) { //seteo el comboBox con el valor del atributo
                    if (String.valueOf(jComboBox2.getItemAt(index)).equals(expte.getComisaria().getDescripcion())) { //comparoel valor de cada item del combo con el valor almacenado
                        jComboBox2.setSelectedIndex(index);
                    }
                }
            } else {
                jCheckBox3.setSelected(true);
                UnidadJudicialFacade ujf = new UnidadJudicialFacade();
                Constructor.cargarJCombo(jComboBox2, ujf.getTodos());
                jComboBox2.setVisible(true);
                for (int index = 0; index < jComboBox2.getItemCount(); index++) { //seteo el comboBox con el valor del objeto
                    if (String.valueOf(jComboBox2.getItemAt(index)).equals(expte.getUnidadJudicial().getDescripcion())) {
                        jComboBox2.setSelectedIndex(index);
                    }
                }
            }
        }
    }

    private void ingresarAudienciaMenor() {
        listaAudiencias.add(au);
        menor.setAudiencias(listaAudiencias);
        menorFacade.modificarMenor(menor);
    }
}
