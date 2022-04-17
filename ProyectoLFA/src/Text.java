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
    public String GetText(String Path){
        String Text = "";
        String cadena = "";
        try{
            FileReader file = new FileReader(Path);
            BufferedReader buffer = new BufferedReader(file);
            
            
            while((Text = buffer.readLine()) != null){
                cadena = cadena + Text + '\n';
            }
            
        }catch(Exception e){
            System.out.println(e);
        }
        
        return cadena;
    }
    
    public void GetTokens(String Texto){
        List lista = new List();
        lista.Insertar("a", 1);
        lista.Insertar("b", 1);
        lista.Insertar("c", 1);
        if(lista.Buscar("d") == null){
            System.out.println("Si existe");
        }else{
            System.out.println("No existe");
        }
        
        
        /*for(int i = 0; i < Texto.length(); i++){
            list
            
        }*/
    }
    
}
