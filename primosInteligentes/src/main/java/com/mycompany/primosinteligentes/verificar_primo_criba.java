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
public class verificar_primo_criba {   
  
    
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
        System.out.println("si es") ;   
    return true;
    }
  
    
        
         System.out.println("no es") ; 
        return false;
       
    }


    }
    

