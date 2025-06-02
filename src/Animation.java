
public class Animation extends MyFrame{
     public void run() {
    	 
    	//5-1
    	 
		//int y=100;
		//int x=30;
		//while(y>=80) {
			//画面を消す
			//clear();
			//四角形を表示する
			//setColor(0,128,0);
			//fillRect(x,y,10,100);//xとyを用いて表示
			//y-=5;//yを減らす(xは変更しない)
			//sleep(0.1);
			//}
		//while(x<=170) {
			//画面を消す
			//clear();
			//四角形を表示する
			//setColor(0,128,0);
			//fillRect(x,y,10,100);//xとyを用いて表示
			//x+=5;//xを増やす(yは変更しない)
			//sleep(0.1);
		//}
    	 
    	 
        //5-2
    	 
    	//int y=100;
 		//int x=30;
 		// while(y<=200) {
 			//画面を消す
 			//clear();
 			//四角形を表示する
 			//setColor(0,128,0);
 			//fillRect(x,y,10,100);//xとyを用いて表示
 			//x+=5;
 			//y+=5;
 			//sleep(0.1);
 			//}
 		 //while(x>=30) {
 			//clear();
 			//setColor(0,128,0);
 			//fillRect(x,y,10,100);
 			//x-=5;
 			//sleep(0.1);
 	 	//	}
 		//while (y >= 100) {
            //clear();
            //setColor(0, 128, 0);
            //fillRect(x, y, 10, 100);
            //x += 5;
            //y -= 5;
            //sleep(0.1);
       // }
        //while (x >= 30) {
            //clear();
            //setColor(0, 128, 0);
           // fillRect(x, y, 10, 100);
           // x -= 5;
           // sleep(0.1);
 		 //}
    	 
         //5-3
 
    	 //int y = 100;
         //int x;
         //for (int i = 0; i < 3; i++) {
            //x = 30;
            //while (x <= 170) {
                 //clear();
                 //setColor(0, 128, 0);
                 //fillRect(x, y, 10, 100);
                 //x += 5;
                 //sleep(0.1);
             //}
             //x = 170;
             //while (x >= 30) {
                 //clear();
                 //setColor(0, 128, 0);
                 //fillRect(x, y, 10, 100);
                 //x -= 5;
                 //sleep(0.1);
             //}
    	 
    	 //5-EX
    	 
    	 //int x = 30;
         //int y = 100;
         //int width = 10;
         //int height = 100;
         //int step = 5;
         //while (true) {
    	 
             // → 右に移動
             //while (x <= 170) {
                 //clear();
                 //setColor(0, 128, 0);
                 //fillRect(x, y, width, height);
                 //x += step;
                 //sleep(0.1);
             //}
    	 
             //下
             //while (y <= 300) {
                 //clear();
                 //setColor(0, 128, 0);
                 //fillRect(x, y, width, height);
                 //y += step;
                 //sleep(0.1);
             //}

             //左
             //while (x >= 30) {
                 //clear();
                 //setColor(0, 128, 0);
                 //fillRect(x, y, width, height);
                 //x -= step;
                 //sleep(0.1);
             //}

             //上
             //while (y >= 100) {
                 //clear();
                 //setColor(0, 128, 0);
                 //fillRect(x, y, width, height);
                 //y -= step;
                 //sleep(0.1);
    	 
    	 //EX-2
    	 int x = 30;
         int y = 100;
         int step = 5;
         while (true) {
        	 
             //右
             while (x <= 170) {
                 clear();
                 setColor(0, 128, 0);
                 fillRect(x, y, 10, 100);
                 x += step;
                 sleep(0.1);
             }

             //下
             y += step;

             //左
             while (x >= 30) {
                 clear();
                 setColor(0, 128, 0);
                 fillRect(x, y, 10, 100);
                 x -= step;
                 sleep(0.1);
             }

             //下
             y += step;
             
             if (y > 300) {
                 y = 50;
             }
           }
         }
       }
 
    	 
     
   

         
     

 
			
		
	



