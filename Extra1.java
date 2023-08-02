package ExercicioExtra;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Extra1 {

	public static void main(String[] args) {
		DecimalFormat df= new DecimalFormat("#.##");
		float Salario=0, Abono=0, Total=0;
		Scanner leia = new Scanner(System.in);
		System.out.println("\nInsira o valor referente ao salário.");
	    float Sa = (float) leia.nextDouble();
		Scanner ler = new Scanner(System.in);
		System.out.println("\nInsira o valor referente ao abono salarial.");
		float Ab = (float) ler.nextDouble();
		Total = (float) (Sa+Ab);
		System.out.println("\nO valor do novo salário é de R$: " + df.format(Total));
		
		
		

	}




	}


