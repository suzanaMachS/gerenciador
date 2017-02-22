/**
 * Created by Suzana Machado on 04/02/2017.
 */
public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public double calculaINSS(){
        return salario * 0.1;
    }

    public double calculaSeguro(){
        return salario * 0.15;
    }

    public double calculaRef(){
        return salario * 0.11;
    }

    public double calculaTransporte(){
        return salario * 0.05;
    }

    public double calculaImpostos(){
        return calculaINSS() + calculaSeguro() + calculaRef() + calculaTransporte();
    }

    public double calculaTotal(){
        return calculaImpostos() + salario;
    }

    @Override
    public String toString(){
        return "Nome: "+nome+"; INSS: R$"+calculaINSS()+"; SegVida: R$"+calculaSeguro()+"; VR: R$"+calculaRef()+"; VT: R$"+calculaTransporte()+"; Custo Total: R$"+calculaTotal();
    }

}
