package aula3;

import java.util.Scanner;

public class Exemplo1 {
    public static void main (String[] args) {
    
        String nomeAluno;
        double nota1 = 0, nota2 = 0;
        
        Scanner input = new Scanner(System.in); //cria um objeto na memoria 
       

        System.out.println("digite eu nome:");
        nomeAluno = input.nextLine();

        System.out.println("Digite nota1:");
        nota1 = input.nextDouble();

        System.out.println("Digite nota2:");
        nota2 = input.nextDouble();

        double media = (nota1 + nota2) /2;

        System.out.println ("media:" + media);


    }
    
    
}
