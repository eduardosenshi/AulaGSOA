import static javax.swing.JOptionPane.showMessageDialog; //out
import static javax.swing.JOptionPane.showInputDialog; //in
import static java.lang.Integer.parseInt; //String -> int
import static java.lang.Float.parseFloat; //String -> Float
import static java.lang.String.valueOf; //Qualquer coisa -> string

public class NumerosFavoritos{
    
    public static void main(String[] args) {
        
       //criando array de 1d 
       int[] numFav = new int[7];
       
       //numFav[5] = 2; - Forma de atribuir valor a uma posição do array
      
       for (int cont = 0; cont < numFav.length; cont++) {//for + ctrl + espaço - numFav.length = tamanho do array
            numFav[cont] = receberInt("Digite o " + (cont+1) + "° favorito: ");
        }
       
       //var auxiliar
       String mensagem = "";
        for (int cont = 0; cont < numFav.length; cont++) {
            mensagem += (cont+1) + "° número favorito: " + numFav[cont] + "\n";
        }
        exibir(mensagem);
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