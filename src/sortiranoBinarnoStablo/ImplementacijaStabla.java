package sortiranoBinarnoStablo;

public class ImplementacijaStabla {

	CvorBinarnogStabla koren;
	
	public String vratiVrednostCvora (CvorBinarnogStabla k, int kljuc) {
		if(k==null)
			return null;
		
		if(k.kljuc == kljuc)
			return k.vrednost;
		
		if(k.kljuc > kljuc)
			return vratiVrednostCvora(k.levo, kljuc);
		
		return vratiVrednostCvora(k.desno, kljuc);
	}
	
}