package jeu.cartes.carte;

import java.awt.Color;

public class Carte {
	
	private static final int NBR_COULEURS = 5;
	private static final int NBR_MOTIFS = 5;
	private static final int NBR_VALEURS = 5;
	
	private Color couleur;
	private Symbole motif;
	private int valeur;
	
	
	
	

	
	/**
	 * @return the nbrCouleurs
	 */
	public static int getNbrCouleurs() {
		return NBR_COULEURS;
	}

	
	/**
	 * @return the nbrMotifs
	 */
	public static int getNbrMotifs() {
		return NBR_MOTIFS;
	}

	
	/**
	 * @return the nbrValeurs
	 */
	public static int getNbrValeurs() {
		return NBR_VALEURS;
	}

	
	/**
	 * @return the couleur
	 */
	public Color getCouleur() {
		return couleur;
	}

	/**
	 * @return the motif
	 */
	public Symbole getMotif() {
		return motif;
	}

	/**
	 * @return the valeur
	 */
	public int getValeur() {
		return valeur;
	}

	public Carte() {
		super();
		forcerCarteVide();
		
	}
	
	public Carte(int valeur, int couleur, Symbole motif) {
		super();
		if (couleur<1 || couleur>NBR_COULEURS || valeur<1 || valeur>NBR_VALEURS) {
			System.out.println("Erreur de création de carte");
			forcerCarteVide();
		}
		else {
			this.couleur = Carte.getColor(couleur);
			this.motif = motif;
			this.valeur = valeur;
		}
		
	}


	private void forcerCarteVide() {
		this.couleur = Color.DARK_GRAY;
		this.motif = Symbole.VIDE;
		this.valeur = -1;
	}

	private static Color getColor(int couleur2) {
		Color coul;
		
		switch (couleur2) {
		case 1 : coul = Color.BLUE;break;
		case 2 : coul = Color.ORANGE;break;
		case 3 : coul = Color.CYAN;break;
		case 4 : coul = Color.BLACK;break; 
		case 5 : coul = Color.LIGHT_GRAY;break;
		default:
			coul = Color.DARK_GRAY;
			break;
		}
		return coul;
	}


	@Override
	public String toString() {
		return "Carte [couleur=" + couleur + ", motif=" + motif + ", valeur=" + valeur + "]";
	}
	
	
	
	

	
}
