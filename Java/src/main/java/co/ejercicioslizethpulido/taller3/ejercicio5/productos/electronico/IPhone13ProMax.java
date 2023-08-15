package co.ejercicioslizethpulido.taller3.ejercicio5.productos.electronico;

import co.ejercicioslizethpulido.taller3.ejercicio5.ProductoElectronico;

public class IPhone13ProMax extends ProductoElectronico {
    private final double precio = 4000000;

    public IPhone13ProMax() {
        super("iPhone 13 Pro Max", "Apple");
    }

    @Override
    public double calcularPrecio(int unidades) {
        return precio * unidades;
    }

    @Override
    public void mostrarDetalles() {
        System.out.printf("El producto es %s, su marca es %s y su precio unitario es %f",getNombre(), getMarca(), precio);
    }
}
