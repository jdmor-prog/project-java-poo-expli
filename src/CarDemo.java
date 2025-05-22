import models.*;

public class CarDemo {
    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Vehiculo();
        vehiculo1.setId("V001");
        vehiculo1.setMarca("Toyota");
        vehiculo1.setModelo("Corolla");
        vehiculo1.setAno(2022);
        vehiculo1.setColor("Rojo");
        vehiculo1.setTipo("Sedán");

        Vehiculo vehiculo2 = new Vehiculo();
        vehiculo2.setId("V002");
        vehiculo2.setMarca("Honda");
        vehiculo2.setModelo("Civic");
        vehiculo2.setAno(2021);
        vehiculo2.setColor("Azul");
        vehiculo2.setTipo("Sedán");

        Vehiculo vehiculo3 = new Vehiculo();
        vehiculo3.setId("V003");
        vehiculo3.setMarca("Ford");
        vehiculo3.setModelo("EcoSport");
        vehiculo3.setAno(2020);
        vehiculo3.setColor("Negro");
        vehiculo3.setTipo("SUV");

        Vehiculo vehiculo4 = new Vehiculo();
        vehiculo4.setId("V004");
        vehiculo4.setMarca("Chevrolet");
        vehiculo4.setModelo("Onix");
        vehiculo4.setAno(2023);
        vehiculo4.setColor("Blanco");
        vehiculo4.setTipo("Hatchback");

        System.out.println("Vehículo 1: " + vehiculo1.getId() + ", " + vehiculo1.getMarca() + ", " + vehiculo1.getModelo() + ", " + vehiculo1.getAno() + ", " + vehiculo1.getColor() + ", " + vehiculo1.getTipo());
        System.out.println("Vehículo 2: " + vehiculo2.getId() + ", " + vehiculo2.getMarca() + ", " + vehiculo2.getModelo() + ", " + vehiculo2.getAno() + ", " + vehiculo2.getColor() + ", " + vehiculo2.getTipo());
        System.out.println("Vehículo 3: " + vehiculo3.getId() + ", " + vehiculo3.getMarca() + ", " + vehiculo3.getModelo() + ", " + vehiculo3.getAno() + ", " + vehiculo3.getColor() + ", " + vehiculo3.getTipo());
        System.out.println("Vehículo 4: " + vehiculo4.getId() + ", " + vehiculo4.getMarca() + ", " + vehiculo4.getModelo() + ", " + vehiculo4.getAno() + ", " + vehiculo4.getColor() + ", " + vehiculo4.getTipo());

        Motor motor1 = new Motor();
        motor1.setTipo("Gasolina");
        motor1.setPotencia(120);
        motor1.setCilindrada("1.8 L");

        Motor motor2 = new Motor();
        motor2.setTipo("Diésel");
        motor2.setPotencia(140);
        motor2.setCilindrada("2.0 L");

        Motor motor3 = new Motor();
        motor3.setTipo("Eléctrico");
        motor3.setPotencia(200);
        motor3.setCilindrada("N/A");

        Motor motor4 = new Motor();
        motor4.setTipo("Híbrido");
        motor4.setPotencia(150);
        motor4.setCilindrada("1.5 L");

        System.out.println("Motor 1: " + motor1.getTipo() + ", " + motor1.getPotencia() + ", " + motor1.getCilindrada());
        System.out.println("Motor 2: " + motor2.getTipo() + ", " + motor2.getPotencia() + ", " + motor2.getCilindrada());
        System.out.println("Motor 3: " + motor3.getTipo() + ", " + motor3.getPotencia() + ", " + motor3.getCilindrada());
        System.out.println("Motor 4: " + motor4.getTipo() + ", " + motor4.getPotencia() + ", " + motor4.getCilindrada());

        Transmision transmision1 = new Transmision();
        transmision1.setTipo("Automática");
        transmision1.setMarchas("6");
        transmision1.setTraccion("Delantera");

        Transmision transmision2 = new Transmision();
        transmision2.setTipo("Manual");
        transmision2.setMarchas("5");
        transmision2.setTraccion("Trasera");

        Transmision transmision3 = new Transmision();
        transmision3.setTipo("CVT");
        transmision3.setMarchas("0");
        transmision3.setTraccion("Trasera");

        Transmision transmision4 = new Transmision();
        transmision4.setTipo("Automática DCT");
        transmision4.setMarchas("7");
        transmision4.setTraccion("Delantera");

        System.out.println("Transmisión 1: " + transmision1.getTipo() + ", " + transmision1.getMarchas() + ", " + transmision1.getTraccion());
        System.out.println("Transmisión 2: " + transmision2.getTipo() + ", " + transmision2.getMarchas() + ", " + transmision2.getTraccion());
        System.out.println("Transmisión 3: " + transmision3.getTipo() + ", " + transmision3.getMarchas() +  ", " + transmision3.getTraccion());
        System.out.println("Transmisión 4: " + transmision4.getTipo() + ", " + transmision4.getMarchas() +  ", " + transmision4.getTraccion());

        Chasis chasis1 = new Chasis();
        chasis1.setTipoChasis("Monocasco");
        chasis1.setDimensiones("4.5m x 1.8m x 1.4m");
        chasis1.setPeso("350 kg");

        Chasis chasis2 = new Chasis();
        chasis2.setTipoChasis("Espina dorsal");
        chasis2.setDimensiones("4.2m x 1.7m x 1.3m");
        chasis2.setPeso("280 kg");

        Chasis chasis3 = new Chasis();
        chasis3.setTipoChasis("Tubular");
        chasis3.setDimensiones("4.0m x 1.6m x 1.2m");
        chasis3.setPeso("200 kg");

        Chasis chasis4 = new Chasis();
        chasis4.setTipoChasis("Bastidor de escalera");
        chasis4.setDimensiones("4.8m x 2.0m x 1.5m");
        chasis4.setPeso("400 kg");

        System.out.println("Chasis 1: " + chasis1.getTipoChasis() + ", " + chasis1.getDimensiones() + ", " + chasis1.getPeso());
        System.out.println("Chasis 2: " + chasis2.getTipoChasis() + ", " + chasis2.getDimensiones() + ", " + chasis2.getPeso());
        System.out.println("Chasis 3: " + chasis3.getTipoChasis() + ", " + chasis3.getDimensiones() + ", " + chasis3.getPeso());
        System.out.println("Chasis 4: " + chasis4.getTipoChasis() + ", " + chasis4.getDimensiones() + ", " + chasis4.getPeso());

        Neumatico neumatico1 = new Neumatico();
        neumatico1.setMarca("Michelin");
        neumatico1.setTamano("205/55 R16");
        neumatico1.setPresion("32 PSI");

        Neumatico neumatico2 = new Neumatico();
        neumatico2.setMarca("Pirelli");
        neumatico2.setTamano("195/65 R15");
        neumatico2.setPresion("30 PSI");

        Neumatico neumatico3 = new Neumatico();
        neumatico3.setMarca("Bridgestone");
        neumatico3.setTamano("215/60 R17");
        neumatico3.setPresion("34 PSI");

        Neumatico neumatico4 = new Neumatico();
        neumatico4.setMarca("Goodyear");
        neumatico4.setTamano("225/45 R18");
        neumatico4.setPresion("33 PSI");

        System.out.println("Neumático 1: " + neumatico1.getMarca() + ", " + neumatico1.getTamano() + ", " + neumatico1.getPresion());
        System.out.println("Neumático 2: " + neumatico2.getMarca() + ", " + neumatico2.getTamano() + ", " + neumatico2.getPresion());
        System.out.println("Neumático 3: " + neumatico3.getMarca() + ", " + neumatico3.getTamano() + ", " + neumatico3.getPresion());
        System.out.println("Neumático 4: " + neumatico4.getMarca() + ", " + neumatico4.getTamano() + ", " + neumatico4.getPresion());

        SistemaElectrico sistema1 = new SistemaElectrico();
        sistema1.setBateria("Batería AGM 12V 70Ah");
        sistema1.setLuces("LED delanteras y traseras");
        sistema1.setSensores("Sensores de estacionamiento");

        SistemaElectrico sistema2 = new SistemaElectrico();
        sistema2.setBateria("Batería de litio 400V");
        sistema2.setLuces("Halógenas");
        sistema2.setSensores("Sensores de lluvia");

        SistemaElectrico sistema3 = new SistemaElectrico();
        sistema3.setBateria("Batería convencional 12V 60Ah");
        sistema3.setLuces("Xenón");
        sistema3.setSensores("Sensores de presión de neumáticos");

        SistemaElectrico sistema4 = new SistemaElectrico();
        sistema4.setBateria("Batería AGM 12V 80Ah");
        sistema4.setLuces("LED automáticas");
        sistema4.setSensores("Sensores de proximidad");

        System.out.println("Sistema Eléctrico 1: " + sistema1.getBateria() + ", " + sistema1.getLuces() + ", " + sistema1.getSensores());
        System.out.println("Sistema Eléctrico 2: " + sistema2.getBateria() + ", " + sistema2.getLuces() + ", " + sistema2.getSensores());
        System.out.println("Sistema Eléctrico 3: " + sistema3.getBateria() + ", " + sistema3.getLuces() + ", " + sistema3.getSensores());
        System.out.println("Sistema Eléctrico 4: " + sistema4.getBateria() + ", " + sistema4.getLuces() + ", " + sistema4.getSensores());

        SistemaFrenos frenos1 = new SistemaFrenos();
        frenos1.setTipo("Disco");
        frenos1.setDiscos("4 discos ventilados");
        frenos1.setAbs("Sí");
        frenos1.setEstado("Óptimo");

        SistemaFrenos frenos2 = new SistemaFrenos();
        frenos2.setTipo("Tambor");
        frenos2.setDiscos("2 tambores traseros");
        frenos2.setAbs("No");
        frenos2.setEstado("Bueno");

        SistemaFrenos frenos3 = new SistemaFrenos();
        frenos3.setTipo("Disco/Tambor");
        frenos3.setDiscos("2 discos delanteros, 2 tambores traseros");
        frenos3.setAbs("Sí");
        frenos3.setEstado("Regular");

        SistemaFrenos frenos4 = new SistemaFrenos();
        frenos4.setTipo("Disco");
        frenos4.setDiscos("4 discos sólidos");
        frenos4.setAbs("Sí");
        frenos4.setEstado("Nuevo");

        System.out.println("Sistema de Frenos 1: " + frenos1.getTipo() + ", " + frenos1.getDiscos() + ", " + frenos1.getAbs() + ", " + frenos1.getEstado());
        System.out.println("Sistema de Frenos 2: " + frenos2.getTipo() + ", " + frenos2.getDiscos() + ", " + frenos2.getAbs() + ", " + frenos2.getEstado());
        System.out.println("Sistema de Frenos 3: " + frenos3.getTipo() + ", " + frenos3.getDiscos() + ", " + frenos3.getAbs() + ", " + frenos3.getEstado());
        System.out.println("Sistema de Frenos 4: " + frenos4.getTipo() + ", " + frenos4.getDiscos() + ", " + frenos4.getAbs() + ", " + frenos4.getEstado());

        RegistroVehicular registro1 = new RegistroVehicular();
        registro1.setMatricula("ABC123");
        registro1.setPropietario("Juan Pérez");
        registro1.setFechaRegistro("2022-01-15");

        RegistroVehicular registro2 = new RegistroVehicular();
        registro2.setMatricula("XYZ789");
        registro2.setPropietario("María López");
        registro2.setFechaRegistro("2021-06-10");

        RegistroVehicular registro3 = new RegistroVehicular();
        registro3.setMatricula("LMN456");
        registro3.setPropietario("Carlos Ruiz");
        registro3.setFechaRegistro("2023-03-22");

        RegistroVehicular registro4 = new RegistroVehicular();
        registro4.setMatricula("QWE852");
        registro4.setPropietario("Ana Torres");
        registro4.setFechaRegistro("2020-11-05");

        System.out.println("Registro Vehicular 1: " + registro1.getMatricula() + ", " + registro1.getPropietario() + ", " + registro1.getFechaRegistro());
        System.out.println("Registro Vehicular 2: " + registro2.getMatricula() + ", " + registro2.getPropietario() + ", " + registro2.getFechaRegistro());
        System.out.println("Registro Vehicular 3: " + registro3.getMatricula() + ", " + registro3.getPropietario() + ", " + registro3.getFechaRegistro());
        System.out.println("Registro Vehicular 4: " + registro4.getMatricula() + ", " + registro4.getPropietario() + ", " + registro4.getFechaRegistro());

        Car car1 = new Car();
        car1.setMake("Toyota");
        car1.setModel("Corolla");
        car1.setYear(2022);

        Car car2 = new Car();
        car2.setMake("Honda");
        car2.setModel("Civic");
        car2.setYear(2021);

        Car car3 = new Car();
        car3.setMake("Ford");
        car3.setModel("Focus");
        car3.setYear(2020);

        Car car4 = new Car();
        car4.setMake("Chevrolet");
        car4.setModel("Onix");
        car4.setYear(2023);

        System.out.println("Auto 1: " + car1.getMake() + " " + car1.getModel() + " " + car1.getYear());
        System.out.println("Auto 2: " + car2.getMake() + " " + car2.getModel() + " " + car2.getYear());
        System.out.println("Auto 3: " + car3.getMake() + " " + car3.getModel() + " " + car3.getYear());
        System.out.println("Auto 4: " + car4.getMake() + " " + car4.getModel() + " " + car4.getYear());

        Sensor sensor1 = new Sensor();
        sensor1.setVelocidad("100 km/h");
        sensor1.setTemperatura("85°C");
        sensor1.setPresion("32 PSI");
        sensor1.setNivelCombustible("80%");
        sensor1.setEstadoFrenos("Bueno");

        Sensor sensor2 = new Sensor();
        sensor2.setVelocidad("90 km/h");
        sensor2.setTemperatura("80°C");
        sensor2.setPresion("30 PSI");
        sensor2.setNivelCombustible("60%");
        sensor2.setEstadoFrenos("Regular");

        Sensor sensor3 = new Sensor();
        sensor3.setVelocidad("110 km/h");
        sensor3.setTemperatura("90°C");
        sensor3.setPresion("33 PSI");
        sensor3.setNivelCombustible("50%");
        sensor3.setEstadoFrenos("Óptimo");

        Sensor sensor4 = new Sensor();
        sensor4.setVelocidad("70 km/h");
        sensor4.setTemperatura("75°C");
        sensor4.setPresion("31 PSI");
        sensor4.setNivelCombustible("40%");
        sensor4.setEstadoFrenos("Malo");

        System.out.println("Datos del sensor 1: " + sensor1.getVelocidad() + ", " + sensor1.getTemperatura() + ", " + sensor1.getPresion() + ", " + sensor1.getNivelCombustible() + ", " + sensor1.getEstadoFrenos());
        System.out.println("Datos del sensor 2: " + sensor2.getVelocidad() + ", " + sensor2.getTemperatura() + ", " + sensor2.getPresion() + ", " + sensor2.getNivelCombustible() + ", " + sensor2.getEstadoFrenos());
        System.out.println("Datos del sensor 3: " + sensor3.getVelocidad() + ", " + sensor3.getTemperatura() + ", " + sensor3.getPresion() + ", " + sensor3.getNivelCombustible() + ", " + sensor3.getEstadoFrenos());
        System.out.println("Datos del sensor 4: " + sensor4.getVelocidad() + ", " + sensor4.getTemperatura() + ", " + sensor4.getPresion() + ", " + sensor4.getNivelCombustible() + ", " + sensor4.getEstadoFrenos());

        Mantenimiento mant1 = new Mantenimiento();
        mant1.setHistorialMantenimientos("Cambio de aceite");
        mant1.setProximoMantenimiento("2025-06-20");
        mant1.setDescripcion("Mantenimiento preventivo");

        Mantenimiento mant2 = new Mantenimiento();
        mant2.setHistorialMantenimientos("Cambio de frenos");
        mant2.setProximoMantenimiento("2025-07-15");
        mant2.setDescripcion("Mantenimiento correctivo");

        Mantenimiento mant3 = new Mantenimiento();
        mant3.setHistorialMantenimientos("Alineación y balanceo");
        mant3.setProximoMantenimiento("2025-05-30");
        mant3.setDescripcion("Mantenimiento rutinario");

        Mantenimiento mant4 = new Mantenimiento();
        mant4.setHistorialMantenimientos("Revisión general");
        mant4.setProximoMantenimiento("2025-08-10");
        mant4.setDescripcion("Inspección completa");

        System.out.println("Mantenimiento 1: " + mant1.getHistorialMantenimientos() + ", " + mant1.getProximoMantenimiento() + ", " + mant1.getDescripcion());
        System.out.println("Mantenimiento 2: " + mant2.getHistorialMantenimientos() + ", " + mant2.getProximoMantenimiento() + ", " + mant2.getDescripcion());
        System.out.println("Mantenimiento 3: " + mant3.getHistorialMantenimientos() + ", " + mant3.getProximoMantenimiento() + ", " + mant3.getDescripcion());
        System.out.println("Mantenimiento 4: " + mant4.getHistorialMantenimientos() + ", " + mant4.getProximoMantenimiento() + ", " + mant4.getDescripcion());
    }
}
