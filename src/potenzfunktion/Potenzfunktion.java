/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package potenzfunktion;

/**
 *
 * @author maili
 */
public class Potenzfunktion {

    
    public static void main(String[] args) {
        
        System.out.println(potenz(2,10 ));
    }
    
    public static double potenz(int zahl, int pot) {
        if (pot==1) {
             return zahl;
        } 
        
        else if (pot == 0){
            return 1;
        }
        
        else if(pot < 1){
            pot *= -1;
          return 1/(zahl * potenz(zahl,pot-1));
        }
        
        else {
           return zahl*potenz(zahl,pot-1);
         }
        
        
        
        
        
}
    
}
