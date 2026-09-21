//un camion es un vehiculo que transporta carga
public class Camion extends Vehiculo {
    //Atributos
    private double capacidadCarga;
    //Inicializa el camion, delega en Vehiculo los datos comunes y guarda la carga propia
    public Camion(String patente, double nivelCombustible, double capacidadCarga) {
        super(patente, nivelCombustible);
        this.capacidadCarga = capacidadCarga;
    }
    //METODOS
    //redefine acelerar: a mas carga transportada, mayor el consumo de combustible
    @Override
    public void acelerar() {
        double consumo = 1.0 + (capacidadCarga * 0.001);
        //accede directo a nivelCombustible porque es protected en Vehiculo
        nivelCombustible -= consumo;
        System.out.println(getPatente() + " (Camion) consumo=" + consumo
                + " combustible=" + nivelCombustible);
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }
}