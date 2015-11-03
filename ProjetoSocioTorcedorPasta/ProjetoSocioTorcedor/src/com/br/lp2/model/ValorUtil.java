/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.lp2.model;

import java.text.DecimalFormat;

/**
 *
 * @author 41487532
 */
public class ValorUtil {
  
    private static DecimalFormat df = new DecimalFormat("#.##");
    
    public static String double2String(double valor){
         
        String dx = df.format(valor); 
        
        return dx;
    }
}
