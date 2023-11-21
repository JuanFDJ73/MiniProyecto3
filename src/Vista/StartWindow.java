
package Vista;



public class StartWindow extends javax.swing.JFrame {


    private Profesores p1;

    
   
    public StartWindow() {
        initComponents();

        
        p1 = new Profesores();
        p1.setSize(660,314);
        p1.setLocation(10,50);
        
        Tabla.removeAll();
        Tabla.add(p1);
        Tabla.revalidate();
        Tabla.repaint();
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Añadir = new javax.swing.JButton();
        Ajustes = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Profesores = new javax.swing.JButton();
        Alumnos = new javax.swing.JButton();
        Trabajadores = new javax.swing.JButton();
        Todos = new javax.swing.JButton();
        Tabla = new javax.swing.JPanel();
        Editar = new javax.swing.JToggleButton();
        Eliminar = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Añadir.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        Añadir.setText("Añadir");
        Añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AñadirActionPerformed(evt);
            }
        });

        Ajustes.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        Ajustes.setText("Ajustes");
        Ajustes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AjustesActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel1.setText("Tu Agenda");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Profesores.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Profesores.setText("Profesores");
        Profesores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProfesoresActionPerformed(evt);
            }
        });

        Alumnos.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Alumnos.setText("Alumnos");
        Alumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlumnosActionPerformed(evt);
            }
        });

        Trabajadores.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Trabajadores.setText("Trabajadores");
        Trabajadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrabajadoresActionPerformed(evt);
            }
        });

        Todos.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Todos.setText("Todos");
        Todos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TodosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TablaLayout = new javax.swing.GroupLayout(Tabla);
        Tabla.setLayout(TablaLayout);
        TablaLayout.setHorizontalGroup(
            TablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 647, Short.MAX_VALUE)
        );
        TablaLayout.setVerticalGroup(
            TablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );

        Editar.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        Editar.setText("Editar");
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });

        Eliminar.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
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
                        .addComponent(Profesores, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Alumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Trabajadores, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Todos, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Tabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(Añadir)
                            .addGap(45, 45, 45)
                            .addComponent(Ajustes)
                            .addGap(28, 28, 28)
                            .addComponent(Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(15, 15, 15))
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Todos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Alumnos, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                        .addComponent(Trabajadores, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE))
                    .addComponent(Profesores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Tabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Añadir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ajustes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AñadirActionPerformed
        
        AddWindow añadir = new AddWindow();
        
        añadir.setVisible(true);
        
        this.dispose();
        
    }//GEN-LAST:event_AñadirActionPerformed

    private void AjustesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AjustesActionPerformed
        
        ConfigWindow ajustes = new ConfigWindow();
        
        ajustes.setVisible(true);
        
        this.dispose();
        
    }//GEN-LAST:event_AjustesActionPerformed

    private void ProfesoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProfesoresActionPerformed



        
        
        p1.setSize(660,314);
        p1.setLocation(10,50);
        
        
        Tabla.removeAll();
        Tabla.add(p1);
        Tabla.revalidate();
        Tabla.repaint();
    }//GEN-LAST:event_ProfesoresActionPerformed

    private void AlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlumnosActionPerformed
        
        Estudiantes p2 = new Estudiantes();
        p2.setSize(660,314);
        p2.setLocation(10,50);
        
        Tabla.removeAll();
        Tabla.add(p2);
        Tabla.revalidate();
        Tabla.repaint();

    }//GEN-LAST:event_AlumnosActionPerformed

    private void TrabajadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TrabajadoresActionPerformed
        Trabajadores p3 = new Trabajadores();
        p3.setSize(660,314);
        p3.setLocation(10,50);
        
        Tabla.setEnabled(false);
        
        Tabla.removeAll();
        Tabla.add(p3);
        Tabla.revalidate();
        Tabla.repaint();

    }//GEN-LAST:event_TrabajadoresActionPerformed

    private void TodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TodosActionPerformed
        
        Todos p4 = new Todos();
        p4.setSize(660,314);
        p4.setLocation(10,50);
        
        Tabla.removeAll();
        Tabla.add(p4);
        Tabla.revalidate();
        Tabla.repaint();

    }//GEN-LAST:event_TodosActionPerformed

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
        
        if (Editar.isSelected()) {
            System.out.println("Botón Editar seleccionado");
            
            p1.habilitarEdicion(true);            
            
        } else {
            System.out.println("Botón Editar deseleccionado");
            
            p1.habilitarEdicion(false);
            
        }
        
    }//GEN-LAST:event_EditarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        
        DeleteWindow wea = new DeleteWindow();
        
        wea.setVisible(true);
        
        this.dispose();
        
    }//GEN-LAST:event_EliminarActionPerformed

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
            java.util.logging.Logger.getLogger(StartWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Ajustes;
    public javax.swing.JButton Alumnos;
    public javax.swing.JButton Añadir;
    public static javax.swing.JToggleButton Editar;
    public static javax.swing.JToggleButton Eliminar;
    public javax.swing.JButton Profesores;
    public javax.swing.JPanel Tabla;
    public javax.swing.JButton Todos;
    public javax.swing.JButton Trabajadores;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
