import java.util.ArrayList;
import java.util.List;

class Articulo {
    private String nombre;
    private int cantidad;

    public Articulo(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public String getNombre(){
        return nombre;
    }

    @Override
    public String toString() {
        return nombre + " (Cantidad: " + cantidad + ")";
    }
}

class listaCompras {
    private List<Articulo> listaCompras = new ArrayList<>();

    public void agregarArticulo(String nombre, int cantidad) {
        Articulo nuevoArticulo = new Articulo(nombre, cantidad);
        listaCompras.add(nuevoArticulo);
        System.out.println("Articulo agregado: " + nuevoArticulo);
    }

    public Articulo buscarArticulo(String nombre){
        for(Articulo articulo : listaCompras){
            if (articulo.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Articulo encontrado "+ articulo);
                return articulo;
            }
        }
        System.out.println("Articulo no encontrado");
        return null;
    }

    public void mostrarLista() {
        System.out.println("Lista de Compras:");
        for (Articulo articulo : listaCompras) {
            System.out.println("- " + articulo);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        listaCompras lista = new listaCompras();
        lista.agregarArticulo("Manzanas", 4);
        lista.agregarArticulo("Pan", 1);
        lista.mostrarLista();
    }
}
