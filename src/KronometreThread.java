
public class KronometreThread implements Runnable {
	
	private Thread thread;
	private String threadName;
	
  public KronometreThread(String threadName) {
	  this.threadName=threadName;
	  System.out.println("olustuuluyor"+threadName);
  }
	 
	@Override
	public void run() {
	     
		System.out.println("calıştırılıyor :"+ threadName);
		try {
		for(int i=0;i<=10;i++) {
			System.out.println(threadName + " : "+ i);
			Thread.sleep(1000);
			}
		}catch (InterruptedException e) {
				// TODO Auto-generated catch block
			   System.out.println("kesildi"+threadName);
			}
		
		System.out.println("thread bitti:"+threadName);
		
	}
	
	public void start() {
		System.out.println("Thread nesnesi olusturuluyor");
		if(thread==null)
			thread=new Thread(this,threadName);
		thread.start();
	}
	

}
