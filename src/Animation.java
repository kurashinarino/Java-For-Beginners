
public class Animation extends MyFrame{

	public void run() {
		int x=170;//30から170に変更
		while(x>=30) {//xが30以上の間
			//画面を消す
			clear();
			//四角形を表示する
			setColor(0,128,0);
			fillRect(x,80,10,100);
			//x+=20;
			//sleep(1);
			x-=5;//左に動かすのでxの値を減らす
			//if(x>200) {//xの値が200より大きくなったら
				//break;//whileによる繰り返しをやめる
			sleep(0.1);
			}
			
		}
			
		
	}


