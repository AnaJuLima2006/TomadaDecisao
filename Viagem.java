package lista2TomadaDecisao;
import java.util.Scanner;
public class exeInedito {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int destino, dias;
		double custo;

		System.out.println("Digite o seu destino: ");
		destino = ler.nextInt();
		System.out.println("Digite o a quantidade de dias: ");
		dias =  ler.nextInt();
		if (destino == 1){
			if (dias <= 5) {
				System.out.println("Calcule o custo di�rio: ");
				custo = 240 * dias;
				System.out.println("O custo da did�ria �: " + custo);
			}
			else if (dias <= 10 )  {
				System.out.println("Calcule o custo di�rio: ");
				custo = (220 * dias) + 130;
				System.out.println("O custo da did�ria �: " + custo);
			}
			else {
				System.out.println("Calcule o custo di�rio: ");
				custo = (210 * dias) + 150 ;
				System.out.println("O custo da did�ria �: " + custo);
			}
		}
		else {
			if (dias <= 5  )  {
				System.out.println("Calcule o custo di�rio: ");
				custo = (400 * dias) + 100 ;
				System.out.println("O custo da did�ria �: " + custo);
			}
			else if (dias <= 10 )  {
				System.out.println("Calcule o custo di�rio: ");
				custo = (410 * dias) + 150;
				System.out.println("O custo da did�ria �: " + custo);
		    }
			else { 
				System.out.println("Calcule o custo di�rio: ");
				custo = (420 * dias) + 200;
				System.out.println("O custo da did�ria �: " + custo);
			}	
	}
  }
}