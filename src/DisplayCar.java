
public class DisplayCar extends MyFrame{

	public void run() {
		Car car1=new Car(50,50,10,5);
		Car car2=new Car(50,110,10,5);
		Car car3=new Car(50,170,10,5);
		Car car4=new Car(50,230,10,5);
		Car car5=new Car(50,290,10,5);
		int speed1 = 1;
        int speed2 = 2;
        int speed3 = 3;
        int speed4 = 4;
        int speed5 = 5;
		int width = getWidth();
		for (int i=0;i<500;i++) {
			clear();
			car1.draw(this);
			car2.draw(this);
			car3.draw(this);
			car4.draw(this);
			car5.draw(this);
			car1.x+=1;
			car2.x+=2;
			car3.x+=3;
			car4.x+=4;
			car5.x+=5;
			if (car1.x > width) car1.x = 0;
            if (car2.x > width) car2.x = 0;
            if (car3.x > width) car3.x = 0;
            if (car4.x > width) car4.x = 0;
            if (car5.x > width) car5.x = 0;
            if (i % 50 == 0) {
                speed1++;
                speed2++;
                speed3++;
                speed4++;
                speed5++;
            }
			sleep(0.1);
		}

	}

}

