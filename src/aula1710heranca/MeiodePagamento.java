package aula1710heranca;

public abstract class MeiodePagamento {
    protected double valor; 

    public MeiodePagamento (double valor) {
        this.valor = valor; 

    }

    public abstract boolean processarPagamento (); 

    public void exibirDetalhes () {
        System.out.printf("valor da transação: R$ %.2f" , valor);

    }
    
}
