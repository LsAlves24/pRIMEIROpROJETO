package aula5;

public class App {

    public static void main( String [] args){
//invocando o métodos contrutores com o new para criação dos objetos 
Aluno aluno1 = new Aluno();
Aluno aluno2 = new Aluno();
Aluno aluno3 = new Aluno();

aluno1.id=10;
aluno1.nome="larissa";
aluno1.matricula="2025837";
aluno1.idade=30;

aluno2.id=11;
aluno2.nome="douglas";
aluno2.matricula="20256738";
aluno2.idade=32;

aluno3.id=12;
aluno3.nome="leticia";
aluno3.matricula="2025039";
aluno3.idade=34;

// parenteses invoca o método

//imprimir dados 
aluno1.imprimirDados(1);
aluno2.imprimirDados (2);
aluno3.imprimirDados (3);

  }
}