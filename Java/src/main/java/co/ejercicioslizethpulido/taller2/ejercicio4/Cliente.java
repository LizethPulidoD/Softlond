package co.ejercicioslizethpulido.taller2.ejercicio4;

public class Cliente {
    private int cedula;
    private String nombre;
    private String empresa;

    public Cliente(int cedula, String nombre, String empresa) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.empresa = empresa;
    }

    public Cliente() {
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
}
