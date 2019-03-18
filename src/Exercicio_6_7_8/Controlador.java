package Exercicio_6_7_8;
import java.util.ArrayList;

import Exercicio_6_7_8.Sensor;

public class Controlador {
	private int qtdSensores = 9;  
	private Sistema sistema = new Sistema();
	private Sensor sensor = new Sensor(0, false, false);
	private ArrayList<Sensor> sensores = new ArrayList<Sensor>();
	
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
	
	public void ligarSistema(Sistema sistema, String codigo) {
		if (codigo.equals(sistema.getCodigo())) {
			sistema.setEstado(true);
			System.out.println("Sistema Iniciado...");
			System.out.println("Sensores Ligados...");
		}else {
			System.out.println("Senha invalida");
		}
	}
	
	public void desligarSistema(Sistema sistema, String codigo) {
		if (codigo.equals(sistema.getCodigo())) {
			sistema.setEstado(false);
			System.out.println("Sistema Encerrado...");	
		}else {
			System.out.println("Senha invalida");
		}
	}
	
	public void printStatusSensores(ArrayList<Sensor> sensores) {
		for(Sensor sensor: sensores) {
			System.out.println("Sensor " + sensor.getId() + " Ligado");
		}
	}
	
	public void checarSensor(int id_sensor, ArrayList<Sensor> sensores) {
		for(Sensor sensor: sensores) {
			if(sensor.getId() == id_sensor) {
				if(sensor.isEstado()) {
					System.out.println("Sensor " + sensor.getId() + " Ligado");
				}else {
					System.out.println("Sensor " + sensor.getId() + " Desligado");
				}	
			}else {
				System.out.println("Sensor nao encontrado ou inexistente!");
			}
		}
	}
	
	public void ligarSensor(int id_sensor, ArrayList<Sensor> sensores) {
		for(Sensor sensor: sensores) {
			if(sensor.getId() == id_sensor) {
				sensor.ligarSensor(sensor);
				System.out.println("Sensor ligado...");
			}else {
				System.out.println("Sensor nao encontrado ou inexistente!");
			}
			
		}
	}
	
	public void desligarSensor(int id_sensor, ArrayList<Sensor> sensores) {
		for(Sensor sensor: sensores) {
			if(sensor.getId() == id_sensor) {
				sensor.desligarSensor(sensor);
				System.out.println("Sensor desligado...");
			}else {
				System.out.println("Sensor nao encontrado ou inexistente!");
			}
			
		}
	}
}
