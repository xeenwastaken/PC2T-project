
// Autor : Jakub Žalud [259 525], PC2T PROJEKT

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		SpravceZamestnancu manager = new SpravceZamestnancu();
		Scanner klavesnice = new Scanner(System.in);
		int akce = -1;

		while (akce != 0) {
			System.out.println("\n*** HLAVNI MENU ***");
			System.out.println("1 - Pridat zamestnance");
			System.out.println("2 - Pridat novou spolupraci");
			System.out.println("3 - Vymazat cloveka dle ID");
			System.out.println("4 - Spustit dovednost (podle skupiny)");
			System.out.println("5 - Abecedni vypis lidi");
			System.out.println("6 - Celkove statistiky");
			System.out.println("7 - Export do souboru");
			System.out.println("8 - Import ze souboru");
			System.out.println("0 - Ukoncit program");
			System.out.print("Vyberte cislo akce: ");

			while (!klavesnice.hasNextInt()) {
				System.out.println("Chyba: Zadejte cislo akce!");
				klavesnice.nextLine();
			}
			akce = klavesnice.nextInt();
			klavesnice.nextLine();

			if (akce == 1) {
				System.out.print("Skupina (1-Analytik, 2-Specialista): ");
				while (!klavesnice.hasNextInt()) {
					System.out.println("Chyba: Zadejte 1 nebo 2!");
					klavesnice.nextLine();
				}
				int typ = klavesnice.nextInt();
				klavesnice.nextLine();

				System.out.print("Zadejte jmeno: ");
				String jmeno = klavesnice.nextLine();
				System.out.print("Zadejte prijmeni: ");
				String prijmeni = klavesnice.nextLine();

				System.out.print("Zadejte rok narozeni: ");
				while (!klavesnice.hasNextInt()) {
					System.out.println("Chyba: Zadejte rok jako cislo!");
					klavesnice.nextLine();
				}
				int rok = klavesnice.nextInt();
				klavesnice.nextLine();
				manager.pridatNoveho(typ, jmeno, prijmeni, rok);

			} else if (akce == 2) {
				System.out.print("ID odesilatele: ");
				while (!klavesnice.hasNextInt()) {
					System.out.println("Chyba: ID musi byt cislo!");
					klavesnice.nextLine();
				}
				int id1 = klavesnice.nextInt();

				System.out.print("ID kolegy: ");
				while (!klavesnice.hasNextInt()) {
					System.out.println("Chyba: ID musi byt cislo!");
					klavesnice.nextLine();
				}
				int id2 = klavesnice.nextInt();

				System.out.print("Kvalita (1-NIZKA, 2-STREDNI, 3-VYSOKA): ");
				while (!klavesnice.hasNextInt()) {
					System.out.println("Chyba: Zadejte 1, 2 nebo 3!");
					klavesnice.nextLine();
				}
				int uroven = klavesnice.nextInt();

				UrovenSpoluprace u = (uroven == 1) ? UrovenSpoluprace.NIZKA
						: (uroven == 2) ? UrovenSpoluprace.STREDNI : UrovenSpoluprace.VYSOKA;
				Zamestnanec z = manager.hledejID(id1);
				if (z != null) {
					z.getVazby().add(new Spoluprace(id2, u));
					System.out.println("Spoluprace pridana.");
				} else {
					System.out.println("ID " + id1 + " neexistuje.");
				}

			} else if (akce == 3) {
				System.out.print("Zadejte ID pro smazani: ");
				while (!klavesnice.hasNextInt()) {
					System.out.println("Chyba: Zadejte ciselné ID!");
					klavesnice.nextLine();
				}
				manager.vymazatZamestnance(klavesnice.nextInt());

			} else if (akce == 4) {
				System.out.print("Zadejte ID zamestnance: ");
				while (!klavesnice.hasNextInt()) {
					System.out.println("Chyba: Zadejte ciselné ID!");
					klavesnice.nextLine();
				}
				Zamestnanec z = manager.hledejID(klavesnice.nextInt());
				if (z != null)
					z.dovednost();
				else
					System.out.println("ID nenalezeno.");

			} else if (akce == 5) {
				manager.tiskAbecedne();
			} else if (akce == 6) {
				manager.vypisStatistiky();
			} else if (akce == 7) {
				manager.ulozit();
			} else if (akce == 8) {
				manager.nacist();
			}
		}
		System.out.println("System ukoncen.");
		klavesnice.close();
	}
}