package geometrie;

public abstract class Figure implements Calcul {
	
	// Le premier point de la figure
	protected Point origine;
	
	
	public Figure()	{
		this.origine = new Point();
	}
	public Figure(Point p)	{
		this.origine = p;
	}
	

}
