package lista2TomadaDecisao;
import java.util.Scanner;
public class exe4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double a, b, c, delta, x1, x2;
		System.out.println("Digite o valor de a: ");
		a = ler.nextDouble();
		System.out.println("Digite o valor de b: ");
		b = ler.nextDouble();
		System.out.println("Digite o valor de c: ");
		c = ler.nextDouble();
		delta = (b*b)-4*a*c;
		System.out.println("Delta = " + delta);
		if (delta <0)  {
			System.out.println("Não existem raízes reais"); 
		}else if (delta == 0) {
			x1 = -b / (2*a);
			System.out.println("Existe uma raíz real  x1: " + x1);
		} else {
			x1 = (-b+Math.sqrt(delta))/(2*a);
			x2 = (-b-Math.sqrt(delta))/(2*a);
			System.out.println("Tem duas raízes x1 =" + x1 + "e x2 " + x2);
		}
	}
}
