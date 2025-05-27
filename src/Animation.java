
public class Animation extends MyFrame{

	public void run() {
		int x=30;
		while(true) {
			//画面を消す
			clear();
			//四角形を表示する
			setColor(0,128,0);
			fillOval(x,80,50,50);
			//x+=20;
			//sleep(1);
			x+=5;
			if(x>200) {//xの値が200より大きくなったら
				break;//whileによる繰り返しをやめる
			}
			sleep(0.1);
		}
			
		
	}

}
