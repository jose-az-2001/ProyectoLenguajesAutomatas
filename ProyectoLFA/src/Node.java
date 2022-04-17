/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO
 */
public class Node {
    private String dato;
    private int Count;
    private Node Siguiente;

    public void setDato(String dato) {
        this.dato = dato;
    }

    public void setSiguiente(Node Siguiente) {
        this.Siguiente = Siguiente;
    }

    public String getDato() {
        return dato;
    }

    public Node getSiguiente() {
        return Siguiente;
    }

    public int getCount() {
        return Count;
    }

    public void setCount(int Count) {
        this.Count = Count;
    }
    
}
