package Exercicio_6_7_8;

public class Sirene {
	private int id;
	private boolean status;
	
	public boolean isStatus() {
		return status;
	}
	
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void ativarSirene() {
		this.status = true;
	}
	
	public void destivarSirene() {
		this.status = false;
	}

}
