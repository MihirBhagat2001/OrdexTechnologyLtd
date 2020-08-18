
class Hey extends Thread{
	@Override
	public void run() {
	
		for(int i=0;i<5;i++){
			
			System.out.println("Hey");
			try{sleep(2000);} catch(Exception e){}
		}
	}
	
}

class Hello extends Thread{
	
	@Override
	public void run() {
	
		for(int i=0;i<5;i++){
			
			System.out.println("Hello");
			try{sleep(2000);} catch(Exception e){}
		}
	}
	
}


public class DemoThread {

	public static void main(String[] args) {
		
		Hey h1 = new Hey();
		Hello h2 = new Hello();
		
		h1.start();
		try{Thread.sleep(10);} catch(Exception e){}
		h2.start();

	}

}
