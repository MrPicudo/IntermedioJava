package p04_foreach.dom;

public class Persona {
    // Atributos
    private String nombre;
    private int edad;
    
    // Constructor vacio
    public Persona() {}
    
    // Constructor que inicializa los atributos
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    // Métodos get y set de los atributos.
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getEdad() {
        return this.edad;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    // Método toString
    @Override
    public String toString() {
        StringBuilder eco = new StringBuilder();
        eco.append("Persona[");
        eco.append("nombre = ").append(nombre);
        eco.append(", edad = ").append(edad);
        eco.append("]");        
        return eco.toString();
    }
}
