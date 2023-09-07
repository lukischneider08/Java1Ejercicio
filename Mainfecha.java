package com.educacionitJava.Ejercicio1java;

import java.util.Scanner;

public class Mainfecha {

	public static void main(String[] args) {

		int dia = ingreseDia();

		System.out.println("Dia ingresado.");

		int mes = ingreseMes();

		System.out.println("Mes ingresado.");

		int anio = ingreseAnio();

		System.out.println("Anio ingresado.");

		if (validar(dia, mes, anio)) {

			if (mes == 2) {

				System.out.println("Mes de Febrero ingresado");
			}

			else if (anio % 4 != 0 && anio % 100 != 0 && anio % 400 != 0) {

				System.out.println(anio + "NO es un anio bisiesto");

			}

			else {

				System.out.println(anio + " ES un anio bisiesto");

			}

			System.out.println("Fecha ingresada:" + dia + "/" + mes + "/" + anio);

		}

		else {

			System.out.println("Fecha incorrecta, intente nuevamente");

		}

	}

	public static int ingreseDia() {

		System.out.println("Ingrese el dia: ");

		Scanner teclado = new Scanner(System.in);

		int dia = teclado.nextInt();

		return dia;

	}

	public static int ingreseMes() {

		System.out.println("Ingrese el mes: ");

		Scanner teclado = new Scanner(System.in);

		int mes = teclado.nextInt();

		return mes;

	}

	public static int ingreseAnio() {

		System.out.println("Ingrese en anio: ");

		Scanner teclado = new Scanner(System.in);

		int anio = teclado.nextInt();

		return anio;
	}

	static boolean validar(int dia, int mes, int anio) {

		if (anio >= 1900 && anio <= 2099 && mes >= 1 && mes <= 12) {

			int limitardia = 31;

			if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {

				limitardia = 30;

			} else if (mes == 2) {

				if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {

					limitardia = 29;

				} else {

					limitardia = 28;
				}
			}

			return dia >= 1 && dia <= limitardia;

		}

		return false;

	}

}
