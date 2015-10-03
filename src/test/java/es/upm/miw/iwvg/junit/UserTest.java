package es.upm.miw.iwvg.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UserTest {

    private User u;
    
    @Before
    public void before(){
        u = new User(1234, "Jorge", "garrido");
    }
    
    @Test
    public void testFullName(){
        assertEquals("Jorge Garrido",u.fullName());
    }
    
    @Test
    public void testInitials(){
        assertEquals("J.", u.initials());
    }
    
    @Test 
    public void testGetNumber(){
        assertEquals(1234, u.getNumber());
    }
    
    @Test 
    public void testGetName(){
        assertEquals("Jorge", u.getName());
    }
    
    @Test
    public void testGetFamilyName(){
        assertEquals("Garrido", u.getFamilyName());
    }
   
}
