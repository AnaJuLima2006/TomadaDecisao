package lista2TomadaDecisao;

import java.util.Scanner;

public class exe8 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner (System.in);
	    int n1, n2, m, exame, notaN;
		System.out.println("Digite a primeira nota:");
		n1 = leitura.nextInt();
		System.out.println("Digite a segunda nota:");
		n2 = leitura.nextInt();
		m = n1+n2/2;
		System.out.println("A sua nota �:" + m);
		if (m<3) {
			System.out.println("Sua nota � " + m + " voc�  est� reprovado!");
		}else if(m>6) {
			System.out.println("Sua nota � " + m + " voc�  est� aprovado!");
		}else if(m>3 & m<6) {
			System.out.println("Sua nota � " + m + " voc�  realiz� o exame!");
		}
		System.out.println("Digite a nota do exame:");
		exame = leitura.nextInt();
		notaN = (m+exame)/2;
		if(notaN>=6) {
			System.out.println("Sua nota de recupera��o � " + notaN + " voc� passou!");
		}
	}

}
