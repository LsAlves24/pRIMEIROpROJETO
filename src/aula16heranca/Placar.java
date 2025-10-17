package aula16heranca;

import java.util.UUID;

public class Placar {
    UUID id; 
    int golMandante;
    int golsViitantes;

    public Placar(UUID id, int golMandante, int golsViitantes) {
        this.id = id;
        this.golMandante = golMandante;
        this.golsViitantes = golsViitantes;
    }
    public Placar () {
    }
    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public int getGolMandante() {
        return golMandante;
    }
    public void setGolMandante(int golMandante) {
        this.golMandante = golMandante;
    }
    public int getGolsViitantes() {
        return golsViitantes;
    }

    public void setGolsViitantes(int golsViitantes) {
        this.golsViitantes = golsViitantes;
    }
    
}
