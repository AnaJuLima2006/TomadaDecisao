package lista2TomadaDecisao;
import java.util.Scanner;
public class exe6 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a, b, c;
		System.out.println("Digite o valor de a: ");
		a = ler.nextInt();
		System.out.println("Digite o valor de b: ");
		b = ler.nextInt();
		System.out.println("Digite o valor de c: ");
		c = ler.nextInt();
		if (a < b && b < c) {
			System.out.println("O valores s�o:" + a,+ b,+ c);
		} else if (a < c && c < b) {
		System.out.println("O valores s�o:" + a,+ c,+ b);	
		}else if ( b < a && a < c) {
			System.out.println("O valores s�o:" + b, + a, + c);
		}else if ( b < c && c < a) {
			System.out.println("O valores s�o:" + b, + c, + a);
		}else if ( c < a && a < b) {
			System.out.println("O valores s�o:" + c, +  a, + b);
		}else ( c < b && b < a) {
			System.out.println("O valores s�o:" + c, + b, + a);
		}	
	}

}
