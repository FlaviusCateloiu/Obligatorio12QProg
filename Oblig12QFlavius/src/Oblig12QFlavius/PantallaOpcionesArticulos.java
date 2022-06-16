package Oblig12QFlavius;

import ADO.*;
import MisListas.*;

/**
 *
 * @author Flavius Florian Cateloiu
 */
public class PantallaOpcionesArticulos extends javax.swing.JFrame {

    private ListaArticulos listaArt;
    private ListaAutores listaAut;
    private ListaAlquileres listaAlq;
    private int posVentana;
    /**
     * Creates new form PantallaOpcionesArticulos
     */
    public PantallaOpcionesArticulos(int posPanelArt, ListaArticulos listaArt, ListaAutores listaAut, ListaAlquileres listaAlq) {
        initComponents();
        setLocationRelativeTo(null);
        this.listaArt = listaArt;
        this. listaAut = listaAut;
        this.listaAlq = listaAlq;
        jTPArticulos.setSelectedIndex(posPanelArt);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTPArticulos = new javax.swing.JTabbedPane();
        jPAltaArticulo = new javax.swing.JPanel();
        jBVolverAlta = new javax.swing.JButton();
        jPDatosArtAlta = new javax.swing.JPanel();
        jLblNombreAlta = new javax.swing.JLabel();
        jTFNombreAlta = new javax.swing.JTextField();
        jLFechaAlta = new javax.swing.JLabel();
        jLErrorNombreAlta = new javax.swing.JLabel();
        jDCFechaAlta = new com.toedter.calendar.JDateChooser();
        jLAnyoAlta = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTAResumenAlta = new javax.swing.JTextArea();
        jLErrorResumenAlta = new javax.swing.JLabel();
        jSAnyoAlta = new javax.swing.JSlider();
        jPDatosAutArtAlta = new javax.swing.JPanel();
        jLNombreAutorAlta = new javax.swing.JLabel();
        jTFNombreAutorAlta = new javax.swing.JTextField();
        jLApellidosAutorAlta = new javax.swing.JLabel();
        jTFApellidosAutorAlta = new javax.swing.JTextField();
        jLErrorNombreAutorAlta = new javax.swing.JLabel();
        jLErrorDeterioradoAlta = new javax.swing.JLabel();
        jCBDeterioradoAlta = new javax.swing.JCheckBox();
        jLErrorApellidosAutorAlta1 = new javax.swing.JLabel();
        jPBajaArticulo = new javax.swing.JPanel();
        jBVolverBaja = new javax.swing.JButton();
        jPModifArticulo = new javax.swing.JPanel();
        jBVolverMod = new javax.swing.JButton();
        jPConsultarArticulo = new javax.swing.JPanel();
        jBVolverCons = new javax.swing.JButton();
        jPConsultarTodosArticulos = new javax.swing.JPanel();
        jBVolverConsTod = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jBVolverAlta.setText("Volver");
        jBVolverAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVolverAltaActionPerformed(evt);
            }
        });

        jPDatosArtAlta.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Datos del Articulo", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jLblNombreAlta.setText("Nombre:");

        jLFechaAlta.setText("Fecha:");

        jLAnyoAlta.setText("Año:");

        jLabel1.setText("Resumen:");

        jTAResumenAlta.setColumns(20);
        jTAResumenAlta.setLineWrap(true);
        jTAResumenAlta.setRows(5);
        jScrollPane1.setViewportView(jTAResumenAlta);

        jSAnyoAlta.setMajorTickSpacing(1);
        jSAnyoAlta.setMaximum(22);
        jSAnyoAlta.setPaintLabels(true);
        jSAnyoAlta.setPaintTicks(true);
        jSAnyoAlta.setValue(0);

        javax.swing.GroupLayout jPDatosArtAltaLayout = new javax.swing.GroupLayout(jPDatosArtAlta);
        jPDatosArtAlta.setLayout(jPDatosArtAltaLayout);
        jPDatosArtAltaLayout.setHorizontalGroup(
            jPDatosArtAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatosArtAltaLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPDatosArtAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLFechaAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblNombreAlta, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(jLAnyoAlta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPDatosArtAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPDatosArtAltaLayout.createSequentialGroup()
                        .addGroup(jPDatosArtAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTFNombreAlta, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                            .addComponent(jDCFechaAlta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLErrorNombreAlta, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))
                    .addComponent(jLErrorResumenAlta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPDatosArtAltaLayout.createSequentialGroup()
                        .addGroup(jPDatosArtAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
                            .addComponent(jSAnyoAlta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPDatosArtAltaLayout.setVerticalGroup(
            jPDatosArtAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatosArtAltaLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPDatosArtAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPDatosArtAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLblNombreAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTFNombreAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLErrorNombreAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPDatosArtAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLFechaAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDCFechaAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPDatosArtAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLAnyoAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSAnyoAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPDatosArtAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLErrorResumenAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPDatosAutArtAlta.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Datos de Autor del Articulo", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jLNombreAutorAlta.setText("Nombre Autor:");

        jLApellidosAutorAlta.setText("Apellidos Autor:");

        jCBDeterioradoAlta.setText("Articulo Deteriorado");

        javax.swing.GroupLayout jPDatosAutArtAltaLayout = new javax.swing.GroupLayout(jPDatosAutArtAlta);
        jPDatosAutArtAlta.setLayout(jPDatosAutArtAltaLayout);
        jPDatosAutArtAltaLayout.setHorizontalGroup(
            jPDatosAutArtAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatosAutArtAltaLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPDatosAutArtAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPDatosAutArtAltaLayout.createSequentialGroup()
                        .addComponent(jCBDeterioradoAlta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLErrorDeterioradoAlta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(216, 216, 216))
                    .addGroup(jPDatosAutArtAltaLayout.createSequentialGroup()
                        .addGroup(jPDatosAutArtAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLNombreAutorAlta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLApellidosAutorAlta, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPDatosAutArtAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTFNombreAutorAlta, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                            .addComponent(jTFApellidosAutorAlta))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLErrorNombreAutorAlta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPDatosAutArtAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPDatosAutArtAltaLayout.createSequentialGroup()
                    .addGap(309, 309, 309)
                    .addComponent(jLErrorApellidosAutorAlta1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(16, 16, 16)))
        );
        jPDatosAutArtAltaLayout.setVerticalGroup(
            jPDatosAutArtAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatosAutArtAltaLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPDatosAutArtAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNombreAutorAlta)
                    .addComponent(jTFNombreAutorAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLErrorNombreAutorAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPDatosAutArtAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTFApellidosAutorAlta)
                    .addComponent(jLApellidosAutorAlta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPDatosAutArtAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCBDeterioradoAlta)
                    .addComponent(jLErrorDeterioradoAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPDatosAutArtAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPDatosAutArtAltaLayout.createSequentialGroup()
                    .addGap(61, 61, 61)
                    .addComponent(jLErrorApellidosAutorAlta1, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addGap(29, 29, 29)))
        );

        javax.swing.GroupLayout jPAltaArticuloLayout = new javax.swing.GroupLayout(jPAltaArticulo);
        jPAltaArticulo.setLayout(jPAltaArticuloLayout);
        jPAltaArticuloLayout.setHorizontalGroup(
            jPAltaArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPAltaArticuloLayout.createSequentialGroup()
                .addContainerGap(621, Short.MAX_VALUE)
                .addComponent(jBVolverAlta)
                .addGap(15, 15, 15))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPAltaArticuloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPAltaArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPDatosAutArtAlta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPDatosArtAlta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPAltaArticuloLayout.setVerticalGroup(
            jPAltaArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPAltaArticuloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPDatosArtAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPDatosAutArtAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jBVolverAlta)
                .addGap(14, 14, 14))
        );

        jTPArticulos.addTab("Alta", jPAltaArticulo);

        jBVolverBaja.setText("Volver");
        jBVolverBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVolverBajaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPBajaArticuloLayout = new javax.swing.GroupLayout(jPBajaArticulo);
        jPBajaArticulo.setLayout(jPBajaArticuloLayout);
        jPBajaArticuloLayout.setHorizontalGroup(
            jPBajaArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPBajaArticuloLayout.createSequentialGroup()
                .addContainerGap(617, Short.MAX_VALUE)
                .addComponent(jBVolverBaja)
                .addGap(19, 19, 19))
        );
        jPBajaArticuloLayout.setVerticalGroup(
            jPBajaArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPBajaArticuloLayout.createSequentialGroup()
                .addContainerGap(489, Short.MAX_VALUE)
                .addComponent(jBVolverBaja)
                .addGap(15, 15, 15))
        );

        jTPArticulos.addTab("Baja", jPBajaArticulo);

        jBVolverMod.setText("Volver");
        jBVolverMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVolverModActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPModifArticuloLayout = new javax.swing.GroupLayout(jPModifArticulo);
        jPModifArticulo.setLayout(jPModifArticuloLayout);
        jPModifArticuloLayout.setHorizontalGroup(
            jPModifArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPModifArticuloLayout.createSequentialGroup()
                .addContainerGap(619, Short.MAX_VALUE)
                .addComponent(jBVolverMod)
                .addGap(17, 17, 17))
        );
        jPModifArticuloLayout.setVerticalGroup(
            jPModifArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPModifArticuloLayout.createSequentialGroup()
                .addContainerGap(488, Short.MAX_VALUE)
                .addComponent(jBVolverMod)
                .addGap(16, 16, 16))
        );

        jTPArticulos.addTab("Modificar", jPModifArticulo);

        jBVolverCons.setText("Volver");
        jBVolverCons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVolverConsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPConsultarArticuloLayout = new javax.swing.GroupLayout(jPConsultarArticulo);
        jPConsultarArticulo.setLayout(jPConsultarArticuloLayout);
        jPConsultarArticuloLayout.setHorizontalGroup(
            jPConsultarArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPConsultarArticuloLayout.createSequentialGroup()
                .addContainerGap(621, Short.MAX_VALUE)
                .addComponent(jBVolverCons)
                .addGap(15, 15, 15))
        );
        jPConsultarArticuloLayout.setVerticalGroup(
            jPConsultarArticuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPConsultarArticuloLayout.createSequentialGroup()
                .addContainerGap(485, Short.MAX_VALUE)
                .addComponent(jBVolverCons)
                .addGap(19, 19, 19))
        );

        jTPArticulos.addTab("Consultar", jPConsultarArticulo);

        jBVolverConsTod.setText("Volver");
        jBVolverConsTod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVolverConsTodActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPConsultarTodosArticulosLayout = new javax.swing.GroupLayout(jPConsultarTodosArticulos);
        jPConsultarTodosArticulos.setLayout(jPConsultarTodosArticulosLayout);
        jPConsultarTodosArticulosLayout.setHorizontalGroup(
            jPConsultarTodosArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPConsultarTodosArticulosLayout.createSequentialGroup()
                .addContainerGap(617, Short.MAX_VALUE)
                .addComponent(jBVolverConsTod)
                .addGap(19, 19, 19))
        );
        jPConsultarTodosArticulosLayout.setVerticalGroup(
            jPConsultarTodosArticulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPConsultarTodosArticulosLayout.createSequentialGroup()
                .addContainerGap(490, Short.MAX_VALUE)
                .addComponent(jBVolverConsTod)
                .addGap(14, 14, 14))
        );

        jTPArticulos.addTab("Consultar Todos", jPConsultarTodosArticulos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTPArticulos)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTPArticulos)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBVolverModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVolverModActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBVolverModActionPerformed

    private void jBVolverAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVolverAltaActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBVolverAltaActionPerformed

    private void jBVolverBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVolverBajaActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBVolverBajaActionPerformed

    private void jBVolverConsTodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVolverConsTodActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBVolverConsTodActionPerformed

    private void jBVolverConsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVolverConsActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBVolverConsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBVolverAlta;
    private javax.swing.JButton jBVolverBaja;
    private javax.swing.JButton jBVolverCons;
    private javax.swing.JButton jBVolverConsTod;
    private javax.swing.JButton jBVolverMod;
    private javax.swing.JCheckBox jCBDeterioradoAlta;
    private com.toedter.calendar.JDateChooser jDCFechaAlta;
    private javax.swing.JLabel jLAnyoAlta;
    private javax.swing.JLabel jLApellidosAutorAlta;
    private javax.swing.JLabel jLErrorApellidosAutorAlta1;
    private javax.swing.JLabel jLErrorDeterioradoAlta;
    private javax.swing.JLabel jLErrorNombreAlta;
    private javax.swing.JLabel jLErrorNombreAutorAlta;
    private javax.swing.JLabel jLErrorResumenAlta;
    private javax.swing.JLabel jLFechaAlta;
    private javax.swing.JLabel jLNombreAutorAlta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLblNombreAlta;
    private javax.swing.JPanel jPAltaArticulo;
    private javax.swing.JPanel jPBajaArticulo;
    private javax.swing.JPanel jPConsultarArticulo;
    private javax.swing.JPanel jPConsultarTodosArticulos;
    private javax.swing.JPanel jPDatosArtAlta;
    private javax.swing.JPanel jPDatosAutArtAlta;
    private javax.swing.JPanel jPModifArticulo;
    private javax.swing.JSlider jSAnyoAlta;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTAResumenAlta;
    private javax.swing.JTextField jTFApellidosAutorAlta;
    private javax.swing.JTextField jTFNombreAlta;
    private javax.swing.JTextField jTFNombreAutorAlta;
    private javax.swing.JTabbedPane jTPArticulos;
    // End of variables declaration//GEN-END:variables
}
