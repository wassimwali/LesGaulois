package personnages;
import java.security.SecureRandom;
import java.util.Random;
public class Druide extends Gaulois {
	private int dosesPotion;
	private int forcePotion;
	private Random random;
	public Druide(String nom, int force) {
		super(nom, force);
		try {
			random = SecureRandom.getInstanceStrong();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void fabriquerPotion() {
		dosesPotion = random.nextInt(5) + 1;
		forcePotion = random.nextInt(5) + 2; 
		parler("J'ai concocté " + dosesPotion + " doses de potion magique. Elle a une force de " + forcePotion + ".");

	}
	public void booster(Gaulois gaulois) {
		if (gaulois.getNom().equals("Obelix")) {
			parler("Non, Obelix Non !... Et tu le sais très bien !");

		} else if (dosesPotion > 0) {
			dosesPotion--;
			gaulois.boirePotion(forcePotion);
			parler("Tiens " + gaulois.getNom() + " un peu de potion magique.");
		} else {
			parler("Désolé " + gaulois.getNom() + " il n'y a plus une seule goutte de potion.");
		}
 		}
	public int getDosesPotion() {
		return dosesPotion;
	}
	public int getForcePotion() {
		return forcePotion;
	}

}