package br.com.lucianonevesln.modelos;

// Definição de SuperClasse
public class Audio {
    private String titulo;
    private int totalReproducoes;
    private int totalCurtidas;
    private int classificacao;

    public void curte (int curtida) {
        this.totalCurtidas += curtida;
    }

    public void reproduz (int reproducao) {
        this.totalReproducoes += reproducao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }
}
