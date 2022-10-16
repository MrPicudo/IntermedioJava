package p02_enumeraciones.test;

// Para usar la clase (o enumeración) que se encuentra en otro paquete, tenemos que importarla.
import p02_enumeraciones.Dias;

public class TestDias {
    public static void main(String[] args) {
        // Para acceder a la enumeración que es como una clase que contiene valores tipo cadena constantes, usamos Dias.constante
        System.out.println("Día 1: " + Dias.LUNES); // Es decir, NombreEnum.constanteEnum
        System.out.println("Día 2: " + Dias.MARTES);
        System.out.println("Día 3 " + Dias.MIERCOLES);
        System.out.println("Día 4: " + Dias.JUEVES);
        System.out.println("Día 5: " + Dias.VIERNES);
        System.out.println("Día 6: " + Dias.SABADO);
        System.out.println("Día 7: " + Dias.DOMINGO);
        // Mandamos a llamar al método privado que creamos en esta clase (que solo podemos utilizar aquí), con el argumento correcto.
        indicarDiaSemana(Dias.MARTES);
    }
    
    private static void indicarDiaSemana(Dias arg) {
        // El switch puede hacerse de la manera normal con break, o con flecha, sin agregar el break.
        switch(arg) {
            case LUNES -> System.out.println("Ingresó el día lunes.");
            case MARTES -> System.out.println("Ingresó el día martes.");
            case MIERCOLES -> System.out.println("Ingresó el día miércoles");
            case JUEVES -> System.out.println("Ingresó el día jueves");
            case VIERNES -> System.out.println("Ingresó el día viernes");
            case SABADO -> System.out.println("Ingresó el día sábado");
            case DOMINGO -> System.out.println("Ingresó el día domingo");
        }
    }
}
