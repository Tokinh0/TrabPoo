package Exercicio_2;
import java.util.Scanner;

public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;
    
    public String getName() {
        return nome;
    }
    public void setName(String name) {
        this.nome = name;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    Scanner leitor = new Scanner(System.in);
    
    Pessoa addPessoa() {
        Pessoa person = new Pessoa();
        System.out.println("Digite o nome da pessoa: ");
        person.nome = leitor.next();
        System.out.println("Digite a idade da pessoa: ");
        person.idade = leitor.nextInt();
        System.out.println("Digite o sexo da pessoa: ");
        person.sexo = leitor.next();
        return person;
    }
    
    void showALL() {
        System.out.println("Nome: "+ this.nome);
        System.out.println("Idade: "+ this.idade);
        System.out.println("Sexo: "+ this.sexo);
    }
}
