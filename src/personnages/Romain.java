package personnages;

public class Romain {
	private String nom;
	private int force;
	public Romain(String nom,int force) {
		this.nom=nom;
		this.force=force;
	}
	public String getNom() {
		return nom;
	}
	public void parler(String txt) {
		System.out.println("le Romain "+nom+" :<<"+txt+">>.");
	}
	public void recevoirCoup(int coup) {
		force=force-coup;
		if (force<= 0) {
			force=0;
			System.out.println("J'abandonne... ");
		}
		else {
			System.out.println("Aïe ! ");
		}
	}
}
