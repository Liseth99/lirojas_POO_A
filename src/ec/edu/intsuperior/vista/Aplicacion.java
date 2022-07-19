
package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.modelo.*;
import java.util.Scanner;

public class Aplicacion {

      public static void main(String[] args) {
        /*========== objetos ==========*/
        Scanner sc = new Scanner(System.in);
        Persona perEmp = new Persona();
        Persona perCli = new Persona();
        Cliente cli = new Cliente();
        Directivo dir = new Directivo();
        Empresa emp = new Empresa();

        /*========== VARIABLES ==========*/
        String empNombres, dirCartegoria, empreNombre;
        int empEdad, empDias, empHoras;
        String cliNombres, cliTelefono;
        int cliEdad;
        /*========== LOGICA EMPLEADOS ==========*/
        System.out.println("Ingrese los datos de la empresa");
        System.out.println("Nombre de la empresa:");
        empreNombre = sc.next();
        if (empreNombre != null) {
            System.out.println("Ingrese los datos del empleado de la empresa " + empreNombre);
            System.out.println("Nombre:");
            empNombres = sc.next();
            System.out.println("Edad:");
            empEdad = sc.nextInt();
            perEmp.setPerNombre(empNombres);
            perEmp.setPerEdad(empEdad);
            System.out.println("Categoria:");
            dirCartegoria = sc.next();
            System.out.println("Dias trabajados:");
            empDias = sc.nextInt();
            System.out.println("Horas trabajados trabajadas en " + empDias + " dias:");
            empHoras = sc.nextInt();
            /*========== MOSTRAR EMPLEADO ==========*/
            System.out.println("======================================");
            dir.mostrar(perEmp, empDias, empHoras, dirCartegoria);
            System.out.println("======================================");
            /*========== LOGICA CLIENTES ==========*/
            System.out.println("Ingrese los datos del cliente que visita " + empreNombre);
            System.out.println("Nombre:");
            cliNombres = sc.next();
            System.out.println("Edad:");
            cliEdad = sc.nextInt();
            System.out.println("Telefono:");
            cliTelefono = sc.next();
            perCli.setPerNombre(cliNombres);
            perCli.setPerEdad(cliEdad);
            /*========== MOSTRAR CLIENTE ==========*/
            System.out.println("======================================");
            cli.mostrar(perCli, cliTelefono);
            System.out.println("======================================");
        } else {
            System.out.println("NO EXISTE LA EMPRESA");
        }
    }

}
