package br.com.lucianonevesln.modelos;

public class Preferencias {
    public void inclui (Audio audio) {
        if (audio.getClassificacao() >= 9) {
            System.out.println(audio.getTitulo() + " é considerado sucesso!");
        } else {
            System.out.println(audio.getTitulo() + " ótima opção para ser ouvido!");
        }
    }
}
