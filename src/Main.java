public class Main {

    public static void main(String[] args) {
        System.out.println("Sistema de invernadero inteligente");
        System.out.println();

        SensorTemperatura temperatura = new SensorTemperatura("ST-01", "zona norte");
        SensorHumedad humedad = new SensorHumedad("SH-01", "zona central");
        SensorHumedadSuelo suelo = new SensorHumedadSuelo("SS-01", "zona sur");
        System.out.println();

        temperatura.medir(32);
        humedad.medir(55);
        suelo.medir(22);

        System.out.println(temperatura.evaluarMedicion());
        System.out.println(humedad.evaluarMedicion());
        System.out.println(suelo.evaluarMedicion());
    }

}