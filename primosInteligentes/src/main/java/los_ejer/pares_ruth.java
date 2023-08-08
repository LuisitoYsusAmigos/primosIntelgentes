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
public class pares_ruth {
    

    public static boolean criba(int n){
    n=n+1;
    int temp = 0 ;
         
        int[] criba = new int [n];
        //iniciamos el algoritmo para encontrar los valores de la criba
        for(int i=2; i<=Math.sqrt(n); i++)
        {
            if(criba[i]==0){
            //preguntamo si el valor del sub indice que son multiplos 
            //debemos convertir en 1 todos los subindices que son multiplos de 1
            for(int j =i*2; j<n ; j=j+i)
                criba[j]=1;
            }
          }
    //mostrmoa los valores que los subindices que tiene un valor 0
    //esos eran los numeros
    for(int i=2 ; i<n; i++){
        if(criba[i]==0)
            temp=i;
        //System.out.println(i) ;
       // System.out.println("hey") ;        
         }
    
    if(temp+1==n){
        
        //System.out.println("si es") ;   
    return true;
    }
  
    
        
         //System.out.println("no es") ; 
        return false;
       
    }
    public static int prueba_ruth(int x)
    { 
        int temp=0;
  
  
      for(int i = 2; i <= x; i++){
         
          if(criba(i)){
            if(x%i==0){
            x=x/i;
            //System.out.println(i);
            temp=i+temp;
            }  
          }
        }
        //System.out.println(temp);
       return temp;
    }
    
    public static boolean prueba_ruth_par(int x, int y){
        if(prueba_ruth(x)==prueba_ruth(y)){
        System.out.println((x+" + "+y)); 
        return true; }else{
        return false; }
           
    }
    
    
    public static void main(String[] args) {
        for(int i = 1; i <= 20000; i = i + 1)
{
    int y=i+1;
        prueba_ruth_par(i,y);
}

        
    }
}
    

