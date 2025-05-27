
public class Animation extends MyFrame{

	public void run() {
		int y=100;
		int x=30;
		while(x<=170) {
			//画面を消す
			clear();
			//四角形を表示する
			setColor(0,128,0);
			fillRect(x,y,10,100);//xとyを用いて表示
			x+=5;//xを増やす(yは変更しない)
			sleep(0.1);
		}
		while(y<=200) {
			//画面を消す
			clear();
			//四角形を表示する
			setColor(0,128,0);
			fillRect(x,y,10,100);//xとyを用いて表示
			y+=5;//yを増やす(xは変更しない)
			sleep(0.1);
			}
			
		}
			
		
	}


