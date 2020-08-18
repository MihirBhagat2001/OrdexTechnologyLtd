
public class DemoException {

	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 0;
		int c;
		try{
			c = a / b;
			System.out.println("c : "+c);
		}
		catch(ArithmeticException e){
			
			System.out.println("Divide by zero Exception"+e);
		}
		finally{
			
			System.out.println("Finally block executed");
		}
		
		int arr[];
		try{
			arr= new int[2];
			arr[0] = 1;
			arr[1] = 2;
			arr[2] = 3;
			arr[3] = 4;
			
			for(int i : arr){
				System.out.println(i);
			}
		}
		catch(ArrayIndexOutOfBoundsException e2){
			
			System.out.println("Array index out of Bound"+e2);
		}
			
	}
}
		
		