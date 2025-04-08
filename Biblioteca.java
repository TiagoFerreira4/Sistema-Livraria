import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros = new ArrayList<>();
    private List<Autor> autores = new ArrayList<>();

    void mostrar(){
        for (Livro livro : livros) {
            System.out.println(livro);
        }
    }

    List<Autor> getAutores() {
        return autores;
    }

    List<Livro> getLivros() {
        return livros;
    }

    void add(Livro livro){
        livros.add(livro);
    }

    void add(Autor autor){
        autores.add(autor);
    }

    void remove(Livro livro){
        livros.remove(livro);
    }
}
