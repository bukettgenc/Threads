package src;

public class Gorev1 extends UstGorev implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println("Görev sınıfı-Numara:" + i);
		}
		Thread.currentThread().setName("-Gorev Sinifi Thread-");
		System.out.println("Mevcut thread bilgisi:"+Thread.currentThread().getName());
	}

}
