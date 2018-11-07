import static javax.swing.JOptionPane.showInputDialog; //input
import static javax.swing.JOptionPane.showMessageDialog; //output
import static java.lang.Integer.parseInt; //String -> int
import static java.lang.String.valueOf; // ?? -> String
import java.util.*; //importação p/ 

public class Exercicio211ArrayList {
    
    //método executável
    public static void main(String[] args) {
        
        //a tag Integer é para especificar o tipo de dado da Array
        //Sem essa primeira tag, seria generico aceitando qualquer tipo de dado
        List<Integer> idades = new ArrayList<>();
        List<String> nomes = new ArrayList<>();
        
        int qtdConvidados = receberInt("Digite a quantidade de convidados na lista");
        
        for (int contador = 0; contador < qtdConvidados; contador++) {
            nomes.add(
                    showInputDialog(
                    "CONTROLE DE CONVIDADOS\n" +
                    "Digite o nome do " + 
                            (contador + 1) + "º convidado"
            )
            );
            
            idades.add(
                    receberInt(
                    "Agora...\n" +
                    "Digite a idade do " + nomes.get(contador)
            )
            );
        }//for
        
        //exibir o resultado
        String resposta = "LISTA FINAL DE CONVIDADOS\n";
        
        for (String nome : nomes) {
            resposta += "Nome: " + nome + "    ";
        }
        
        resposta += "\n";
        
        for (Integer idade : idades) {
            resposta += "Idade: " + idade + "   ";
        }
        
        resposta += "\n";
        
        for (Integer idade : idades) {
            resposta += "Situação: " + 
              validaConvidado(idade) + "    ";   
        }
        exibir(resposta);                              
        
        
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

    public static void exibir(String mensagemProUsuario) {
        showMessageDialog(null, mensagemProUsuario);
    }

    public static String validaConvidado(int idadeConvidado) {
        String msg = "";

        if (idadeConvidado >= 15 && idadeConvidado <= 17) {
            msg = "Você pode entrar na festa";
        } else {
            msg = "Sai fora bicão!!!";
        }

        return msg;
    }


}//class