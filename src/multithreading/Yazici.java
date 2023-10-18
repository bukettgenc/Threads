package multithreading;

public class Yazici {
	//synchronized sayesinde düzene okuyor
	 void dokumanlariYazdir(int kopyaSayisi, String dokumanIsmi) {
		for (int i = 0; i < kopyaSayisi; i++) {
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			System.out.println(dokumanIsmi+"isimli dosyanın"+i+". kopyası yazdırıldı");
		}
	}
}
