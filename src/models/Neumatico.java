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

    public void displayInfo() {
        System.out.println("Información del Neumático:");
        System.out.println("Marca: " + marca);
        System.out.println("Tamaño: " + tamano);
        System.out.println("Presión: " + presion);
    }
}
