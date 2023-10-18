package multithreading;

public class Gorev implements Runnable{
Yazici yaziciRef;
String dokumanAdi;
int kopyaSayisi;

	public Gorev(Yazici yaziciRef, String dokumanAdi, int kopyaSayisi) {
	super();
	this.yaziciRef = yaziciRef;
	this.dokumanAdi = dokumanAdi;
	this.kopyaSayisi = kopyaSayisi;
}

	@Override
	public void run() {
		synchronized (yaziciRef) {
			yaziciRef.dokumanlariYazdir(kopyaSayisi, dokumanAdi);

		}
		
	}

}
