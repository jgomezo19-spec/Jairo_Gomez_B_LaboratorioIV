public class Revista extends Material {

    private int numeroEdicion;

    public Revista(String titulo, int numeroEdicion) {
        super(titulo);
        this.numeroEdicion = numeroEdicion;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Tipo: Revista");
        System.out.println("Titulo: " + titulo);
        System.out.println("Edicion: " + numeroEdicion);
    }
}