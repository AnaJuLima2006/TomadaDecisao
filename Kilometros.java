package lista2TomadaDecisao;
import java.util.Scanner;
public class exe2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double km, l, gasto;
		System.out.println("Digite o valor da ditancia percorrida (em km): ");
		km = ler.nextDouble();
		System.out.println("Digite o valor da capacidade do tanque de combustível (em litros): ");
		l =  ler.nextDouble();
		gasto = km / l;
		System.out.println("O seu gasto foi de: " + gasto);
		if (gasto >= 10) {
			System.out.println("O carro é economico");
		} else {
			System.out.println("O carro não é economico");
		}
	}
}
