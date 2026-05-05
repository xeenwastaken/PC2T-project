
// Autor : Jakub Žalud [259 525], PC2T PROJEKT

public class BezpecnostniSpecialista extends Zamestnanec {

	public BezpecnostniSpecialista(int ID, String jmeno, String prijmeni, int rok) {
		super(ID, jmeno, prijmeni, rok);
	}

	@Override
	public void dovednost() {
		System.out.println("--- Vyhodnoceni rizikovosti: " + prijmeni + " ---");
		if (vazby.isEmpty()) {
			System.out.println("Tento specialista nema zadne vazby, riziko je nulove.");
			return;
		}

		double soucet = 0;
		for (Spoluprace s : vazby) {
			soucet += s.getKvalita().getBody();
		}

		double vysledek = soucet / vazby.size();

		double skore = (vazby.size() * 1.5) / vysledek;

		System.out.printf("Rizikove skore: %.2f (vazeb: %d, prumerna kvalita: %.2f)\n", skore, vazby.size(), vysledek);
	}
}