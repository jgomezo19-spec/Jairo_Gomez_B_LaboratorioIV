import java.util.Scanner;

public class DivisionSegura {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Ingrese el primer número: ");
            double numero1 = scanner.nextDouble();

            System.out.print("Ingrese el segundo número: ");
            double numero2 = scanner.nextDouble();

            if (numero2 == 0) {
                throw new ArithmeticException("No se puede dividir entre cero");
            }

            double resultado = numero1 / numero2;

            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {

            System.out.println("Error: " + e.getMessage());

        } catch (Exception e) {

            System.out.println("Error: Ingrese valores numéricos válidos");

        } finally {

            scanner.close();
        }
    }
}
