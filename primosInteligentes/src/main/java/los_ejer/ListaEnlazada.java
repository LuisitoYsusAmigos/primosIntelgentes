package los_ejer;

public class ListaEnlazada 
{
    //defino 2 variables de intancia que son las referencias (direcciones de memoria) del nodo primero y �ltimo
	Nodo primero;
	Nodo ultimo;
	
	static class Nodo
	{
		int dato;
		Nodo puntero;
	}
	
	public void agregarNodoEnLista(int valor)
	{
		Nodo nuevoNodo = new Nodo();
		nuevoNodo.dato = valor;
		nuevoNodo.puntero = null;
		//verifico si existe alg�n nodo
		if(this.primero==null)
		{
			this.primero = nuevoNodo;
			this.ultimo = nuevoNodo;
		}
		else
		{
			this.ultimo.puntero = nuevoNodo;
			this.ultimo = nuevoNodo;
		}
	}
	public void mostrarLista()
	{
		if(this.primero==null)
			System.out.println("La Lista Enlazada est� vacia");
		else
		{
			Nodo aux = this.primero;
			while(aux!=null)
			{
				System.out.print(aux.dato+"->");
				aux = aux.puntero;
			}
			System.out.println("null");
		}
	}
	
	public static void main(String[] args) 
	{
		ListaEnlazada lista = new ListaEnlazada();
		lista.mostrarLista();
		lista.agregarNodoEnLista(2);
		lista.agregarNodoEnLista(9);
		lista.agregarNodoEnLista(5);
		lista.agregarNodoEnLista(4);
		lista.mostrarLista();
		lista.primero = lista.primero.puntero;//elimino el primer elemento de mi lista enlazada
		lista.mostrarLista();
		
	}

}
