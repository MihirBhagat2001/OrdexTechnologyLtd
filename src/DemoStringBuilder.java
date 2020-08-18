public class DemoStringBuilder {
	
	public static void main(String []args){
		
		StringBuilder strb1 = new StringBuilder("Mihir");
		StringBuilder strb2 = new StringBuilder("123");
		StringBuilder strb3 = new StringBuilder();
		strb3.append(strb1);
		
		System.out.println(strb1);
		strb1.deleteCharAt(0);
		strb1.append(strb2); 
		
		System.out.println(strb1);
		System.out.println(strb2);
		System.out.println(strb3);
		strb1.insert(0, 'M'); 
		System.out.println("length of strb1 : "+strb1.length());
		System.out.println("Capacity of strb1 :  "+strb1.capacity());
		System.out.println("Pint char at index 2 : "+strb1.charAt(2));
		
		
		
		
		
	}
}