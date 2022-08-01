package carRegister;

//classe permettant de représenter des objets Voiture
public class Voiture {
	
	//les variables contenues dans un objet Voiture sont ses attributs/propriétés
	// public/private nous disent si on peut accéder à l'attribut/la méthode depuis l'extérieur de la classe
	private String couleur;
	private String modele;
	private int nbRoues;
	
	//les méthodes, constructeurs compris, sont généralement publiques
	//on veut pouvoir les appeler depuis l'extérieur de la classe
	
	//constructeur par défaut de la classe Voiture : crée une voiture
	//l'objet est implicitement renvoyé comme résultat du constructeur
	public Voiture() {
		this.couleur="noire";
		this.modele="ford T";
		this.nbRoues=4;
	}
	
	//constructeur paramétré de la classe Voiture, beaucoup plus polyvalent
	public Voiture(String couleurV, String modeleV, int nbR) {
		//mot-clé this : réfère à l'objet en cours
		this.couleur = couleurV;
		this.modele = modeleV;
		this.nbRoues = nbR;
		
	}
	
	//transforme l'objet Voiture en chaîne de caractères
	public String toString() {
		return "Voiture : couleur=" + this.couleur + ", modele=" + this.modele + ", nbRoues=" + this.nbRoues;
	}
	
	//pour accéder aux attributs privés : on passe par des méthodes réservées
	//le getter permet de récupérer la valeur d'un attribut
	public String getCouleur() {
		return this.couleur;
	}
	
	//le setter permet de modifier la valeur d'un attribut
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	
	public String getModele() {
		return this.modele;
	}
	
	//pas de setter pour modele : on ne peut pas le modifier !
	
	public int getNbRoues() {
		return this.nbRoues;
	}
	
	public void setNbRoues(int nbR) {
		this.nbRoues = nbR;
	}
	

}
