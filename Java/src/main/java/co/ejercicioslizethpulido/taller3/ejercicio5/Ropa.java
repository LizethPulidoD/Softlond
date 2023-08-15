package co.ejercicioslizethpulido.taller3.ejercicio5;

public abstract class Ropa implements Producto {
    public Ropa(String nombre, String marca, String talla) {
        this.nombre = nombre;
        this.marca = marca;
        this.talla = talla;
    }

    private final String nombre;
    private final String marca;
    private final String talla;

    public String getNombre() {
        return nombre;
    }

    public String getMarca() {
        return marca;
    }

    public String getTalla() {
        return talla;
    }
}
