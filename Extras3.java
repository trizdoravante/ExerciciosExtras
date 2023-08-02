package Exercicios3;

import java.util.Scanner;

public class Extras3 {

	public static void main(String[] args) {
	float SalarioBruto, AdicionalNoturno, HorasExtras, Descontos, SalarioLiquido;
	Scanner leia = new Scanner(System.in);
	System.out.println("\nInsira o valor bruto do salário: ");
	float SB = leia.nextFloat();
	System.out.println("\nInsira o valor do adicional noturno: ");
	float AN = leia.nextFloat();
	System.out.println("\nInsira o valor das horas extras: ");
	float HE = leia.nextFloat();
	System.out.println("\nInsira o valor a ser descontado: ");
	float D = leia.nextFloat();
	SalarioLiquido = (SB+AN+HE*5-D);
	System.out.println("O valor final do salário, ou salário líquido, é de: R$ "+SalarioLiquido);
	

	}

}
