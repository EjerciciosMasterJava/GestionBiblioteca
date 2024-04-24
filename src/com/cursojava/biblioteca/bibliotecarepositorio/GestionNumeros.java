package com.cursojava.biblioteca.bibliotecarepositorio;

import java.util.Scanner;

public class GestionNumeros {

	/**
	 * Leer por teclado un numero, en caso de error se notifica y pide volver a introducir un numero valido
	 * @param frase la frase a mostrar
	 * @param scan el Scanner
	 * @return el numero leido
	 */
	public static Integer scanNumero(String frase, Scanner scan) {
		Integer ret = -1;
		Boolean error = true;
		do {
			try {
				System.out.println(frase);
				ret = Integer.parseInt(scan.nextLine());
				error = false;
			} catch (Exception e) {
				System.out.println("Error. Solo se admiten numeros.");
				error = true;
			}
		} while (error);
		return ret;
	}
	
}
