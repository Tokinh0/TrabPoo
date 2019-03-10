package Exercicio_3;
import javax.swing.JOptionPane;



public class Menu {
	
	ContaCorrente CC = new ContaCorrente(); 
	
	public Integer lerOpcaoDoMenu(){
		double saldo = CC.getSaldo();
		String menu = "[Saldo da conta: " + saldo +"]";
		menu += "\n[0] - Sair";
		menu += "\n[1] - Depositar.";
		menu += "\n[2] - Sacar";
		menu += "\n[ ------------------------- ]";
		menu += "\nInforme o numero da opção desejada:  ";
		String strOpcao = JOptionPane.showInputDialog(null,menu);
		CC.setSaldo(saldo); 
		return Integer.parseInt(strOpcao);
	}			
}