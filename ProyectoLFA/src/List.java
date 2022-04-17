/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO
 */
public class List {
    private Node Inicio;
    public List(){}
    public void Insertar(String dato, int count){
        Node nuevo = new Node();
        nuevo.setDato(dato);
        nuevo.setCount(count);
        if(this.Inicio == null){
            Inicio = nuevo;
            nuevo.setSiguiente(null);
        }
        else{
            Node aux = this.Inicio;
            while(aux.getSiguiente()!=null){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
    }
    public String Mostrar(){
        String resultado = "";
        Node aux = Inicio;
        while(aux.getSiguiente()!=null){
            resultado = resultado+ " " + aux.getDato() + " " + aux.getCount()+ '\n';
            aux = aux.getSiguiente();
        }
        resultado = resultado+ " " + aux.getDato() + " " + aux.getCount();
        System.out.println(resultado);
        return resultado;
    }
    
    public Node Buscar(String dato){
        Node aux = Inicio;
        while(aux.getDato() != dato){
            aux = aux.getSiguiente();
        }
        if(aux.getDato() != dato){
            aux = null;
        }
        return aux;
    }
}
