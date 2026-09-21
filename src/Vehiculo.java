//representacion de un vehiculo de la empresa de transporte
public class Vehiculo {
    //Atributos
    private static int cantidadVehiculos = 0;   //cuenta cuantos vehiculos hay en total, es de la clase no de cada objeto
    private String patente;
    protected double nivelCombustible;   //protected para que las subclases lo puedan tocar directo
    //Inicializa el vehiculo con su patente y combustible, y suma uno al contador general
    public Vehiculo(String patente, double nivelCombustible) {
        this.patente = patente;
        this.nivelCombustible = nivelCombustible;
        cantidadVehiculos++;
    }
    //METODOS
    //aceleracion generica, resta un poco de combustible. las subclases la redefinen con @Override
    public void acelerar() {
        nivelCombustible -= 1.0;
        System.out.println(patente + " acelera. Combustible: " + nivelCombustible);
    }
    //da la cantidad total de vehiculos creados hasta el momento, no hace falta tener una instancia
    public static int getCantidadVehiculos() {
        return cantidadVehiculos;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public double getNivelCombustible() {
        return nivelCombustible;
    }

    public void setNivelCombustible(double nivelCombustible) {
        this.nivelCombustible = nivelCombustible;
    }
}