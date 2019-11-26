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
public class Empleado {
    private int legE;
    private String nomE;
    private String apE;

    public Empleado(int legE) {
        this.legE = legE;
    }

    public int getLegE() {
        return legE;
    }

    public void setLegE(int legE) {
        this.legE = legE;
    }

    public String getNomE() {
        return nomE;
    }

    public void setNomE(String nomE) {
        this.nomE = nomE;
    }

    public String getApE() {
        return apE;
    }

    public void setApE(String apE) {
        this.apE = apE;
    }

    @Override
    public String toString() {
        return "Empleado{" + "legE=" + legE + ", nomE=" + nomE + ", apE=" + apE + '}';
    }

    
    
}
