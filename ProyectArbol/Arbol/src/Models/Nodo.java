package Models;

public class Nodo {
    private int dato;
    private Nodo izq;
    private Nodo der;

    public Nodo(int dato) {
        this.dato = dato;
    }
    public Nodo() {}

    public Nodo getIzq() { return izq; }
    public Nodo getDer() { return der; }
    public int getDato() { return dato; }

    public void setDato(int dato) { this.dato = dato; }
    public void setIzq(Nodo nodo) { this.izq = nodo; }
    public void setDer(Nodo nodo) { this.der = nodo; }
}
