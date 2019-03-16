package Exercicio_9;

public class Main {
	public static void main (String args[]) {
		Televisao televisao = new Televisao();
		ControleRemoto controle = new ControleRemoto();
		
		televisao.mostrarStatus();
		controle.ligarTV(televisao);
		controle.aumentarVolume(televisao);
		controle.aumentarVolume(televisao);
		controle.aumentarVolume(televisao);
		controle.aumentarVolume(televisao);
		controle.aumentarVolume(televisao);
		controle.diminuirVolume(televisao);
		controle.escolherCanal(televisao, 33);
		controle.aumentarCanal(televisao);
		controle.diminuirVolume(televisao);
		televisao.mostrarStatus();
		
	}
}
