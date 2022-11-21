import java.util.Scanner;
public class Imc {
	public static void main(String[]args) {
		Scanner leitura = new Scanner(System.in);
		double peso, altura, imc;
		System.out.println("Digite seu peso:");
		peso = leitura.nextDouble();
		System.out.println("Digite sua altura:");
		altura = leitura.nextDouble();
		imc = peso/(altura*altura);
		if (imc<=18) {
			System.out.println("Você está exesso de magreza!");
		}else if (imc<=25) {
			System.out.println("Você está com o peso normal!");
		}else if (imc<=30) {
			System.out.println("Você está exesso de peso!");
		}else if (imc<=35) {
			System.out.println("Você está com obesidade (grau I)!");
		}else if (imc<=40) {
			System.out.println("Você está com obesidade (grau II)!");
		}else{
			System.out.println("Você está com obesidade (grau III)!");
		}
		leitura.close();
			
	}
}
