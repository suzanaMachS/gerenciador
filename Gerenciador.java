import java.util.ArrayList;
import java.util.List;

/**
 * Created by Suzana Machado on 04/02/2017.
 */
public class Gerenciador {
    private static Gerenciador gerenciador = null;
    private List<Funcionario> funcionarios;
    private double total;
    private double salarios;
    private double impostos;

    private Gerenciador(){
        funcionarios = new ArrayList<Funcionario>();
        total = 0;
        salarios = 0;
        impostos = 0;
    }

    public static Gerenciador getInstance(){
        if(gerenciador == null){
            gerenciador = new Gerenciador();
        }
        return gerenciador;
    }

    //@requires nome!=null && salario>=0;
    public void adicionaFunc(String nome, double salario){
        Funcionario f = new Funcionario(nome, salario);
        funcionarios.add(f);
    }

    public double calcTotal(){
        for(int i=0;i<funcionarios.size();i++){
            total = total + funcionarios.get(i).calculaTotal();
        }
        return total;
    }

    public double calcSal(){
        for(int i=0;i<funcionarios.size();i++){
            salarios = salarios + funcionarios.get(i).getSalario();
        }
        return salarios;
    }

    public double calcImp(){
        for(int i=0;i<funcionarios.size();i++){
            impostos = impostos + funcionarios.get(i).calculaImpostos();
        }
        return impostos;
    }

    public void imprime(){
        for(int i=0;i<funcionarios.size();i++){
            System.out.println(funcionarios.get(i));
        }
        System.out.println("Total Impostos: R$"+calcImp());
        System.out.println("Total Salarios: R$"+calcSal());
        System.out.println("Total Geral: R$"+calcTotal());
    }
}
