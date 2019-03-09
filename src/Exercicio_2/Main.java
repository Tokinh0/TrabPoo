package Exercicio_2;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    private static Scanner leitor;
	public static void main (String args[]) {
        int option;
        int repetidor = 0;
        ArrayList<Pessoa> lista = new ArrayList<Pessoa>();
        Pessoa pessoa = new Pessoa();
        while(repetidor <= 10) {
            System.out.println("-------------- Menu ---------------");
            System.out.println("Digite 1 Para cadastrar Pessoa.");
            System.out.println("Digite 2 Para Buscar uma Pessoa.");
            System.out.println("Digite 3 Para Mostar todas as pessoas cadastradas.");
            System.out.println("Digite 0 para encerrar o programa.");
            System.out.println("-------------- Menu ---------------");
            leitor = new Scanner(System.in);
            option = leitor.nextInt();
            switch(option) {
                case 1:
                    pessoa = pessoa.addPessoa();
                    lista.add(pessoa);
                    System.out.println("Pessoa Cadastrada com Sucesso!");
                    break;
                case 2:
                    System.out.println("Digite o numero do elemento ");
                    int elemento = leitor.nextInt();
                    if(elemento < 0 || elemento > 10) {
                        System.out.println("Elemento nao existe !");
                    }
                    pessoa = lista.get(elemento);
                    pessoa.showALL();
                    break;
                    
                case 3:
                    for(Pessoa pessoas: lista) {
                        pessoas.showALL();
                    }
                break;
                
                case 0:
                	System.out.println("Encerrando...");
                    System.exit(0);
                break;    
            }
        }
    }
}
