package Agile_TP3.book1;

import java.util.ArrayList;

public class Librairie {
private String librairieName;
public ArrayList<Livre> livreList = new ArrayList<Livre> ();
public Livre livre;
public Librairie(String bookstore) {
	this.librairieName = bookstore;
	this.livre = new Livre();
}

public void addLivre(Livre l) {
	if (l.getLibrairie() == null) {
		this.livreList.add(l);
		l.setLibrairie(this);
	}
}

public String getLibrairie() {
	return this.librairieName;
}

public Livre getBook() {
	return this.livre;
}


}
