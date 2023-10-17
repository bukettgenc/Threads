package src;

public class Main {
//Threadler processlerin hafif halidir.
//Bir programın en küçük bağımsız birimidir
//Her java programı bir thread içerir
	public static void main(String[] args) {

//		Gorev gorev = new Gorev();
//		System.out.println("Program başladı");
//		System.out.println("Aktif thread sayısı:" + Thread.activeCount());
//		gorev.start();
//		System.out.println("Aktif thread sayısı:" + Thread.activeCount());
//		System.out.println("Program bitti");
//		System.out.println("Mevcut thread bilgisi:" + Thread.currentThread().getName());
		Thread.currentThread().setName("-Main thread-");
		Runnable gorev1 = new Gorev1();
		Thread gorev = new Thread(gorev1, "-Gorev Sinifi Thread-");
		gorev.start();

		Runnable gorev2 = new DigerGorev();
		Thread digerGorev = new Thread(gorev2, "-Diger Gorev Thread-");
		//default priority 5'tir.
		digerGorev.setPriority(10);
		digerGorev.start();

		new Thread(new DigerGorev(), "-Diger Gorev Thread 2-").start();
		System.out.println(digerGorev.isAlive());
//parcaciklarinin-bazi-metotlari-ve-kararsizligi-4 bitti
	}

}
