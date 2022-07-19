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
public class Cliente {
    Persona persona=new Persona();
    String telefono_de_contacto;

    public String getTelefono_de_contacto() {
        return telefono_de_contacto;
    }

    public void setTelefono_de_contacto(String telefono_de_contacto) {
        this.telefono_de_contacto = telefono_de_contacto;
    }
    public String mostrar(String nombre, int edad, String telefono_de_contacto){
        return persona.mostrar(nombre, edad)+ " "+ telefono_de_contacto;
        
                
    }
}
