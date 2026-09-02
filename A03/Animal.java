public class Animal {
    private String nombre;
    private String comida;

    public Animal(String nombre, String comida) {
        this.nombre = nombre;
        this.comida = comida;
    }

    public void hacerSonido() {
        System.out.println("El animal hace un sonido.");
    }

    public void mostrarInfo() {
        System.out.print(nombre + " come " + comida + " y hace: ");
        hacerSonido();
    }
}