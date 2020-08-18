class ab implements Cloneable{
	int length;
	int width;
	
	public void set(int l,int w){
		
		this.length = l;
		this.width = w;
	}
	public void get(){
		int area = 0;
		area = length*width;
		System.out.println("Area of rectangle : "+area);
	}
	
	public Object clone()throws CloneNotSupportedException{  
		return super.clone();  
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ab other = (ab) obj;
		if (length != other.length)
			return false;
		if (width != other.width)
			return false;
		return true;
	} 
	
}



public class DemoObjectClass {

	public static void main(String[] args) {
		
		try{
			new DemoObjectClass(); //creating instance of DemoObjectClass to demonstrating finalize method.
			ab a1 = new ab();
			ab a2;
			a1.set(10, 20);
			
			a2 = (ab)a1.clone();
			System.out.println("Calling a1 method");
			a1.get();
			System.out.println("Calling a2 method");
			a2.get();
			System.out.println(a1.getClass());
			System.out.println(a2.getClass());
			System.out.println(a1.hashCode()); 
			/* rutern's a integer value of the object based on the some calculation 
			 & memory address of the object where is stored. */
			System.out.println(a2.hashCode());
			System.out.println(a1.equals(a2));
			System.gc(); //calling garbage collecting method;
		}
		catch(Exception e){
		
			e.printStackTrace();
		}
		
		
	}

	@Override
	protected void finalize() {

		System.out.println("Hello World exection finalize block");
	}

}
