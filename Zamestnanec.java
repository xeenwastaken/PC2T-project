
// Autor : Jakub Žalud [259 525], PC2T PROJEKT

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public abstract class Zamestnanec implements Serializable {
	protected int identifikator;
	protected String jmeno;
	protected String prijmeni;
	protected int rokNarozeni;
	protected List<Spoluprace> vazby;

	public Zamestnanec(int ID, String jmeno, String prijmeni, int rok) {
		this.identifikator = ID;
		this.jmeno = jmeno;
		this.prijmeni = prijmeni;
		this.rokNarozeni = rok;
		this.vazby = new ArrayList<>();
	}

	public abstract void dovednost();

	public int getID() {
		return identifikator;
	}

	public String getPrijmeni() {
		return prijmeni;
	}

	public List<Spoluprace> getVazby() {
		return vazby;
	}

	@Override
	public String toString() {
		return "ID " + identifikator + ": " + jmeno + " " + prijmeni + " (" + rokNarozeni + ")";

	}

}