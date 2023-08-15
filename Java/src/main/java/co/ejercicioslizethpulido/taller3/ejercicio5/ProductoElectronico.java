package co.ejercicioslizethpulido.taller3.ejercicio5;

public abstract class ProductoElectronico implements Producto {
    private final String nombre;
    private final String marca;

    public ProductoElectronico(String nombre, String marca) {
        this.nombre = nombre;
        this.marca = marca;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMarca() {
        return marca;
    }
}
