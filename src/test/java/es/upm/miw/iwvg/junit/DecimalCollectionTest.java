package es.upm.miw.iwvg.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DecimalCollectionTest {

    private DecimalCollection c;

    @Before
    public void before() {
        c = new DecimalCollection();
        c.add(3);
        c.add(2);
    }

    @Test
    public void testSum() {
        assertEquals(5, c.sum(), 0);
    }
    
    public void testSize(){
        assertEquals(2, c.size());
    }

    public void testHigher() {
        assertEquals(3, c.higher(), 0);
    }

    
}
