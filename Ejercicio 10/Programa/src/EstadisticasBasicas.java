import java.util.Scanner;

public class EstadisticasBasicas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] numeros = new double[5];
        double suma = 0;

        for (int i = 0; i < numeros.length; i++) {

            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();

            suma += numeros[i];
        }

        double mayor = numeros[0];
        double menor = numeros[0];

        for (int i = 1; i < numeros.length; i++) {

            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }

            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        double promedio = suma / numeros.length;

        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + promedio);
        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);

        scanner.close();
    }
}
