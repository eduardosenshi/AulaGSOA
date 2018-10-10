import static javax.swing.JOptionPane.showMessageDialog;//importação para exibir mensagens
import static javax.swing.JOptionPane.showInputDialog;//importação para receber dados do usuário
import static java.lang.Integer.parseInt;//converter string para int
import static java.lang.Float.parseFloat;//converter string para float


public class AprendendoFuncoes {//classe deve ter o mesmo nome do arquivo
    public static void main(String[] args) {//psvm+tab para criar automaticamente essa linha
        int n1 = parseInt(showInputDialog("Digite n1 "));//
        int n2 = parseInt(showInputDialog("Digite n2 "));//
        int resultado = calculaSoma(n1, n2);
        showMessageDialog(null, resultado);
       
        
    }//main
    
    //somar 2 números [int]: [int]
    public static int calculaSoma(int num1, int num2){
        int soma = num1 + num2;
        return soma;
    } 
}//class