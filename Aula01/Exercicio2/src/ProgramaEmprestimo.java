import java.util.Scanner;

public class ProgramaEmprestimo {


	public static void main(String[] args) {
Scanner teclado = new Scanner(System.in);
double salarioBruto;
double emprestimoSolicitado;
double quantidadePrestacao;
double calcularPorcentagem;
double calcularParcela;

System.out.println("Digite seu sal�rio bruto!");
salarioBruto = teclado.nextDouble();
System.out.println("Insira o valor do empr�stimo a ser solicitado!");
emprestimoSolicitado = teclado.nextDouble();
System.out.println("Informe a quantidade de presta��es");
quantidadePrestacao = teclado.nextDouble();
calcularPorcentagem = salarioBruto * 30 / 100;
calcularParcela = emprestimoSolicitado / quantidadePrestacao;
if(calcularParcela <= calcularPorcentagem) {
	System.out.println("empr�stimo aprovado, pois as parcelas est�o abaixo de 30% do sal�rio");
System.out.println("o valor da parcela � de: " + calcularParcela);
System.out.println("O valor m�ximo de parcela aprovado � de " + calcularPorcentagem);

} else {
	System.out.println("Empr�stimo n�o aprovado pois as parcelas superam os 30% do seu sal�rio");
	System.out.println("O valor m�ximo de parcela aprovado � de " + calcularPorcentagem);

} // fim da condicional if else
teclado.close();
} // fim do m�todo main
} // fim da classe
