package Exercicio_6_7_8;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		
		Controlador controlador = new Controlador();
		Sensor sensor = controlador.getSensor();
		ArrayList<Sensor> sensores = controlador.criaSensores();
		
		int bios = 1;
		
		while(bios != 0) {
			
			System.out.println("---------Menu--------");
			System.out.println("0 - Desligar Sistema");
			System.out.println("1 - Ligar todo o sistema");
			System.out.println("2 - Ligar sensor individual");
			System.out.println("3 - Desligar sensor individual");
			System.out.println("4 - Mostrar status dos sensores");
			Scanner leitor = new Scanner(System.in);
			int opcao = leitor.nextInt();
			switch(opcao) {
			case 0:
				System.out.println("Digite a senha para Desligar: ");
				String password = leitor.next();
				controlador.desligarSistema(controlador.getSistema(), password);
				bios = 0;
				System.exit(bios);
				break;
			case 1:
				System.out.println("Digite a senha: ");
				String senha = leitor.next();
				controlador.ligarSistema(controlador.getSistema(), senha);
				controlador.ligarTodosSensores(sensores);
				break;
			case 2:
				System.out.println("Digite o id do sensor a ser ligado: ");
				int id_sensor = leitor.nextInt();
				controlador.ligarSensor(id_sensor, sensores);
				break;
			case 3:
				System.out.println("Digite o id do sensor a ser desligado: ");
				int id_sen = leitor.nextInt();
				controlador.desligarSensor(id_sen, sensores);
				break;
			case 4:
				controlador.printStatusSensores(sensores);
				break;
			}	
		}
	}
}
