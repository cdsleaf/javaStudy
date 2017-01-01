package java7.concurrency.threadBasic;

import java.util.Random;

//run은 Thread.start시 새로운 Thread로 시작하는 메소드
/*
Start main
End main
0 STARTED
4 STARTED
1 STARTED
3 STARTED
2 STARTED
4 ENDED
0 ENDED
1 ENDED
3 ENDED
2 ENDED
 */
public class ThreadBasicRunSample extends Thread{

	private int num;
	public ThreadBasicRunSample(int num){
		this.num = num;
	}
	
	public void run(){
		Random r = new Random(System.currentTimeMillis());
		System.out.println(num + " STARTED");
		
		try{
			int tm = r.nextInt(500);
			Thread.sleep(tm);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println(num + " ENDED");
	}
	
	public static void main(String[] args) {
		System.out.println("Start main");
		for(int i = 0; i<5; i++){
			ThreadBasicRunSample test = new ThreadBasicRunSample(i);
			test.start();
		}
		System.out.println("End main");
	}

}
