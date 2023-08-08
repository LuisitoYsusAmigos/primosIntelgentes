/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.palindrome;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */

public class ejer2 {
    public static int[] burbuja(int[] arreglo)
    {
      int auxiliar;
      int[] arregloOrdenado;
      for(int i = 2; i < arreglo.length; i++)
      {
        for(int j = 0;j < arreglo.length-i;j++)
        {
          if(arreglo[j] > arreglo[j+1])
          {
            auxiliar = arreglo[j];
            arreglo[j] = arreglo[j+1];
            arreglo[j+1] = auxiliar;
          }   
        }
      }
      arregloOrdenado = arreglo;
      return arregloOrdenado;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
		// Lo primero ser� leer los casos de ejer2 T
		int T = entrada.nextInt();
		for(int i=0; i<T; i++)
		{
			//N es la cantidad de regalos
			//M es el peso m�ximo
			int N = entrada.nextInt();
			int M = entrada.nextInt();
			int[] X = new int[N];
			for(int j=0 ; j<N ; j++)
				X[j] = entrada.nextInt();
                                ejer2.burbuja(X);
			//se debe ordenar el vector
			int suma = 0;
			int contador = 0;
			for(int j=0 ; j<N ; j++)
			{
				//suma = suma + X[j];
				suma += X[j];
				contador++;
				if(suma>M)
				{
					contador--;
					break;
				}
			}
			System.out.println(contador);
		}
		

	}
    }
    

