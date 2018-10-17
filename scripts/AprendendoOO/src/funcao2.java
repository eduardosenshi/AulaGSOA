import static javax.swing.JOptionPane.showMessageDialog; //out
import static javax.swing.JOptionPane.showInputDialog; //in
import static java.lang.Integer.parseInt; //String -> int
import static java.lang.Float.parseFloat; //String -> Float

public class funcao2{
    
    public static void main(String[] args) {
        
        
       int num1 = receberInt("Digite o 1° número: "),
           num2 = receberInt("Digite o 2° número: "),
           num3 = receberInt("Digite o 3° número: "),
           num4 = receberInt("Digite o 4° número: "),
           num5 = receberInt("Digite o 5° número: "),
           num6 = receberInt("Digite o 6° número: "),
           num7 = receberInt("Digite o 7° número: ");
       
       exibir(
               "Num Fav 1 - " + num1 + "\n" +        
               "Num Fav 2 - " + num2 + "\n" +        
               "Num Fav 3 - " + num3 + "\n" +        
               "Num Fav 4 - " + num4 + "\n" +        
               "Num Fav 5 - " + num5 + "\n" +        
               "Num Fav 6 - " + num6 + "\n" +        
               "Num Fav 7 - " + num7 + "\n"         
       );
    }//fim main
    
    public static int receberInt(String mensagemProUsuario){
        try {//try + ctrl + espaço
            return parseInt(showInputDialog(mensagemProUsuario));
            //codigo normal
        } catch (Exception e) {
            //se deu errado
            //não é obrigatório tratar o erro. Em ocasiões essa parte pode ficar vazia
        }
        return 0;
    }
    
    public static void exibir(String mensagemProUsuario){
        showMessageDialog(null, mensagemProUsuario);
    }
    
}//fim classe