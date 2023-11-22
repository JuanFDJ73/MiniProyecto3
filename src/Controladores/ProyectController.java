/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Modelos.*;
import Vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Usuario
 */
public class ProyectController {
    private Contact model;
    private ContactsList modelList;
    private AddWindow addView;
    private EditWindow editView;
    private Profesores profesores;
    private Estudiantes estudiantes;
    private Trabajadores trabajadores;
    private Todos todos;
    
    ContactsList contactos = new ContactsList();
    

    public ProyectController(Contact model, AddWindow addView) {
        this.model = model;
        this.addView = addView;
        
        
        

        addView.addAgregarListener(new AgregarListener());

        actualizarVista();
    }
    
    public void contactFilter(){
        
    }

    class AgregarListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String nombre = addView.getNombreInput();
            String apellidos = addView.getNombreInput();
            String iD = addView.getNombreInput();
            String direccion = addView.getNombreInput();
            String barrio = addView.getNombreInput();
            String ciudad = addView.getNombreInput();
            String numero = addView.getNombreInput();
            String tipo = addView.getNombreInput();
            String estamento = addView.getNombreInput();
            String dia = addView.getNombreInput();
            String mes = addView.getNombreInput();
            String año = addView.getNombreInput();
            Contact contacto = new Contact();
            
            contactos.agregarContacto(contacto);
            
        }
    }
    
    
    
    private void actualizarVista() {
        view.setTareas(model.getTareas());
    }
}
