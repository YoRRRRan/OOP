package geometrie;

public class Triangle extends Polygone{

	public Triangle(Point...points) {
		super(points);
	
	}
	
	
	public double surface()	{
		double demiPeri = this.perimetre()/2;
		double surf = demiPeri * (demiPeri - longueurSegment(points[0], points[1]));
		surf = surf * (demiPeri - longueurSegment(points[1], points[2]));
		surf = surf * (demiPeri - longueurSegment(points[2], points[0]));
		surf = Math.sqrt(surf);
		return surf;
	}
	
		
	
}
