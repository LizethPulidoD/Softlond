package co.ejercicioslizethpulido.taller3.ejercicio5.productos.aseo;

import co.ejercicioslizethpulido.taller3.ejercicio5.ProductoDeAseo;

public class SuavizanteSuavitel extends ProductoDeAseo {
    private final double precio;

    public SuavizanteSuavitel() {
        super("Suavitel");
        this.precio = 12000;
    }

    @Override
    public double calcularPrecio(int unidades) {
        return unidades * this.precio;
    }

    @Override
    public void mostrarDetalles() {
        System.out.printf("El producto es de aseo, su marca es %s y su precio unitario es %f", getNombre(), precio);
    }
}
