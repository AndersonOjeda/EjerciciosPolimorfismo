package empleados;

class EmpleadoConHorasTriples extends Empleado {
    private int horasTriples;

    public EmpleadoConHorasTriples(int horasTrabajadas, double sueldoPorHora, int horasTriples) {
        super(horasTrabajadas, sueldoPorHora);
        this.horasTriples = horasTriples;
    }

    // Sobrescribe el método para incluir horas triples
    @Override
    public double calcularSalario() {
        // Salario normal + salario por horas triples
        return (super.getHorasTrabajadas() * super.getSueldoPorHora()) +
               (horasTriples * super.getSueldoPorHora() * 3);
    }
}

