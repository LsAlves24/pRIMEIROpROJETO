package avaliacao;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CadastroApp {
    public static void main(String[] args) {
        Musica musica1 = new Musica();
        musica1.id = 10;
        musica1.titulo = "Pra que juizo";
        musica1.artista = "Henrique e Juliano";
        musica1.duracaoSeg = 190;
        musica1.genero = "Sertanejo";

        Musica musica2 = new Musica (20, "Só me ligar", "Bk", 180, "rap");

        Musica musica3 = new Musica (30, "Mania de voce", "Rita Lee", 170, "MPB");

        List<Musica> playlist = new ArrayList<>();
        playlist.add(musica1);
        playlist.add(musica2);
        playlist.add(musica3);

        Playlist playlist1 = new Playlist();
        playlist1.id = 40;
        playlist1.nome = "variadas";
        playlist1.publica = true;
        playlist1.totalMusicas = 3;
        playlist1.duracaoTotalSeg = 300;
        playlist1.dataCriacao = LocalDateTime.now();
        playlist1.musicas = playlist;

        System.out.println("======= Playlist ======");
        System.out.println("Nome: " + playlist1.nome);
        System.out.println("Publica: " + playlist1.publica);
        System.out.println("Total de musicas: " + playlist1.totalMusicas);
        System.out.println("Duração total em segundos: " + playlist1.duracaoTotalSeg);
        System.out.println("Data de criação: " + playlist1.dataCriacao);


        System.out.println("\n");


        for ( Musica m: playlist1.musicas) {
            System.out.println("Musica: " + m.titulo);
            System.out.println("Id: " + m.id);
            System.out.println("Artista: "  + m.artista);
            System.out.println("Genero: " + m.genero);
            System.out.println("Duração: " + m.duracaoSeg);
            System.out.println("\n");

        }



    }
    
}
