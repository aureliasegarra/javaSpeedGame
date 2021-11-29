package jeu.cartes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import jeu.cartes.carte.Carte;


public class PaquetCarte {

	private static final int NBR_CARTES = 72;
	private List<Carte> cartes = new ArrayList<Carte>();
	
	
	public PaquetCarte() {
		super();
		Carte c = null;
		for (int couleur = 1; couleur <= Carte.NBR_COULEURS; couleur++) {
			for (int valeur = 1; valeur <= Carte.NBR_VALEURS; valeur++) {
				for (int motif = 1; motif <= Carte.NBR_MOTIFS; motif++) {
					c = new Carte(valeur, couleur, motif);
					System.out.println("la carte crée est C");
					cartes.add(c);
				}
			}
		}
		// on mélange les cartes et on fait en sorte qu'il n'en reste que 72
		Collections.shuffle(cartes);
		for (int i = cartes.size(); i > NBR_CARTES; i--) {
			cartes.remove(0);
		}
	}
	
	public PaquetCarte(PaquetCarte p1, int n) {
		super();
		if(n <= p1.size()) {
			for(int i=0; i< n; i++) {
				this.add(p1.remove(0));
			}
		}else {
			System.out.println("Probleme de taille du paquet !");
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
		 return cartes.size()+" / Paquet [cartes=" + cartes + "]";
	}



	
	

	
	
}
