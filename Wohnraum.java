package composite;

public class Wohnraum implements Wohnflaeche{
	
	 int Stockwerk;
	 int Raeume;
	double qm;
	
		
	public Wohnraum(int stockwerk, int raeume, double qm) {
		Stockwerk = stockwerk;
		Raeume = raeume;
		this.qm = qm;
	}

	public void showWohnflaecheDetails() {
		System.out.println("Stockwerk: "+Stockwerk+" | Räume: "+Raeume+" | Quardratmeter: "+getQm());
	}

	public  double getQm() {
		return qm;
	}



}