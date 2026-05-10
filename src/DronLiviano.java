import java.sql.SQLOutput;

public class DronLiviano extends Dron {

    private double limiteHoras;

    public DronLiviano(String codigo,String modelo, double distanciakm,double pesoPaquete,double horasVuelo,double limiteHoras) {
        super(codigo,modelo,distanciakm,pesoPaquete,horasVuelo,3.00);
        this.setLimiteHoras(limiteHoras);
    }

    public void setLimiteHoras(double limiteHoras) {
        this.limiteHoras = 2.00;
    }

    public double getLimiteHoras() {return this.limiteHoras;}

    public boolean validarDatos() {
        if(getPesoPaquete()<= 5 && getHorasVuelo() <=2){
            return true;
        }else{
            return false;
        }
    }

    public double calcularCostoEntrega(){return this.costoBase+(getDistanciakm()*0.50);}

    @Override
    public void mostrarInformacion(){
        System.out.println("--- Dron Liviano ---");
        super.mostrarInformacion();
        System.out.println("Limite de peso: 5 kg");
        System.out.println("Limite Horas: " + this.limiteHoras);
        System.out.println("Costo de entrega: " + this.calcularCostoEntrega());
    }

}
