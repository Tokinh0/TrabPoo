package Exercicio_6_7_8;

public class Sensor {
	private int id;
	private boolean estado;
	private boolean status;
	
	Sensor(int id,boolean estado, boolean status){
		this.id = id;
		this.estado = estado;
		this.status = status;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	public void ligarSensor(Sensor sensor){
		this.estado = true;
	}
	
	public void desligarSensor(Sensor sensor) {
		sensor.setEstado(false);
	}
	
	public void ativarSensor() {
		this.status = true;
	}
	
	public void desativarSensor() {
		this.status = false;
	}
}