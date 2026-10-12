package com.bootcamp.helper;

public class DiscountCalculator {
	
	public double calcularDescuento(double precio, double porcentaje) {
    	
    	if(porcentaje <= 0) return precio;
    	
    	if(precio <= 0 || porcentaje > 100) return 0;

    	return precio - (precio * porcentaje / 100);
    	
    }
}
