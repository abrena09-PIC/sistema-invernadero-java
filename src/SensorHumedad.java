public class SensorHumedad extends Sensor {

    public SensorHumedad(String id, String ubicacion) {

        super(id, ubicacion);

        System.out.println("ejecutando constructor de SensorHumedad");
    }

    @Override
    public String evaluarMedicion() {


            double humedad = getUltimaMedicion();


        if (humedad < 40) {
            return "Humedad ambiental baja";

        }
        else if (humedad <= 70) {
            return "Humedad ambiental adecuada";


        }
        else {
            return "Humedad ambiental alta";

        }
    }

}