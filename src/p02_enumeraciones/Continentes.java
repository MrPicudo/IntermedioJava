package p02_enumeraciones;

public enum Continentes {
    // Los siguientes elementos (constantes) de la enumeración, tienen un atributo o argumento.
    AFRICA(53),
    EUROPA(46),
    ASIA(44),
    AMERICA(34),
    OCEANIA(14); // Si vamos a continuar con más código en la enumeración, debemos acabar las contanstes con punto y coma.
    
    // Creamos un atributo para recibir el número de paises de cada continente
    private final int paises;
    
    // Agregamos un constructor para poder crear las constantes de arriba
    Continentes(int paises) {
        this.paises = paises;
    }
    
    // Método get para el atributo de paises, con este accedemos al número que definimos dentro de cada continente.
    public int getPaises() {
        return this.paises;
    }
}
