/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

/**
 *
 * @author Cristhian
 */
public class Directivo {

    Empleado empleado = new Empleado();
    String categoria;

    public Directivo() {
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String mostrar(String nombre, int edad, double sueldo_bruto, String categoria) {
        return empleado.mostrar(nombre, edad, sueldo_bruto) + " " + categoria;

    }
}
