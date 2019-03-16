package Exercicio_4;

public class Bomba {
	boolean status;
	long tempo;
	
	void ligar(long tempo) {
		this.status = true;
		printStatus(this.status);
		while(tempo >= 0) {
			System.out.println("tempo: " + tempo);
			try {
				   Thread.sleep(1000);
				} catch (Exception e) {
				   e.printStackTrace();
				}
			tempo--;
		}
	}
	
	void desligar() {
		this.status = false;
		printStatus(this.status);
	}
	
	void printStatus(boolean stats) {
		if (stats == true) {
			System.out.println("Bomba Ligada");
		}else {
			System.out.println("Bomba Desligada");	
		}
		
	}
}
