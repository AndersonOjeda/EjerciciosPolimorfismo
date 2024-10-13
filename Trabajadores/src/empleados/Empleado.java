package empleados;

class Empleado {
    private int horasTrabajadas;
    private double sueldoPorHora;

    // Constructor
    public Empleado(int horasTrabajadas, double sueldoPorHora) {
        this.horasTrabajadas = horasTrabajadas;
        this.sueldoPorHora = sueldoPorHora;
    }

    // Getters y Setters
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getSueldoPorHora() {
        return sueldoPorHora;
    }

    public void setSueldoPorHora(double sueldoPorHora) {
        this.sueldoPorHora = sueldoPorHora;
    }

    // Método virtual para calcular el salario (será sobrescrito por las subclases)
    public double calcularSalario() {
        return horasTrabajadas * sueldoPorHora;
    }
}