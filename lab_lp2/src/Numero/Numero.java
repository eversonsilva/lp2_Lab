/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Numero;

import java.io.Serializable;
import java.util.Random;

/**
 *
 * @author 41487532
 */
public class Numero implements Serializable {
    
    private int numero;

    public Numero(int numero) {
        Random random = new Random();
        this.numero = random.nextInt(numero);
    }
    
    @Override
    public String toString() {
        return "numero = " + numero;
    }
      
}
