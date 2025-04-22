/*
 * OrdemCrescente.java
 * 
 * 
 * 
 * 
 */

import java.util.Scanner;

public class OrdemCrescente {
	
	public static void main (String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		int val1 = 0;
		int val2 = 0;
		
		System.out.print("Digite um valor: ");
		val1 = entrada.nextInt();
		
		System.out.print("Digite outro valor: ");
		val2 = entrada.nextInt();
		
		String res = (val1 > val2 ? val1 +" "+ val2 : val2 +" "+ val1);
		
		System.out.print(res);
	}
}

