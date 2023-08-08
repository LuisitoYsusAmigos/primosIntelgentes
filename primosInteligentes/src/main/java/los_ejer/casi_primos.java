/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package los_ejer;

import static com.mycompany.primosinteligentes.nprimos.criba;

/**
 *
 * @author Usuario
 */
public class casi_primos {
    
     public static int Nprimo(int n){
          int temp=1;
        int otro=2;
       while(temp<=n){
       if(criba(otro)){
       //System.out.println(otro);
       temp++;       
       }
       otro++;
       
       }
        return otro;
     
     }

   public static boolean verificador(int x, int primo){
        while(x>=1){
        if(x%primo==0){
        x=x/primo;
        }else{
        return false;
        
        }
        //System.out.println(x);
        if(x==1){            
            return true;}
        }
       return false;
        
   
   }
   public static boolean verificador2(int x){
              for(int i = 1; i <= Math.ceil(Math.sqrt(i)); i = i + 1)
{
      verificador(x,Nprimo(i));
      if(verificador(x,Nprimo(i))){
      //System.out.println("si");
      return true;
      }
}
 
       
       
       
         return false;
   }
   
    public static void main(String[] args) {
        
        int cont=0;
        
        int limite_superior=10;
         int limite_inferior=1;
        for(int i = limite_inferior; i <= limite_superior; i = i + 1)
        {
            if(verificador2(i)){
            cont=cont+1;}

        }
        System.out.println(cont);
       
       
    }
    
}
