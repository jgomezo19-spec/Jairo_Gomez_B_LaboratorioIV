public class Carro extends Vehiculo {

    private int puertas;

    public Carro(String marca, String modelo, int puertas) {
        super(marca, modelo);
        this.puertas = puertas;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Puertas: " + puertas);
        System.out.println("Tipo: Carro");
    }
}