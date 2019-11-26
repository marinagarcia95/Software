/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Modelo.BasedeDatos;
import Modelo.Financiera;
import Modelo.Cliente;
import Modelo.Couta;
import Modelo.Credito;
import Modelo.Plan;
import Vista.Solicitar;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author mari_
 */
public class Pruebras {
    
    public Pruebras() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void Test1Credito1() {
          //Definicion
        BasedeDatos.iniciar();
        Cliente cl = new Cliente("jordan", "ismael", 1234, 582, "Salta");
        Credito cr = new Credito(0.5, new Plan("adelantada", 6, 10000), "SI");
        cl.agregarCr(cr);
        double total;
          // ejecucion 
        cr.calcularTotal();
        total = cr.getTotalCr();
          // comprobacion 
        assertEquals(15000, total, 0);
        }
    
     @Test
     public void Test2Credito2(){
          //Definicion
        BasedeDatos.iniciar();
        Cliente cl1= new Cliente("Dante", "Eduardo", 145, 789, "Bulnes");
        Credito cr1= new Credito(0.8, new Plan("Adelantada", 8, 5000), "SI");
        cl1.agregarCr(cr1);
        double valorCuota;
          //ejecucion
        cr1.generarCuo();
        valorCuota = cr1.getValorCuo();
           // comprobacion
        //totalCr 9000
         assertEquals(529, valorCuota, 0);
        
    }
     
     @Test
     public void Test3Credito3(){
        BasedeDatos.iniciar();
        Cliente cl2= new Cliente("Gomez", "Micaela", 145, 789, "Bulnes");
        Credito cr2= new Credito(0.5, new Plan("Adelantada", 6, 5000), "SI");
        cl2.agregarCr(cr2);
        double valorCuota;
          //ejecucion
        cr2.generarCuo();
        valorCuota = cr2.getValorCuo();
           // comprobacion
        //totalCr 7500
         assertEquals(1875, valorCuota, 0);
         
     
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
