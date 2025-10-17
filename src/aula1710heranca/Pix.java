package aula1710heranca;

import java.util.UUID;

public class Pix extends MeiodePagamento {
    private String chaveAleatoria;


    public Pix(double valor) {
        super(valor);
        this.chaveAleatoria = UUID.randomUUID().toString(); 

    }

    @Override
    public boolean processarPagamento() {
        System.out.println(" \n Processando pagamaneto com Pix");
        super.exibirDetalhes();
        System.out.println("Chave Aleatória" + this.chaveAleatoria);
        System.out.println("Tempo limite: 30 minutos.");
        return true;
    } 

    
}
