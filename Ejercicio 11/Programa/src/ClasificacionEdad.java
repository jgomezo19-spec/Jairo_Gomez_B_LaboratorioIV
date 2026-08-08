import java.util.Scanner;

public class ClasificacionEdad {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        if (edad >= 0 && edad <= 12) {

            System.out.println("Niño");

        } else if (edad >= 13 && edad <= 17) {

            System.out.println("Adolescente");

        } else if (edad >= 18) {

            System.out.println("Adulto");

        } else {

            System.out.println("Edad no válida");
        }

        scanner.close();
    }
}