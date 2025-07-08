package vistaContent;

import SistemaContarVotos.ContadorVotos;
import SistemaContarVotos.GestionActas;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class ConteoVotos extends javax.swing.JPanel {

    private DefaultTableModel modeloResultados;
    private GestionActas gestorActas;

    /**
     * Creates new form Partidos
     */
    public ConteoVotos(GestionActas gestorActas) {
        initComponents();
        modeloResultados = new DefaultTableModel();
        modeloResultados.setColumnIdentifiers(new String[]{"Candidato", "Partido", "Votos"});
        tablaResultados.setModel(modeloResultados);

        comboSeleccionarEleccion.removeAllItems();
        for (var acta : gestorActas.getActas()) {
            if (acta != null && acta.getEleccion() != null) {
                String descripcion = acta.getEleccion().getTipo() + " - " + acta.getEleccion().getFecha();
                comboSeleccionarEleccion.addItem(descripcion);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaResultados = new javax.swing.JTable();
        txtNombredelPartidoPolitico = new javax.swing.JLabel();
        txtregistrarunpartido = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        comboSeleccionarEleccion = new javax.swing.JComboBox<>();
        btnGenerarResultados = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(550, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setEnabled(false);

        tablaResultados.setBackground(new java.awt.Color(255, 255, 255));
        tablaResultados.setForeground(new java.awt.Color(0, 0, 0));
        tablaResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Candidato ", "Partido", "Votos"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaResultados);

        txtNombredelPartidoPolitico.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtNombredelPartidoPolitico.setForeground(new java.awt.Color(0, 0, 0));
        txtNombredelPartidoPolitico.setText("Seleccionar elección:");

        txtregistrarunpartido.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        txtregistrarunpartido.setForeground(new java.awt.Color(0, 0, 0));
        txtregistrarunpartido.setText("CONTEOS DE VOTOS");

        comboSeleccionarEleccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnGenerarResultados.setBackground(new java.awt.Color(255, 0, 51));
        btnGenerarResultados.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        btnGenerarResultados.setForeground(new java.awt.Color(255, 255, 255));
        btnGenerarResultados.setText("Generar Resultados");
        btnGenerarResultados.setBorder(null);
        btnGenerarResultados.setBorderPainted(false);
        btnGenerarResultados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGenerarResultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarResultadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtNombredelPartidoPolitico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboSeleccionarEleccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(btnGenerarResultados, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(151, 151, 151)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtregistrarunpartido)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(112, 112, 112)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(txtregistrarunpartido)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombredelPartidoPolitico)
                    .addComponent(comboSeleccionarEleccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGenerarResultados, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 360));
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarResultadosActionPerformed
        ContadorVotos.ResultadoGlobal resultadoGlobal = ContadorVotos.contarVotos(gestorActas);
        modeloResultados.setRowCount(0);
        for (ContadorVotos.ResultadoConteo rc : resultadoGlobal.getResultados()) {
            modeloResultados.addRow(new Object[]{
                rc.getNombreCompleto(),
                rc.getPartido(),
                rc.getVotos()
            });
        }

        String mensaje = "";
        mensaje += "RESULTADOS GLOBALES\n\n";
        mensaje += "Total de votos emitidos: " + resultadoGlobal.getTotalVotos() + "\n";
        mensaje += "Votos en blanco: " + resultadoGlobal.getVotosBlanco() + "\n";
        mensaje += "Votos nulos: " + resultadoGlobal.getVotosNulos() + "\n\n";

        mensaje += "RESULTADOS POR CANDIDATO:\n";
        for (ContadorVotos.ResultadoConteo rc : resultadoGlobal.getResultados()) {
            mensaje += rc.getNombreCompleto() + " (" + rc.getPartido() + "): " + rc.getVotos() + " votos\n";
        }

        mensaje += "\nGANADOR: " + resultadoGlobal.getGanador().getNombreCompleto()
                + " (" + resultadoGlobal.getGanador().getPartido() + ")\n";

        JOptionPane.showMessageDialog(this, mensaje, "Resultados", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_btnGenerarResultadosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerarResultados;
    private javax.swing.JComboBox<String> comboSeleccionarEleccion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tablaResultados;
    private javax.swing.JLabel txtNombredelPartidoPolitico;
    private javax.swing.JLabel txtregistrarunpartido;
    // End of variables declaration//GEN-END:variables
}
