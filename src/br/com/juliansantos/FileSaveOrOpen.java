/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.juliansantos;

import static br.com.juliansantos.FileSaveOrOpen.jfc;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Julian A. Santos
 */
public class FileSaveOrOpen {

    public static final JFileChooser jfc = new JFileChooser();

    public static File openFile() {

        if (jfc.showOpenDialog(null) == JFileChooser.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(jfc, "No file selected!", "Attention", JOptionPane.INFORMATION_MESSAGE);
        }

        return jfc.getSelectedFile();
    }
    
    public static File openFile(File currentDirectory) {
        
        if(currentDirectory.exists()) {
            jfc.setCurrentDirectory(currentDirectory);
        }
        
        if (jfc.showOpenDialog(null) == JFileChooser.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(jfc, "No file selected!", "Attention", JOptionPane.INFORMATION_MESSAGE);
        }

        return jfc.getSelectedFile();
    }
    
    public static File saveFile() {
        if (jfc.showSaveDialog(null) == JFileChooser.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(jfc, "No file selected!", "Attention", JOptionPane.INFORMATION_MESSAGE);
        }
        
        return jfc.getSelectedFile();
    }
    
    public static File saveFile(File currentDirectory) {
        
        if(currentDirectory.exists()) {
            jfc.setCurrentDirectory(currentDirectory);
        }
        
        if (jfc.showSaveDialog(null) == JFileChooser.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(jfc, "No file selected!", "Attention", JOptionPane.INFORMATION_MESSAGE);
        }
        
        return jfc.getSelectedFile();
    }
}
