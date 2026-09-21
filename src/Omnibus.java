//un omnibus es un vehiculo que transporta pasajeros
public class Omnibus extends Vehiculo {
    //Atributos
    private int cantidadPasajeros;
    //Inicializa el omnibus, delega en Vehiculo los datos comunes y guarda los pasajeros
    public Omnibus(String patente, double nivelCombustible, int cantidadPasajeros) {
        super(patente, nivelCombustible);
        this.cantidadPasajeros = cantidadPasajeros;
    }
    //METODOS
    //redefine acelerar: a mas pasajeros, mas esfuerzo del motor y mas consumo
    @Override
    public void acelerar() {
        double consumo = 1.0 + (cantidadPasajeros * 0.02);
        nivelCombustible -= consumo;
        System.out.println(getPatente() + " (Omnibus) consumo=" + consumo
                + " combustible=" + nivelCombustible);
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }
}