package src;

public class Gorev1 extends UstGorev implements Runnable{

	@Override
	public void run() {
		Thread.currentThread().setName("-Gorev Sinifi Thread-");
		for (int i = 0; i < 20; i++) {
			System.out.println(Thread.currentThread().getName()+"-Numara:" + i);
		}
		
		System.out.println("Mevcut thread bilgisi:"+Thread.currentThread().getName());
	}

}
