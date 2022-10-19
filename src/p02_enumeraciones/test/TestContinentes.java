package p02_enumeraciones.test;

import p02_enumeraciones.Continentes;

public class TestContinentes {
    public static void main(String[] args) {
        System.out.println(Continentes.AFRICA + " tiene " + Continentes.AFRICA.getPaises() + " países.");
        System.out.println(Continentes.EUROPA + " tiene " + Continentes.EUROPA.getPaises() + " países.");
        System.out.println(Continentes.ASIA + " tiene " + Continentes.ASIA.getPaises() + " países.");
        System.out.println(Continentes.AMERICA + " tiene " + Continentes.AMERICA.getPaises() + " países.");
        System.out.println(Continentes.OCEANIA + " tiene " + Continentes.OCEANIA.getPaises() + " países.");
    }
}
