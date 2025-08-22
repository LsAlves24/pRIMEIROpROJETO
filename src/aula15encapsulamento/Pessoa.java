package aula15encapsulamento;

public class Pessoa {
    // sem static é dinamico
    // static é parado 
    // encapsulamento de atributos 
    private String nome;
    private int idade; 
    
    //código bolier plates - repetitivos padrões
    public String getNome (){
        return this.nome;
    }
    public int getIdade (){
        return this.idade;
    }

    public void setNome(String nome) {
   //set - forma simples de inserir
   this.nome = nome;

    } 

    public void setIdade(int idade) {
        if (idade < 0) {
            System.out.println("valor inválido");
        } else {
            this.idade = idade; 
        }
    }
}
