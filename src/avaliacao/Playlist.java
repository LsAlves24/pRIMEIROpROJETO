package avaliacao;

import java.time.LocalDateTime;
import java.util.List;

public class Playlist {
    int id;
    String nome;
    boolean publica;
    int totalMusicas;
    int duracaoTotalSeg;
    LocalDateTime dataCriacao;
    List<Musica> musicas;

    public Playlist () {

    } 
    public Playlist ( int id, String nome, boolean publica, int totalMusicas, int duracaoTotalSeg, LocalDateTime dataCriacao, List<Musica> musicas) {
        this.id = id;
        this.nome = nome;
        this.publica = publica;
        this.totalMusicas = totalMusicas;
        this.duracaoTotalSeg = duracaoTotalSeg;
        this.dataCriacao = dataCriacao;
        this.musicas = musicas;
    }
    
}
