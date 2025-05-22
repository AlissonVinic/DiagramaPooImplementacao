

public class Obra {
    private String titulo;
    private int ano;
    private String status;
    private Avaliador avaliador;
    private Autor autor;
    private String genero;

    public String getTitulo() {
        return titulo;
    }

    public int getAno() {
        return ano;
    }

    public String getStatus() {
        return status;
    }

    public Avaliador getAvaliador() {
        return avaliador;
    }

    public Autor getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setAvaliador(Avaliador avaliador) {
        this.avaliador = avaliador;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
