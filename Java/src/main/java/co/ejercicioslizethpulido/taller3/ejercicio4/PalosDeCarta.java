package co.ejercicioslizethpulido.taller3.ejercicio4;

public enum PalosDeCarta {
    PICAS("Picas color negro"),
    CORAZONES("Corazones color rojo"),
    ROMBOS("Rombos color rojo"),
    TREBOLES("Treboles color negro");
    private final String nombre;

    PalosDeCarta(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
