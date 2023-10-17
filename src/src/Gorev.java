package src;

import java.util.Iterator;

public class Gorev extends Thread{
	//Eğer bi,r üst sınıfı extends edeceksen thread oluşturmak için Runnable interfaceini implement edebiliriz
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println("Görev sınıfı-Numara:" + i);
		}
		Thread.currentThread().setName("-Gorev Sinifi Thread-");
		System.out.println("Mevcut thread bilgisi:"+Thread.currentThread().getName());
	}
}
