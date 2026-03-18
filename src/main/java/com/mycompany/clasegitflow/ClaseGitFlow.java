/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clasegitflow;

/**
 *
 * @author emgallego
 */
import Modelo.isaquijano;
import Modelo.cristiannn;

public class ClaseGitFlow {

    public static void main(String[] args) {
        System.out.println("TuNombreAqui: ");
        isaquijano modelo = new isaquijano();
        String nombre = modelo.mostrarNombre();
        System.out.println(nombre);
        cristiannn modelopr =new cristiannn();
        System.out.println(modelopr.nombre());
        
    }
}
