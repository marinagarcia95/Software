/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Vista.Login;

/**
 *
 * @author mari_
 */
public class FinancieraSoft {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BasedeDatos.iniciar();
        Login log= new Login();
        log.setVisible(true);
        
    }
    
}
