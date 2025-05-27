
public class practice4 extends MyFrame{

	public void run() {
		
		//4-1
		//int x=30;
		//setColor(0,128,0);
		//int i;//繰り返しに使う変数iを宣言
		//for(i=0;i<10;i++) {//i=0からi<9の間繰り返す 繰り返すたびにiを1増やす
			//if(i==0) {
				//fillRect(x,50,10,100);
			//}else if(i==1){
				//fillRect(x,60,10,100);
			//}else if(i==2){
				//fillRect(x,70,10,100);
			//}else if(i==3){
				//fillRect(x,80,10,100);
			//}else if(i==4){
				//fillRect(x,90,10,100);
			//}else if(i==5){
				//fillRect(x,100,10,100);
			//}else if(i==6){
				//fillRect(x,110,10,100);
			//}else if(i==7){
				//fillRect(x,120,10,100);
			//}else if(i==8){
				//fillRect(x,130,10,100);
			//}else if(i==9){
				//fillRect(x,140,10,100);
			//}else {
				//fillRect(x,150,10,100);
			//}
			//x+=20;
		
		//4-2
		//int x=30;
		//setColor(0,128,0);
		//int i;//繰り返しに使う変数iを宣言
		//for(i=0;i<10;i++) {//i=0からi<9の間繰り返す 繰り返すたびにiを1増やす
			//if(i==0) {
				//fillRect(x,60,10,50);
			//}else if(i==1){
				//fillRect(x,60,10,60);
			//}else if(i==2){
				//fillRect(x,60,10,70);
			//}else if(i==3){
				//fillRect(x,60,10,80);
			//}else if(i==4){
				//fillRect(x,60,10,90);
			//}else if(i==5){
				//fillRect(x,60,10,100);
			//}else if(i==6){
				//fillRect(x,60,10,110);
			//}else if(i==7){
				//fillRect(x,60,10,120);
			//}else if(i==8){
				//fillRect(x,60,10,130);
			//}else if(i==9){
				//fillRect(x,60,10,140);
			//}else {
				//fillRect(x,60,10,150);
			//}
			//x+=20;
		
		//4-1
		setColor(0,128,0);
		int x=30;
		//for (int i=0;i<10;i++) {
			//fillRect(x,x,10,100);
			
			//x+=20;
		//}
		
		//4-2
		//for (int i=0;i<10;i++) {
			//fillRect(x,100,10,x);
	
            //x+=20;
	//}
		
		//4-3
		int rbg = 0;
		for(int i= 0;i <10;i++) {
			
			rbg += 20;
			setColor(rbg,rbg,rbg);
			fillRect(x,100,10,100);
			
			x+=15;
		}
		
	}
}
