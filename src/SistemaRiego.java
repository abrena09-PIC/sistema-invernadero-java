public class SistemaRiego {

    private boolean activo;


    public SistemaRiego() {
            this.activo = false;
    }

    public void activar() {
             activo = true;
    }

    public void desactivar() {
          activo = false;
    }

    public boolean estaActivo() {
        return activo;
    }

    public void revisarSuelo(SensorHumedadSuelo sensor) {
        if (sensor.requiereRiego()) {
            activar();

        }
        else {
            desactivar();
        }
    }
}