package Exercicio_9;

public class ControleRemoto {
	
	public void ligarTV(Televisao televisao) {
		televisao.setStatus(true);	
	}
	
	public void desligarTV(Televisao televisao) {
		televisao.setStatus(false);
	}
	
	public void aumentarVolume(Televisao televisao){
		int volume = televisao.getVolume();
		televisao.setVolume(volume+1);
	}
	
	public void diminuirVolume(Televisao televisao) {
		int volume = televisao.getVolume();
		televisao.setVolume(volume-1);
	}
	
	public void escolherCanal(Televisao televisao, int canal) {
		televisao.setCanal(canal);
	}
	
	public void aumentarCanal(Televisao televisao) {
		int canal = televisao.getCanal();
		televisao.setCanal(canal+1);
	}
	
	public void diminuirCanal(Televisao televisao) {
		int canal = televisao.getCanal();
		televisao.setCanal(canal-1);
	}
}
