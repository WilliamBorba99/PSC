package Exercicios;

import java.util.Scanner;

public class Media {
	static void main (String[] args)
	{
		double media;
		int nota1, nota2, nota3;
		String retorno;
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Digite sua primeira nota: ");
		nota1 = scanner.nextInt();
		System.out.println("Digite sua segunda nota: ");
		nota2 = scanner.nextInt();
		System.out.println("Digite sua terceira nota: ");
		nota3 = scanner.nextInt();	
		
		media = (nota1 + nota2 + nota3) / 3;
		if (media > 7)
			System.out.println("Aprovado");
		else
			System.out.println("Reprovado");
		
		media = (nota1 + nota2 + nota3) / 3;
		retorno = nota1 + "+" + nota2 + "+" + nota3 + "/ 3 ="+ media;
		System.out.println(retorno);
						
	}

}
