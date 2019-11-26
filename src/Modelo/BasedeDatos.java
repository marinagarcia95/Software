/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author mari_
 */
public class BasedeDatos {
    
    public static ArrayList<Cliente> clientes = new ArrayList();
    public static ArrayList<Empleado> empleados = new ArrayList();
    
    
    public static void iniciar(){
        Cliente cl=new Cliente("Salazar", "Solana", 654, 123, "salta");
        clientes.add(cl);
        Empleado e1= new Empleado(42181);
        empleados.add(e1);
        Credito cr= new Credito(0.08, new Plan("Cuota Adelantada", 8, 10000), "SI");
       // Credito cr= new Credito(0.05, new Plan("Cuota Adelantada", 8, 10000), "SI", 10500);
        cr.generarCuo();
        cl.getCreditos().add(cr);
        cr.getEmpleados().add(e1);
    }
    
    
}
