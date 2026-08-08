public class ProductoFisico extends Producto {

    private double peso;

    public ProductoFisico(String nombre, double precio, double peso) {
        super(nombre, precio);
        this.peso = peso;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Tipo: Producto físico");
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: Q" + precio);
        System.out.println("Peso: " + peso + " kg");
    }
}