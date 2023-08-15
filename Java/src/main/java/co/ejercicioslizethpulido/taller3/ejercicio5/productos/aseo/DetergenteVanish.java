package co.ejercicioslizethpulido.taller3.ejercicio5.productos.aseo;

import co.ejercicioslizethpulido.taller3.ejercicio5.ProductoDeAseo;

public class DetergenteVanish extends ProductoDeAseo {
    private final double precio;

    public DetergenteVanish() {
        super("Vanish");
        this.precio = 3000;
    }

    @Override
    public double calcularPrecio(int unidades) {
        return unidades * precio;
    }

    @Override
    public void mostrarDetalles() {
        System.out.printf("El producto es de aseo, su marca es %s y su precio unitario es %f", getNombre(), precio);
    }
}
