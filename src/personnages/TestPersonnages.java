package personnages;

import sites.Camp;
import sites.Village;

public class TestPersonnages {
	public static void main(String[] args) {
		Gaulois vercingetorix=new Gaulois("Vercingetorix",5);
		Soldat minus=new Soldat("Minus","CENTURION",2);
		Village village=new Village(vercingetorix);
		Camp camp=new Camp(minus);
		camp.ajouterSoldat(new Soldat("Brutus","CENTURION",5));
		camp.ajouterSoldat(new Soldat("Milexcus", "SOLDAT", 2));
		camp.ajouterSoldat(new Soldat("Tullius Octopus", "TESSERARIUS", 2));
		camp.ajouterSoldat(new Soldat("Ballondebaudrus", "OPTIO", 3)); 
		village.ajouterVillageois(new Gaulois("Agecanonix", 1));
		village.ajouterVillageois(new Gaulois("Assurancetourix", 2));
		village.ajouterVillageois(new Gaulois("Astérix", 5));
		village.ajouterVillageois(new Gaulois("Obelix", 15));
		village.ajouterVillageois(new Gaulois("Prolix", 2)); 
		village.afficherVillage();
		camp.afficherCamp();
		 }
}
