import static javax.swing.JOptionPane.showInputDialog; //input
import static javax.swing.JOptionPane.showMessageDialog; //output
import static java.lang.Integer.parseInt; //String -> int
import static java.lang.Float.parseFloat;//string -> float
import static java.lang.String.valueOf; // ?? -> String
import java.util.*;

public class Exercicio402 {
    
    public static void main(String[] args) {
        
        int qtd = 5;
        float soma = 0;
        float[] a = new float[qtd];
        String msg = "";
        
        for (int i = 0; i < a.length; i++) {
            a[i] = receberFloat("Digite o " + (i+1) + "° número real");
            
            if (a[i]%2!=0) {
                soma = soma + a[i];
            }
        }
        
        msg = "Total: " + soma;
        exibir(msg);
        
    }//main
    
    public static int receberInt(String mensagemProUsuario) {
        String aux = showInputDialog(mensagemProUsuario);
        try {
            return parseInt(aux);
        } catch (Exception e) {
            exibir("Você digitou algo errado :(");
            return 0;
        }
    }
    
    public static float receberFloat(String mensagemProUsuario) {
        String aux = showInputDialog(mensagemProUsuario);
        try {
            return parseFloat(aux);
        } catch (Exception e) {
            exibir("Você digitou algo errado :(");
            return 0;
        }
    }
    
    
    public static void exibir(String mensagemProUsuario) {
        showMessageDialog(null, mensagemProUsuario);
    }
}//class