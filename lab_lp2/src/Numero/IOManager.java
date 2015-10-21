/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Numero;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 41487532
 */
public class IOManager {
    
    public static String readKeyboard(String inputSentence)
    {
        String resposta = "";
        
        InputStreamReader entrada = new InputStreamReader(System.in);
        BufferedReader dados = new BufferedReader(entrada);
        
        System.out.println(inputSentence);
        
        try {
            resposta = dados.readLine();
        } catch (IOException ex) {
            Logger.getLogger(IOManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return resposta;
    }
    
    public static void saveNumero(Numero numero, File file)
    {
        
        try{
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(numero);
        oos.close();
        fos.close();
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
    
    public static Numero readNumero(File file)
    {
        Numero numero = null;
        
        try{
       
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        
        numero = (Numero) ois.readObject();
        
        fis.close();
        ois.close();
        } catch(IOException | ClassNotFoundException ex){
            ex.printStackTrace();
        } 
        
        return numero;
        
    }
    
}
