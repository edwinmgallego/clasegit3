/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clasegitflow;

/**
 *
 * @author felip
 */
import Modelo.samuelbd8;
import Modelo.samuelmurillo03;
import Modelo.isaquijano;
import Modelo.felipegarzon;

public class ClaseGitFlow {

    public static void main(String[] args) {


   
        samuelbd8 consultor = new samuelbd8 ("Samuel Beltran");
        
        System.out.println("El nombre es: " + consultor.getNombre());
        System.out.println("TuNombreAqui: ");
        isaquijano modelo = new isaquijano();
        String nombre = modelo.mostrarNombre();
        System.out.println(nombre);
         samuelmurillo03 nom = new samuelmurillo03();
        nom.mostrarNombre();
         System.out.println("TuNombreAqui: ");
        felipegarzon modeloFelipe = new felipegarzon();
        String nombreFelipe = modeloFelipe.mostrarNombre();
        System.out.println(nombreFelipe);
        System.out.println("Aporte Felipe Garzón PR");
    }
}

    


    
