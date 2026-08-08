public class SistemaBiblioteca {

    public static void main(String[] args) {

        Material material1 = new Libro("Don Quijote", "Miguel de Cervantes");
        Material material2 = new Revista("National Geographic", 25);

        material1.mostrarInformacion();

        System.out.println();

        material2.mostrarInformacion();
    }
}