class A implements Runnable{
	
	public void run() {
		
		for(int i=0;i<5;i++){
			System.out.println("This is class A");
			try{Thread.sleep(1000);}catch(Exception e){}
		}
	}
}

class B implements Runnable{
	
	public void run() {
		for(int i=0;i<5;i++){
			System.out.println("This is class B");
			try{Thread.sleep(1000);}catch(Exception e){}
		}
	}
}

public class DemoThreadInterface {

	public static void main(String[] args) {
		
		Runnable a1 = new A();
		Runnable b1 = new B();
		
		Thread t1 = new Thread(a1);
		Thread t2 = new Thread(b1);
		
		t1.start();
		try{Thread.sleep(10);}catch(Exception e){}
		t2.start();

	}

}
