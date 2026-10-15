package listas.simples;

public class Nodo{
	private int valor;
	private Nodo sig;

	public Nodo(int dato) {
        	this.valor = dato;
        	this.sig = null;
	}

	public int getValor() {
        	return valor;
	}

	public void setValor(int valor) {
        	this.valor = valor;
    	}

    	public Nodo getSig() {
        	return sig;
    	}

    	public void setSig(Nodo sig) {
        	this.sig = sig;
    	}
}