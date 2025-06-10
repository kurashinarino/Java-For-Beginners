import java.util.Vector;

public class DisplayVehicleVector extends MyFrame{

	public void run() {
		Vector<Vehicle> vehicles=new Vector<Vehicle>();
		vehicles.add(new Car(10,30,3,0));
		vehicles.add(new Car(10,100,-5,0));
		vehicles.add(new Train(10,180,7,0));
		vehicles.add(new Train(10,250,-7,0));
		vehicles.add(new Truck(10,300,9,0));
		vehicles.add(new Truck(50,350,10,0));

		while(true) {
			clear();
			int width =getWidth();
			int height = getHeight();
			
			for (Vehicle v : vehicles) {
				v.draw(this);
				v.move();
				v.resetIfOut(width, height);
			}
			sleep(0.1);
		}
	}

}
