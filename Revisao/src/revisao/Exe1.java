package revisao;

import javax.swing.JOptionPane;

public class Exe1 {
    
    private double valor;
    private int codigo;
    
    public Exe1(){
        String resp = JOptionPane.showInputDialog("Digite o valor do produto");
        valor = Double.parseDouble(resp);
        
        codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do produto"));
        
        switch(codigo){
            case 1:
                valor = valor + valor * 0.1;
                break;
            case 3:
                valor += valor * 0.25;
                break;
            case 4:
                valor = valor * 1.3;
                break;
            case 8:
                valor *= 1.5;
                break;
        }
        JOptionPane.showMessageDialog(null, "O novo valor é " +valor);
        
    }
    
}