package models;

public class Motor {
    private String tipo;
    private String cilindrada;
    private int potencia;

    public Motor() {}

    public Motor(String tipo, String cilindrada, int potencia) {
        this.tipo = tipo;
        this.cilindrada = cilindrada;
        this.potencia = potencia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public void displayInfo() {
        System.out.println("Información del Motor:");
        System.out.println("Tipo: " + tipo);
        System.out.println("Cilindrada: " + cilindrada);
        System.out.println("Potencia: " + potencia + " HP");
    }
}