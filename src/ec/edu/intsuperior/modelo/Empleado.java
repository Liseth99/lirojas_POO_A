
package ec.edu.intsuperior.modelo;


public class Empleado {

    double empSueldoBruto;

    public Empleado() {
    }

    public double getEmpSueldoBruto() {
        return empSueldoBruto;
    }

    public void setEmpSueldoBruto(double empSueldoBruto) {
        this.empSueldoBruto = empSueldoBruto;
    }

    public void mostrar(Persona persona, int dias, int horas) {
        System.out.println("Los datos del empleado son:");
        System.out.println("Nombre: " + persona.getPerNombre());
        System.out.println("Edad: " + persona.getPerEdad());
        System.out.println("Su sueldo neto es: " + calcular_salario_neto(dias, horas));
    }

    public double calcular_salario_neto(int dias, int horas) {
        int respuesta = dias * horas;
        return respuesta;
    }

}
