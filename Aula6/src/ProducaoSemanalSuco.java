import java.util.Scanner;

public class ProducaoSemanalSuco {

    public static void main(String[] args) {
       
        int qtd_garrafas;
        float total_litros;
        int opcao_de_suco;
        float valor=0.0f;
       
        do {
        System.out.println("___________________________________________");
        System.out.println("Digite o tipo de suco a ser produzido:");
        System.out.println("___________________________________________");
        System.out.println("[1] - Suco de Limão");
        System.out.println("[2] - Suco de Tangerina");
        System.out.println("[3] - Suco de Uva");
        System.out.println("[4] - Suco de Manga");
        System.out.println("[0] - Encerrar o programa");
        System.out.println("___________________________________________");
        System.out.println();
       
        Scanner captura = new Scanner(System.in);
        opcao_de_suco = captura.nextInt();
        switch(opcao_de_suco) {
        case 1:
        	
        	System.out.println("Digite a qtd garrafas");
        	qtd_garrafas = captura.nextInt();
        	while(qtd_garrafas < 30000 || qtd_garrafas > 500000) { 
            System.out.println("Informe a quantidade de garrafas Maior que 30000 e manor 500000");
            qtd_garrafas = captura.nextInt();
        	} 
        
            total_litros = qtd_garrafas * 0.0125f;
            total_litros = total_litros * 1.02f;
            System.out.println("A qtd de suco de limão a ser comprado é: "+total_litros+" litros");
           
            valor=total_litros *1.5f;
            System.out.println("O custo do litro de suco de limão é : "+valor +"real");
            break;
            
           
        case 2:
        	System.out.println("Digite a qtd garrafas");
        	qtd_garrafas = captura.nextInt();
        	while(qtd_garrafas < 30000 || qtd_garrafas > 500000) { 
            System.out.println("Informe a quantidade de garrafas Maior que 30000 e manor 500000");
            qtd_garrafas = captura.nextInt();
        	} 
        	
            total_litros = qtd_garrafas * 0.025f;
            total_litros = total_litros * 1.02f;
            System.out.println("A qtd de suco de tangerina a ser comprado é: "+total_litros+" litros");
            valor=total_litros *0.85f;
            System.out.println("O custo do litro de suco de Tangerina é : "+valor +"real");
            break;
           
        case 3:
        	System.out.println("Digite a qtd garrafas");
        	qtd_garrafas = captura.nextInt();
        	while(qtd_garrafas < 30000 || qtd_garrafas > 500000) { 
            System.out.println("Informe a quantidade de garrafas Maior que 30000 e manor 500000");
            qtd_garrafas = captura.nextInt();
        	} 
        	
            total_litros = qtd_garrafas * 0.045f;
            total_litros = total_litros * 1.02f;
            System.out.println("A qtd de suco de uva a ser comprado é: "+total_litros+" litros");
            valor=total_litros *1.75f;
            System.out.println("O custo do litro de suco de Uva é : "+valor +"real");
            break;
           
        case 4:
        	System.out.println("Digite a qtd garrafas");
        	qtd_garrafas = captura.nextInt();
        	while(qtd_garrafas < 30000 || qtd_garrafas > 500000) { 
            System.out.println("Informe a quantidade de garrafas Maior que 30000 e manor 500000");
            qtd_garrafas = captura.nextInt();
        	} 
        	
            total_litros = qtd_garrafas * 0.03f;
            total_litros = total_litros * 1.02f;
            System.out.println("A qtd de suco de manga a ser comprado é: "+total_litros+" litros");
            valor=total_litros *2.30f;
            System.out.println("O custo do litro de suco de Manga é : "+valor +"real");
            break;
       
        default:
            if (opcao_de_suco != 0)
                System.out.println("Opção Invalida, refaça a operação!");
            //break;
        }
       
       }while(opcao_de_suco != 0);
        System.out.println("********* PROGRAMA ENCERRADO **************");
    }

}