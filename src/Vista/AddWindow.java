
package Vista;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import Vista.Estudiantes;
import Vista.Trabajadores;
import Vista.Profesores;
import Vista.Todos;
import javax.swing.table.DefaultTableModel;

public class AddWindow extends javax.swing.JFrame {

    
    
    private ArrayList<Object[]> info;
    
    public AddWindow() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Atrás = new javax.swing.JButton();
        AñadirAgregar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        AñadirNombre = new javax.swing.JTextField();
        AñadirApellidos = new javax.swing.JTextField();
        AñadirID = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        AñadirNumero = new javax.swing.JTextField();
        AñadirCiudad = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        AñadirTipo = new javax.swing.JComboBox<>();
        AñadirEstamento = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        AñadirDia = new javax.swing.JTextField();
        AñadirMes = new javax.swing.JTextField();
        AñadirAño = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        AñadirDireccion = new javax.swing.JTextField();
        AñadirBarrio = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Atrás.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        Atrás.setText("Atrás");
        Atrás.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrásActionPerformed(evt);
            }
        });

        AñadirAgregar.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        AñadirAgregar.setText("Agregar");
        AñadirAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AñadirAgregarMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel2.setText("Añadir");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("*");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("Apellidos:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("ID:");

        AñadirNombre.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        AñadirApellidos.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        AñadirID.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setText("Dirección:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setText("Barrio:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setText("Ciudad:");

        AñadirNumero.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        AñadirCiudad.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setText("Número:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel10.setText("Tipo:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel11.setText("Estamento:");

        AñadirTipo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        AñadirTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celular", "Telefono", "Fax" }));

        AñadirEstamento.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        AñadirEstamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Trabajador", "Profesor", "Alumno" }));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel12.setText("Día:");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel13.setText("Mes:");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel14.setText("Año:");

        AñadirDia.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        AñadirMes.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        AñadirAño.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 51, 51));
        jLabel15.setText("*");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 51, 51));
        jLabel16.setText("*");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 51, 51));
        jLabel17.setText("*");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 51, 51));
        jLabel18.setText("*");

        AñadirDireccion.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        AñadirBarrio.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel15))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel18))
                                    .addComponent(AñadirDia, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 41, Short.MAX_VALUE)))
                        .addGap(46, 46, 46))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(AñadirNumero, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(AñadirNombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AñadirDireccion, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AñadirApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(AñadirTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(AñadirBarrio, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AñadirCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AñadirID, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel17))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(AñadirAño, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(AñadirEstamento, javax.swing.GroupLayout.Alignment.LEADING, 0, 165, Short.MAX_VALUE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(86, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16))
                            .addComponent(AñadirMes, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Atrás, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AñadirAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(AñadirAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(AñadirApellidos, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AñadirNombre, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AñadirID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel17))
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(AñadirBarrio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(AñadirDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(AñadirCiudad))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel18))
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AñadirTipo)
                    .addComponent(AñadirNumero)
                    .addComponent(AñadirEstamento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AñadirDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AñadirAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AñadirMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(Atrás, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AtrásActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrásActionPerformed
        
        StartWindow retroceder = new StartWindow();
        
        retroceder.setVisible(true);
        
        this.dispose();
        
    }//GEN-LAST:event_AtrásActionPerformed

    private void AñadirAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AñadirAgregarMouseClicked
        
        DefaultTableModel modeloEstudiante = (DefaultTableModel) Estudiantes.tablaDatosEstudiantes.getModel();
        DefaultTableModel modeloProfesores = (DefaultTableModel) Profesores.tablaDatosProfesores.getModel();
        DefaultTableModel modeloTrabajadores = (DefaultTableModel) Trabajadores.tablaDatosTrabajadores.getModel();
        
        Object[] nuevaFila = new Object[12];
        
        // Verificar que los campos obligatorios estén llenos
        if (AñadirNombre.getText().isEmpty() || AñadirDireccion.getText().isEmpty() ||
            AñadirBarrio.getText().isEmpty() || AñadirCiudad.getText().isEmpty() ||
            AñadirNumero.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Salir del método para evitar la acción incorrecta
        }

        // Verificar que el campo de nombre contenga solo letras
        if (!soloLetras(AñadirNombre.getText())) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese solo letras en el campo de nombre.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Verificar que el campo de apellidos contenga solo letras o esté vacío
        if (!AñadirApellidos.getText().isEmpty() && !soloLetras(AñadirApellidos.getText())) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese solo letras en el campo de apellidos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Verificar que el campo de ID contenga solo números o esté vacío
        if (!AñadirID.getText().isEmpty() && !soloNumeros(AñadirID.getText())) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese solo números en el campo de ID.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Verificar que el campo de dirección no esté vacío
        if (AñadirDireccion.getText()== null) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese una dirección.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Verificar que el campo de barrio no esté vacío
        if (AñadirBarrio.getText()== null) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un barrio.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Verificar que el campo de ciudad no esté vacío
        if (AñadirCiudad.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese una ciudad.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Verificar que el campo de número contenga solo números
        if (!soloNumeros(AñadirNumero.getText())) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese solo números en el campo de número.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Verificar que los campos de día, mes y año contengan solo números o estén vacíos
        if ((!AñadirDia.getText().isEmpty() && !soloNumeros(AñadirDia.getText())) ||
            (!AñadirMes.getText().isEmpty() && !soloNumeros(AñadirMes.getText())) ||
            (!AñadirAño.getText().isEmpty() && !soloNumeros(AñadirAño.getText()))) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese solo números en los campos de día, mes y año.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        
        nuevaFila[0] = AñadirID.getText();
        nuevaFila[1] = AñadirNombre.getText();
        nuevaFila[2] = AñadirApellidos.getText();
        nuevaFila[3] = AñadirDireccion.getText();
        nuevaFila[4] = AñadirBarrio.getText();
        nuevaFila[5] = AñadirCiudad.getText();
        nuevaFila[6] = AñadirNumero.getText();
        nuevaFila[7] = AñadirTipo.getSelectedItem().toString();
        nuevaFila[8] = AñadirEstamento.getSelectedItem().toString();
        nuevaFila[9] = AñadirDia.getText();
        nuevaFila[10] = AñadirMes.getText();
        nuevaFila[11] = AñadirAño.getText();
        
        // Agregar los valores al array
        info.add(nuevaFila);
        
            switch (AñadirEstamento.getSelectedItem().toString()) {
        case "Estudiante":
            modeloEstudiante.addRow(nuevaFila);
            break;
        case "Profesor":
            modeloProfesores.addRow(nuevaFila);
            break;
        case "Trabajador":
            modeloTrabajadores.addRow(nuevaFila);
            break;
        }



        // Limpiar los campos después de agregar la fila
        limpiarCampos();
    }//GEN-LAST:event_AñadirAgregarMouseClicked

    private void limpiarCampos() {
        AñadirID.setText("");
        AñadirNombre.setText("");
        AñadirApellidos.setText("");
        AñadirDireccion.setText("");
        AñadirBarrio.setText("");
        AñadirCiudad.setText("");
        AñadirNumero.setText("");
        AñadirTipo.setSelectedIndex(0);
        AñadirEstamento.setSelectedIndex(0);
        AñadirDia.setText("");
        AñadirMes.setText("");
        AñadirAño.setText("");
    }

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
            java.util.logging.Logger.getLogger(AddWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddWindow().setVisible(true);
            }
        });
    }
    
    
    
    
    // Método para verificar si una cadena contiene solo letras
    private boolean soloLetras(String cadena) {
        return cadena.matches("^[a-zA-Z]+$");
    }    
    
    
    // Método para verificar si una cadena contiene solo números
    private boolean soloNumeros(String cadena) {
        return cadena.matches("^[0-9]+$");
    }

    private boolean camposVacios() {
        return AñadirNombre.getText().isEmpty() || AñadirDireccion.getText().isEmpty() ||
                AñadirBarrio.getText().isEmpty() || AñadirCiudad.getText().isEmpty() ||
                AñadirNumero.getText().isEmpty();
    }  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atrás;
    private javax.swing.JButton AñadirAgregar;
    public static javax.swing.JTextField AñadirApellidos;
    public static javax.swing.JTextField AñadirAño;
    public static javax.swing.JTextField AñadirBarrio;
    public static javax.swing.JTextField AñadirCiudad;
    public static javax.swing.JTextField AñadirDia;
    public static javax.swing.JTextField AñadirDireccion;
    public static javax.swing.JComboBox<String> AñadirEstamento;
    public static javax.swing.JTextField AñadirID;
    public static javax.swing.JTextField AñadirMes;
    public static javax.swing.JTextField AñadirNombre;
    public static javax.swing.JTextField AñadirNumero;
    public static javax.swing.JComboBox<String> AñadirTipo;
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
    // End of variables declaration//GEN-END:variables
}
