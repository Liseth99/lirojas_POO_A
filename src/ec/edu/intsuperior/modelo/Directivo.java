
package ec.edu.intsuperior.modelo;

public class Directivo  extends Empleado {

     String dirCategoria;

    public Directivo() {
    }

    public String getDirCategoria() {
        return dirCategoria;
    }

    public void setDirCategoria(String dirCategoria) {
        this.dirCategoria = dirCategoria;
    }

    public void mostrar(Persona persona, int dias, int horas, String dirCategoria) {
        System.out.println("Los datos del empleado son:");
        System.out.println("Nombre: " + persona.getPerNombre());
        System.out.println("Edad: " + persona.getPerEdad());
        System.out.println("Categoria: " + dirCategoria);
        System.out.println("Su sueldo neto es: " + calcular_salario_neto(dias, horas));
    }

}
