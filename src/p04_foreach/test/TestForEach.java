package p04_foreach.test;

import p04_foreach.dom.Persona;

public class TestForEach {
    public static void main(String[] args) {
        // Uso de forEach con un arreglo de tipo int.
        int edades[] = {13, 17, 89, 93}; // Sintaxis resumida para la creación de un arreglo de tipo numérico.
        for(int edad: edades) {
            System.out.println("Edad = " + edad);
        }
        
        // Uso de forEach con un arreglo de tipo double.
        double sueldos[] = {8500.0, 13850.0, 29000.0, 87450.0};
        for(double sueldo: sueldos) {
            System.out.println("Sueldo: " + sueldo);
        }
        
        // Uso de forEach con un arreglo de tipo String
        String nombres[] = {"Miguel", "Nelly", "Mariana", "Alejandro"};
        for(String nombre: nombres) {
            System.out.println("Nombre: " + nombre);
        }
        
        // Uso de forEach con un arreglo de tipo Object
        Persona personas[] = {new Persona("Miguel Torres", 28), new Persona("Alejandro Torres", 33)}; // Sintaxis resumida.
        for(Persona persona: personas) {
            System.out.println("Arreglo tipo Object: " + persona);
        }
    }
}
