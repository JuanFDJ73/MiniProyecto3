/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author Usuario
 */
public class Contact {
    public String iD;
    public String nombre;
    public String apellidos;
    public String direccion;
    public String barrio;
    public String ciudad;
    public String numero;
    public String tipo;
    public String estamento;
    public String dia;
    public String mes;
    public String año;
    
    
    public Contact (){
        this.nombre = nombre;
        this.iD = iD;
        this.apellidos=apellidos;
        this.barrio=barrio;
        this.direccion=direccion;
        this.ciudad=ciudad;
        this.numero=numero;
        this.tipo=tipo;
        this.estamento=estamento;
        this.dia=dia;
        this.mes=mes;
        this.año=año;
        
    }
    
    public String getID(){
        return iD;
    }
    
    public void setID(String id) {
        this.iD = id;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    public String getApellidos() {
        return apellidos;
    }
    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    
    public String getDireccion() {
        return direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public String getBarrio() {
        return barrio;
    }
    
    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }
    
    
    public String getCiudad() {
        return ciudad;
    }
    
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    
    public String getNumero() {
        return numero;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    public String getEstamento() {
        return estamento;
    }
    
    public void setEstamento(String estamento) {
        this.estamento = estamento;
    }
    
    
    public String getDia() {
        return dia;
    }
    
    public void setDia(String dia) {
        this.dia = dia;
    }
    
    
    public String getMes() {
        return mes;
    }
    
    public void setMes(String mes) {
        this.mes = mes;
    }
    
    public String getAño() {
        return año;
    }
    
    public void setAño(String año) {
        this.año = año;
    }
}