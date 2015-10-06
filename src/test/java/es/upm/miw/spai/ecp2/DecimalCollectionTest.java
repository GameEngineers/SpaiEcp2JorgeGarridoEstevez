package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import es.upm.miw.spai.ecp2.DecimalCollection;

public class DecimalCollectionTest {

    private DecimalCollection c;

    @Before
    public void before() {
        c = new DecimalCollection();
        c.add(3.23);
        c.add(2.45);
        c.add(-10.67);
    }

    @Test
    public void testSum() {
        assertEquals(-4.99, c.sum(), 10e-5);
    }
    
    public void testSize(){
    }

    public void testHigher() {
        assertEquals(3.23, c.higher(),10e-5);
    }

    
}