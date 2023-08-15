package co.ejercicioslizethpulido.taller3.ejercicio5.productos.libros;

import co.ejercicioslizethpulido.taller3.ejercicio5.Libro;

public class HarryPotterYLaPiedraFilosofal extends Libro {
    private final double precio = 40000;

    public HarryPotterYLaPiedraFilosofal() {
        super("9788498382662 ", "Harry Potter y la piedra filosofal", 1997);
    }

    @Override
    public double calcularPrecio(int unidades) {
        return unidades * precio;
    }

    @Override
    public void mostrarDetalles() {
        System.out.printf("El producto es un libro su nombre es %s su ISBN es %s su año de publicacion es %d y su precio unitario es %f",
                getNombre(),
                getIsbn(),
                getAnhoDePublicacion()
                , precio);
    }
}
