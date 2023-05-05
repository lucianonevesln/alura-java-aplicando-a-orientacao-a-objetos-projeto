package br.com.lucianonevesln.principal;

import br.com.lucianonevesln.modelos.Musica;
import br.com.lucianonevesln.modelos.Podcast;
import br.com.lucianonevesln.modelos.Preferencias;

public class Principal {
    public static void main(String[] args) {
        Musica musica1 = new Musica();
        musica1.setTitulo("This Is a Call");
        musica1.setArtista("Foo Fighters");
        for (int curtida = 0; curtida < 100; curtida++) {
            musica1.curte(1);
        }
        for (int reproduzido = 0; reproduzido < 1000; reproduzido++) {
            musica1.reproduz(1);
        }

        Podcast podcast1 = new Podcast();
        podcast1.setTitulo("Java");
        podcast1.setApresentador("Luciano Neves");
        podcast1.setDescricao("Conversando sobre a linguagem Java.");
        for (int curtida = 0; curtida < 7; curtida++) {
            podcast1.curte(1);
        }
        for (int reproduzido = 0; reproduzido < 100; reproduzido++) {
            podcast1.reproduz(1);
        }

        Preferencias preferencias = new Preferencias();

        System.out.println("**************************************************");
        System.out.println("Artista: " + musica1.getArtista());
        System.out.println("Música: " + musica1.getTitulo());
        System.out.println("Curtidas: " + musica1.getTotalCurtidas());
        System.out.println("Reproduções: " + musica1.getTotalReproducoes());
        preferencias.inclui(musica1);
        System.out.println("**************************************************\n");
        System.out.println("**************************************************");
        System.out.println("Apresentador: " + podcast1.getApresentador());
        System.out.println("Tema: " + podcast1.getTitulo());
        System.out.println("Descrição: " + podcast1.getDescricao());
        System.out.println("Curtidas: " + podcast1.getTotalCurtidas());
        System.out.println("Reproduções: " + podcast1.getTotalReproducoes());
        preferencias.inclui(podcast1);
        System.out.println("**************************************************\n");
    }
}
