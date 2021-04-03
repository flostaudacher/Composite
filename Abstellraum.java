package composite;

public class Abstellraum implements Wohnflaeche{
	
	private int Stockwerk;
	private int Raeume;
	double qm;
	
		
	public Abstellraum(int stockwerk, int raeume, double qm) {
		Stockwerk = stockwerk;
		Raeume = raeume;
		this.qm = qm;
	}

	public void showWohnflaecheDetails() {
		System.out.println("Stockwerk: "+Stockwerk+" | Räume: "+Raeume+" | Quardratmeter: "+getQm());
	}

	public double getQm() {
		return qm;
	}


}