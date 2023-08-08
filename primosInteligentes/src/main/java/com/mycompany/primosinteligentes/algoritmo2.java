/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.primosinteligentes;

/**
 *
 * @author Usuario
 */
public class algoritmo2 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
         int [] x = {-1,2,4,-3,5,2,-5,2};         
         int n=8;     
               
         int p=0;        
        for(int a=0; a<n; a++){
          int s=0;
          
          for(int b=a; b<n; b++){
              
            s+=x[b];
            
            if (p<s) {
             p=s;
            }           
                   
          }          
        }
        System.out.print(p);
    }
    
}
