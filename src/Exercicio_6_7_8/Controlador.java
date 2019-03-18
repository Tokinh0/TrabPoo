package Exercicio_6_7_8;
import java.util.ArrayList;

import Exercicio_6_7_8.Sensor;

public class Controlador {
	private int qtdSensores = 9;  
	private Sistema sistema = new Sistema();
	private Sensor sensor = new Sensor(0, false, false);
	private ArrayList<Sensor> sensores = new ArrayList<Sensor>();
	private Sirene sirene = new Sirene();
	
	public Sensor getSensor() {
		return sensor;
	}

	public void setSensor(Sensor sensor) {
		this.sensor = sensor;
	}

	public ArrayList<Sensor> getSensores() {
		return sensores;
	}

	public void setSensores(ArrayList<Sensor> sensores) {
		this.sensores = sensores;
	}

	public Sistema getSistema() {
		return sistema;
	}

	public void setSistema(Sistema sistema) {
		this.sistema = sistema;
	}
	
	public ArrayList<Sensor> criaSensores() {
		for(int x = 0;x <= qtdSensores;x++) {
			sensor = new Sensor(x,false,false);
			sensores.add(sensor);
		}
		return sensores;
	}
	
	public void ligarTodosSensores(ArrayList<Sensor> sensores) {
		for(Sensor sensor: sensores) {
			sensor.ligarSensor(sensor);
		}
	}
	
	public void desligarTodosSensores(ArrayList<Sensor> sensores) {
		for(Sensor sensor: sensores) {
			sensor.desligarSensor(sensor);
			sensor.desativarSensor(sensor);
		}
	}
	
	public void ligarSistema(Sistema sistema, String codigo) {
		if (codigo.equals(sistema.getCodigo())) {
			sistema.setEstado(true);
			ligarTodosSensores(sensores);
			System.out.println("Sistema Iniciado...");
			System.out.println("Sensores Ligados...");
		}else {
			System.out.println("Senha invalida");
		}
	}
	
	public void desligarSistema(Sistema sistema, String codigo) {
		if (codigo.equals(sistema.getCodigo())) {
			sistema.setEstado(false);
			desligarTodosSensores(sensores);
			System.out.println("Sistema Encerrado...");
			System.exit(0);
		}else {
			System.out.println("Senha invalida");
		}
	}
	
	public void printStatusSensores(ArrayList<Sensor> sensores) {
		for(Sensor sensor: sensores) {
			if(sensor.isEstado()) {
				System.out.println("Sensor " + sensor.getId() + " Ligado");
				if(sensor.isStatus()) {
					System.out.println("Sensor " + sensor.getId() + " foi acionado !");
				}
			}else {
				System.out.println("Sensor " + sensor.getId() + " Desligado");
			}
			
		}
	}
	
	public void checarSensor(int id_sensor, ArrayList<Sensor> sensores) {
		for(Sensor sensor: sensores) {
			if(sensor.getId() == id_sensor) {
				if(sensor.isEstado()) {
					System.out.println("Sensor " + sensor.getId() + " Ligado");
					if(sensor.isStatus()) {
						System.out.println("Sensor foi acionado !");
					}
				}else {
					System.out.println("Sensor " + sensor.getId() + " Desligado");
				}	
			}
		}
	}
	
	public void ligarSensor(int id_sensor, ArrayList<Sensor> sensores) {
		for(Sensor sensor: sensores) {
			if(sensor.getId() == id_sensor) {
				sensor.ligarSensor(sensor);
				System.out.println("Sensor ligado...");
			}
		}
	}
	
	public void desligarSensor(int id_sensor, ArrayList<Sensor> sensores) {
		for(Sensor sensor: sensores) {
			if(sensor.getId() == id_sensor) {
				sensor.desligarSensor(sensor);
				sensor.desativarSensor(sensor);
				System.out.println("Sensor desligado...");
			}	
		}
	}
	
	public void checarSensores(ArrayList<Sensor> sensores) {
		for(Sensor sensor: sensores) {
			if(sensor.isStatus()) {
				sirene.ativarSirene();
				System.out.println("Intruço Detectado perto ao sensor: " + sensor.getId());
			}
		}	
	}
	
	public Sensor escolherSensor(ArrayList<Sensor> sensores, int id_sens) {
		for(Sensor sensor: sensores) {
			if(sensor.getId() == id_sens) {
				return sensor;
			}
		}
		return null;
	}
	
	public void intrucao(Sensor sensor) {
		if(sensor.isEstado()) {
			sensor.setStatus(true);
		}else {
			System.out.println("Sensor esta desligado !");
		}
		
	}
}
