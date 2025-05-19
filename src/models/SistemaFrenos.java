package models;

public class SistemaFrenos {
    private String tipo;
    private String discos;
    private String abs;
    private String estado;

    public SistemaFrenos() {}

    public SistemaFrenos(String tipo, String discos, String abs, String estado) {
        this.tipo = tipo;
        this.discos = discos;
        this.abs = abs;
        this.estado = estado;
    }

    public void displayInfo() {
        System.out.println("Información del Sistema de Frenos:");
        System.out.println("Tipo: " + tipo);
        System.out.println("Discos: " + discos);
        System.out.println("ABS: " + abs);
        System.out.println("Estado: " + estado);
    }
}
