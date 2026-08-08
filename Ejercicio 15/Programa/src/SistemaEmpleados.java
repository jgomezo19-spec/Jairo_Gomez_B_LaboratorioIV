
public class SistemaEmpleados {

    public static void main(String[] args) {

        try {

            Empleado empleado1 =
                    new EmpleadoTiempoCompleto("Carlos", 5000);

            Empleado empleado2 =
                    new EmpleadoPorHoras("Ana", 35, 40);

            empleado1.mostrarDatos();

            System.out.println();

            empleado2.mostrarDatos();

        } catch (IllegalArgumentException e) {

            System.out.println("Error: " + e.getMessage());
        }
    }
}