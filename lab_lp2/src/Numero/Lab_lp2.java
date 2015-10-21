/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Numero;

import java.io.File;

public class Lab_lp2 {
    
    public static void main(String args []){
        
        String num = IOManager.readKeyboard(" Qual o maximo ");
        int numInt = Integer.parseInt(num);
        Numero numero = new Numero(numInt);
        
        File file = new File("D:/3º semestre/Lb - lab/numero.txt");
        IOManager.saveNumero(numero, file);
        Numero numero2 = IOManager.readNumero(file);
        System.out.println("O numero gerado é: "+numero2);
        
        
    }
    
}
