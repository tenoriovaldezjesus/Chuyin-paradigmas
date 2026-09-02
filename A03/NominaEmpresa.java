import java.util.Locale;

// Clase abstracta base
abstract class Empleado {
    protected String nombre;
    protected String cedula;
    protected double sueldoBase;
    protected int id;
    protected static int totalEmpleados = 0;
    protected static int proximoId = 1001;

    public Empleado(String nombre, String cedula, double sueldoBase) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.sueldoBase = sueldoBase;
        this.id = proximoId++;
        totalEmpleados++;
    }
    public abstract double calcularSueldo();
    public abstract String obtenerDetalles();

    public static int obtenerTotalEmpleados() {
        return totalEmpleados;
    }
    public static void mostrarEstadisticas(double totalNomina) {
        System.out.println("----------------------------------------");
        System.out.printf(Locale.US, "Total: $%.2f%n", totalNomina);
        System.out.println("Total empleados: " + totalEmpleados);
    }
}
class Obrero extends Empleado {
    public Obrero(String nombre, String cedula, double sueldoBase) {
        super(nombre, cedula, sueldoBase);
    }

    @Override
    public double calcularSueldo() {
        return sueldoBase;
    }

    @Override
    public String obtenerDetalles() {
        return String.format(Locale.US, "[%d] %s - Obrero - $%.2f", id, nombre, calcularSueldo());
    }
}
class Supervisor extends Empleado {
    public Supervisor(String nombre, String cedula, double sueldoBase) {
        super(nombre, cedula, sueldoBase);
    }

    @Override
    public double calcularSueldo() {
        return sueldoBase * 1.15;
    }

    @Override
    public String obtenerDetalles() {
        return String.format(Locale.US, "[%d] %s - Supervisor - $%.2f", id, nombre, calcularSueldo());
    }
}
class Gerente extends Empleado {
    public Gerente(String nombre, String cedula, double sueldoBase) {
        super(nombre, cedula, sueldoBase);
    }

    @Override
    public double calcularSueldo() {
        return sueldoBase * 1.25;
    }

    @Override
    public String obtenerDetalles() {
        return String.format(Locale.US, "[%d] %s - Gerente - $%.2f", id, nombre, calcularSueldo());
    }
}
public class NominaEmpresa {
    public static void main(String[] args) {
        Empleado[] empleados = new Empleado[] {
            new Gerente("Gustavo", "123", 4000.00),
            new Gerente("CharlyHoot", "124", 4500.00),
            new Supervisor("Adonis", "125", 2500.00),
            new Supervisor("Emmanuel", "126", 2700.00),
            new Obrero("Eduardo", "127", 1500.00),
            new Obrero("Fernanda", "128", 1600.00),
            new Obrero("Kevin", "129", 1550.00),
            new Obrero("Jesus", "130", 1580.00)
        };
        double totalNomina = 0;
        for (Empleado emp : empleados) {
            System.out.println(emp.obtenerDetalles());
            totalNomina += emp.calcularSueldo();
        }
        Empleado.mostrarEstadisticas(totalNomina);
    }
}