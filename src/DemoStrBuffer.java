//Demo program on StringBuffer

public class DemoStrBuffer {

	public static void main(String []args){
		
		StringBuffer sb1 = new StringBuffer("Mihir");
		StringBuffer sb2 = new StringBuffer("HelloWorld");
		
		System.out.println("value of sb1 : "+sb1);
		System.out.println("value of sb2 : "+sb2);
		sb1.append(sb2);
		System.out.println("After appending value of sb1 : "+sb1);
		
		System.out.println("length of sb1 : "+sb1.length());
		System.out.println("Capacity of sb1 : "+sb1.capacity());					//printing the length of sb1
		sb1.ensureCapacity(50);														//Changing the capacity from 21 to 50 of sb1 object. 
		System.out.println("Capacity of sb2 : "+sb1.capacity());					//Again printing the length of sb1
		System.out.println("reverse of sb1 : "+sb1.reverse());
		System.out.println("returning substring from sb1 : "+sb2.substring(4));		//return string after a specific index number.
		System.out.println("returning substring from sb1 : "+sb1.substring(0,4));	//return string from starting to ending index position
		sb2.append("123");															//appending 123 at the end of sb2 stringBuffer
		System.out.println("value of sb2 : "+sb2);		
		sb2.replace(5, 10, "Mihir");												//changing a part of string with my name.. 
		System.out.println("value of sb2 : "+sb2);
		
		
	}
}
