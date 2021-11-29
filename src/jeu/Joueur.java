package jeu;



import jeu.cartes.PaquetCarte;
import jeu.cartes.carte.Carte;

public class Joueur {

	public static final int PENALITE = 3;
	private String nom;
	private PaquetCarte pc;
	public int penalite;
	

	
	public Joueur(String nom, PaquetCarte pc) {
		super();
		this.nom = nom;
		this.pc = pc;
	}


	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}


	public Carte remove(int i) {
		return pc.remove(i);
	}


	public Carte get(int i) {
		return pc.get(i);
	}


	public boolean add(Carte carte) {
		return this.pc.add(carte);
		
	}


	public int size() {	
		return this.pc.size();
	}


	public boolean gagne() {		
		return this.pc.get(0).isVide();
	}

	private void annulerPenalite() {
		this.penalite=0;
	}

	private void ajouterPenalite() {
		this.penalite=PENALITE;
	}
	
	public boolean sansPenalite() {
		return true;
	}
	
	private void oterEventuellementUnePenalite() {
		if(!this.sansPenalite()) {
			this.penalite--;
		}
	}

	public void gererErreur(Joueur autreJoueur) {
		//annuler l'éventuelle penalité
		autreJoueur.annulerPenalite();
		//mettre une pénalité maximale sur le joueur this
		this.ajouterPenalite();
	}


	public Carte testerCarteSommet(int i, Carte sommet1, Joueur autreJoueur) {
		Carte carteRetour = null;
		if(this.get(i).estCompatible(sommet1)) {
			carteRetour=this.remove(i);
			autreJoueur.oterEventuellementUnePenalite();
		}
		return carteRetour;
	}
	 
	





	



}
