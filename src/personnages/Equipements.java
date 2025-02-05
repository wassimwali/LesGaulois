package personnages;

public class Equipements {
	private String nom;
	private int absorp;
	public Equipements(String nom, int absorp) {
		this.nom=nom;
		this.absorp=absorp;
	}
	public int getAbsorption() {
		return absorp;
	}
	public String getNom() {
		return nom;
	}
}
