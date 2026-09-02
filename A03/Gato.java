public class Gato extends Animal {
    public Gato() {
        super("Gato", "Pescado");
    }

    @Override
    public void hacerSonido() {
        System.out.println("\"¡Miau Miau!\"");
    }
}