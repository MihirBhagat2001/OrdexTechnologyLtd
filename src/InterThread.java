//In this example we will make use of notify() & wait() of Object class.

class Demo{
	
	int q;
	boolean valueSet = false;
	public synchronized void put(int q){
		
		while(valueSet){
			try{ wait(); }catch(Exception e){}
		}
		this.q=q;
		System.out.println("put : "+q);
		valueSet = true;
		notify();
		
	}
	
	public synchronized void get(){
		
		while(!valueSet){
			try{ wait(); } catch(Exception e){}
		}
		System.out.println("get : "+q);
		valueSet = false;
		notify();
	}
}

class producer implements Runnable{
	
	Demo a;
	producer(Demo a){
		this.a=a; 
		Thread t1 = new Thread(this,"producer");
		t1.start();
	}
	
	public void run(){
		
		int i = 0;
		while(true){
			a.put(i++);
			try{Thread.sleep(500);}catch(Exception e){}
		}
	}
	
}

class consumer implements Runnable{
	
	Demo a;
	consumer(Demo a){
		this.a = a;
		Thread t2 = new Thread(this,"consumer");
		t2.start();
		
	}
	
	public void run(){
		
		while(true){
			a.get();
			try{Thread.sleep(5000);}catch(Exception e){}
		}
		
	}
	
}


public class InterThread {

	public static void main(String[] args) {
		
		Demo q = new Demo();
		new producer(q);
		new consumer(q);
		
		

	}

}
