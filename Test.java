public class Test {

	public static void main(String[] args) {


		Point A=new Point();
		Point B=new Point(5);
		Point C=new Point(3,8);

		System.out.println("l'image de A est : "+A.Symetrie());
			System.out.println("l'image de B est : "+B.Symetrie());
			System.out.println("l'image de c est : "+C.Symetrie());

		Segment AB=new Segment(A,B);
		Segment BC=new Segment(B,C);
		System.out.println("le segment AB est:"+AB.distance());
		System.out.println("la segment BC est:"+BC.distance());

	System.out.println("l'mage de BC est CB "+BC.Symetrie1());

	}

}
