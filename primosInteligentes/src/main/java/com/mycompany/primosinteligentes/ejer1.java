/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.palindrome;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Usuario
 */
public class ejer1 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("introduzca frase");
        Scanner entrada=new Scanner(System.in);
        String palabra=entrada.nextLine();     
        String[] parts = palabra.split(" ");
        boolean sies=true;

//System.out.println(parts.length);
int temp[]= new int[parts.length];
for (int i = 0; i < parts.length; i++) {
  //System.out.println(parts[i]);
  //System.out.println(i);
  String s = parts[i];
        Vector myVec = new Vector();
        char[] sChars = s.toCharArray();
        for(int t = 0; t < s.length(); ++t) {
            
            myVec.add(sChars[t]);
            //System.out.println(sChars[t]);
                if(t==0){
                temp[i]=sChars[t];
                }
        }
        
                     
        }
        for(int z = 0; z < temp.length-1; z++){   
            if(temp[z]==temp[z+1]){}else{
                sies=false;
                break;}
}




if(sies==true)
        {System.out.println("Si es");
       }else
        {System.out.println("No es");
                }
    }}
    

