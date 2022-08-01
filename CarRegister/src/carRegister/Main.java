package carRegister;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		//on appelle une fonction utilitaire codée dans la classe Utils
//		String nom = Utils.scanString("entrez votre nom");
//		System.out.println(nom);
//		String age = Utils.scanString("entrez votre age");
//		System.out.println(age);
		
		//je crée un objet de type Voiture/une instance de la Voiture
		//j'instancie la classe Voiture
		Voiture voit1 = new Voiture();
		//la fonction toString est appelée depuis l'objet qu'on veut convertir en String
		//comme la plupart des méthodes en programmation orientée objet, elle n'est pas static
		//on reparlera du static un peu plus tard...
		System.out.println(voit1.toString());
		Voiture voit2 = new Voiture("rouge", "Reliant Robin", 3);
		//l'appel explicite de toString n'est pas nécessaire tant que la fonction existe
		System.out.println(voit2);
		System.out.println("Nouvelle voiture");
		//on crée une nouvelle Voiture à partir de trois paramètres entrés depuis le terminal
		Voiture voit3 = new Voiture(Utils.scanString("entrez une couleur"), Utils.scanString("entrez un modèle"), Integer.decode(Utils.scanString("entrez un nombre de roues")));
		System.out.println(voit3);
		//test des références d'objets
		voit1.setCouleur("verte");;
		System.out.println(voit1);
		//Attention : je ne crée pas une nouvelle voiture, je me contente de faire pointer une seconde variable sur la même voiture !
//		Voiture voit4 = voit1;
//		System.out.println(voit4);
//		voit4.couleur = "rouge";
//		System.out.println(voit4);
//		//du coup voit1 et voit4 restent égales quoi que je change dedans
//		//à éviter la plupart du temps
//		//si vous voulez un nouvel objet, faites new Voiture(...)
//		System.out.println(voit1);
		
		//si on stocke ensemble les différentes valeurs c'est plus pratique
		//par exemple dans une liste
		//je crée une liste de voitures vide
		ArrayList<Voiture> listeV = new ArrayList<Voiture>();
		//je la remplis avec les voitures que j'avais créé
		Collections.addAll(listeV, voit1, voit2, voit3);
		//System.out.println(listeV);
		//boucle sur la taille de la liste
		System.out.println("affichage de la liste des voitures");
		for(int i=0; i<listeV.size(); i++) {
			//on affiche l'élément d'index i dans la liste listeV
			System.out.println(listeV.get(i));
		}
		voit3.setCouleur("rose avec des étoiles vertes");
		//syntaxe alternative : la boucle for-each
		//pour chaque voiture dans listeV
		System.out.println("affichage de la liste des voitures depuis la boucle for-each");
		for (Voiture voiture : listeV) {
			//on l'affiche
			System.out.println(voiture);
		}
		
		//je crée un parking vide et je l'affiche
		Parking monParking = new Parking("ICS");
		System.out.println(monParking);
		monParking.getPlaces().add(voit3);
		System.out.println(monParking);
		//dans la famille des choses à ne pas faire
		//accès direct sur des attributs d'un autre objet
		//monParking.places.get(0).couleur = "noire";
		System.out.println(voit3.getCouleur());
	}
	
	

}
