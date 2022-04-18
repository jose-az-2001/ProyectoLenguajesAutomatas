/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author m825
 */
public class Lista {
    private Nodo inicio;
    private int tamanio;
    private String result="";
    private Nodo auxi=new Nodo();
    public Lista(){
       this.inicio=null;
       this.tamanio=0;
    }
    
    public void Insertar(String nombre,String Tipo,int count){
        Nodo nuevo=new Nodo();
        nuevo.ModificarNombre(nombre);
        nuevo.ModificarCount(count);
        nuevo.setTipo(Tipo);
        if(this.inicio==null){
           this.inicio=nuevo;
           inicio.ModificarSiguiente(null);
        }else{  
           Ultimo(this.inicio).ModificarSiguiente(nuevo);
           nuevo.ModificarSiguiente(null);
        }
        this.tamanio++;
    }
    
    public String Buscar(String valor){
        Nodo aux=inicio;
        int num=0;
        while(aux!=null && num!=1){
            if(aux.ObtenerNombre().equals(valor)){
                num=1;
            }else{
                aux=aux.ObtenerSiguiente();
            }
        }
        if(aux==null){
            
            return "El nombre no existe";
        }else{
            aux.ModificarCount(aux.getCount()+1);
            return "El nombre si existe";
        }
        
    }
    
    public void  EliminarFinal(){
        Penultimo(this.inicio).ModificarSiguiente(null);
    }
    
    public Nodo GetInicio(){
        return this.inicio;
    }
    
   public Nodo Ultimo(Nodo aux){
       auxi=aux;
       if(aux.ObtenerSiguiente()!=null){
          Ultimo(aux.ObtenerSiguiente()); 
       }
       return auxi;
   }
   public Nodo Penultimo(Nodo aux){
       auxi=aux;
       if(aux.ObtenerSiguiente().ObtenerSiguiente()!=null){
           Penultimo(aux.ObtenerSiguiente());
       }
       return auxi;
   }
    
    public String Recorrido(Nodo aux){
        if(aux!=null){
           result+="simbolo: "+aux.ObtenerNombre()+" cant:"+aux.getCount()+"\n";
           Recorrido(aux.ObtenerSiguiente());
        }
      
        return result;
    }
}
