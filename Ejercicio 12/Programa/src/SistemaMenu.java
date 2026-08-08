import java.util.Scanner;

public class SistemaMenu {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Sumar");
        System.out.println("2. Restar");

        System.out.print("Seleccione una opción: ");
        int opcion = scanner.nextInt();

        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();

        switch (opcion) {

            case 1:
                System.out.println("Resultado: " + (numero1 + numero2));
                break;

            case 2:
                System.out.println("Resultado: " + (numero1 - numero2));
                break;

            default:
                System.out.println("Opción no válida");
        }

        scanner.close();
    }
}