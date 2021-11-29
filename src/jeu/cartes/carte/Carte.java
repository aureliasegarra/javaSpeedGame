package jeu.cartes.carte;

import java.awt.Color;

import jeu.Joueur;

public class Carte {
	
	public static final int NBR_COULEURS = 5;
	public static final int NBR_MOTIFS = 5;
	public static final int NBR_VALEURS = 5;
	
	private Color couleur;
	private Symbole motif;
	private int valeur;
	
	
	
	public Carte() {
		super();
		forcerCarteVide();
		
	}
	

	
	public Carte(int valeur,int couleur, int motif) {
		super();
		if(valeur>=1 && valeur <= NBR_VALEURS) {
			if (couleur >= 1 && couleur<=NBR_COULEURS) {
				this.valeur = valeur;
				this.couleur = Carte.getColor(couleur);
				this.motif = Symbole.get(motif);
			}
			else {
				System.out.println("PROBLEME COULEUR");
				forcerCarteVide();
			}}
		else {
			System.out.println("PROBLEME VALEUR");
			forcerCarteVide();
		}
	}
	
	@SuppressWarnings("unused")
	private Carte(int valeur,int couleur, Symbole motif) {
		super();
		if(valeur>=1 && valeur <= NBR_VALEURS) {
			if (couleur >= 1 && couleur<=NBR_COULEURS) {
				this.valeur = valeur;
				this.couleur = Carte.getColor(couleur);
				this.motif = motif;
			}
			else {
				System.out.println("PROBLEME COULEUR");
				forcerCarteVide();
			}}
		else {
			System.out.println("PROBLEME VALEUR");
			forcerCarteVide();
		}
	}
	
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

	public boolean estCompatible(Carte c2) {
		boolean compatible=true;
		if (this.isVide() || c2.isVide()) {
			compatible=false;
		}
		else {
			if(!this.couleur.equals(c2.couleur) 
				&& this.valeur!=c2.valeur 
				&&!this.motif.equals(c2.motif)) {
				compatible=false;
			}
		}
		return compatible;
	}

	public boolean isVide() {
		return this.valeur==-1 && this.motif==Symbole.VIDE && this.couleur==Color.DARK_GRAY;
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
