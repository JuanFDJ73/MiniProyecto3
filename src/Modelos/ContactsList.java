/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.util.ArrayList;
import java.util.List;
import Modelos.Contact;


public class ContactsList {
    private List<Contact> contactos;

    public ContactsList() {
        contactos = new ArrayList<>();
    }

    public void agregarContacto(Contact contacto) {
        contactos.add(contacto);
    }
    
    
    
}

