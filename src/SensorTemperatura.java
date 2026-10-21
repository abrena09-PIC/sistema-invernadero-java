public class SensorTemperatura extends Sensor {

    public SensorTemperatura(String id, String ubicacion) {
        super(id, ubicacion);
        System.out.println("ejecutando el constructor de SensorTemperatura");
    }


    @Override
    public String evaluarMedicion() {

            double temperatura = getUltimaMedicion();

        if (temperatura < 18) {
            return "Temperatura baja";

        }
        else if (temperatura <= 30) {
            return "Temperatura adecuada";


        }
        else {
            return "Temperatura alta";


        }
    }


    public double convertirAFahrenheit() {

        return getUltimaMedicion()*9/5+32;
    }
}