/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mp3;

import javax.swing.JFileChooser;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JFrame;


/**
 *
 * @author GoD
 */
public class Playlist {
    JFileChooser fc = new JFileChooser();
    ArrayList ls = new ArrayList();
    FileOutputStream fos;
    ObjectOutputStream oos;
    FileInputStream fis;
    ObjectInputStream ois;
    
    void add(JFrame frame){
        fc.setMultiSelectionEnabled(true);
        fc.setFileFilter(new FileTypeFilter(".mp3","Open MP# Files Only"));
        int fileValid = fc.showOpenDialog(frame);
        if(fileValid == javax.swing.JFileChooser.CANCEL_OPTION){
            return;
        }else if(fileValid == javax.swing.JFileChooser.APPROVE_OPTION){
            File [] file = fc.getSelectedFiles();
            ls.addAll(Arrays.asList(file));
        }
    }
    
    ArrayList getListSong(){
        return ls;
    }

}
