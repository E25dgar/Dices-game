package games;

import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andres
 */
public class imagenres {
    
       
    public ImageIcon icoImagen;
    public ImageIcon Imaen(int vDice){
        
      
          switch (vDice){
           case 1:
                  icoImagen = new ImageIcon("images/1.png");
                  break;
            
          case 2:
                  icoImagen = new ImageIcon("images/2.png");
                 break;
                 
                  
           case 3:
                  icoImagen = new ImageIcon("images/3.png");
                  
                  break;
            case 4:
                  icoImagen = new ImageIcon("images/4.png");      
          
                  break;
                  
            case 5:
                  icoImagen = new ImageIcon("images/5.png");   
                  
                  break;
                  
                  
            case 6:
                  icoImagen = new ImageIcon("images/6.png"); 
                  
                  break;
      } 
        
        return icoImagen;
    }
}
