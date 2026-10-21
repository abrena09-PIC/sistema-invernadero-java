public class SensorHumedadSuelo extends Sensor {

    public SensorHumedadSuelo(String id, String ubicacion) {
        super(id, ubicacion);


        System.out.println("ejecutando el constructor de SensorHumedadSuelo");
    }

    public boolean requiereRiego() {

        return getUltimaMedicion() < 30;
    }
}