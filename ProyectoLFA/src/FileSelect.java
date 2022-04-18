/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;
import java.io.File;
import javax.swing.filechooser.FileNameExtensionFilter;
/**
 *
 * @author JoseAz
 */
public class FileSelect {
    public String getPath(){
        String Path;
        File SelectedFile;
        JFileChooser SelectFile;
        SelectFile = new JFileChooser();
        FileNameExtensionFilter filtro = new  FileNameExtensionFilter("*.TXT", "txt");
        SelectFile.setFileFilter(filtro);
        SelectFile.showOpenDialog(null);
        SelectedFile = SelectFile.getSelectedFile();
        Path = SelectedFile+"";
        return Path;
    }
}
