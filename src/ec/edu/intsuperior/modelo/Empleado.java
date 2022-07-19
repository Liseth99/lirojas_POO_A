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
public class Empleado {

    Persona persona = new Persona();
    Double sueldo_bruto;

    public Empleado() {
    }

    public Double getSueldo_bruto() {
        return sueldo_bruto;
    }

    public void setSueldo_bruto(Double sueldo_bruto) {
        this.sueldo_bruto = sueldo_bruto;
    }

    public String mostrar(String nombre, int edad, double sueldo_bruto) {
        return persona.mostrar(nombre, edad) + " " + sueldo_bruto;
    }

    public Double calcularSueldo(int Dias, int Horas){
        double respuesta;
        respuesta = Dias * Horas;
        return respuesta;
    }
    
}
