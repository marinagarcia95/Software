/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author mari_
 */
public class Couta {
    
    private int nroCuo;
    private Date diaVen;
    private double precioCuo;
    private String estado;

    public Couta(int nroCuo, Date diaVen, double precioCuo, String estado) {
        this.nroCuo = nroCuo;
        this.diaVen = diaVen;
        this.precioCuo = precioCuo;
        this.estado = estado;
    }
     
    

   
    public int getNroCuo() {
        return nroCuo;
    }

    public void setNroCuo(int nroCuo) {
        this.nroCuo = nroCuo;
    }

    public Date getDiaVen() {
        return diaVen;
    }

    public void setDiaVen(Date diaVen) {
        this.diaVen = diaVen;
    }

    public double getPrecioCuo() {
        return precioCuo;
    }

    public void setPrecioCuo(double precioCuo) {
        this.precioCuo = precioCuo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
        

    

    public void calcularFecVen(){
        
    }    
}
