/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author m825
 */
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

public class Lista{
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
    
    public Nodo Buscar(String valor, int NoLinea){
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
            if (!valor.equals(""))
            {
                DefaultListModel modeloLista = new DefaultListModel();
                String alerta = "Linea No. " + NoLinea + " : " + valor;
                modeloLista.addElement(alerta);
                Main.jList1.setModel(modeloLista);
            }
        }else{
            aux.ModificarCount(aux.getCount()+1);
        }
        return aux;
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
    
    public DefaultTableModel Modelo(Nodo aux){
        DefaultTableModel dtmTokens = new DefaultTableModel();
        String[] cabecera = {"Token","Tipo","Cantidad"};
        dtmTokens.setColumnIdentifiers(cabecera);
        dtmTokens = Objetar(aux,dtmTokens);
        return dtmTokens;
    }
    
    public DefaultTableModel Objetar(Nodo aux, DefaultTableModel dtmTokens){
        Object[] datos = new Object[Main.JT1.getColumnCount()];
        if(aux!=null){
           if (aux.getCount() > 0)
           {
                datos[0] = aux.ObtenerNombre();
                datos[1] = aux.getTipo();
                datos[2] = aux.getCount();
                dtmTokens.addRow(datos);
           }
           Objetar(aux.ObtenerSiguiente(),dtmTokens);
        }
      
        return dtmTokens;
    }
}
