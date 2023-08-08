/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package los_ejer;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class numeros_amigos {

   public static int amigo(int n){
       int total=0;
        for(int i = 1; i <= Math.sqrt(n); i++) 
      { 
          if(n % i == 0)
          { 
              //System.out.print(i + ", ");
            total=total+i;
          if(i != n/i) {
              total=total+n/i;
              //System.out.print(n/i + ", "); 
           } 
          } 
      } 
       return total-n;
   }
    
    public static void main(String[] args) {
         
  int numero=284;
  
  if(amigo(amigo(numero))==numero){
     
     System.out.println(numero +" y "+amigo(numero));  
     }else{
    System.out.println(-1);}
      
  
  
    }
    
}
