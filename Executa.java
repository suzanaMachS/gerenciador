import java.util.Scanner;

/**
 * Created by Suzana Machado on 04/02/2017.
 */
public class Executa {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        Gerenciador ger = Gerenciador.getInstance();
        boolean continua = true;

        System.out.println("Digite os dados para continuar ou 'quit' para encerrar o processo:");
        while(continua){
            String info = in.nextLine();
            if(info.equals("quit")){
                ger.imprime();
                continua = false;
            }else{
                String[] partes = info.split(";");
                partes[1] = partes[1].replace(" ", "");
                ger.adicionaFunc(partes[0], Double.parseDouble(partes[1]));
            }
        }
    }
}
