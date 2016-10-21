public class Point {
	private double abscisse;
	private double ordonée;

	public Point(){
		this.abscisse=0;
		this.ordonée=0;}
	public Point(double x){
		this.abscisse=x;
		this.ordonée=x;
	}
	public Point (double x, double y){
		this.abscisse=x;
		this.ordonée=y;
	}
	public double getAbscisse(){
		return this.abscisse;
	}
	public double getOrdonée(){
		return this.ordonée;
	}
	public String toString(){
		return "(" + abscisse+ ","+ ordonée +")";
	}
	public Point Symetrie(){
		return new Point(-abscisse,ordonée);
	}

}
