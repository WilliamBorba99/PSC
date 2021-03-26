package Exercicios;

import java.util.Scanner;

public class Multiplicação {
	public static void main (String[] args) {		
		int valor1,valor2,resultado;
		String retorno;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o primeiro valor: ");
		valor1 = scanner.nextInt();
		System.out.println("Digite o segundo valor: ");
		valor2 = scanner.nextInt();
		
		resultado = valor1 * valor2;
		retorno = valor1 + "*" + valor2 + "=" + resultado;
		System.out.println(retorno);
		
	}
}
