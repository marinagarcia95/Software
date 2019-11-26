/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author mari_
 */
public class Plan {
    private String modalidad;
    private int cantCuo;
    private double montoSol;

    public Plan(String modalidad,int cantCuo, double montoSol) {
        this.modalidad = modalidad;
        this.cantCuo= cantCuo;
        this.montoSol= montoSol;
    }

    public String getModalidad() {
        return modalidad;
    }
     public int getCntCuo() {
        return cantCuo;
    }

    public void setCantCuo(int cantCuo) {
        this.cantCuo = cantCuo;
    }


    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public double getMontoSol() {
        return montoSol;
    }

    public void setMontoSol(double montoSol) {
        this.montoSol = montoSol;
    }
    

   
   
    
    
    
}
