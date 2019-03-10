package Exercicio_3;

import javax.swing.JOptionPane;

public class ContaCorrente {
	private int id;
	private double saldo;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double efetuarDeposito() {
		String strValor = JOptionPane.showInputDialog(null, "Digite o valor a ser depositado");
		return Double.parseDouble(strValor);
	}
	
	public double efetuarSaque() {
		String strValor = JOptionPane.showInputDialog(null, "Digite o valor a ser sacado");
		return Double.parseDouble(strValor);
	}
	
	void depositar(double valor) {
		this.saldo = (saldo + valor);
	}
	
	void sacar(double valor) {
		if (valor <= this.saldo) {
			this.saldo = (saldo - valor);
		}else {
			JOptionPane.showMessageDialog(null, "Saldo insuficiente");
		}
	}
	
	
}
