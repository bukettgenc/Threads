package interthreads;

public class Consumer implements Runnable {

	private Kaynak kaynak;

	public Consumer(Kaynak kaynak) {
		super();
		this.kaynak = kaynak;
		Thread gorev = new Thread(this, "Consumer");
		gorev.start();
	}

	@Override
	public void run() {
		int i = 0;
		while (true) {
			System.out.println(kaynak.getTuketimNo() + "deger tuketildi");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
