import java.util.Scanner;

public class notaAlun {

	public static void main(String[] args) {
		float nota1;

		float nota2;

		float nota3;

		float nota4;

		float media_aluno;

		

		Scanner leTeclado = new Scanner(System.in);

		

		System.out.println("Digite a primera nota.");

		nota1 = leTeclado.nextFloat();

		// repete enquanto o operador digitar notas maiores que 10 ou menores que 0.

		while(nota1 > 10 || nota1 < 0) { 

			System.out.println("Digite notas de 0 a 10");

			nota1 = leTeclado.nextFloat();

		}

		

		System.out.println("Digite a segunda nota.");

		nota2 = leTeclado.nextFloat();

		while(nota2 > 10 || nota2 < 0) {

			System.out.println("Digite notas de 0 a 10");

			nota2 = leTeclado.nextFloat();

		}

		

		System.out.println("Digite a terceira nota.");

		nota3 = leTeclado.nextFloat();

		while(nota3 > 10 || nota3 < 0) {

			System.out.println("Digite notas de 0 a 10");

			nota3 = leTeclado.nextFloat();

		}

		

		System.out.println("Digite a quarta nota.");

		nota4 = leTeclado.nextFloat();

		while(nota4 > 10 || nota1 < 0) {

			System.out.println("Digite notas de 0 a 10");

			nota4 = leTeclado.nextFloat();

		}

		

		media_aluno = (nota1 + nota2 + nota3 + nota4) / 4; 

		System.out.println("A média do aluno é: "+media_aluno);

		

		if(media_aluno <= 4) {

			System.out.println("O aluno esta Reprovado");	

		}

		else if(media_aluno >= 7) {

			System.out.println("O aluno esta Aprovado");	

		}

		else {

			System.out.println("O aluno esta Exame Final");

		}	

	}



	}


