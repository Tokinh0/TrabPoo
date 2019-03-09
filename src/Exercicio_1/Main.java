package Exercicio_1;
import javax.swing.JOptionPane;

public class Main {

    public static void main (String args[]) {
        Aluno aluno = new Aluno();
        aluno.name = JOptionPane.showInputDialog("Entre com o nome do aluno:");
        aluno.setNum_sala(JOptionPane.showInputDialog("Entre com a numeração da sala do aluno " + aluno.name));  
        aluno.nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota de " + aluno.name));
        aluno.nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota de " + aluno.name));
        aluno.nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota de " + aluno.name));
        aluno.nota4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a quarta nota de " + aluno.name));
        aluno.calculaMedia();
        JOptionPane.showMessageDialog(null, "A média é: " + aluno.media);
    }

}
