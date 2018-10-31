import static javax.swing.JOptionPane.showInputDialog; //input
import static javax.swing.JOptionPane.showMessageDialog; //output
import static java.lang.Integer.parseInt; //String -> int
import static java.lang.Float.parseFloat; //String -> Float
import static java.lang.String.valueOf; //Qualquer coisa -> string

public class CasaNoturna{
    public static void main(String[] args) {
        
         //showMessageDialog(null, idadeConvidado);
       //exibir("" + idadeConvidado);//sem o "" + não funciona porque nao permite a converção (int > string)
       //dessa forma ele vai transformar em string
       //int idadeConvidado = receberInt("Digite sua idade");
       
       //exibir(valueOf(idadeConvidado)); // forma 2 - converter quanquer dado para string
        
        //criando array
        int qtdConvidados = 5; //deixar com 20
        int[] idade = new int[qtdConvidados];
        
        for (int contador = 0; contador < qtdConvidados; contador++) {
            idade[contador] = receberInt(
                    "Controle de Convidados\n" +
                            "Digite a idade do " + (contador + 1) + "° convidado"
            );
        }
        
        
        //exibit o resultado
        String resposta = "Lista final de convidados\n";
        
        for (int cont = 0; cont < idade.length; cont++) {
            resposta += 
                    "idade: " + idade[cont] + 
                    "   - Situação: " + validaConvidado(idade[cont]) + "\n";
            exibir(resposta);
        }
        
       
       
       
    
    public static int receberInt(String mensagemProUsuario) {
        String aux = showInputDialog(mensagemProUsuario);
        
        try {
            return parseInt(aux);
        } catch (Exception e) {
            exibir("Você digitou algo errado :(");
            return 0;
        }
        
        
        //try catch usado porque sem ele dava erro se digitado algo diferente de numeros
        //agora o programa exibe uma mensagem de erro ao inves de apenas fechar
    }
    
    public static void exibir(String mensagemProUsuario) {
        showMessageDialog(null, mensagemProUsuario);
    }
    
    public static String validaConvidado(int idadeConvidado) {
        String msg = "";
       
        if (idadeConvidado >= 15 && idadeConvidado <= 17) {
            msg = "Você pode entrar na festa";
        }
        else{
            msg = "Sai fora!!!";
        }
        
        return msg;
    }
    
    }
}
