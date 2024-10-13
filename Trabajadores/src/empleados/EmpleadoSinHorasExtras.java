package empleados;

class EmpleadoSinHorasExtras extends Empleado {

    public EmpleadoSinHorasExtras(int horasTrabajadas, double sueldoPorHora) {
        super(horasTrabajadas, sueldoPorHora);
    }

    // Sobrescribe el método para calcular salario sin horas extras
    @Override
    public double calcularSalario() {
        return super.getHorasTrabajadas() * super.getSueldoPorHora();
    }
}
