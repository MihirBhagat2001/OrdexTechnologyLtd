class DemoClone1 {

	int x,y;
}


class DemoClone2 implements Cloneable {
	
	int a;
	int b;
	DemoClone1 c = new DemoClone1();
	public Object clone() throws CloneNotSupportedException{
		
		return super.clone();
	}

}

public class DemoClone3 {
	
	public static void main(String []args) throws CloneNotSupportedException{
		
		DemoClone2 t1 = new DemoClone2();
		t1.a = 10;
		t1.b = 20;
		t1.c.x = 30;
		t1.c.y = 40;
		
		DemoClone2 t3 = (DemoClone2)t1.clone();
		t3.a = 100;
		t3.c.x = 300;
		
		System.out.println(t1.a + " " + t1.b + " " + t1.c.x + " "+ t1.c.y);
		System.out.println(t3.a + " " + t3.b + " " + t3.c.x + " "+ t3.c.y);
		
	}
}
