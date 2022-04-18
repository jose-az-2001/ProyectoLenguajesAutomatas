/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import javax.swing.ListModel;

/**
 *
 * @author USUARIO
 */
public class Text {
    public Lista lista = new Lista();
    public String GetText(String Path){
        String Text = "";
        String cadena = "";
        insertPalabras();
        try{
            FileReader file = new FileReader(Path);
            BufferedReader buffer = new BufferedReader(file);
            
            
            while((Text = buffer.readLine()) != null){
                cadena = cadena + Text + '\n';
                Npalabras(Text);
                palabra(Text);
            }
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.print(lista.Recorrido(lista.GetInicio()));
        return cadena;
    }
    public int Npalabras(String txt){
        int c=0;
        for(int i=0;i<txt.length();i++){
            if(txt.charAt(i)==' '){
                c++;
            }
        }
        c++;
        return c;
    }
    public void palabra(String txt){
        String palabra="";
        
        for(int i=0;i<txt.length();i++){
            if(txt.charAt(i)==' '){
                System.out.println("."+palabra+".");
                System.out.println(lista.Buscar(palabra));
                palabra="";
            }else{
                palabra+=txt.charAt(i);
            }
            
        }
    }
    public void insertPalabras(){
         lista.Insertar("Entero","palabra reservada", 0);
        lista.Insertar("Decimal","palabra reservada", 0);
        lista.Insertar("Booleano","palabra reservada", 0);
        lista.Insertar("Cadena","palabra reservada", 0);
        lista.Insertar("si","palabra reservada", 0);
        lista.Insertar("sino","palabra reservada", 0);
        lista.Insertar("mientras","palabra reservada", 0);
        lista.Insertar("hacer","palabra reservada", 0);
        lista.Insertar("verdadero","palabra reservada", 0);
        lista.Insertar("falso","palabra reservada", 0);
        lista.Insertar("+","Operador", 0);
        lista.Insertar("-","Operador", 0);
        lista.Insertar("*","Operador", 0);
        lista.Insertar("/","Operador", 0);
        lista.Insertar("%","Operador", 0);
        lista.Insertar("=","Operador", 0);
        lista.Insertar("==","Operador", 0);
        lista.Insertar("<","Operador", 0);
        lista.Insertar(">","Operador", 0);
        lista.Insertar(">=","Operador", 0);
        lista.Insertar("<=","Operador", 0);
        lista.Insertar("(","Operador", 0);
        lista.Insertar(")","Operador", 0);
        lista.Insertar("{","Operador", 0);
        lista.Insertar("}","Operador", 0);
        lista.Insertar("\"","Operador", 0);
        lista.Insertar(";","Operador", 0);
        lista.Insertar("DD*","numeros", 0);
        lista.Insertar("L(DuL) *","identificador", 0);
    }
    public void GetTokens(String Texto){
       
       
      
        //System.out.print(lista.Recorrido(lista.GetInicio()));
    }
    
}
