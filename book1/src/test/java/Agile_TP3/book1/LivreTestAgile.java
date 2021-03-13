package Agile_TP3.book1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LivreTestAgile
{
    private Livre livreObjet;
    private Prix prixObjet;
    private Librairie librairie1;

    public LivreTestAgile()
    {
    }

    @BeforeEach
    public void setUp() // throws java.lang.Exception
    {
        // Initialisez ici vos engagements
        livreObjet = new Livre();
        prixObjet = new Prix();
        librairie1 = new Librairie();
        livreObjet.setPrix(prixObjet);
        librairie1.addLivre(livreObjet);
    }


    @AfterEach
    public void tearDown() // throws java.lang.Exception
    {
        //Libérez ici les ressources engagées par setUp()
    }

    @Test
    public void test()
    {
        assertEquals(77,this.livreObjet.ageDeLivre(null,77));
    }


    @Test
    public void test2()
    {
        livreObjet.setPrix(prixObjet);
        assertEquals(5,this.livreObjet.ageDeLivre(null,5));
    }

    @Test
    public void test3()
    {
        extractedTest3();
    }

	public void extractedTest3() {
		assertTrue(librairie1.livreList.contains(livreObjet));
        assertEquals(livreObjet.getLibrairie(),librairie1);
	}
    

}


