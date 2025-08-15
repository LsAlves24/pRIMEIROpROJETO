package aula9;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Jonh Doe"; 
        aluno1.idade = 50; 

        Matricula mat = new Matricula();
        mat.status = "Matriculado"; 
        mat.codigo = "202310070007";
        mat.data = LocalDateTime.now(); 
        // o now ele n permite que o usuario personalise a data. 
        mat.aluno = aluno1; 

        System.out.println("dados matrícula");
        System.out.println("Aluno: " + mat.aluno.nome);
        System.out.println("Idade: " + mat.aluno.idade);
        System.out.println("Matrícula: " + mat.codigo);
        System.out.println("Status: " + mat.status);
        System.out.println("Data: " + mat.data);
        
        




    }
}
