package test_fonctionnel;

import personnages.Druide;
import personnages.Equipements;
import personnages.Gaulois;
import personnages.Romain;
import personnages.Soldat;

public class TestGaulois {
	public static void main(String[] args) {
		Gaulois asterix=new Gaulois("Asterix",8);
		System.out.println(asterix.getNom());
		asterix.parler("bonjour à tous");
		Soldat minus = new Soldat("Minus", "CENTURION", 6);
		minus.parler(" UN GAU… UN GAUGAU…");
		minus.ajouterequip(new Equipements("bouclier", 3));
		minus.ajouterequip(new Equipements("casque", 2));
		minus.ajouterequip(new Equipements("plastron", 3));
		Druide panoramix = new Druide("Panoramix", 5);
		panoramix.fabriquerPotion();
		panoramix.booster(asterix);
		panoramix.booster(new Gaulois("Obelix", 15));
		panoramix.booster(new Gaulois("Assurancetourix", 2));
		panoramix.booster(new Gaulois("Abraracourcix", 5));
		panoramix.booster(new Gaulois("Agecanonix", 1));
		asterix.frapper(minus);
}
}