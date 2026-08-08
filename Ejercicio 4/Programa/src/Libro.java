public class Libro extends Material {

    private String autor;

    public Libro(String titulo, String autor) {
        super(titulo);
        this.autor = autor;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Tipo: Libro");
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
    }
}