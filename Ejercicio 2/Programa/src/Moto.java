public class Moto extends Vehiculo {

    private int cilindrada;

    public Moto(String marca, String modelo, int cilindrada) {
        super(marca, modelo);
        this.cilindrada = cilindrada;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Cilindrada: " + cilindrada + "cc");
        System.out.println("Tipo: Moto");
    }
}