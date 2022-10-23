package p03_bloquesdeinicializacion;

public class Persona {
    private final int idPersona; // Un atributo de tipo final es una constante, generalmente las declaramos como estáticas.
    private static int contadorPersonas; // Se pueden acceder a las variables estáticas sin necesidad de crear objetos de la clase.
    
   // Normalmente el constructor tiene el código para hacer el conteo de los objetos creados, pero ahora lo pusimos en los bloques de inicialización.
    public Persona() {
        System.out.println("Ejecución del constructor");
    }
    
    // Este bloque de inicialización NO estático, se va a ejecutar cada vez que se cree un objeto de la clase persona.
    {
        System.out.println("Ejecución de bloque no estático");
        this.idPersona = Persona.contadorPersonas++; // Esta variable ya no se va a poder modificar de nuevo, porque es de tipo final.
        // El atributo idPersona es una constante para cada objeto que es creado, pero cambia para cada objeto porque es un identificador.
    }
    
     // Este bloque se ejecuta solamente una vez, cuando se carga la clase.
    static {
        System.out.println("Ejecución de bloque estático");
        ++Persona.contadorPersonas;
    }
    
    // Método get del atributo idPersona.
    public int getIdPersona() {
        return this.idPersona;
    }

    // Método toString para poder imprimir la información del objeto con sout.
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona[");
        sb.append("idPersona = ").append(idPersona);
        sb.append(']');
        return sb.toString();
    }
    
    
    
}
