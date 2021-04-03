package composite;

import java.util.ArrayList;
import java.util.List;

public class Verzeichnis implements Wohnflaeche{

	private List<Wohnflaeche> wohnflaecheList = new ArrayList<Wohnflaeche>();
	
	@Override
	public void showWohnflaecheDetails() {
	    for(Wohnflaeche wf:wohnflaecheList)
        {
            wf.showWohnflaecheDetails();
        }
    }
        
    public void addWohnflaeche(Wohnflaeche wf) {
        wohnflaecheList.add(wf);
    }
    

}