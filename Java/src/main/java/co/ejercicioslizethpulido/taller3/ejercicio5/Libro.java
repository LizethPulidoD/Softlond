package co.ejercicioslizethpulido.taller3.ejercicio5;

public abstract class Libro  implements Producto{
    private final String isbn;
    private final String nombre;
    private final int anhoDePublicacion;

    public Libro(String isbn, String nombre, int anhoDePublicacion) {
        this.isbn = isbn;
        this.nombre = nombre;
        this.anhoDePublicacion = anhoDePublicacion;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAnhoDePublicacion() {
        return anhoDePublicacion;
    }
}
