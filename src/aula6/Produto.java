package aula6;

public class Produto {
    public int id;
    public String nome;
    public String descricao;
    public String codigoBarras;
    public double valor;

    public Produto () {

    } 
    public Produto (int id, String nome, String descricao, String codigoBarras, double valor) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.codigoBarras = codigoBarras;
        this.valor = valor;
    } 
    public void imprimirDados () {
        System.out.println("Id: " + this.id);
        System.out.println("Nome: " + this.nome);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Codigo de barras: " + this.codigoBarras);
        System.out.println("Valor: " + this.valor);
    }
     
}
