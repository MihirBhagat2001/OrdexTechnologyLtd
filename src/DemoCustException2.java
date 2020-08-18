public class DemoCustException2{
	public static void main(String []args){
		int x=5,y=1000;
		try{
			float z = (float) x/(float)y;
			if(z<0.01){
				throw new DemoCustException1("Number is too small");
				
			}
		}
		catch(DemoCustException1 e){
			System.out.println("Caught my Exception");
			System.out.println(e.getMessage());
			
		}
		finally{
			System.out.println("I am always here");
		}
	}
}