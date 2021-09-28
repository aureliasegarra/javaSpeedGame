package jeu;

import java.util.Collections;

import jeu.cartes.PaquetCarte;

public class Joueur {

	private String nom;
	private PaquetCarte pc;

	
	public Joueur(String nom, PaquetCarte pc) {
		super();
		this.nom = nom;
		this.pc = pc;
	} 

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @param pc the pc to set
	 */
	public void setPc(PaquetCarte pc) {
		this.pc = pc;
	}

	
	

}
