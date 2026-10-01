package com.bootcamp.helper;

import java.util.Scanner;

public class ConsoleApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("=========================================");
		System.out.println(" PRODUCTOS SERVICE");
		System.out.println("=========================================");
		System.out.println("1. Calcular IVA");
		System.out.println("2. Calcular Descuento");
		System.out.print("Seleccione una opción: ");

		int opcion = scanner.nextInt();

		System.out.print("Ingrese el precio del producto: $");
		double precio = scanner.nextDouble();

		System.out.println("-----------------------------------------");

		switch (opcion) {
			case 1:
				double iva = new TaxCalculator().calculateIva(precio);
				double totalConIva = precio + iva;
		
				System.out.printf("Precio base: $%.2f%n", precio);
				System.out.printf("IVA (16%%): $%.2f%n", iva);
				System.out.printf("Total: $%.2f%n", totalConIva);
				break;
			
			case 2:
				System.out.print("Ingrese el porcentaje de descuento: ");
				double porcentaje = scanner.nextDouble();
		
				double descuento = precio * (porcentaje / 100);
				double precioFinal = precio - descuento;
		
				System.out.printf("Precio original: $%.2f%n", precio);
				System.out.printf("Descuento %.2f%%: $%.2f%n", porcentaje, descuento);
				System.out.printf("Precio final: $%.2f%n", precioFinal);
				break;
	
			default:
				System.out.println("Opción no válida.");
		}

		System.out.println("=========================================");

		scanner.close();
	}
}