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
public class Cliente {
    private String apC;
    private String nomC;
    private int DNI;
    private int tel;
    private String dom;
    private ArrayList<Credito> creditos= new ArrayList();

    public Cliente(String apC, String nomC, int DNI, int tel, String dom) {
        this.apC = apC;
        this.nomC = nomC;
        this.DNI = DNI;
        this.tel = tel;
        this.dom = dom;
    }

    public String getApC() {
        return apC;
    }

    public void setApC(String apC) {
        this.apC = apC;
    }

    public String getNomC() {
        return nomC;
    }

    public void setNomC(String nomC) {
        this.nomC = nomC;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public String getDom() {
        return dom;
    }

    public void setDom(String dom) {
        this.dom = dom;
    }

    public ArrayList<Credito> getCreditos() {
        return creditos;
    }
    
    
    @Override
    public String toString() {
        return "Cliente{" + "apC=" + apC + ", nomC=" + nomC + ", DNI=" + DNI + ", tel=" + tel + ", dom=" + dom + '}';
    }
    
    public void agregarCr(Credito cr){
        creditos.add(cr);
    }
    
    public void borrarCr(Credito cr){
        creditos.remove(cr);
    }
    
    public void borrarCr(int index){
        creditos.remove(index);
    }
}
