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
		
		Runnable gorev1=new Gorev1();
		Thread gorev=new Thread(gorev1);
		gorev.start();
		
		//3 bitti
	}

}
