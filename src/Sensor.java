public class Sensor {
    private String id;
    private String ubicacion;
    private boolean activo;
    private double ultimaMedicion;



    public Sensor(String id, String ubicacion) {
            this.id = id;
            this.ubicacion = ubicacion;
            this.activo = true;
            this.ultimaMedicion = 0;

        System.out.println("ejecutado el constructor de sensor");
    }

    public String getId() {
        return id;
    }


    public String getUbicacion() {
        return ubicacion;
    }



    public boolean isActivo() {
        return activo;
    }



    public double getUltimaMedicion() {
        return ultimaMedicion;
    }



    public void activar() {
        activo = true;
    }



    public void desactivar() {
        activo = false;
    }


    public void medir(double valor) {
        if (activo) {


            ultimaMedicion = valor;


        }
    }

    public void mostrarInformacion() {
        System.out.println("sensor " + id + " en " + ubicacion);
        System.out.println("activo: " + activo);
        System.out.println("ultima medicion: "+ ultimaMedicion);


    }
}