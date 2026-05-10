public class DronEmergencia extends Dron {

    private double recargoEmergencia;
    private int nivelPrioridad;

    public DronEmergencia(String codigo, String modelo, double distanciakm, double pesoPaquete, double horasVuelo, int nivelPrioridad) {
        super(codigo, modelo, distanciakm, pesoPaquete, horasVuelo, 8.00);
        this.setRecargoEmergencia(nivelPrioridad);
        this.setNivelPrioridad(nivelPrioridad);
    }

    public void setRecargoEmergencia(double nivelPrioridad) {
        if (nivelPrioridad == 1) {
            this.recargoEmergencia = 4.00;
        } else if (nivelPrioridad == 2) {
            this.recargoEmergencia = 6.00;
        } else if (nivelPrioridad == 3) {
            this.recargoEmergencia = 8.00;
        } else {
            this.recargoEmergencia = 0.00;
        }
    }

    public double getRecargoEmergencia() {
        return this.recargoEmergencia;
    }

    public void setNivelPrioridad(int nivelPrioridad) {
        if (nivelPrioridad >= 1 && nivelPrioridad <= 3) {
            this.nivelPrioridad = nivelPrioridad;
        } else {
            this.nivelPrioridad = 0;
        }
    }

    public int getNivelPrioridad(){return this.nivelPrioridad;}

    @Override
    public boolean validarDatos() {
        if(getPesoPaquete() <= 10 && getHorasVuelo() <= 3 && (nivelPrioridad >= 1&&nivelPrioridad <= 3)) {
            return true;
        }else{
            return false;
        }
    }

    public double calcularCostoEntrega(){
        return getCostoBase() + (getDistanciakm() * 1)+ recargoEmergencia;
    }
    @Override
    public void mostrarInformacion(){
        System.out.println("--- Dron Emergencia ---");
        super.mostrarInformacion();
        System.out.println("Nivel Prioridad: " + getNivelPrioridad());
        System.out.println("Recargo Emergencia: " + getRecargoEmergencia());
        System.out.println("Costo de entrega: " + calcularCostoEntrega());
    }

}
