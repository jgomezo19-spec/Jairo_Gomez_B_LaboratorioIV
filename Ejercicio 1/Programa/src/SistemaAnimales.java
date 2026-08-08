public class SistemaAnimales {

    public static void main(String[] args) {

        Animal animal1 = new Perro("Max");
        Animal animal2 = new Gato("Luna");

        animal1.hacerSonido();
        animal2.hacerSonido();
    }
}