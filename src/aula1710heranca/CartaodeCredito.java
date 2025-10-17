package aula1710heranca;

public class CartaodeCredito extends MeiodePagamento {

    private String numeroCartao; 
    private int parcelas;



    public CartaodeCredito(double valor, String numeroCartao, int parcelas) {
        super(valor);
        this.numeroCartao = numeroCartao;
        this.parcelas = parcelas; 

    }
     // Implementação obrigatória do método abstrato
    @Override
    public boolean processarPagamento() {
        System.out.println("\n Processando pagamento com Cartão de Crédito");
        super.exibirDetalhes(); //  está na classe mãe 
        System.out.println ("Final: " + this.numeroCartao.substring(this.numeroCartao.length()-4));
        System.out.println ("Parcelado em: " + this.parcelas + "x");

        if (this.valor > 0 && this.parcelas > 0) {
            System.out.println("Transação autorizada! ");
            return true; 

        } else {
            System.out.println ( "Transação Negada!");
            return false; 
        }
        

    } 


    
}
