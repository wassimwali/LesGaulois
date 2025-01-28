package sites;
import personnages.Soldat;
public class Camp {
	private Soldat commandant;
	private Soldat[] habitants;
	private int nbrSoldat;
	public Camp(Soldat commandant) {
		this.commandant=commandant;
		this.nbrSoldat=1;
		this.habitants= new Soldat[80];
	}
	public Soldat getCommandant() {
		return commandant;
	}
	public void ajouterSoldat(Soldat soldat) {
		if(nbrSoldat<80) {
			habitants[nbrSoldat++]=soldat;
			soldat.parler("Je mets mon épée au service de Rome dans le camp dirigé par " + commandant.getNom() + ".");
		}else {
			commandant.parler("Désolé " + soldat.getNom() + " notre camp est complet !");
		}
	}
	public void afficherCamp() {
		System.out.println("Le camp dirigé par "+commandant.getNom()+" contient les soldats : ");
		for (int i=0;i<nbrSoldat;i++) {
			System.out.println(habitants[i].getNom());
		}
	}
	public void changerCommandant(Soldat soldat) {
		if (soldat.getGrade()=="CENTURION") {
			commandant.parler(" Je ne suis pas suffisamment gradé pour prendre la direction du camp romain. ");
			commandant=soldat;
			commandant.parler(" Moi "+commandant.getNom()+" je prends la direction du camp romain.");	
		}
	}
}
