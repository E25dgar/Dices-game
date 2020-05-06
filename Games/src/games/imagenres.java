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
                  icoImagen = new ImageIcon("images/uno.png");
                  break;
            
          case 2:
                  icoImagen = new ImageIcon("images/dos.png");
                 break;
                 
                  
           case 3:
                  icoImagen = new ImageIcon("images/tres.png");
                  
                  break;
            case 4:
                  icoImagen = new ImageIcon("images/cuatro.png");      
          
                  break;
                  
            case 5:
                  icoImagen = new ImageIcon("images/cinco.png");   
                  
                  break;
                  
                  
            case 6:
                  icoImagen = new ImageIcon("images/seis.png"); 
                  
                  break;
      } 
        
        return icoImagen;
    }
}
