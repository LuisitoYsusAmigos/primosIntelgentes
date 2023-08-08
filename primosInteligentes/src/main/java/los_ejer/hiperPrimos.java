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
public class hiperPrimos {
    
     public static int amigo(int n){
       int total=0;
        for(int i = 1; i <= Math.sqrt(n); i++) 
      { 
          if(n % i == 0)
          { 
              //System.out.print(i + ", ");
            total=total+1;
          if(i != n/i) {
              total=total+1;
              //System.out.print(n/i + ", "); 
           } 
          } 
      } 
       return total;
   }

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
         //System.out.println("no es") ;
    
        return temp+1==n;
       
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
       if(criba(amigo(n))){
       System.out.print("es super primo cuenta con "+amigo(n)+" divisiores");
       
       }else{
       System.out.print("no es super primo "+amigo(n)+" divisiores");
       
       }
       
        
  
    }
    
}
