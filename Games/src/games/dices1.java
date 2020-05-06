package games;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Random;

/**
 *
 * @author Andres
 */
public class dices1 {
    
    public int valortirar;
    public int calculanumero(){
        
        Random generar = new Random();
       valortirar = generar.nextInt(6) + 1 ;
        
       return valortirar;
        
        
    }
    
    
}
