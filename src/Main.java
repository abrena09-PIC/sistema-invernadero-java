public class Main {

    public static void main(String[] args) {
        System.out.println("Sistema de invernadero inteligente");
        System.out.println();

        SensorTemperatura temperatura = new SensorTemperatura("ST-01", "zona norte");
        temperatura.medir(32);
        temperatura.mostrarInformacion();
    }

}