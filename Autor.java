import java.util.Date;

public class Autor {
    private String nome;
    private String Id;
    private Date dataNascimento;

    Autor(String nome, String Id) {
        this.nome = nome;
        this.Id = Id;
    }

    public String getNome() {
        return nome;
    }
}
