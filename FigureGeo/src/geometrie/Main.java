package geometrie;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Création des points 
		Point a = new Point();
		Point b = new Point(2, 3.5);
		Point c = new Point(1,2);
		Point d = new Point(2,2.5);
		//System.out.println(a);
		//System.out.println(b);
		
		Triangle t1 = new Triangle(a, b, c);
		System.out.println(t1);
		
		Rectangle r1 = new Rectangle(a,b,c,d);
		System.out.println(r1);
		
		Cercle c1 = new Cercle(15);
		System.out.println(c1);
		
		
		
		
	}

}
