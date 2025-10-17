package aula16heranca;

import java.util.UUID;

public class Jogador extends Pessoa {
    public String numero;
    public String posicao;
    
    public Jogador(UUID id, String nome, String cpf, String numero, String posicao) {
        super(id, nome, cpf);
        this.numero = numero;
        this.posicao = posicao;
    }

    public Jogador() {
        super ();
    }
    
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getPosicao() {
        return posicao;
    }
    public void setPosicao(String posicao) {
        this.posicao = posicao;
    } 

}
