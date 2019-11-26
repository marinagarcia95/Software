/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author mari_
 */
public class Credito {
   
    private int nroCr;
    private static int id=1;
    private double totalCr;
    private double valorCuo;
    private double interes;
    private Plan plan;
    private ArrayList<Couta> cuotas= new ArrayList();
    private ArrayList<Pago> pagos  = new ArrayList();
    private ArrayList<Empleado> empleados = new ArrayList();
    private String cuopagada;

    public Credito( double interes, Plan plan, String cuopagada) {
        this.nroCr = id;
        id++;
        this.interes = interes;
        this.plan = plan;
        this.cuopagada=cuopagada;
    }



    public int getNroCr() {
        return nroCr;
    }

    public void setNroCr(int nroCr) {
        this.nroCr = nroCr;
    }

    public ArrayList<Couta> getCuotas() {
        return cuotas;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public ArrayList<Pago> getPlanes() {
        return pagos;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    public String getCuopagada() {
        return cuopagada;
    }

    public void setCuopagada(String cuopagada) {
        this.cuopagada = cuopagada;
    }

    public double getTotalCr() {
        calcularTotal();
        return totalCr;
    }

    public void setTotalCr(double totalCr) {
        this.totalCr = totalCr;
        
    }
    
    public double getValorCuo(){
        return valorCuo;
    }
    
    public void setValorCuo(double valorCuo){
        this.valorCuo= valorCuo;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }
    
    

    @Override
    public String toString() {
        return "Credito{" + "nroCr=" + nroCr + ", interes=" + interes + ", plan=" + plan + ", cuotas=" + cuotas + ", pagos=" + pagos + ", cuopagada=" + cuopagada +", empleado=" + empleados + '}';
    }
    
    
   public void calcularTotal(){
       
       totalCr=plan.getMontoSol()+(plan.getMontoSol() *interes);
       }
 //  public void calcularMontoCuota(){
//       double mc;
  //     for (Couta cuo : cuotas) {
////           mc=t/cuo.getCntCuo();
//        }
//    
    
//    }
  public void generarCuo(){
      
      Calendar cal= Calendar.getInstance();
      for(int cuota=1; cuota<=plan.getCntCuo();cuota++){
          double valorCuo =(totalCr/plan.getCntCuo())*(1+interes);
          
          String pagada=cuopagada;
          if(cuota>1)pagada="NO";
          cuotas.add(new Couta(cuota, cal.getTime(), valorCuo,pagada));
          cal.add(Calendar.MONTH, 1);
      }
  } 
   
             
}
