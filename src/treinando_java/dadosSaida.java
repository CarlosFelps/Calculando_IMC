package treinando_java;

import java.util.Locale;
import java.util.Scanner;

public class dadosSaida {

	public static void main(String[] args) {
		// Importando o Locale.US
		Locale.setDefault(Locale.US);
		
		// Importando o Scanner
		Scanner sc = new Scanner(System.in);
		
		// Declarando as vari�veis e seus dados
		String nome = "Carlos Felipe da Concei��o";
		int idade = 28;
		double salario = 1600.00;
		
		// Mostrando dados na tela com print/println  
	/*	System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade + " Anos");
		System.out.println("Sal�rio: " + salario + " Reais");
	*/
		// Mostrando dados na tela com printf
	//	System.out.printf("Me chamo %s, Tenho %d Anos e Recebo %.2f reais", nome, idade, salario);
		System.out.printf("Nome: %s %nIdade: %d Anos %nSal�rio: %.2f reais", nome, idade, salario);
		
		sc.close();
	}

}
