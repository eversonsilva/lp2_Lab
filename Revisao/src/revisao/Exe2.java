package revisao;

import javax.swing.JOptionPane;

class Exe2 {
    
    private int valor = 0;
    
    public Exe2(){
        String resp = JOptionPane.showInputDialog("Digite seu estado civil : 1-Solteir0(a) /2-Desquitado(a) /3-Casado(a) /4-Divorciado(a) /5-Viúvo(a) ");
        valor = Integer.parseInt(resp);
    
        switch(valor){
            case 1:
                JOptionPane.showMessageDialog(null, " Você é solteir(a)");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Você é desquitado(a)");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Você é casado(a)");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Você é divorciado(a)");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Você é Viùvo(a)");
                break;
            default :
                JOptionPane.showMessageDialog(null, "Esta opção não existe");
                break;
        }  
    }
}
