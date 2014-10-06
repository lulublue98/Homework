public class Driver {
    public static void main(String[] args){
	Shapes s1 = new Shapes();
	System.out.println(s1.box(5,4));
	System.out.println(s1.box(4,5));
	Shapes s2 = new Shapes();
	System.out.println(s2.triangle1(4));
	System.out.println(s2.triangle2(4));
	Shapes s3 = new Shapes();
	System.out.println(s3.triangle3(4));
	System.out.println(s3.triangle3for(4));
	System.out.println(s3.diamond(5));
	System.out.println(s3.diamond(7));
	System.out.println(s3.triangle4(4));
	Shapes s4 = new Shapes();
	System.out.println(s4.frame(6,5));
	System.out.println(s4.frame(5,7));
    }

}
