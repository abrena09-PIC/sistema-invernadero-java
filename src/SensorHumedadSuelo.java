public class SensorHumedadSuelo extends Sensor {

    public SensorHumedadSuelo(String id, String ubicacion) {
        super(id, ubicacion);


        System.out.println("ejecutando el constructor de SensorHumedadSuelo");
    }

    @Override
    public String evaluarMedicion() {

            double humedad = getUltimaMedicion();
        if (humedad < 30) {

            return "Humedad del suelo baja";
        }
        else if (humedad <= 70) {

            return "Humedad del suelo adecuada";

        }

        else {
            return "Humedad del suelo alta";
        }
    }
    public boolean requiereRiego() {

        return getUltimaMedicion() < 30;
    }
}