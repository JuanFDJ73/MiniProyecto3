
package Vista;

import Modelos.ContactsList;
import static Vista.StartWindow.Editar;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class Trabajadores extends javax.swing.JPanel {
    
    private ArrayList<Object[]> info;
    ContactsList contacto = new ContactsList();
    DefaultTableModel modelo=new DefaultTableModel(); 


        public void cargarDatosEstudiantes(){
    
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Dirección");
        modelo.addColumn("Barrio");
        modelo.addColumn("Ciudad");
        modelo.addColumn("Numero");
        modelo.addColumn("Tipo");
        modelo.addColumn("Estamento");
        modelo.addColumn("Dia");
        modelo.addColumn("Mes");
        modelo.addColumn("Año");
        tablaDatosTrabajadores.setModel(modelo);
        
        ArrayList<Object[]>info=new ArrayList<Object[]>();
        
        
        Object[]dato1=new Object[]{"0","Ifrit","Gonzales","Cra 3","El diamante","Cali","0000000000","Movil","Trabajador","10","7","2002"};
        Object[]dato2=new Object[]{"2","Odín","Perez","Cra 1","Caney","Medellin","2222222","Telefono","Trabajador","2","6","2003"};
        Object[]dato3=new Object[]{"3","Bahamut","Tiranido","Cra 2","Poblado","Cali","1111111111","Movil","Trabajador","8","12","2005"};

        info.add(dato1);
        info.add(dato2);
        info.add(dato3);
        
        for (Object []informacion : info){
            modelo.addRow(informacion);
        }
        
        tablaDatosTrabajadores.setModel(modelo);
    }

    public void habilitarEdicion(boolean habilitar) {
        tablaDatosTrabajadores.setEnabled(habilitar);
        tablaDatosTrabajadores.setCellSelectionEnabled(habilitar);
        tablaDatosTrabajadores.setRowSelectionAllowed(habilitar);
        tablaDatosTrabajadores.setColumnSelectionAllowed(habilitar);
        tablaDatosTrabajadores.setFocusable(habilitar);
    }

    public Trabajadores() {
        initComponents();
        cargarDatosEstudiantes();
        info = new ArrayList<>();
        
        
        // Deshabilitar la interactividad en el JScrollPane
        tablaTrabajadores.setEnabled(false);

        // Deshabilitar la interactividad en la tabla
        tablaDatosTrabajadores.setEnabled(false);
        tablaDatosTrabajadores.setCellSelectionEnabled(false);
        tablaDatosTrabajadores.setRowSelectionAllowed(false);
        tablaDatosTrabajadores.setColumnSelectionAllowed(false);
        tablaDatosTrabajadores.setFocusable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tablaTrabajadores = new javax.swing.JScrollPane();
        tablaDatosTrabajadores = new javax.swing.JTable();

        setBackground(new java.awt.Color(204, 255, 255));

        tablaDatosTrabajadores.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaDatosTrabajadores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaDatosTrabajadoresMouseClicked(evt);
            }
        });
        tablaTrabajadores.setViewportView(tablaDatosTrabajadores);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tablaTrabajadores, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tablaTrabajadores, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tablaDatosTrabajadoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaDatosTrabajadoresMouseClicked
        if (Editar.isSelected()) {
            
            int seleccionar = tablaDatosTrabajadores.rowAtPoint(evt.getPoint());

            contacto.setID(Integer.parseInt(String.valueOf(tablaDatosTrabajadores.getValueAt(seleccionar, 0))));
            contacto.setNombre(String.valueOf(tablaDatosTrabajadores.getValueAt(seleccionar, 1)));
            contacto.setApellidos(String.valueOf(tablaDatosTrabajadores.getValueAt(seleccionar, 2)));
            contacto.setDireccion(String.valueOf(tablaDatosTrabajadores.getValueAt(seleccionar, 3)));
            contacto.setBarrio(String.valueOf(tablaDatosTrabajadores.getValueAt(seleccionar, 4)));
            contacto.setCiudad(String.valueOf(tablaDatosTrabajadores.getValueAt(seleccionar, 5)));
            contacto.setNumero(Integer.parseInt(String.valueOf(tablaDatosTrabajadores.getValueAt(seleccionar, 6))));
            contacto.setTipo(String.valueOf(tablaDatosTrabajadores.getValueAt(seleccionar, 7)));
            contacto.setEstamento(String.valueOf(tablaDatosTrabajadores.getValueAt(seleccionar, 8)));
            contacto.setDia(Integer.parseInt(String.valueOf(tablaDatosTrabajadores.getValueAt(seleccionar, 9))));
            contacto.setMes(Integer.parseInt(String.valueOf(tablaDatosTrabajadores.getValueAt(seleccionar, 10))));
            contacto.setAño(Integer.parseInt(String.valueOf(tablaDatosTrabajadores.getValueAt(seleccionar, 11))));

            int IDContacto = contacto.getId();
            String nombreContacto = contacto.getNombre();
            String apellidosContacto = contacto.getApellidos();
            String direccionContacto = contacto.getDireccion();
            String barrioContacto = contacto.getBarrio();
            String ciudadContacto = contacto.getCiudad();
            int numeroContacto = contacto.getNumero();
            String tipoContacto = contacto.getTipo();
            String EstamentoContacto = contacto.getEstamento();
            int DiaContacto = contacto.getDia();
            int MesContacto = contacto.getMes();
            int AñoContacto = contacto.getAño();

            System.out.println("ID: " + IDContacto);
            System.out.println("Nombre: " + nombreContacto);
            System.out.println("Apellidos: " + apellidosContacto);
            System.out.println("Direccion: " + direccionContacto);
            System.out.println("Barrio: " + barrioContacto);
            System.out.println("Ciudad: " + ciudadContacto);
            System.out.println("Numero: " + numeroContacto);
            System.out.println("Tipo: " + tipoContacto);
            System.out.println("Estamento: " + EstamentoContacto);
            System.out.println("Dia: " + DiaContacto);
            System.out.println("Mes: " + MesContacto);
            System.out.println("Año: " + AñoContacto);

            EditWindow editWindow = new EditWindow(contacto.getId(),contacto.getNombre(), contacto.getApellidos(),contacto.getDireccion(), contacto.getBarrio(),contacto.getCiudad(),contacto.getNumero(),contacto.getTipo(),contacto.getEstamento(),contacto.getDia(), contacto.getMes(), contacto.getAño());
            editWindow.setVisible(true);
            
            

        } else {
            System.out.println("Botón Editar deseleccionado");

        }
    }//GEN-LAST:event_tablaDatosTrabajadoresMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTable tablaDatosTrabajadores;
    public static javax.swing.JScrollPane tablaTrabajadores;
    // End of variables declaration//GEN-END:variables
}
