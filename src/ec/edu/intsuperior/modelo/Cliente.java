
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
public class Cliente extends Persona {
    String cliTelefono;

    public Cliente() {
    }

    public String getCliTelefono() {
        return cliTelefono;
    }

    public void setCliTelefono(String cliTelefono) {
        this.cliTelefono = cliTelefono;
    }

    public void mostrar(Persona persona, String cliTelefono) {
        System.out.println("Los datos del cliente son:");
        System.out.println("Nombre: " + persona.getPerNombre());
        System.out.println("Edad: " + persona.getPerEdad());
        System.out.println("Telefono: " + cliTelefono);
    }
}
