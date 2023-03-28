package vehiculos;

public class Automovil extends Vehiculo{
    private int puestos;
    private static int cantidadAutomoviles;

    
    public Automovil( String placa, String nombre, double precio, double peso, Fabricante fabricante, int puestos) {
        super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
        this.puestos = puestos;
        cantidadAutomoviles++;
    }
    public static int getCantidadAutomoviles() {
        return cantidadAutomoviles;
    }

    public int getPuestos() {
        return puestos;
    }

    public void setPuestos(int puestos) {
        this.puestos = puestos;
    }
}