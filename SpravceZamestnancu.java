
// Autor : Jakub Žalud [259 525], PC2T PROJEKT

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SpravceZamestnancu implements Serializable {
	private Map<Integer, Zamestnanec> seznamZamestnancu = new HashMap<>();
	private int citacID = 1;

	public void pridatNoveho(int typ, String jmeno, String prijmeni, int rok) {
		Zamestnanec novy = (typ == 1) ? new DatovyAnalytik(citacID, jmeno, prijmeni, rok)
				: new BezpecnostniSpecialista(citacID, jmeno, prijmeni, rok);
		seznamZamestnancu.put(citacID, novy);
		citacID++;
	}

	public void vymazatZamestnance(int ID) {
		for (Zamestnanec z : seznamZamestnancu.values()) {
			z.getVazby().removeIf(s -> s.getPartnerID() == ID);
		}
		if (seznamZamestnancu.remove(ID) != null) {
			System.out.println("ID " + ID + " smazano.");
		} else {
			System.out.println("ID neexistuje.");
		}
	}

	public void tiskAbecedne() {
		List<Zamestnanec> lide = new ArrayList<>(seznamZamestnancu.values());
		lide.sort(Comparator.comparing(Zamestnanec::getPrijmeni));

		System.out.println("\n--- ANALYTICI ---");
		for (Zamestnanec z : lide)
			if (z instanceof DatovyAnalytik)
				System.out.println(z);

		System.out.println("\n--- SPECIALISTE ---");
		for (Zamestnanec z : lide)
			if (z instanceof BezpecnostniSpecialista)
				System.out.println(z);
	}

	public void vypisStatistiky() {
		if (seznamZamestnancu.isEmpty())
			return;

		int analytici = 0, specialisté = 0;
		Zamestnanec nejaktivnejsi = null;
		int[] kvality = new int[4];

		for (Zamestnanec z : seznamZamestnancu.values()) {
			if (z instanceof DatovyAnalytik)
				analytici++;
			else
				specialisté++;
			if (nejaktivnejsi == null || z.getVazby().size() > nejaktivnejsi.getVazby().size()) {
				nejaktivnejsi = z;
			}
			for (Spoluprace s : z.getVazby())
				kvality[s.getKvalita().getBody()]++;
		}

		System.out.println("Pocet - Analytici: " + analytici + ", Specialiste: " + specialisté);
		System.out.println("Nejvice vazeb: " + (nejaktivnejsi != null ? nejaktivnejsi.getPrijmeni() : "N/A"));

		String dominantni = "NIZKA";
		if (kvality[2] >= kvality[1] && kvality[2] >= kvality[3])
			dominantni = "STREDNI";
		if (kvality[3] >= kvality[1] && kvality[3] >= kvality[2])
			dominantni = "VYSOKA";
		System.out.println("Prevazujici uroven: " + dominantni);
	}

	public void ulozit() {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data.ser"))) {
			oos.writeObject(seznamZamestnancu);
			oos.writeInt(citacID);
		} catch (IOException e) {
			System.out.println("Chyba zapisu.");
		}
	}

	public void nacist() {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.ser"))) {
			seznamZamestnancu = (Map<Integer, Zamestnanec>) ois.readObject();
			citacID = ois.readInt();
		} catch (Exception e) {
			System.out.println("Zaloha nenalezena.");
		}
	}

	public Zamestnanec hledejID(int hledaneID) {
		return seznamZamestnancu.get(hledaneID);
	}
}