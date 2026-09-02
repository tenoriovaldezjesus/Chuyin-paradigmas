public class Perro extends Animal {
    public Perro() {
        super("Perro", "Croquetas");
    }

    @Override
    public void hacerSonido() {
        System.out.println("\"¡Guau Guau!\"");
    }
}