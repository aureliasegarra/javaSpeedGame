package jeu.cartes.carte;

public enum Symbole {
	ARBRE, FANION, ETOILE, BALLON, MAISON,CHEVAL, VIDE; // ce sont des instances de l'enum Symbole
	
	public static final Symbole[] LES_SYMBOLES = Symbole.values();
	public static final int NBR_SYMBOLES = LES_SYMBOLES.length ;
	
	@Override
	public String toString() {
		String texte = "";
		switch (this) {
		case ARBRE: texte ="arbres"; break;
		case FANION: texte ="fanion"; break;
		case ETOILE: texte ="etoile"; break;
		case BALLON: texte ="ballon"; break;
		case MAISON: texte ="maison"; break;
		case CHEVAL: texte ="cheval"; break;

		default:
			texte = "VIDE";
			break;
		}
		return texte;
	}
	
	public static Symbole get(int i) {
		return LES_SYMBOLES[i-1];
	}

	
	
}


