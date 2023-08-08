package com.mycompany.primosinteligentes;

public class HyperPrimos 
{
	public static void main(String[] args) 
	{
		//definimos un vector que contabilizar� la cantidad de divisores
		int n = 2000000;
		int[] divisores =new int[n+1];
		for(int i=2; i<=divisores.length/2 ;i++)
		{
			for(int j = i*2; j<divisores.length ; j=j+i)
				divisores[j]++;
		}
		//mostramos el vector de divisores sumandole 2, porque todo numero es
		//divisible entre 1 y si mismo
		for(int i=2 ; i<divisores.length ; i++)
			if(divisores[i]==3)
			System.out.println("Divisores["+i+"]="+(divisores[i]+2));
		int maximo =0, valor_i=0;
		for(int i=2 ; i<divisores.length ; i++)
			if(divisores[i]>maximo)
			{
				maximo = divisores[i];
				valor_i = i;
			}
		System.out.println("La maxima de divisores es:"+maximo+" para el valor "+valor_i);
	}

}
