package Exercicios2;

import java.util.Scanner;

public class Extras2 {

	public static void main(String[] args) {
		float num1, num2, num3, num4, media=0;
		Scanner leia = new Scanner(System.in);
		System.out.println("\nInsira a primeira nota do participante: ");
		float n1 = leia.nextFloat();
		System.out.println("\nInsira a segunda nota do participante: ");
		float n2 = leia.nextFloat();
		System.out.println("\nInsira a terceira nota do participante: ");
		float n3 = leia.nextFloat();
		System.out.println("\nInsira a quarta nota do participante: ");
		float n4 = leia.nextFloat();
		media = (n1+n2+n3+n4)/4;
		System.out.println("\nO valor da média final do participanteé: "+media);
		

	}

}
