/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class ContactsList {
         private List<String> contactos;

    public ContactsList() {
        contactos = new ArrayList<>();
    }

    public void agregarContacto(String tarea) {
        contactos.add(tarea);
    }

    public void eliminarContactos(int indice) {
        if (indice >= 0 && indice < contactos.size()) {
            contactos.remove(indice);
        }
    }

    public List<String> getContactos() {
        return contactos;
    }
    
}

