package es.upm.miw.iwvg.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

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

}
