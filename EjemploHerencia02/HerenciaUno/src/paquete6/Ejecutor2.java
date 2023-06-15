/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejecutor2 {

    public static void main(String[] args) {
        // Ingresar estudiante de tipo presencial por teclado.
        // El usuario decide cuando terminar
        // No utilizar super.toString en EstudiantePresencial
        // Debe existir 1 sola impresión de todos los estudiantes presenciales
        // No usar arreglos

        // Trabajo clases 15 junio 2023
        Scanner entrada = new Scanner(System.in);
        boolean bandera = true;
        String cadena = "";

        while (bandera) {

            System.out.println("Ingrese el nombre: ");
            String nombre = entrada.nextLine();
            System.out.println("Ingrese el apellido: ");
            String apellido = entrada.nextLine();
            System.out.println("Ingrese el numero de cedula: ");
            String cedula = entrada.nextLine();
            System.out.println("Ingrese su edad: ");
            int edad = entrada.nextInt();
            System.out.println("Ingrese el numero de Creditos ");
            int creditos = entrada.nextInt();
            System.out.println("Ingrese el costo del credtio: ");
            double costo = entrada.nextDouble();

            EstudiantePresencial estPresencial = new EstudiantePresencial(nombre, apellido, 
                    cedula, edad, costo, creditos);
            estPresencial.calcularMatriculaPresencial();
            entrada.nextLine();

            cadena = String.format("%s%s\n", cadena, estPresencial);
            System.out.println("Desea salir, pulse (S/s)");
            String opcion = entrada.nextLine();
            if (opcion.equals("s") || opcion.equals("S")) {
                bandera = false;
            }
        }
        
        System.out.printf("%s\n", cadena);

    }
}
