

public class Animal {
	// Attributes
   private String nom;
   private String espece;
   private int pattes;
   
   
 
   
   // Constructor
   public Animal(String nom, String espece, int pattes) {
      this.nom=nom;
      this.espece=espece;
      this.pattes=pattes;
   }
   
   // Return 
   public String toString() {
	   
	   return "Je m'appele "+nom+" , je suis un " +espece+" et j'ai " + pattes+" pattes.";
   }
   public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getEspece() {
		return espece;
	}

	public void setEspece(String espece) {
		this.espece = espece;
	}

	public int getPattes() {
		return pattes;
	}

	public void setPattes(int pattes) {
		this.pattes = pattes;
	}



} 
