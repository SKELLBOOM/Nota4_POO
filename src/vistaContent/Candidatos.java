package vistaContent;

import SistemaContarVotos.Candidato;
import SistemaContarVotos.GestionCandidatos;
import SistemaContarVotos.GestionPartidoPolitico;
import SistemaContarVotos.PartidoPolitico;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Candidatos extends javax.swing.JPanel {

    private GestionCandidatos gestor = new GestionCandidatos(100);
    private GestionPartidoPolitico gestorPartidos;

    public Candidatos(GestionCandidatos gestorCandidatos, GestionPartidoPolitico gestorPartidos) {
        this.gestor = gestorCandidatos;
        this.gestorPartidos = gestorPartidos;

        initComponents();
        cargarPartidosPoliticos();

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new String[]{"Nombre", "Apellido", "DNI", "Partido Politico"});
        tablaCandidatos.setModel(modelo);

    }

    private void cargarPartidosPoliticos() {
        comboPartidoPolitico.removeAllItems();
        for (PartidoPolitico p : gestorPartidos.getPartidos()) {
            if (p != null) {
                comboPartidoPolitico.addItem(p.getNombre());
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaCandidatos = new javax.swing.JTable();
        txtregistrarunCANDIDATO = new javax.swing.JLabel();
        txtNombreP = new javax.swing.JLabel();
        txtNombreCandidato = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        txtApellido = new javax.swing.JLabel();
        txtApellidoCandidato = new javax.swing.JTextField();
        txtDNI = new javax.swing.JLabel();
        txtDniCandidato = new javax.swing.JTextField();
        txtElegirPartido = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        comboPartidoPolitico = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(550, 0));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setEnabled(false);

        tablaCandidatos.setBackground(new java.awt.Color(255, 255, 255));
        tablaCandidatos.setForeground(new java.awt.Color(0, 0, 0));
        tablaCandidatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "DNI", "Partido"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaCandidatos);

        txtregistrarunCANDIDATO.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        txtregistrarunCANDIDATO.setForeground(new java.awt.Color(0, 0, 0));
        txtregistrarunCANDIDATO.setText("REGISTRAR CANDIDATO");

        txtNombreP.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtNombreP.setForeground(new java.awt.Color(0, 0, 0));
        txtNombreP.setText("Nombre");

        txtNombreCandidato.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreCandidato.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtNombreCandidato.setForeground(new java.awt.Color(204, 204, 204));
        txtNombreCandidato.setText("Nombre ");
        txtNombreCandidato.setBorder(null);
        txtNombreCandidato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtNombreCandidatoMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNombreCandidatoMousePressed(evt);
            }
        });
        txtNombreCandidato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreCandidatoActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(255, 0, 51));
        btnEliminar.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(null);
        btnEliminar.setBorderPainted(false);
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnAgregar.setBackground(new java.awt.Color(255, 0, 51));
        btnAgregar.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Agregar");
        btnAgregar.setBorder(null);
        btnAgregar.setBorderPainted(false);
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        txtApellido.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtApellido.setForeground(new java.awt.Color(0, 0, 0));
        txtApellido.setText("Apellido");

        txtApellidoCandidato.setBackground(new java.awt.Color(255, 255, 255));
        txtApellidoCandidato.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtApellidoCandidato.setForeground(new java.awt.Color(204, 204, 204));
        txtApellidoCandidato.setText("Apellido");
        txtApellidoCandidato.setBorder(null);
        txtApellidoCandidato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtApellidoCandidatoMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtApellidoCandidatoMousePressed(evt);
            }
        });
        txtApellidoCandidato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoCandidatoActionPerformed(evt);
            }
        });

        txtDNI.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtDNI.setForeground(new java.awt.Color(0, 0, 0));
        txtDNI.setText("DNI");

        txtDniCandidato.setBackground(new java.awt.Color(255, 255, 255));
        txtDniCandidato.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtDniCandidato.setForeground(new java.awt.Color(204, 204, 204));
        txtDniCandidato.setText("Documento de Identidad");
        txtDniCandidato.setBorder(null);
        txtDniCandidato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtDniCandidatoMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtDniCandidatoMousePressed(evt);
            }
        });
        txtDniCandidato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniCandidatoActionPerformed(evt);
            }
        });

        txtElegirPartido.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtElegirPartido.setForeground(new java.awt.Color(0, 0, 0));
        txtElegirPartido.setText("Partido Politico");

        comboPartidoPolitico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtregistrarunCANDIDATO, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtElegirPartido)
                            .addComponent(comboPartidoPolitico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 52, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtApellido)
                    .addComponent(txtDNI)
                    .addComponent(txtNombreP)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDniCandidato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellidoCandidato, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreCandidato, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(txtregistrarunCANDIDATO)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(txtNombreP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreCandidato, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtApellido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtApellidoCandidato, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDNI)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDniCandidato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtElegirPartido))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboPartidoPolitico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtApellidoCandidatoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtApellidoCandidatoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoCandidatoMouseEntered

    private void txtApellidoCandidatoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtApellidoCandidatoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoCandidatoMousePressed

    private void txtApellidoCandidatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoCandidatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoCandidatoActionPerformed

    private void txtNombreCandidatoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreCandidatoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreCandidatoMouseEntered

    private void txtNombreCandidatoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreCandidatoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreCandidatoMousePressed

    private void txtNombreCandidatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreCandidatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreCandidatoActionPerformed

    private void txtDniCandidatoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDniCandidatoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniCandidatoMouseEntered

    private void txtDniCandidatoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDniCandidatoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniCandidatoMousePressed

    private void txtDniCandidatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniCandidatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniCandidatoActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String nombre = txtNombreCandidato.getText().trim();
        String apellido = txtApellidoCandidato.getText().trim();
        String dni = txtDniCandidato.getText().trim();
        String nombrepartido = (String) comboPartidoPolitico.getSelectedItem();

        if (nombre.isEmpty() || apellido.isEmpty() || dni.isEmpty() || nombrepartido == null) {
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios.");
            return;
        }

        PartidoPolitico partido = gestorPartidos.buscarPorNombre(nombrepartido);

        if (partido == null) {
            JOptionPane.showMessageDialog(this, "El partido seleccionado no existe.");
            return;
        }

        Candidato nuevo = new Candidato(nombre, apellido, dni, partido);
        boolean registrado = gestor.agregarCandidato(nuevo);

        if (registrado) {
            DefaultTableModel modelo = (DefaultTableModel) tablaCandidatos.getModel();
            modelo.addRow(new Object[]{nombre, apellido, dni, nombrepartido});

            txtNombreCandidato.setText("");
            txtApellidoCandidato.setText("");
            txtDniCandidato.setText("");
            comboPartidoPolitico.setSelectedIndex(0);

        } else {
            JOptionPane.showMessageDialog(this, "No se pudo registrar el candidato. Capacidad máxima alcanzada.");
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int filaSeleccionada = tablaCandidatos.getSelectedRow();

        if (filaSeleccionada >= 0) {
            int confirm = JOptionPane.showConfirmDialog(this,
                    "¿Estás seguro de eliminar el candidato seleccionado?",
                    "Confirmar eliminación", JOptionPane.YES_NO_OPTION);

            if (confirm == JOptionPane.YES_OPTION) {

                DefaultTableModel modelo = (DefaultTableModel) tablaCandidatos.getModel();
                modelo.removeRow(filaSeleccionada);

                boolean eliminado = gestor.eliminarCandidato(filaSeleccionada);

                if (!eliminado) {
                    JOptionPane.showMessageDialog(this, "No se pudo eliminar del arreglo.");
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona una fila para eliminar.");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JComboBox<String> comboPartidoPolitico;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable tablaCandidatos;
    private javax.swing.JLabel txtApellido;
    private javax.swing.JTextField txtApellidoCandidato;
    private javax.swing.JLabel txtDNI;
    private javax.swing.JTextField txtDniCandidato;
    private javax.swing.JLabel txtElegirPartido;
    private javax.swing.JTextField txtNombreCandidato;
    private javax.swing.JLabel txtNombreP;
    private javax.swing.JLabel txtregistrarunCANDIDATO;
    // End of variables declaration//GEN-END:variables
}
