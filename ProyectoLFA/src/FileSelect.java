/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;
import java.io.File;
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
        SelectFile.showOpenDialog(null);
        SelectedFile = SelectFile.getSelectedFile();
        Path = SelectedFile+"";
        return Path;
    }
}
