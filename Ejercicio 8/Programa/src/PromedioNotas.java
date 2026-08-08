import java.util.Scanner;

public class PromedioNotas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] notas = new double[5];
        double suma = 0;

        for (int i = 0; i < notas.length; i++) {

            System.out.print("Ingrese la nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();

            suma += notas[i];
        }

        double promedio = suma / notas.length;

        System.out.println("Suma de notas: " + suma);
        System.out.println("Promedio: " + promedio);

        scanner.close();
    }
}