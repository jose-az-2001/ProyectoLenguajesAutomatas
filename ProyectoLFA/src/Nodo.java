/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author m825
 */
public class Nodo {
    private Nodo siguiente;
    private String nombre;
    private int count;
    private String Tipo;
    public Nodo(){}
    public String ObtenerNombre(){
        return this.nombre;
    }
    public String getTipo(){
        return this.Tipo;
    }
    public void setTipo(String tipo){
        this.Tipo=tipo;
    }
    public void ModificarNombre(String nombre){
    this.nombre=nombre;
    }
    public void ModificarCount(int count){
        this.count=count;
    }
    public int getCount(){
        return count;
    }
    public Nodo ObtenerSiguiente(){
     return this.siguiente;
    }
    public void ModificarSiguiente(Nodo siguiente){
	this.siguiente = siguiente;
    }
}
