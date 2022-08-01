package carRegister;

import java.util.ArrayList;

//la classe parking va contenir une liste de Voitures
public class Parking {
	//la liste des voitures présentes
	private ArrayList<Voiture> places;
	//le nom du parking
	private String nom;
	
	//le constructeur de parking vide
	public Parking(String nom) {
		this.nom = nom;
		//j'initialise la liste vide pour pouvoir la remplir plus tard
		//si je ne crée pas ma liste je ne pourrai faire aucune manipulation dessus
		places = new ArrayList<Voiture>();
	}
	
	
	
	public String toString() {
		//on construit la chaîne de caractères représentant le parking
		String chaine = "Nom du parking : " + nom + "\n";
		for (Voiture voiture : places) {
			chaine += voiture.toString() + "\n";
		}
		return chaine;
	}



	public ArrayList<Voiture> getPlaces() {
		return places;
	}



	public void setPlaces(ArrayList<Voiture> places) {
		this.places = places;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
	
}
