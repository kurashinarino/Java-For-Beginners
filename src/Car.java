import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Car extends Vehicle implements KeyListener{
	public Car(int x, int y, int vx, int vy) {
		super(x, y, vx, vy);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public void draw(MyFrame frame) {
		frame.fillRect(x+20,y,40,20);
		frame.fillRect(x,y+20,80,20);
		frame.fillOval(x+10,y+40,20,20);
		frame.fillOval(x+50,y+40,20,20);
	}

	public void keyTyped(KeyEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_LEFT) {
			vx=5;
		}
		if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
			vx=5;
		}
		if(e.getKeyCode()==KeyEvent.VK_UP) {
			vx=5;
		}
		if(e.getKeyCode()==KeyEvent.VK_DOWN) {
			vx=5;
		}
		
	}

	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_LEFT) {
			vx=0;
		}
		if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
			vx=0;
		}
		if(e.getKeyCode()==KeyEvent.VK_UP) {
			vx=0;
		}
		if(e.getKeyCode()==KeyEvent.VK_DOWN) {
			vx=0;
		}
	}
	
}


