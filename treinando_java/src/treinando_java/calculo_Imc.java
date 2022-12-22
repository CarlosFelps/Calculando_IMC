package treinando_java;
import java.util.Locale;
import java.util.Scanner;

public class calculo_Imc {

	public static void main(String[] args) {
		int idade;
		String nome, sobrenome;
		double peso, altura, imc;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite sua idade: ");
		idade = sc.nextInt();
		
		System.out.print("Digite seu nome: ");
		nome = sc.next();
		
		System.out.print("Digite seu sobrenome: ");
		sobrenome = sc.next();
		
		System.out.print("Digite seu peso: ");
		peso = sc.nextDouble();
		
		System.out.print("Digite sua altura: ");
		altura = sc.nextDouble();
		System.out.println("=============== RESULTADO ===============");
		
		imc = peso/(altura*altura);
		System.out.printf("Idade: %d Anos %nNome/Sobrenome: %s %s %nPeso: %.2f %nAltura: %.2f%n", idade, nome, sobrenome, peso, altura);
		System.out.printf("Resultado IMC: %.3f ", imc);
		
		sc.close();
		
		
		
		
		
		

	}

}
