package jeu.cartes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import jeu.cartes.carte.Carte;
import jeu.cartes.carte.Symbole;


public class PaquetCarte {

	private static final int NBR_CARTES = 72;
	private List<Carte> cartes = new ArrayList<Carte>();
	
	
	public PaquetCarte() {
		super();
		for (int couleur = 1; couleur <= Carte.NBR_COULEURS; couleur++) {
			for (int valeur = 1; valeur <= Carte.NBR_VALEURS; valeur++) {
				for (int motif = 1; motif <= Carte.NBR_MOTIFS; motif++) {
					cartes.add(new Carte(couleur, valeur, Symbole.get(motif)));
				}
				
			}
		}
		
		Collections.shuffle(cartes);
		for (int i = cartes.size(); i > NBR_CARTES; i--) {
			cartes.remove(0);
		}
	}
	
	/**
	 * pattern façade : redéfinit les méthodes de List directement sur PaquetCarte
	 * @return
	 */
	
	public int size() {
		return cartes.size();
	}
	
	public boolean add(Carte carte) {
		return cartes.add(carte);
	}
	
	public Carte get(int indice) {
		return cartes.get(indice);
	}
	
	public Carte remove(int indice) {
		return cartes.remove(indice);
	}

	@Override
	public String toString() {
		return "PaquetCarte taille : "+ this.size()+ " ->" + cartes;
	}



	
	

	
	
}
