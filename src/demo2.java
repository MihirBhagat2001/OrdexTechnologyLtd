class demo1{

	public void show(){
		System.out.println("this is clas demo1 : show method");
	}
	
	
}

public class demo2 extends demo1 {

	int i = 5;
	public void show(){
		System.out.println("this is demo2 method");
	}
	
	public void show2(){
		System.out.println("this is class demo1 : show2 method");
	}
	
	public static void main(String[] args) {
		
		
		demo1 o1 = new demo1();
		o1.show();
		//o1.show2(); //show2 method belong to demo2 class. so, it cannot be called using demo1 class object.
		
		demo1 o2 = new demo2();
		o2.show();
		
		//o2.show2(); //show2 method belong to demo2 class. so, we cannot call it using reference of demo1.
		
		demo2 o3 = new demo2();
		o3.show();
		o3.show2();
		System.out.println(o3.i);

	}

}
