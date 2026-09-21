public class Main {
    public static void main(String[] args) {
        //crea un camion y un omnibus, guardados como tipo Vehiculo
        Vehiculo camion = new Camion("AD456FG", 90, 5000);
        Vehiculo omnibus = new Omnibus("AF789JK", 100, 35);

        //aunque las variables son Vehiculo, cada uno ejecuta su propia version de acelerar()
        camion.acelerar();
        omnibus.acelerar();

        //consulta el contador general de vehiculos creados hasta el momento
        System.out.println("Vehiculos creados hasta el momento: " + Vehiculo.getCantidadVehiculos());

        //crea otro camion para comprobar que el contador sigue sumando
        Camion otroCamion = new Camion("AC321XY", 70, 4000);
        otroCamion.acelerar();

        //el contador es unico para toda la jerarquia, ya van 3 vehiculos en total
        System.out.println("Vehiculos creados hasta el momento: " + Vehiculo.getCantidadVehiculos());
    }
}