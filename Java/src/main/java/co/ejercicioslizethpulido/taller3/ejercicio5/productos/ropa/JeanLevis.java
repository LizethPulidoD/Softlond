package co.ejercicioslizethpulido.taller3.ejercicio5.productos.ropa;

import co.ejercicioslizethpulido.taller3.ejercicio5.Ropa;

public class JeanLevis extends Ropa {
    private final double precio = 300000;

    public JeanLevis() {
        super("Jean sencillo", "Levis", "M");
    }

    @Override
    public double calcularPrecio(int unidades) {
        return precio * unidades;
    }

    @Override
    public void mostrarDetalles() {
        System.out.printf("El producto es %s, su marca es %s, su talla es %s y su precio unitario es %f",
                getNombre(),
                getMarca(),
                getTalla()
                , precio);

    }
}
