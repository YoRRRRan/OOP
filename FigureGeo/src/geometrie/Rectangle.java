package geometrie;

public class Rectangle extends Polygone {

	public Rectangle(Point...points) {
		super(points);
	}
	
	@Override
	public double surface() {
		
		double surf = longueurSegment(points[0], points[1])*
					  longueurSegment(points[1], points[2]);
		return surf;
	}
	


}
