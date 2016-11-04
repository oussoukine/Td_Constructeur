public class Test {

	public static void main(String[] args) {


		Point A=new Point();
		Point B=new Point(5);
		Point C=new Point(3,8);


System.out.println("le point A mes coordonées sont :"+A);
System.out.println("le point B mes coordonées sont :"+B);
System.out.println("le point c mes coordonées sont :"+C);

		System.out.println("l'image de A est : "+A);
			System.out.println("l'image de B est : "+B);
			System.out.println("l'image de c est : "+C);

		Segment AB=new Segment(A,B);
		Segment BC=new Segment(B,C);
		System.out.println("le segment AB est:"+AB.distance());
		System.out.println("le segment BC est:"+BC.distance());

	System.out.println("l'image de BC est CB "+BC.Symetrie1());

	}

}
