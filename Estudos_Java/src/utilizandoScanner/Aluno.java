package utilizandoScanner;
/**
 * <h1>Aluno</h1>
 * <p>nota: este projeto serve como uma tentativa de 
 * aplicar todo o conhecimento que tenho no Java
 * fazendo assim, uma simples aplicação.</p>
 * 
 * @author Victor Ricardo :)
 * @version 1.0
 * @since 19/01/2023
 * 
 * */
import java.util.Locale;
import java.util.Scanner;

public class Aluno {

	public static void main(String[] args) {
		//Variável que vai armazenar o resultado da equação
		double result;
		
		//Instânciação do Scanner criando uma nova variavel pra ele
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		/*
		 Digite seu nome, o valor digitado vai ser armazenado
		 atravez da instanciação da variavel nome com a variavel sc
		 no qual armazenará a variável nome com o valor digitado.
		 */
		System.out.print("Digite seu nome: ");
		String nome = sc.next();
		
		System.out.println("Digite a primeira nota: ");
		int nota1 = sc.nextInt();
		
		System.out.println("Digite a segunda nota: ");
		int nota2 = sc.nextInt();
		
		//Result armazena o resultad da equação
		result = (nota1 + nota2)/2;
		
		System.out.println("Media de "+ nome +": "+ result);
}
}
