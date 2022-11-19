package lista2TomadaDecisao;
import java.util.Scanner;
public class exe5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double a, b, c  ;
		System.out.println("Digite o valor do lado A: ");
		a = ler.nextDouble();
		System.out.println("Digite o valor do lado B: ");
		b =  ler.nextDouble();
		System.out.println("Digite o valor do lado C: ");
		c =  ler.nextDouble();
		if (a > (b + c) || b > (a + c) || c > (a + b)) {
			System.out.println("Não é um triângulo");
		} else if  (a  == b && b == c && a == c) {
			System.out.println("É um triângulo equilátero");
		} else if  (a !=  b && b != c && a != c  ) {
			System.out.println("É um triângulo escaleno ");
		} else {
			System.out.println("É um triangulo isósceles");
	   }
	}	
}
