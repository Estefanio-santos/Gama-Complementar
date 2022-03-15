import java.util.Scanner;

public class ProgramaEmprestimo {


	public static void main(String[] args) {
Scanner teclado = new Scanner(System.in);
double salarioBruto;
double emprestimoSolicitado;
double quantidadePrestacao;
double calcularPorcentagem;
double calcularParcela;

System.out.println("Digite seu salário bruto!");
salarioBruto = teclado.nextDouble();
System.out.println("Insira o valor do empréstimo a ser solicitado!");
emprestimoSolicitado = teclado.nextDouble();
System.out.println("Informe a quantidade de prestações");
quantidadePrestacao = teclado.nextDouble();
calcularPorcentagem = salarioBruto * 30 / 100;
calcularParcela = emprestimoSolicitado / quantidadePrestacao;
if(calcularParcela <= calcularPorcentagem) {
	System.out.println("empréstimo aprovado, pois as parcelas estão abaixo de 30% do salário");
System.out.println("o valor da parcela é de: " + calcularParcela);
System.out.println("O valor máximo de parcela aprovado é de " + calcularPorcentagem);

} else {
	System.out.println("Empréstimo não aprovado pois as parcelas superam os 30% do seu salário");
	System.out.println("O valor máximo de parcela aprovado é de " + calcularPorcentagem);

} // fim da condicional if else
teclado.close();
} // fim do método main
} // fim da classe
