package sites;

import personnages.Gaulois;
import personnages.Soldat;

public class Village {
	private Gaulois chef;
	private Gaulois[] habitants;
	private int nbrGaulois;
	public Village(Gaulois chef) {
		this.chef=chef;
		this.habitants=new Gaulois[50];
		this.nbrGaulois=1;
	}
	public Gaulois getChef() {
		return chef;
	}
	public void ajouterVillageois(Gaulois gaulois) {
		if(nbrGaulois<50) {
			habitants[nbrGaulois++]=gaulois;
			chef.parler("Bienvenue " + gaulois.getNom() + " !");
		}else {
			chef.parler("Désolé " + gaulois.getNom() + " mon village est déjà bien rempli.");
		}
	}
	public void afficherVillage() {
		System.out.println("Le village de "+chef.getNom()+" est habité par :");
		for (int i=0;i<nbrGaulois;i++) {
			System.out.println(habitants[i].getNom());
		}
	}
	public void changerChef(Gaulois gaulois) {
		chef.parler(" Je laisse mon grand bouclier au grand "+gaulois.getNom()+".");
		chef=gaulois;
		chef.parler(" Merci !");	
		
	}
}
