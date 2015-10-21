/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_lp2;

import java.io.File;

/**
 *
 * @author 41487532
 */
public class Lab_lp2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String name = IOManager.readKeyboard("Qual seu nome");
        Gamer gamer = new Gamer(name, 0,0);
        System.out.println("O game criado é: " +gamer);
        
        File file = new File("D:/3º semestre/Lb - lab/score.txt");
        IOManager.saveGamer(gamer, file);
        Gamer gamer2 = IOManager.readGamer(file);
        System.out.println("O gamer lido do arquivo é: "+gamer2);
        
    }
    
}
