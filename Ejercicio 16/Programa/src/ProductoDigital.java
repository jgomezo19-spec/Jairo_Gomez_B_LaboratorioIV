public class ProductoDigital extends Producto {

    private double tamanoArchivo;

    public ProductoDigital(String nombre, double precio, double tamanoArchivo) {
        super(nombre, precio);
        this.tamanoArchivo = tamanoArchivo;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Tipo: Producto digital");
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: Q" + precio);
        System.out.println("Tamaño: " + tamanoArchivo + " MB");
    }
}