package iheritanceExample;

public class Dog extends Mammals {

	String breed;
	String color;
	
	
	
	public String getBreed() {
		return breed;
	}



	public void setBreed(String breed) {
		this.breed = breed;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public static void main(String[] args) {
		
		Dog d1 = new Dog();
		d1.setBreed("dobermann");
		d1.setColor("black");
		d1.setHeight(5);
		d1.setWeight(25.0F);
		d1.setSpeed(40);
		
		System.out.println("showing properties of Dog");
		System.out.println("Breed : "+d1.getBreed());
		System.out.println("color : "+d1.getColor());
		System.out.println("height : "+d1.getHeight());
		System.out.println("Weight : "+d1.getWeight());
		System.out.println("Speed : "+d1.getSpeed());
	}

}
