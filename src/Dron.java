public abstract class Dron {

    private String codigo;
    private String modelo;
    private double distanciakm;
    private double pesoPaquete;
    private double horasVuelo;
    protected double costoBase;

    public Dron(){};

    public Dron(String codigo, String modelo ,double distanciakm,double pesoPaquete,double horasVuelo,double costoBase){
        this.setCodigo(codigo);
        this.setModelo(modelo);
        this.setDistanciakm(distanciakm);
        this.setPesoPaquete(pesoPaquete);
        this.setHorasVuelo(horasVuelo);
        this.setCostoBase(costoBase);
    }

    public void setCodigo(String codigo) {
        if(codigo ==null || codigo.isEmpty()){
            this.codigo = "";
        }else{
            this.codigo = codigo;
        }
    }
    public void setModelo(String modelo) {
        if(modelo ==null || modelo.isEmpty()){
            this.modelo = "";
        }else {
            this.modelo = modelo;
        }
    }
    public void setDistanciakm(double distanciakm) {
        if(distanciakm > 0){
            this.distanciakm = distanciakm;
        }else{
            this.distanciakm = 0;
        }
    }
    public void setPesoPaquete(double pesoPaquete) {
        if(pesoPaquete > 0){
            this.pesoPaquete = pesoPaquete;
        }else {
            this.pesoPaquete = 0;
        }
    }
    public void setHorasVuelo(double horasVuelo) {
        if(horasVuelo >= 0 && horasVuelo <= 5){
            this.horasVuelo = horasVuelo;
        }else {
            this.horasVuelo = 0;
        }
    }
    public void setCostoBase(double costoBase) {
        if(costoBase >= 3 && costoBase <= 8){
            this.costoBase = costoBase;
        }else {
            this.costoBase = 0;
        }
    }
    public String getCodigo() {return this.codigo;}
    public String getModelo() {return this.modelo;}
    public double getDistanciakm() {return this.distanciakm;}
    public double getPesoPaquete() {return this.pesoPaquete;}
    public double getHorasVuelo() {return this.horasVuelo;}
    public double getCostoBase() {return this.costoBase;}

    public abstract double calcularCostoEntrega();
    public abstract boolean validarDatos();

    public void mostrarInformacion(){
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Distanciakm: " + this.distanciakm);
        System.out.println("Peso paquete: " + this.pesoPaquete);
        System.out.println("Horas vuelo: " + this.horasVuelo);
        System.out.println("Costo base: " + this.costoBase);
    };







}
