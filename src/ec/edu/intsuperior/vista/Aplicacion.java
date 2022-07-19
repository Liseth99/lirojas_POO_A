/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.modelo.*;
import java.util.Scanner;

/**
 *
 * @author Cristhian
 */
public class Aplicacion {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        Persona p1 = new Persona();
        Cliente cliente = new Cliente();
        Empresa empresa = new Empresa();
        Empleado empleado = new Empleado();
        Directivo directivo = new Directivo();
        String nombreEmpledo, clienteTelefono, nombreCliente, nombrePersona, nombreDirectivo, cargoDirectivo, nombreEmpresa;
        Integer edadPersona, edadCliente, edadEmpleado, edadDirectivo, dias, horas, diasDirectivo, horasDirectivo;
        Double sueldoEmpleado;

        System.out.println("Ingresar el nombre de la persona");
        nombrePersona = sn.next();
        System.out.println("Ingresar la edad de la persona");
        edadPersona = sn.nextInt();
        System.out.println("Ingresar el nombre del cliente");
        nombreCliente = sn.next();
        System.out.println("Ingresar la edad del cliente");
        edadCliente = sn.nextInt();
        System.out.println("Ingresar el numero de telefono del cliente");
        clienteTelefono = sn.next();
        System.out.println("Ingresar el nombre de la empleado");
        nombreEmpledo = sn.next();
        System.out.println("Ingresar la edad del empleado");
        edadEmpleado = sn.nextInt();
        System.out.println("Ingresar el nombre de la empleado");
        edadEmpleado = sn.nextInt();
        System.out.println("Ingresar las horas laboradas");
        horas = sn.nextInt();
        System.out.println("Ingresar los dias laborados");
        dias = sn.nextInt();
        System.out.println("Ingresar el nombre del directivo");
        nombreDirectivo = sn.next();
        System.out.println("Ingresar la edad del directivo");
        edadDirectivo = sn.nextInt();
        System.out.println("Ingresar las horas laboradas");
        horasDirectivo = sn.nextInt();
        System.out.println("Ingresar los dias laborados");
        diasDirectivo = sn.nextInt();
        System.out.println("Ingresar el nombre de la empresa:");
        nombreEmpresa = sn.next();
        System.out.println("");
        System.out.println("====================");
        System.out.println("");

        System.out.println("====================");

        System.out.println("Persona: " + p1.mostrar(nombrePersona, edadPersona) + "\n"
                + "Cliente: " + cliente.mostrar(nombreCliente, 34, clienteTelefono) + "\n"
                + "Empleado: " + empleado.mostrar(nombreEmpledo, edadEmpleado, empleado.calcularSueldo(dias, horas)) + "\n"
                + "Directivo: " + directivo.mostrar(nombreDirectivo, edadDirectivo, empleado.calcularSueldo(diasDirectivo, horasDirectivo), "administrador") + "\n"
                + "Empresa : " + empresa.mostrar(nombreEmpresa));
    }
}
