package com.bootcamp.helper;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiscountCalculatorTest {

	@Test
	void shouldReturnDiscountCorrectly() {
    	double price = 100.0;
    	double porcentageOfDiscount = 50.0;
    	
    	DiscountCalculator helper = new DiscountCalculator();
        
        double discount = helper.calcularDescuento(price, porcentageOfDiscount);
        
        assertEquals(50.0, discount, 0.001);
    }
	
	@Test
	void shouldReturnFullPriceWhenDiscountIsZeroOrNegative() {
		DiscountCalculator helper = new DiscountCalculator();

        assertEquals(100.0, helper.calcularDescuento(100.0, 0), 0.001);
    }
	
	@Test
	void shouldReturnZeroWhenDiscountIsOverOneHundredOrPriceIsNegative() {
		DiscountCalculator helper = new DiscountCalculator();

        assertEquals(0.0, helper.calcularDescuento(200.0, 1000), 0.001);
        assertEquals(0.0, helper.calcularDescuento(-100.0, 50), 0.001);
    }
	
}
