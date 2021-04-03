package composite;

public class Wohngebaeude {

	public static void main(String[] args) {
		 	
			Wohnraum wo1 = new Wohnraum(1, 3, 100.24);
			Wohnraum wo2 = new Wohnraum(1, 4, 150.53);
	      
			Verzeichnis wohnVerzeichnis = new Verzeichnis();
			wohnVerzeichnis.addWohnflaeche(wo1);
			wohnVerzeichnis.addWohnflaeche(wo2);
			
	        Abstellraum ar1 = new Abstellraum(0, 1, 23.25);
	        Abstellraum ar2 = new Abstellraum(0, 2, 27.5);
	           
	        Verzeichnis abstVerzeichnis = new Verzeichnis();
	        abstVerzeichnis.addWohnflaeche(ar1);
	        abstVerzeichnis.addWohnflaeche(ar2);
	       
	        Verzeichnis v = new Verzeichnis();
	        v.addWohnflaeche(wohnVerzeichnis);
	        v.addWohnflaeche(abstVerzeichnis);
	        v.showWohnflaecheDetails();
	        
	        System.out.println("");
	        System.out.println("Verfügbarer Wohnraum: ");
	        System.out.println(Math.round(Double.sum(wo1.qm, wo2.qm))+" m²"); 
	        
	        System.out.println("");
	        System.out.println("Verfügbarer Räume: ");
	        System.out.println(Integer.sum(wo1.Raeume, wo2.Raeume));
	        
	}

}