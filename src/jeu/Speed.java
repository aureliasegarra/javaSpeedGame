package jeu;

import jeu.cartes.PaquetCarte;
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
		
		PaquetCarte pc1 = new PaquetCarte();
		System.out.println("taille du paquet de carte"+ pc1.size());
		
		System.out.println(pc1);
	}
	
}
