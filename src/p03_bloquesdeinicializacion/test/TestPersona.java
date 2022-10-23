package p03_bloquesdeinicializacion.test;

import p03_bloquesdeinicializacion.Persona;

public class TestPersona {
    public static void main(String[] args) {
        // Creamos un objeto de la clase Persona, cargando así la clase Persona en memoria.
        Persona persona1 = new Persona();
        System.out.println("persona1 = " + persona1 + "\n");
        // Volvemos a crear un objeto, pero ya se ha cargado la clase, entonces el bloque estático ya no se ejecuta.
        Persona persona2 = new Persona();
        System.out.println("persona2 = " + persona1);
    }
}
