package br.com.lucianonevesln.modelos;

// Definição de SubClasse com herança
public class Podcast extends Audio {
    private String apresentador;
    private String descricao;

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // Polimorfismo, sobrescrita de método
    @Override
    public int getClassificacao() {
        if (this.getTotalCurtidas() >= 10) {
            return 10;
        } else {
            return 8;
        }
    }
}
