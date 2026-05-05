
// Autor : Jakub Žalud [259 525], PC2T PROJEKT

import java.io.Serializable;

public class Spoluprace implements Serializable {
	private int PartnerID;
	private UrovenSpoluprace kvalita;

	public Spoluprace(int PartnerID, UrovenSpoluprace kvalita) {
		this.PartnerID = PartnerID;
		this.kvalita = kvalita;
	}

	public int getPartnerID() {
		return PartnerID;
	}

	public UrovenSpoluprace getKvalita() {
		return kvalita;
	}
}
