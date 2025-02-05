package personnages;
import personnages.Equipements;
public class Soldat extends Romain{
	private String grade;
	private Equipements[] equip;
	private int max=3;
	private int taille=0;
	public Soldat(String nom, String grade, int force) {
		super(nom,force);
		this.grade=grade;
		this.equip=new Equipements[max];
	}
	public String getGrade() {
		return grade;
	}
	public boolean ajouterequip(Equipements equipement) {
		if(taille==max) {
			System.out.println("impossible d ajouter un autre equip");
			return false;
		}
		else {
			for(int i=0;i<taille;i++) {
				if (equip[i].equals(equipement.getNom())) {
					System.out.println("impossible , equipement deja existant");	
					return false;
				}
			}
			equip[taille]=equipement;
			taille++;
			System.out.println("Le soldat "+ super.getNom() +" s'équipe avec un "+equipement.getNom()+" .");
			return true;
		}
	}
	public void recevoirCoup(int force) {
		int forceabsorb=0;
		for(int i=0;i<taille;i++) {
			forceabsorb+=equip[i].getAbsorption();
			System.out.println("Le " + equip[i].getNom() + " absorbe " + equip[i].getAbsorption() + " du coup.");
		}
		int forceRestante = force - forceabsorb;
		if (forceRestante > 0) {
		 super.recevoirCoup(forceRestante);
		 } else {
		 parler("J’abandonne... ");
		 }
	}

}

