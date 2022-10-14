package p01_argumentosvariables.test;

public class ArgumentosVariables {
    public static void main(String[] args) {
        // Vamos a llamar a la función imprimirNumeros con varios argumentos.
        imprimirNumeros(13, 17, 21);
        // Como estamos utilizando argumentos variables, podemos cambiar la cantidad.
        imprimirNumeros(67, 68, 89, 93);
        // Podemos mandar a llamar un método desde otro, siempre y cuando respetemos los parámetros.
        variosParametros("Miguel", 13, 39, 93, 117);
        // Ponemos en práctica el concepto de argumentos variables...
        parejas("Miguel", "Shomara", "Marlen", "Nelly");
    }
    
    private static void variosParametros(String nombre, int... arreglo) {
        System.out.println(nombre);
        imprimirNumeros(arreglo);
    }
    
    private static void imprimirNumeros(int... numeros) {
        System.out.println("Los números recibidos son: ");
        for (int i=0; i<numeros.length; i++) {
            System.out.println("Número " + (i+1) + ": " + numeros[i]);
        }
        System.out.println(" ");
    }
    
    private static void parejas(String nombre, String... novias) {
        System.out.println(nombre + " ha tenido " + novias.length + " novias: ");
        for(int i=0; i<novias.length; i++) {
            System.out.println("\t" + novias[i]);
        }
        
    }
}
