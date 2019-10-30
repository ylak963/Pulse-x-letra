package es.studium.PulseF;

import java.util.Scanner;

public class PulseF {

	public static void main(String[] args) {
		String letra;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escriba una letra:");
		letra=teclado.nextLine();
		
		//Mientras la letra no sea igual a la f
		while(!letra.equals("f"))
		{
			System.out.println("La letra indicada es:"+letra);
			System.out.println("Escriba otra letra(f para fin):");
			letra=teclado.nextLine();
		}
		teclado.close();

	}

}
