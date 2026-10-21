public class Main {

    public static void main(String[] args) {
        System.out.println("***SISTEMA DE INVERNADERO INTELIGENTE***");
        System.out.println();

        Sensor[] sensores = new Sensor[3];
        sensores[0] = new SensorTemperatura("ST-01", "zona norte");
        sensores[1] = new SensorHumedad("SH-01", "zona central");
        sensores[2] = new SensorHumedadSuelo("SS-01", "zona sur");

        System.out.println();


        sensores[0].medir(32);

        sensores[1].medir(55);

        sensores[2].medir(22);

        for (Sensor sensor : sensores) {


            sensor.mostrarInformacion();
            System.out.println("tipo real del objeto: " + sensor.getClass().getSimpleName());

            System.out.println("tnterpretacion: " + sensor.evaluarMedicion());

            System.out.println();


        }

        for (Sensor sensor : sensores) {

                    if (sensor instanceof SensorTemperatura) {

                    SensorTemperatura temperatura = (SensorTemperatura) sensor;
                    System.out.println("temperatura en Fahrenheit: " + temperatura.convertirAFahrenheit());
                    }
        }

        System.out.println();

        SistemaRiego riego = new SistemaRiego();

        revisarRiego(sensores, riego);

                System.out.println("Humedad del suelo: " + sensores[2].getUltimaMedicion());

                System.out.println("Riego activo: " + riego.estaActivo());

                System.out.println();

        sensores[2].medir(51);


        revisarRiego(sensores, riego);


        System.out.println("Humedad del suelo: " + sensores[2].getUltimaMedicion());
        System.out.println("Riego activo: " + riego.estaActivo());
    }

    public static void revisarRiego(Sensor[] sensores, SistemaRiego riego) {
        for (Sensor sensor : sensores) {


            if (sensor instanceof SensorHumedadSuelo) {


                SensorHumedadSuelo suelo = (SensorHumedadSuelo) sensor;
                riego.revisarSuelo(suelo);
            }
        }
    }

    }
