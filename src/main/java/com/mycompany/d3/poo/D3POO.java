/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.d3.poo;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class D3POO {

    // Clase Padre
    static class Padre {
        private String nombre;
        private int edad;
        private Hijo hijo;

        public Padre(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

        // Getters y Setters
        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public Hijo getHijo() {
            return hijo;
        }

        public void setHijo(Hijo hijo) {
            this.hijo = hijo;
        }

        @Override
        public String toString() {
            return "Padre{" +
                    "nombre='" + nombre + '\'' +
                    ", edad=" + edad +
                    ", hijo=" + (hijo != null ? hijo.getNombre() : "No tiene hijo") +
                    '}';
        }
    }

    // Clase Hijo
    static class Hijo {
        private String nombre;
        private int edad;
        private Padre padre;

        public Hijo(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

        // Getters y Setters
        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public Padre getPadre() {
            return padre;
        }

        public void setPadre(Padre padre) {
            this.padre = padre;
        }

        @Override
        public String toString() {
            return "Hijo{" +
                    "nombre='" + nombre + '\'' +
                    ", edad=" + edad +
                    ", padre=" + (padre != null ? padre.getNombre() : "No tiene padre") +
                    '}';
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingresar datos del padre
        System.out.print("Ingrese el nombre del padre: ");
        String nombrePadre = scanner.nextLine();
        System.out.print("Ingrese la edad del padre: ");
        int edadPadre = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea pendiente

        Padre padre = new Padre(nombrePadre, edadPadre);

        // Ingresar datos del hijo
        System.out.print("Ingrese el nombre del hijo: ");
        String nombreHijo = scanner.nextLine();
        System.out.print("Ingrese la edad del hijo: ");
        int edadHijo = scanner.nextInt();

        Hijo hijo = new Hijo(nombreHijo, edadHijo);

        // Establecer relación entre Padre e Hijo
        padre.setHijo(hijo);
        hijo.setPadre(padre);

        // Imprimir detalles
        System.out.println("\nDetalles del padre y el hijo:");
        System.out.println(padre);
        System.out.println(hijo);

        // Acceder desde Padre a Hijo
        System.out.println("El hijo del padre " + padre.getNombre() + " es " + padre.getHijo().getNombre());

        // Acceder desde Hijo a Padre
        System.out.println("El padre del hijo " + hijo.getNombre() + " es " + hijo.getPadre().getNombre());
    }
}
