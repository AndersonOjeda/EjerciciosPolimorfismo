package Vehiculos;

public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche("ABC123", 4);
        System.out.println(coche.toString());
        coche.acelerar(50);
        System.out.println(coche.toString());

        Camion camion = new Camion("XYZ789");
        System.out.println(camion.toString());
        camion.acelerar(60);
        System.out.println(camion.toString());

        Remolque remolque = new Remolque(2000);
        camion.ponRemolque(remolque);
        System.out.println(camion.toString());
        camion.acelerar(50);
    }
}
