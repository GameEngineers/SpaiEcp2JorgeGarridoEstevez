package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import es.upm.miw.spai.ecp2.Fraction;

public class FractionTest {

	private Fraction f;

	@Before
	public void before() {
		f = new Fraction(1, 2);
	}

	@Test
	public void testDecimal() {
		assertEquals(0.5, f.decimal(), 0);
	}

	@Test
	public void testGetNumerator() {
		assertEquals(1, f.getNumerator());
	}

	@Test
	public void testGetDenominator() {
		assertEquals(2, f.getDenominator());
	}

	@Test
	public void testDivide() {
		Fraction fr = f.divide(new Fraction(1, 2));
		assertEquals(0.25, fr.decimal(),0);
	}
	
	@Test
    public void testMultiply() {
        Fraction fraction = f.multiply(new Fraction (8, 1));
        assertEquals(4, fraction.decimal(), 10e-5);
    }

}
