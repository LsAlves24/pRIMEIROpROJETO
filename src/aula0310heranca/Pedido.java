package aula0310heranca;

import java.util.List;
import java.util.UUID;

public class Pedido {
    private UUID id;
    private List<Item> itens;

    public Pedido() {
    }

    public Pedido(UUID id, List<Item> itens){
        this.id = id;
        this.itens = itens;
    }

    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public List<Item> getItens() {
        return itens;
    }
    public void setItens(List<Item> itens) {
        this.itens = itens;
    }
    
}
