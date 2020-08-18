
package ExampleAbstract;

abstract class A {
	
	public int a = 10; 
	public void show(){
		System.out.println("Value of a : "+a);
	}
	
	public abstract void set(int value);

}
