
// Autor : Jakub Žalud [259 525], PC2T PROJEKT

import java.io.Serializable;

public enum UrovenSpoluprace implements Serializable {
	NIZKA(1), STREDNI(2), VYSOKA(3);

	private final int body;

	UrovenSpoluprace(int body) {
		this.body = body;
	}

	public int getBody() {
		return body;
	}
}