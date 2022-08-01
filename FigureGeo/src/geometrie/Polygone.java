package geometrie;

public abstract  class Polygone extends Figure{
	
	protected Point[] points;	
	// le polygone contient plusieurs objets Point
	public Polygone(Point... points)	{
			super(points[0]);
			this.points = points;
			
	
				}
	
	public double perimetre(){	
		int i;
		
		double peri = 0;
		for(i=0; i<points.length-1; i++)	{
		peri += longueurSegment(this.points[i], this.points[i+1]);
		}
		peri += longueurSegment(this.points[i],this.points[0]);
		return peri;
	}
	
	public static double longueurSegment(Point a, Point b)	{
		double diffX = b.getX() - a.getX();
		double diffY = b.getY() - a.getY();
		double distance = Math.sqrt(diffX*diffX + diffY*diffY);
		
		return distance;
	}

	public Point[] getPoints() {
		return points;
	}

	public void setPoints(Point[] points) {
		this.points = points;
	}
	public String toString() {
		String s = "Le "+this.getClass().getSimpleName()+" est fait de points ";
		for(Point p : this.points)	{
			s += "\n"+ p.toString();
		}
		s += "\nLe point d'origine est " + this.origine.toString();
		s += "\nSon perimetre est " + this.perimetre();
		s += "\nSa surface est "+ this.surface();
		return s;
	}
	
}
	
	
