package Agile_TP3.book1;

public class Livre 
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private String name = "Le Petit Prince";
    private int age = 0;
    private Prix prixLivre;
    private Librairie librairie;
    public Livre () {
    	this.prixLivre = new Prix();
    }
    
    public int ageDeLivre(Prix z, int y)
    {
        this.prixLivre = z;
        this.age += y;
        return this.age;
    }
    
    public void setPrix(Prix p)
    {
        this.prixLivre = p;

    }
    
    public void setLibrairie(Librairie lb)
    {
    	this.librairie = lb;
    }
    
    public Librairie getLibrairie() {
    	return this.librairie;
    }

	public String getName() {
		return this.name;
	}

	public Prix getPrice() {
		return this.prixLivre;
	}
 
}


