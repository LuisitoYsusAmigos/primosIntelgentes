package los_ejer;

public class ListaDoblementeEnlazada 
{
	//creo mis variables de instancia
	Nodo primero;
	Nodo ultimo;
	
	static class Nodo
	{
		int dato;
		Nodo anterior;
		Nodo siguiente;
	}
	
	public void agregarEnListaDoble(int valor)
	{
		Nodo nuevoNodo = new Nodo();
		nuevoNodo.dato = valor;
		nuevoNodo.anterior = null;
		nuevoNodo.siguiente = null;
		//Se pregunta si la lista est� vacia
		if(this.primero==null)
		{
			this.primero = nuevoNodo;
			this.ultimo = nuevoNodo;
		}
		else
		{
			this.ultimo.siguiente = nuevoNodo;
			nuevoNodo.anterior = this.ultimo;
			this.ultimo = nuevoNodo;
		}
	}
	public void mostrarListaDobleHaciaAdelante()
	{
		if(this.primero==null)
			System.out.println("La lista enlazada doble est� vacia");
		else
		{
			Nodo aux = this.primero;
			System.out.print("null<-");
			while(aux!=null)
			{
				System.out.print(aux.dato+"<->");
				aux = aux.siguiente;
			}
			System.out.println("null");
		}
		
	}
        public void mostrarListaDobleHaciaAtras()
	{
		if(this.primero==null)
			System.out.println("lista enlazada doblevacia");
		else
		{
			Nodo aux = this.ultimo;
			System.out.print("null<-");
			while(aux!=null)
			{
				System.out.print(aux.dato+"<->");
				aux = aux.anterior;
			}
			System.out.println("null");
		}
        }   
        
        
        
        
        
	//implementar el m�todo mostrarListaDobleHaciaAtras
	public static void main(String[] args) 
	{
		ListaDoblementeEnlazada lista = new ListaDoblementeEnlazada();
		lista.mostrarListaDobleHaciaAdelante();
		lista.agregarEnListaDoble(3);
		lista.agregarEnListaDoble(8);
		lista.agregarEnListaDoble(17);
		lista.agregarEnListaDoble(1);
		lista.mostrarListaDobleHaciaAdelante();
                lista.mostrarListaDobleHaciaAtras();
	}

}
