import java.util.ArrayList;

public class Zoo {

	ArrayList<Animal>places;
	String zooTopia;
	
	public Zoo(String zooTopia)	{
		this.zooTopia=zooTopia;
		places = new ArrayList<Animal>();
	}
		public String toString()	{
			String chaine = "Nom du Zoo : " + zooTopia + "\n";
			for(Animal animal : places)	{
				chaine += animal.toString() + "\n";
			}
			return chaine;
		}
		
}

	
