public class Point { 
	protected int x, y; //coordinates
	
	public Point( int x, int y ) {
		setPoint( x,y );
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y; 
	}
	
	public void setPoint( int x, int y ) {

      this.x=x;

      this.y=y;

}

	public void setLocaltion( int x, int y ) {

      this.x=x;

      this.y=y;

}
	public double distanceTo(Point that){
		double d = Math.pow(x-that.x,2) + Math.pow(y-that.y,2); 
	   
		return Math.sqrt(d);  
	}
		
}