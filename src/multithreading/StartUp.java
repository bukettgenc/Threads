package multithreading;

public class StartUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Yazici yazici = new Yazici();
//		yazici.dokumanlariYazdir(5, "Vize1.pdf");
//		yazici.dokumanlariYazdir(5, "Vize2.pdf");
//		yazici.dokumanlariYazdir(5, "Vize3.pdf");
		
		Runnable r1=new Gorev(yazici, "Vize1.pdf", 5);
		Runnable r2=new Gorev(yazici, "Final1.pdf", 5);

		Thread  gorev1=new Thread(r1);
		Thread  gorev2=new Thread(r2);
		gorev1.start();
		gorev2.start();
	}

}
