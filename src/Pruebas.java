public class Pruebas {

    public static void main(String[] args) {


        SensorTemperatura temperatura = new SensorTemperatura("ST-01", "zona norte");
        SensorHumedad humedad = new SensorHumedad("SH-01", "zona central");
        SensorHumedadSuelo suelo = new SensorHumedadSuelo("SS-01", "zona sur");
        System.out.println();



        System.out.println("***Temperatura***");

        probar(temperatura, 15, "Temperatura baja");
        probar(temperatura, 18, "Temperatura adecuada");
        probar(temperatura, 25, "Temperatura adecuada");
        probar(temperatura, 30, "Temperatura adecuada");
        probar(temperatura, 34, "Temperatura alta");



        System.out.println("***Humedad ambiental***");
        probar(humedad, 32, "Humedad ambiental baja");
        probar(humedad, 40, "Humedad ambiental adecuada");
        probar(humedad, 55, "Humedad ambiental adecuada");
        probar(humedad, 70, "Humedad ambiental adecuada");
        probar(humedad, 82, "Humedad ambiental alta");





        System.out.println("***Humedad del suelo***");
        probar(suelo, 18, "Humedad del suelo baja");
        probar(suelo, 30, "Humedad del suelo adecuada");
        probar(suelo, 48, "Humedad del suelo adecuada");
        probar(suelo, 70, "Humedad del suelo adecuada");
        probar(suelo, 83, "Humedad del suelo alta");




        System.out.println("***Sensor desactivado***");
        temperatura.medir(25);
        temperatura.desactivar();
        temperatura.medir(40);
        System.out.println("ultima medicion con el sensor desactivado: " + temperatura.getUltimaMedicion());
        temperatura.activar();



        System.out.println("***Sistema de riego***");
        SistemaRiego riego = new SistemaRiego();
        System.out.println("Riego al crear el objeto: " + riego.estaActivo());

        suelo.medir(22);
        riego.revisarSuelo(suelo);
        System.out.println("Suelo en 22 --- riego activo: " + riego.estaActivo());

        suelo.medir(51);
        riego.revisarSuelo(suelo);
        System.out.println("Suelo en 51 ---- riego activo: " + riego.estaActivo());

        suelo.medir(83);
        riego.revisarSuelo(suelo);
        System.out.println("Suelo en 83 ---- riego activo: " + riego.estaActivo());

        System.out.println("***instanceof y casting***");
        Sensor[] sensores = {temperatura, humedad, suelo};
        for (Sensor sensor : sensores) {
            System.out.println(sensor.getId() + " es SensorTemperatura: " + (sensor instanceof SensorTemperatura));
        }


        temperatura.medir(25);
        Sensor referencia = temperatura;
        SensorTemperatura convertido = (SensorTemperatura) referencia;
        System.out.println("25 C en Fahrenheit: " + convertido.convertirAFahrenheit());
    }

    public static void probar(Sensor sensor, double valor, String esperado) {
        sensor.medir(valor);
        String obtenido = sensor.evaluarMedicion();
        String resultado;
        if (obtenido.equals(esperado)) {

            resultado = "OK";
        }
        else {
            resultado = "FALLO";
        }
        System.out.println(sensor.getId() + " con " + valor + " -> " + obtenido + " [" + resultado + "]");
    }
}