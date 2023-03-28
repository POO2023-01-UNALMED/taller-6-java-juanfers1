package vehiculos;

import java.util.ArrayList;

public class Pais {
    private String nombre;
    private int numeroVendidos;

    public Pais(String nombre) {
        this.nombre = nombre;
        numeroVendidos++;
    }
    public static Pais paisMasVendedor() {
        ArrayList<Fabricante> fabricantes = Vehiculo.getFabricantes();
        int mayorVendedor = 0;
        Pais paisMayor = null;
        for ( int i = 0; i < fabricantes.size(); i++) {
            if (fabricantes.get(i).getPais().getNumeroVendidos() > mayorVendedor) {
                mayorVendedor = fabricantes.get(i).getPais().getNumeroVendidos();
                paisMayor = fabricantes.get(i).getPais();
            }
        }
        return paisMayor;
    }

    public int getNumeroVendidos() {
        return numeroVendidos;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}