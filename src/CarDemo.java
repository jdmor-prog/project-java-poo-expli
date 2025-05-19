import models.Car;
import models.Chasis;
import models.Mantenimiento;
import models.Motor;
import models.Neumatico;
import models.RegistroVehicular;
import models.Sensor;
import models.SistemaElectrico;
import models.SistemaFrenos;
import models.Transmision;
import models.Vehiculo;

public class CarDemo {
    public static void main(String[] args) throws Exception {
        Car myCar = new Car("Toyota", "Corolla", 2022);
        myCar.displayInfo();
        Car friendsCar = new Car("Honda", "Civic", 2023);
        friendsCar.displayInfo();
        Vehiculo myVehiculo = new Vehiculo("1", "Ford", "Mustang", 2021, "Rojo", "Deportivo");
        myVehiculo.displayInfo();
        Motor myMotor = new Motor("Gasolina", "2.0L", 250);
        myMotor.displayInfo();
        Transmision myTransmision = new Transmision("Automática", "6", "Delantera");
        myTransmision.displayInfo();
        Chasis myChasis = new Chasis("Monocasco", "4.5m x 1.8m x 1.4m", "1500kg");
        myChasis.displayInfo();
        Neumatico myNeumatico = new Neumatico("Pirelli", "225/45R17", "25 psi");
        myNeumatico.displayInfo();
        SistemaElectrico mySistemaElectrico = new SistemaElectrico("12V", "Batería de plomo-ácido", "Alternador de 120A");
        mySistemaElectrico.displayInfo();
        SistemaFrenos mySistemaFrenos = new SistemaFrenos("Discos", "Delanteros y traseros", "Sí", "Bueno");
        mySistemaFrenos.displayInfo();
        RegistroVehicular myRegistroVehicular = new RegistroVehicular("ABC123", "Javier Moreno", "2023-01-01");
        myRegistroVehicular.displayInfo();
        Mantenimiento myMantenimiento = new Mantenimiento("Cambio de aceite", "2023-06-01", "Cambio de frenos");
        myMantenimiento.displayInfo();
        Sensor mySensor = new Sensor("80km/h", "80 grados celcius", "30%", "50%", "90%");
        mySensor.displayInfo();
    }
}
