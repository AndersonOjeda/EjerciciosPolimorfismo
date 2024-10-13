package empleados;

public class Main {
    public static void main(String[] args) {
        // Empleado sin horas extras
        Empleado empleado1 = new EmpleadoSinHorasExtras(40, 10);
        System.out.println("Salario Empleado sin horas extras: " + empleado1.calcularSalario());

        // Empleado con horas dobles
        Empleado empleado2 = new EmpleadoConHorasDobles(40, 10, 5);
        System.out.println("Salario Empleado con horas dobles: " + empleado2.calcularSalario());

        // Empleado con horas triples
        Empleado empleado3 = new EmpleadoConHorasTriples(40, 10, 3);
        System.out.println("Salario Empleado con horas triples: " + empleado3.calcularSalario());
    }
}