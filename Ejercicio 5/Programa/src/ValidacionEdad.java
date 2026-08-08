import java.util.Scanner;

public class ValidacionEdad {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Ingrese su edad: ");
            int edad = scanner.nextInt();

            if (edad < 0) {
                throw new Exception("La edad no puede ser negativa");
            }

            System.out.println("Edad ingresada: " + edad);

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

        } finally {

            scanner.close();
        }
    }
}