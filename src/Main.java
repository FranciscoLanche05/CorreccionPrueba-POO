import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Dron d1 = new DronLiviano("DL-000", "Falcon Basic", 5.0, 2.0, 1.0, 3.0);
        Dron d2 = new DronCarga("DC-000", "Cargo Max", 5.0, 2.0, 1.0, 1.5);
        Dron d3 = new DronEmergencia("DE-000", "Rescue One", 5.0, 2.0, 1.0, 1);


        System.out.println("======== INFORMACIÓN INICIAL DE DRONES =======");
        d1.mostrarInformacion();
        System.out.println();
        d2.mostrarInformacion();
        System.out.println();
        d3.mostrarInformacion();
        System.out.println("==============================================\n");

        System.out.println("======= INGRESO DE NUEVOS DATOS (Dron Liviano) =======");
        System.out.print("Ingrese nuevo código: ");
        String nuevoCodigo = sc.nextLine();
        System.out.print("Ingrese nuevo modelo: ");
        String nuevoModelo = sc.nextLine();
        System.out.print("Ingrese Distancia (km): ");
        double km = sc.nextDouble();
        System.out.print("Ingrese peso del paquete (kg): ");
        double peso = sc.nextDouble();
        System.out.print("Ingrese horas de vuelo: ");
        double horas = sc.nextDouble();


        d1.setCodigo(nuevoCodigo);
        d1.setModelo(nuevoModelo);
        d1.setDistanciakm(km);
        d1.setPesoPaquete(peso);
        d1.setHorasVuelo(horas);

        System.out.println("\nValidando datos...");
        if (d1.validarDatos()) {
            System.out.println("Los datos cumplen con las validaciones.");


            System.out.println("\n======= INFORMACIÓN ACTUALIZADA =======");
            d1.mostrarInformacion();
        } else {
            System.out.println("ERROR: Los datos ingresados exceden los límites permitidos.");
            System.out.println("No se guardaron los cambios para la operación.");
        }


        System.out.println("\n===== DEMOSTRACIÓN DE POLIMORFISMO =====");
        Dron[] listaDrones = {d1, d2, d3};

        for (Dron dron : listaDrones) {
            System.out.println("----------------------------------");
            System.out.println("Tipo: " + dron.getClass().getSimpleName());
            System.out.println("Modelo: " + dron.getModelo());
            System.out.println("Costo de entrega: $" + dron.calcularCostoEntrega());
        }

        System.out.println("\n========================================");
        System.out.println("SISTEMA FINALIZADO");
        System.out.println("Gracias por usar el sistema de drones.");
        System.out.println("========================================");

        sc.close();
    }
}