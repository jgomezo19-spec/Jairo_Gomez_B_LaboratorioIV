import java.util.Scanner;

public class EntradaNumerica {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Ingrese un número: ");
            int numero = scanner.nextInt();

            System.out.println("Número ingresado: " + numero);

        } catch (Exception e) {

            System.out.println("Error: Debe ingresar un número válido");

        } finally {

            scanner.close();
        }
    }
}