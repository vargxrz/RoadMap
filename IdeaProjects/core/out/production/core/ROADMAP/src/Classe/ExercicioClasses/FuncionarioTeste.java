package Classe.ExercicioClasses;

public class FuncionarioTeste {
    public static void main(String[] args) {


        Funcionario funcionario = new Funcionario("joao", "auxiliar de t.i", 1500);

        DescontoFuncionario inss = new DescontoFuncionario("INSS", 9);
        DescontoFuncionario ir = new DescontoFuncionario("Imposto de renda", 7.5);
        DescontoFuncionario vr = new DescontoFuncionario("Vale Alimentação", 20);
        DescontoFuncionario odontologico = new DescontoFuncionario("Plano odontológico", 14);
        DescontoFuncionario saude = new DescontoFuncionario("Plano de saúde", 30);

        funcionario.adicionarDesconto(inss);
        funcionario.adicionarDesconto(ir);
        funcionario.adicionarDesconto(vr);
        funcionario.adicionarDesconto(odontologico);
        funcionario.adicionarDesconto(saude);

        System.out.println(funcionario.toString());
        System.out.println("Seu salario sem descontos é R$" + funcionario.salario + "\nAgora com descontos ficara: R$" + funcionario.calcularSalarioLiquido());
    }

}
