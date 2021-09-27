package jeu.cartes.carte;

public enum Symbole {
	ARBRE, FANION, ETOILE, BALLON, MAISON, VIDE;
	
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

		default:
			texte = "VIDE";
			break;
		}
		return texte;
	}

	
	
}


