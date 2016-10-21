public class Segment {
	private Point A;
	private Point  B;

	public Segment(Point d){
		new Point();
		this.B=d;
	}


	public Segment(Point A,Point B ){
		this.A=A;
		this.B=B;
}




	public double distance()
    {
        double d;
        d = Math.sqrt((B.getAbscisse()-A.getAbscisse())*(B.getAbscisse()-A.getAbscisse()) +(B.getOrdonée()-A.getOrdonée())*(B.getOrdonée()-A.getOrdonée()));
        return d;
    }

	public String toString(){
		return A.toString()+" "+B.toString() ;
	}

    public  Segment Symetrie1(){
    	return new Segment(A.Symetrie(),B.Symetrie());
    }

}
