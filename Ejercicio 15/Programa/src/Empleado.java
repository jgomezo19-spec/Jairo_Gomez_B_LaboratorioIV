public abstract class Empleado {

    protected String nombre;
    protected double pago;

    public Empleado(String nombre, double pago) {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }

        if (pago < 0) {
            throw new IllegalArgumentException("El pago no puede ser negativo");
        }

        this.nombre = nombre;
        this.pago = pago;
    }

    public abstract double calcularPago();

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Pago: Q" + calcularPago());
    }
}