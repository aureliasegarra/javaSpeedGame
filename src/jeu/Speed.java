package jeu;

import controleur.Controleur;
import jeu.cartes.carte.Carte;
import jeu.cartes.carte.Symbole;

public class Speed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new Controleur();
		System.out.println(Symbole.FANION);
		
		Carte carteVide = new Carte();
		System.out.println(carteVide);
		Carte carte2 = new Carte(1, 2, Symbole.MAISON);
		System.out.println(carte2);
	}
	
}
