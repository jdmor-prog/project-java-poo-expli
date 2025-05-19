package models;
public class Sensor {
    private String velocidad;
    private String temperatura;
    private String presion;
    private String nivelCombustible;
    private String estadoFrenos;

    public Sensor() {}

    public Sensor(String velocidad, String temperatura, String presion, String nivelCombustible, String estadoFrenos) {
        this.velocidad = velocidad;
        this.temperatura = temperatura;
        this.presion = presion;
        this.nivelCombustible = nivelCombustible;
        this.estadoFrenos = estadoFrenos;
    }

    public void displayInfo() {
        System.out.println("Información de los Sensores:");
        System.out.println("Velocidad: " + velocidad);
        System.out.println("Temperatura: " + temperatura);
        System.out.println("Presión: " + presion);
        System.out.println("Nivel de Combustible: " + nivelCombustible);
        System.out.println("Estado de Frenos: " + estadoFrenos);
    }
}