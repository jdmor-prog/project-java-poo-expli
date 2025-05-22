package models;

public class Transmision {
    private String tipo;
    private String marchas;
    private String traccion;

    public Transmision() {}

    public Transmision(String tipo, String marchas, String traccion) {
        this.tipo = tipo;
        this.marchas = marchas;
        this.traccion = traccion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarchas() {
        return marchas;
    }

    public void setMarchas(String marchas) {
        this.marchas = marchas;
    }

    public String getTraccion() {
        return traccion;
    }

    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }

    public void displayInfo() {
        System.out.println("Información de la Transmisión:");
        System.out.println("Tipo: " + tipo);
        System.out.println("Marchas: " + marchas);
        System.out.println("Tracción: " + traccion);
    }
}
