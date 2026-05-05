
// Autor : Jakub Žalud [259 525], PC2T PROJEKT

public class DatovyAnalytik extends Zamestnanec {

	public DatovyAnalytik(int ID, String jmeno, String prijmeni, int rok) {
		super(ID, jmeno, prijmeni, rok);
	}

	@Override
	public void dovednost() {
		System.out.println("--- Analýza pro:  " + jmeno + " " + prijmeni + ") ---");
		System.out.println("Tento analytik má v evidenci " + vazby.size() + " kolegů.");
	}
}