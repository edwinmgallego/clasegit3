/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.clasegitflow;
import Modelo.samuelbd8;

/**
 *
 * @author emgallego
 */
import Modelo.isaquijano;

public class ClaseGitFlow {

    public static void main(String[] args) {

     
     
        samuelbd8 consultor = new samuelbd8 ("Samuel Beltran");
        
        System.out.println("El nombre es: " + consultor.getNombre());

        System.out.println("TuNombreAqui: ");
        isaquijano modelo = new isaquijano();
        String nombre = modelo.mostrarNombre();
        System.out.println(nombre);

    }
}
    

