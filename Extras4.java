package Exercicios4;

import java.util.Scanner;

public class Extras4 {

	public static void main(String[] args) {
		float num1,num2,num3,num4,calculo;
		Scanner leia = new Scanner(System.in);
		System.out.println("\nInsira o primeiro número: ");
		num1 = leia.nextFloat();
		System.out.println("\nInsira o segundo número: ");
		num2 = leia.nextFloat();
		System.out.println("\nInsira o terceiro número: ");
		num3 = leia.nextFloat();
		System.out.println("\nInsira o quarto número: ");
		num4 = leia.nextFloat();
		calculo = (num1*num2) - (num3*num4);
		System.out.println("A diferença entre os produtos é de: "+calculo);
		
		
		

	}

}
