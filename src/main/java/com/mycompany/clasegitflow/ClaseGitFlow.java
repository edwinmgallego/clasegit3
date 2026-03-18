/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.clasegitflow;

/**
 *
 * @author emgallego
 */
import Modelo.isaquijano;
import Modelo.yeicaicedo;

public class ClaseGitFlow {

    public static void main(String[] args) { 
        System.out.println("TuNombreAqui: ");
        isaquijano modelo = new isaquijano();
        String nombre = modelo.mostrarNombre();
        System.out.println(nombre);
        System.out.println("Hello World!");
        yeicaicedo modelo1 = new yeicaicedo();
        String nom = modelo1.mostrarNombre1();
        System.out.println(nom);
    }
}
