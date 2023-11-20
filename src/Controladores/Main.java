/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import javax.swing.JFrame;
import Vista.StartWindow;  


public class Main {

    public static void main(String[] args) {
        // Crear una instancia del JFrame StartWindow
        StartWindow startWindow = new StartWindow();

        // Configurar la operación al cerrar la ventana
        startWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Hacer visible la ventana
        startWindow.setVisible(true);
    }
}
