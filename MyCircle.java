public class MyCircle{
    private double radius; 	
    private Point  centre; 

	/** The implementation of the Point class in Point.java file **/
	
	public MyCircle(double r, int x, int y)

	{ 

	this.radius = r;

	this.centre = new Point(x,y);

	}

	public double getRadius(){
		return radius;
	}
	
	public int getX() {
		return centre.getX();
	}
    	public int getY(){
		return centre.getY();
	}
	public Point getCentre(){
		 return new Point(centre.getX(), centre.getY());
	}

		
}
