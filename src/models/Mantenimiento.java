package models;

public class Mantenimiento {
    private String historialMantenimientos;
    private String proximoMantenimiento;
    private String descripcion;

    public Mantenimiento() {}

    public Mantenimiento(String historialMantenimientos, String proximoMantenimiento, String descripcion) {
        this.historialMantenimientos = historialMantenimientos;
        this.proximoMantenimiento = proximoMantenimiento;
        this.descripcion = descripcion;
    }

    public void displayInfo() {
        System.out.println("Información del Mantenimiento:");
        System.out.println("Historial de Mantenimientos: " + historialMantenimientos);
        System.out.println("Próximo Mantenimiento: " + proximoMantenimiento);
        System.out.println("Descripción: " + descripcion);
    }
}