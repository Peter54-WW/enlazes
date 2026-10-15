package listas.simples;

/**
*Definicion de una lista simple
*@author Pedro Garcia Mata
*@data 15 octubre 2026
*/

public class ListaSimple{
	private Nodo cabeza;

	public ListaSimple(){
		this.cabeza = null;
	}

	public void insertarInicio(int valor) {
		if(cabeza == null){
			Nodo t = new Nodo(valor);
			cabeza = t;
		}else{
			Nodo nuevo = new Nodo(valor);
			nuevo.setSig(cabeza);
			cabeza = nuevo;
		}
	}

	public void recorrer() {
        	Nodo itera = cabeza;
        	while (itera != null) {
            		System.out.print("valor " + itera.getValor() + " -> ");
            		itera = itera.getSig(); 
        	}
        	System.out.println("null");
    	}

	public static void main(String[] args) {
        	ListaSimple lista = new ListaSimple();
        	lista.insertarInicio(2);
        	lista.insertarInicio(3);
        	lista.recorrer();
    	}
}