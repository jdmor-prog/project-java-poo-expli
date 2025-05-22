package models;

public class Neumatico {
    private String marca;
    private String tamano;
    private String presion;

    public Neumatico() {}

    public Neumatico(String marca, String tamano, String presion) {
        this.marca = marca;
        this.tamano = tamano;
        this.presion = presion;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getPresion() {
        return presion;
    }

    public void setPresion(String presion) {
        this.presion = presion;
    }

    public void displayInfo() {
        System.out.println("Información del Neumático:");
        System.out.println("Marca: " + marca);
        System.out.println("Tamaño: " + tamano);
        System.out.println("Presión: " + presion);
    }
}
