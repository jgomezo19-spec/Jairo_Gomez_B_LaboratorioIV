public class SistemaProductos {

    public static void main(String[] args) {

        Producto producto1 =
                new ProductoFisico("Laptop", 5000, 2.5);

        Producto producto2 =
                new ProductoDigital("Curso de Java", 250, 800);

        producto1.mostrarInformacion();

        System.out.println();

        producto2.mostrarInformacion();
    }
}