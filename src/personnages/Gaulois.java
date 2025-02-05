package personnages;

public class Gaulois extends Personnage {
	private double forceBoost=1.0 ;
	public Gaulois (String nom , int force) {
		super(nom,force);
	}
	 public void boirePotion(int forcePotion) {
		 this.forceBoost =(double) forcePotion;
		 }
	@Override
	protected String donnerAuteur() {
		return "Gaulois";
	}

	public void frapper(Personnage adversaire) {
	 int forceCoup = (int) (super.getforce() / 3 * forceBoost);
	 System.out.println(donnerAuteur() + " " + super.getNom() + " donne un grand coup de force " + forceCoup + " à " + donnerAuteur() + " " + adversaire.getNom() + ".");
	 adversaire.recevoirCoup(forceCoup);
	 if (forceBoost > 1.0) {
		 forceBoost -= 0.5;
	 }
}
}