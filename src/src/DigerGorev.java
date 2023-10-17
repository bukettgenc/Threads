package src;

public class DigerGorev extends UstGorev implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Mevcut thread bilgisi:" + Thread.currentThread().getName());
		System.out.println("Isimli threadin calisma anindaki aktif thread sayisi:" + Thread.activeCount());
		for (int i = 0; i < 20; i++) {
			System.out.println(Thread.currentThread().getName()+"-Numara:" + i);
		}
	}

}
