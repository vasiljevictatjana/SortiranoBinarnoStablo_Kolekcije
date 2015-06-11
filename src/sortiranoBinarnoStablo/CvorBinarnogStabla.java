package sortiranoBinarnoStablo;

public class CvorBinarnogStabla {
	
	public String vrednost;
	public int kljuc;
	public CvorBinarnogStabla levo;
	public CvorBinarnogStabla desno;
	
	public String getVrednost() {
		return vrednost;
	}
	public void setVrednost(String vrednost) {
		this.vrednost = vrednost;
	}
	public int getKljuc() {
		return kljuc;
	}
	public void setKljuc(int kljuc) {
		this.kljuc = kljuc;
	}
	public CvorBinarnogStabla getLevo() {
		return levo;
	}
	public void setLevo(CvorBinarnogStabla levo) {
		this.levo = levo;
	}
	public CvorBinarnogStabla getDesno() {
		return desno;
	}
	public void setDesno(CvorBinarnogStabla desno) {
		this.desno = desno;
	}

}
