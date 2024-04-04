package multi_thread;

public class EvenNo extends Thread{

	public void run() {
		
		for (int i=200;i<=300;i++) {
			if(i%2==0) {
			System.out.println("i="+i);
		}
	  }
   }
}
