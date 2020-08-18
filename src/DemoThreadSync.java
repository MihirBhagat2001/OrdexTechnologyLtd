class counter{
	
	int c;
	public synchronized void count(){ //synchronized keyword will not allow multiple thread to run simultaneously
		c++;
	}
	
}

public class DemoThreadSync {

	public static void main(String[] args) throws Exception {
	
		final counter c1 = new counter();
		Thread t1 = new Thread(new Runnable()
		{	
			public void run(){
				
				for(int i=0;i<1000;i++){
					c1.count();
				}
				
			}
		});
		
		Thread t2 = new Thread(new Runnable()
		{	
			public void run(){
				
				for(int i=0;i<1000;i++){
					c1.count();
				}
				
			}
		});
		
		t1.start();
		t2.start();
		
		t1.join(); //Main thread will wait until the t1 thread is completely executed.
		t2.join();
		
		System.out.println(c1.c);
	}

}
