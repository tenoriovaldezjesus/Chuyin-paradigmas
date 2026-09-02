public class Caballo extends Animal {
    public Caballo() {
        super("Caballo", "Heno");
    }

    @Override
    public void hacerSonido() {
        System.out.println("\"¡Hiiihii!\"");
    }
}