package lista2TomadaDecisao;
import java.util.Scanner;
public class exe1 {

	public static void main(String[] args) {
        Scanner leitura = new Scanner (System.in);
	
		int anoNasc, anoAtual, idade;
		
		
		System.out.println("Digite o ano de nascimento:");
		anoNasc = leitura.nextInt();
		System.out.println("Digite o ano atual: ");
		anoAtual = leitura.nextInt();
		idade = anoAtual-anoNasc;
		System.out.println("A idade é " + idade);
		if (idade<10) { 
			System.out.println("Criança");
		} else if(idade<18) {
			System.out.println("Adolescente");
		} else if( idade<60) {
			System.out.println("Adulto");
		} else if(idade>60) {
			System.out.println("Idoso");}

	}
}
