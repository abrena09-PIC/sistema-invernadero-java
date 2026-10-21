public class SensorTemperatura extends Sensor {

    public SensorTemperatura(String id, String ubicacion) {
        super(id, ubicacion);
        System.out.println("ejecutando el constructor de SensorTemperatura");
    }

    public double convertirAFahrenheit() {

        return getUltimaMedicion()*9/5+32;
    }
}