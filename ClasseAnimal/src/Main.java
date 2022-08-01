import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			// Create a object
			Animal animal1 = new Animal("BugsBunny ","Lapin ", 4);
			Animal animal2 = new Animal("BipBip ","Oiseaux ", 2);
			Animal animal3 = new Animal("Mirna ","Araignée ", 8);
			
			ArrayList<Animal> places = new ArrayList<Animal>();
			Collections.addAll(places, animal1, animal2, animal3);
			
			
			
			System.out.println(animal1);
			System.out.println(animal2);
			System.out.println(animal3);
			
			Zoo zootopia = new Zoo("zooTopia");
			zootopia.places.addAll(places);
			System.out.println(zootopia);
			
					}
		
			
	}


