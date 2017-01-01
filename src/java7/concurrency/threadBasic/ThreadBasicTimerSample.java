package java7.concurrency.threadBasic;

public class ThreadBasicTimerSample extends Thread{

	public void run(){
		int n = 0;
		while(true){
			n++;
			try{
				Thread.sleep(1000);
			}catch (InterruptedException e){
				e.printStackTrace();
			}
			System.out.println(n+"초 경과");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Start Timer");
		ThreadBasicTimerSample test = new ThreadBasicTimerSample();
		test.start();
	}

}
