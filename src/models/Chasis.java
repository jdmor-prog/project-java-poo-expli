package models;

public class Chasis {
    private String tipoChasis;
    private String dimensiones;
    private String peso;

    public Chasis() {}

    public Chasis(String tipoChasis, String dimensiones, String peso) {
        this.tipoChasis = tipoChasis;
        this.dimensiones = dimensiones;
        this.peso = peso;
    }

    public String getTipoChasis() {
        return tipoChasis;
    }

    public void setTipoChasis(String tipoChasis) {
        this.tipoChasis = tipoChasis;
    }

    public String getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(String dimensiones) {
        this.dimensiones = dimensiones;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public void displayInfo() {
        System.out.println("Información del Chasis:");
        System.out.println("Tipo de Chasis: " + tipoChasis);
        System.out.println("Dimensiones: " + dimensiones);
        System.out.println("Peso: " + peso);
    }
}
