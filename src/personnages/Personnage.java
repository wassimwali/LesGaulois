package personnages;

public abstract class Personnage {
	private String nom;
	private int force;
	public Personnage(String nom, int force) {
		this.nom=nom;
		this.force=force;
	}
	public int getforce() {
		return force;
	}
	public String getNom() {
		return nom;
	}
	protected abstract String donnerAuteur();
	public void parler(String txt) {
		System.out.println("le "+this.donnerAuteur()+" "+nom+" :<<"+txt+">>.");
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
	public void frapper(Personnage adversaire) {
		System.out.println("le "+this.donnerAuteur()+" "+nom+" envoie un grand coup dans la mâchoire de "+adversaire.getNom());
		adversaire.recevoirCoup(force);
	}

}
