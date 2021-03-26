package Exercicios;

import java.util.Scanner;

public class Divisão {
	static void main (String[] args)
	{
		double resultado;
		int valor1, valor2;
		String retorno;
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Digite o primeiro valor: ");
		valor1 = scanner.nextInt();
		System.out.println("Digite o segundo valor: ");
		valor2 = scanner.nextInt();
		
		if (valor2 == 0) {
			 do {
				 System.out.println("O segundo valor não pode ser igual a zero, pro favor digite novamente: ");
				 valor2 = scanner.nextInt(); 				 
			 }while (valor2 == 0);
			 
		}  
		resultado = valor1 / valor2;
		retorno = valor1 + "/" + valor2 + "=" + resultado;
		System.out.println(retorno);
				
	}
}
