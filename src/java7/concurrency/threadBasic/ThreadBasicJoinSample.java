package java7.concurrency.threadBasic;

import java.util.Random;

/* join을 통해 Thread가 종료될 때 까지 기다리게 된다.
Start main
0 STARTED
0 ENDED
1 STARTED
1 ENDED
2 STARTED
2 ENDED
3 STARTED
3 ENDED
4 STARTED
4 ENDED
End main
 */
public class ThreadBasicJoinSample extends Thread{

	private int num;
	public ThreadBasicJoinSample(int num){
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
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Start main");
		for(int i = 0; i<5; i++){
			ThreadBasicJoinSample test = new ThreadBasicJoinSample(i);
			test.start();
			test.join();
		}
		
		System.out.println("End main");
	}

}
