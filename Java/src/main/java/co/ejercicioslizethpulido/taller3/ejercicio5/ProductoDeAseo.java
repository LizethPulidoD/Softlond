package co.ejercicioslizethpulido.taller3.ejercicio5;

public abstract class ProductoDeAseo implements Producto{
    public ProductoDeAseo(String nombre) {
        this.nombre = nombre;
    }

    private final String nombre;

    public String getNombre() {
        return nombre;
    }
}
