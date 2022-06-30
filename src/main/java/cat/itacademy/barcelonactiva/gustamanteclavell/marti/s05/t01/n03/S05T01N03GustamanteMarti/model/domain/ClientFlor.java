package cat.itacademy.barcelonactiva.gustamanteclavell.marti.s05.t01.n03.S05T01N03GustamanteMarti.model.domain;

public class ClientFlor {

	
	private int florID;
	private String nomFlor;
	private String paisFlor;
	
	public ClientFlor(int florID, String nomFlor, String paisFlor) {
		super();
		this.florID = florID;
		this.nomFlor = nomFlor;
		this.paisFlor = paisFlor;
	}

	public int getFlorID() {
		return florID;
	}

	public void setFlorID(int florID) {
		this.florID = florID;
	}

	public String getNomFlor() {
		return nomFlor;
	}

	public void setNomFlor(String nomFlor) {
		this.nomFlor = nomFlor;
	}

	public String getPaisFlor() {
		return paisFlor;
	}

	public void setPaisFlor(String paisFlor) {
		this.paisFlor = paisFlor;
	}

	@Override
	public String toString() {
		return "ClientFlor [florID=" + florID + ", nomFlor=" + nomFlor + ", paisFlor=" + paisFlor + "]";
	}
	
	
	
	
}
