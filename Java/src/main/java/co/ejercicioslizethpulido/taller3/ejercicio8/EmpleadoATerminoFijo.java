package co.ejercicioslizethpulido.taller3.ejercicio8;

public class EmpleadoATerminoFijo implements Empleado {
    private final double salario;
    private final int mesesTrabajados;

    public EmpleadoATerminoFijo(double salario, int mesesTrabajados) {
        this.salario = salario;
        this.mesesTrabajados = mesesTrabajados;
    }

    @Override
    public double calcularSalario() {
        return salario * mesesTrabajados;
    }
}
