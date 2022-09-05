package projet;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class testJoueur {
    
    @Test
    void testJoueur(){
        Joueur j1 = new Joueur("David");

        assertEquals("David", j1.getNom());
        assertNotEquals("philibert", j1.getNom());  
  }
}

