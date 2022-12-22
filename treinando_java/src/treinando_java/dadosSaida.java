package treinando_java;

import java.util.Locale;
import java.util.Scanner;

public class dadosSaida {

	public static void main(String[] args) {
		// Importando o Locale.US
		Locale.setDefault(Locale.US);
		
		// Importando o Scanner
		Scanner sc = new Scanner(System.in);
		
		// Declarando as variáveis e seus dados
		String nome = "Carlos Felipe da Conceição";
		int idade = 28;
		double salario = 1600.00;
		
		// Mostrando dados na tela com print/println  
	/*	System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade + " Anos");
		System.out.println("Salário: " + salario + " Reais");
	*/
		// Mostrando dados na tela com printf
	//	System.out.printf("Me chamo %s, Tenho %d Anos e Recebo %.2f reais", nome, idade, salario);
		System.out.printf("Nome: %s %nIdade: %d Anos %nSalário: %.2f reais", nome, idade, salario);
		
		sc.close();
	}

}
