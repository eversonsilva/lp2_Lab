
package revisao;

import java.util.ArrayList;
import javax.swing.JOptionPane;

class Exe3 {
    
    private double km = 0;
    private String nome = null;
    private ArrayList<String> nomes;
    private ArrayList kms;
    
    public Exe3(){
        
        nome = JOptionPane.showInputDialog("Digite o nome da praia");
        
        String distancia = JOptionPane.showInputDialog("Digite a distancia da praia (em Km)");
        km = Double.parseDouble(distancia);
        
        nomes = new ArrayList();
        kms = new ArrayList();
        
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public double getKm(){
        return this.km;
    }
    
    public void addNomes(){
        nomes.add(nome);
    }
    
    public void addKm(){
        kms.add(nome);
    }
    
    public double distanciaMedia(){
        double soma = 0.0;
            
        
        
     
        
        return soma;
    }
    
}
