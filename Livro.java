import java.util.Date;

public class Livro {
    private String id;
    private Autor autor;
    private String titulo;
    private Boolean disponivel;
    private Date dataCadastro;
    private Date dataAtualizacao;

    Livro(String id, Autor autor, String titulo, Boolean disponivel) {
        this.id = id;
        this.autor = autor;
        this.titulo = titulo;
        this.disponivel = disponivel;

    }
    public String disponivel() {
        if (disponivel) {
            return "Disponivel";
        }
        else {
            return "Indisponivel";
        }
    }

    public Boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(Boolean disponivel) {
        this.disponivel = disponivel;
    }

    public String toString() {
        return id + " - " + titulo + " - " + autor.getNome() + " - " + disponivel();
    }

    public String getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }



}
