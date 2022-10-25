package p05_autoboxing.test;

public class AutoboxingUnboxing {
    public static void main(String[] args) {
        // El autoboxing es convertir una literal primitiva a un tipo Object, al usar una clase envolvente en vez de "var".
        Integer enteroObject = 10;
        Long longObject = 1700L; // Agregamos una L al final para que esa literal sea de tipo primitivo long.
        Long compare = 500L;
        Float floatObject = 3.1416F; // Agregamos una F al final para que esa literal sea de tipo primitivo float.
        Float compare2 = 3.1416F;
        Double doubleObject = 1.937519;
        /* Ahora usamos algunos de los métodos que contienen estas variables tipo Object. */
        // Variable entera
        System.out.println("Variable entera tipo Object: " + enteroObject);
        System.out.println("Conversión directa a float o double: " + enteroObject.floatValue() + ", " + enteroObject.doubleValue());
        System.out.println("Conversión a String: " + enteroObject.toString());
        System.out.println("Uso de los caracteres del entero convertido a String: " + enteroObject.toString().charAt(0) + " y " + enteroObject.toString().charAt(1));
        // Variable long
        System.out.println("Variable long tipo Object: " + longObject);
        System.out.println("Comparación con otro valor long: " + longObject.compareTo(5074L) + ", " + longObject.compareTo(1700L) + ", " + longObject.compareTo(100L));
        System.out.println("Comparación con otro objeto long: " + longObject.equals(compare));
        // Variable float
        System.out.println("Variable float tipo Object: " + floatObject);
        System.out.println("Conversión a entero y long: " + floatObject.intValue() + ", " + floatObject.longValue());
        System.out.println("Comparación con otro valor float: " + floatObject.compareTo(13.83F));
        System.out.println("Comparación con otro objecto float: " + floatObject.equals(compare2));
        // Variable double
        System.out.println("Variable double tipo Object: " + doubleObject);
        System.out.println("Valor numérico de tipo double extraido del objecto: " + doubleObject.doubleValue());
        System.out.println("Conversión a tipo String para uso de caracteres: " + doubleObject.toString().charAt(3));
        /* Realizamos el unboxing de cada variable tipo object que creamos */
        var entero = enteroObject;
        var enteroLargo = longObject;
        var flotante = floatObject;
        var doble = doubleObject;
        /* Los tipos primitivos y sus correspondientes clases envolventes son: 
            int --> Integer
            long --> Long
            float --> Float
            double --> Double
            boolean --> Boolean
            byte --> Byte
            char --> Character
            short --> Short */
    }
}
