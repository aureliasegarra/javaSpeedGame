package jeu.cartes.carte;

public enum Symbole {
	ARBRE("arbres"), FANION("fanion"), ETOILE("étoile"), BALLON("ballon"), MAISON("maison"),CHEVAL("cheval"), VIDE(" vide "); // ce sont des instances de l'enum Symbole
	
	public static final Symbole[] LES_SYMBOLES = Symbole.values();
	public static final int NBR_SYMBOLES = LES_SYMBOLES.length ;
	
	private String texte;
	
	private Symbole(String string) {
		this.texte = string;
	}
	

	
	public static Symbole get(int i) {
		return LES_SYMBOLES[i-1];
	}

	@Override
	public String toString() {
		return this.texte;
	}
	
}


