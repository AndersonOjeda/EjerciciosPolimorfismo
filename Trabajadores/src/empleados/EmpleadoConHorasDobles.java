package empleados;

class EmpleadoConHorasDobles extends Empleado {
    private int horasDobles;

    public EmpleadoConHorasDobles(int horasTrabajadas, double sueldoPorHora, int horasDobles) {
        super(horasTrabajadas, sueldoPorHora);
        this.horasDobles = horasDobles;
    }

    // Sobrescribe el método para incluir horas dobles
    @Override
    public double calcularSalario() {
        return super.getHorasTrabajadas() * super.getSueldoPorHora() + 
               (horasDobles * super.getSueldoPorHora() * 2);
    }
}
