//Demo program on simple String.

public class DemoString {
	
	
	public static void main(String []args){
		
		//declaring objects of string class..
		String s1 = "Mihir";
		String s2 = "Bhagat";
		char ch[] = {'h','e','l','l','o'};
		String s3 = new String(ch);
		String s4 = new String("   hello World   ");
		
		//displaying and implementing some function of string class on above declared Strings.
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println("Length of s1 String : "+s1.length()); 
		System.out.println("Length of s2 String : "+s2.length());
		System.out.println("Length of s3 String : "+s2.length());
		System.out.println("String comparision of s1 & s2 : "+s1.compareTo(s2)); //show to gap between the first letter of each string in ASCII value.
		System.out.println("Both String are equal or not :"+s1.equals(s2));
		System.out.println("Both String are equal or not :"+s3.equals(s4));
		System.out.println("String concatnation : "+s1.concat(s2));
		System.out.println(s1.toUpperCase());
		System.out.println(s2.toLowerCase());
		System.out.println(s4);
		System.out.println(s4.trim());
		System.out.println(s4.indexOf("W", 0)); //counting starts from 0.
		System.out.println(s1.charAt(1)); // will return i
		
	}
	

}
