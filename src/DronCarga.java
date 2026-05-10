public class DronCarga extends Dron {

    private double costoPorkg;

    public DronCarga(String codigo, String modelo,double distanciakm,double pesoPaquete,double horasVuelo,double costoPorkg) {
        super(codigo,modelo,distanciakm,pesoPaquete,horasVuelo,6.00);
        this.setCostoPorkg(costoPorkg);
    }

    public void setCostoPorkg(double costoPorkg){
        if(costoPorkg>0){
            this.costoPorkg = costoPorkg;
        }else{

        }
    }

    public double getCostoPorkg(){return costoPorkg;}

    public boolean validarDatos(){
        if(getPesoPaquete() <= 30 && getHorasVuelo() <= 5){
            return true;
        }else {
            return false;
        }
    }

    public double calcularCostoEntrega(){return getCostoBase() + (getDistanciakm() * 0.70) + (getPesoPaquete() * costoPorkg);}

    @Override
    public void mostrarInformacion(){
        System.out.println("--- Dron Carga ---");
        super.mostrarInformacion();
        System.out.println("Costo por kg: " + getCostoPorkg());
        System.out.println("Costo de entrega: " + calcularCostoEntrega());
    }
}
