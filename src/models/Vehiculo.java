package models;

public class Vehiculo {
    private String id;
    private String marca;
    private String modelo;
    private int ano;
    private String color;
    private String tipo;

    public Vehiculo() {}

    public Vehiculo(String id, String marca, String modelo, int ano, String color, String tipo) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.color = color;
        this.tipo = tipo;
    }

    public void displayInfo() {
        System.out.println("Información del Vehículo:");
        System.out.println("ID: " + id);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + ano);
        System.out.println("Color: " + color);
        System.out.println("Tipo: " + tipo);
    }
}
