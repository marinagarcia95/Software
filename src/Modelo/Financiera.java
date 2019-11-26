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
public class Financiera {
    private String nomF;
    private String rs;
    private String domF;
    private int cuit;
    private ArrayList<Cliente> clientes=new ArrayList();
    
    
    public Financiera(String nomF, String rs, String domF, int cuit) {
        this.nomF = nomF;
        this.rs = rs;
        this.domF = domF;
        this.cuit = cuit;
    }

    public Financiera() {
    nomF="La Prestadita";
    rs="Financiera";
    domF="Salta";
    cuit=1234;
    }
    
    

    
    public String getNomF() {
        return nomF;
    }

    public void setNomF(String nomF) {
        this.nomF = nomF;
    }

    public String getRs() {
        return rs;
    }

    public void setRs(String rs) {
        this.rs = rs;
    }

    public String getDomF() {
        return domF;
    }

    public void setDomF(String domF) {
        this.domF = domF;
    }

    public int getCuit() {
        return cuit;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    @Override
    public String toString() {
        return "Financiera{" + "nomF=" + nomF + ", rs=" + rs + ", domF=" + domF + ", cuit=" + cuit + '}';
    }
    
        public void agregar(Cliente cl){
        BasedeDatos.clientes.add(cl);
            
    }
    
    public void borrar(Cliente cl){
        BasedeDatos.clientes.remove(cl);
    }
    
    public void borrar(int index){
        BasedeDatos.clientes.remove(index);
    }
    
    private Cliente clienteActivo;

    public Cliente getClienteActivo() {
        return clienteActivo;
    }
    
  
 
    public boolean buscarCliente(int DNI){
        for(Cliente cl: BasedeDatos.clientes){
            if(DNI == cl.getDNI()){
                clienteActivo=cl;
                return true;
            }
            
        }
        return false;
    }
    
      public Empleado empleadoActivo;

    public Empleado getEmpleadoActivo() {
        return empleadoActivo;
    }
    
//    public boolean buscarEmpleado(int legE){
//        for (Empleado e : BasedeDatos.empleados){
//            if(legE == e.getLegE()){
//                empleadoActivo =e;
//                return true;
//    }
//    }
//        return false;
//        }
    
    public ArrayList<Cliente>listaClientes(){
        return BasedeDatos.clientes;
    }
    
 }


