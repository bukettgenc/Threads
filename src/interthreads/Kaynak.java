package interthreads;

public class Kaynak {
	private int tuketimNo;
	private boolean uretimMi = true;

//consumer
	public synchronized int getTuketimNo() {
		while (uretimMi) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		uretimMi = true;
		//Consumer uyandırılıyo
		notify();
		return tuketimNo;
	}

	// producer
	public synchronized void setTuketimNo(int tuketimNo) {
		while (!uretimMi) {
			try {
				// Producer üretim yapmadan consumer tuketmeyecek
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(tuketimNo +" deger uretildi");

		this.tuketimNo = tuketimNo;
		uretimMi = false;
		
		notify();
	}

}
