package iheritanceExample;

public class Mammals extends Animals {

	int speed;
	
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public static void main(String[] args) {
	
		Mammals m1 = new Mammals();
		m1.setHeight(20.8F);
		m1.setSpeed(20);
		m1.setWeight(10);
		System.out.println(m1.getHeight());
		System.out.println(m1.getWeight());
		System.out.println(m1.getSpeed());
		
		

	}

}
