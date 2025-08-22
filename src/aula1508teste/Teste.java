package aula1508teste;

import aula15encapsulamento.Pessoa;
//shift + alt + o para dar import 

public class Teste {
    public static void main(String[] args) {
        Pessoa p = new Pessoa ();
        p.setIdade(10);
        p.setNome ("labubu"); 

        System.out.println("Nome: " + p.getNome());
        System.out.println("Idade: " + p.getIdade() ); 

    }
    
}
