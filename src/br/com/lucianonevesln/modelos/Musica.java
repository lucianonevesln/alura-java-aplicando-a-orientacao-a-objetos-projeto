package br.com.lucianonevesln.modelos;

// Definição de SubClasse com herança
public class Musica extends Audio {
    private String album;
    private String artista;
    private String genero;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    // Polimorfismo, sobrescrita de método
    @Override
    public int getClassificacao() {
        if (this.getTotalReproducoes() >= 500) {
            return 10;
        } else {
            return 7;
        }
    }
}
