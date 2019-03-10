package Exercicio_3;

import javax.swing.JOptionPane;

public class Main {
		public static void main(String[] args) {
			
			ContaCorrente CC = new ContaCorrente();
			Menu menu = new Menu();
			
			Integer opcao = 1;
			while(opcao != 0){
				
				opcao = menu.lerOpcaoDoMenu();
				
				switch(opcao){
				case 1:
					double deposito = CC.efetuarDeposito();
					CC.depositar(deposito);
					break;
				case 2:
					double saque = CC.efetuarSaque();
					CC.sacar(saque);
					break;
				case 0:
					JOptionPane.showMessageDialog(null,"[Programa encerrado!]");
					break;
				 default:
					 JOptionPane.showMessageDialog(null,"Opcao Invalida!");
					 break;
				}
				//atualiza o valor do saldo do menu.
				menu.CC.setSaldo(CC.getSaldo());
				
			}
			
		}
		
	}

