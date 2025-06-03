
public class Car {
    int x,y,vx,vy;
	public Car(int x,int y,int vx,int vy) {
		this.x=x;
		this.y=y;
		this.vx=vx;
		this.vy=vy;
	}
	public void draw(MyFrame frame) {
		frame.fillOval(x-13,y+50,18,18);
		frame.fillOval(x+25,y+50,18,18);
		frame.fillRect(x-21,y+30,70,20);
		frame.fillRect(x-5,y+15,40,20);
	}
	public void move() {
		x+=vx;
		y+=vy;
	}

}


