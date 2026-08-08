public class EmpleadoPorHoras extends Empleado {

    private int horasTrabajadas;

    public EmpleadoPorHoras(String nombre, double pagoPorHora, int horasTrabajadas) {
        super(nombre, pagoPorHora);

        if (horasTrabajadas < 0) {
            throw new IllegalArgumentException("Las horas no pueden ser negativas");
        }

        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularPago() {
        return pago * horasTrabajadas;
    }
}