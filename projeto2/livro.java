public class Livro {
    private String titulo;
    private String autor;
    private String idLivro;
    private boolean disponivel;

    void setInfo(String nomeLivro, String nomeAutor, String idLivro) {
        this.titulo = nomeLivro;
        this.autor = nomeAutor;
        this.idLivro = idLivro;
        this.disponivel = true; // Inicialmente disponível
    }

    void setStatus(boolean disponivel) {
        this.disponivel = disponivel;
    }

    String getTitulo() {
        return titulo;
    }

    String getAutor() {
        return autor;
    }

    String getId() {
        return idLivro;
    }

    String getStatus() {
        return disponivel ? "SIM" : "NÃO";
    }
}
