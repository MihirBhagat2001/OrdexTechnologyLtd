import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class speed implements Serializable{
	int speed = 50;
}

public class DemoSerialiazable {

	public static void main(String[] args) throws Exception {
		
		speed s1 = new speed();
		System.out.println("Default speed : "+s1.speed);
		s1.speed = 100;
		System.out.println("Modified speed : "+s1.speed);
		File f1 = new File("C:/Users/mihir/Desktop/Demo.txt");
		FileOutputStream fos = new FileOutputStream(f1);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s1);
		System.out.println("File written");
		
		FileInputStream fis = new FileInputStream(f1);
		ObjectInputStream ois = new ObjectInputStream(fis);
		speed s2 = (speed) ois.readObject();
		System.out.println("Printing s2 object value");
		System.out.println("speed : "+s2.speed);
		
		oos.flush();
		oos.close();
		
	}

}
