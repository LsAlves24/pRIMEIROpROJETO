package aula5;

    //classe DNA
    // objetivo: Definir a estrutura
public class Aluno {
  
 public int id;
 public String nome;
 public String matricula;
 public int idade;

 //declarando o método construtor vazio --simplifica 
 // além de criar objeto, executa o código contido no bloco
 public Aluno (){
     System.out.println("chamou o contrutor vazio!");
  }

  // this indica que o método ou variavel está naraiz da classe
 public Aluno (String nome) {
    this.nome=nome; 
 }
 public Aluno ( int id, String nome, String matricula, int idade) {
    this.id=id;
    this.nome = nome;
    this.matricula = matricula;
    this.idade = idade;

 }

 // assinatura:
 // proteção + retorno (tring, int, void -- não retorna) + nome + parâmetros
 public void imprimirDados() {
    System.out.println("ID: "+ id );
    System.out.println("nome: "+ nome );
    System.out.println("matrícula: "+ matricula);
    System.out.println("idade: "+ idade);

 } 

 //sobrecarga de metodos: repetição da mesma assinatura
 //mudando somente oparâmetro
 public void imprimirDados(int ordem) {
    System.out.println("Aluno: " + ordem);
    System.out.println("id: " + id);
    System.out.println("nome: "+ nome );
    System.out.println("matrícula: "+ matricula);
    System.out.println("idade: "+ idade);
  }

}





