public class SistemaVehiculos {

    public static void main(String[] args) {

        Vehiculo vehiculo1 = new Carro("Toyota", "Corolla", 4);
        Vehiculo vehiculo2 = new Moto("Honda", "CBR", 600);

        vehiculo1.mostrarDatos();
        System.out.println();

        vehiculo2.mostrarDatos();
    }
}