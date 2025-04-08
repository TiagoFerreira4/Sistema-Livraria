import java.util.Scanner;



public class main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Autor autor1 = new Autor("Yrvin D. Salom", "01");
        Autor autor2 = new Autor("J.K. Rowling", "02");
        Autor autor3 = new Autor("Dan Brown", "03");

        biblioteca.add(autor1);
        biblioteca.add(autor2);
        biblioteca.add(autor3);

        Livro livro1 = new Livro("01", autor1, "Enigma de Spinozza", true);
        Livro livro2 = new Livro("02", autor2, "Harry Potter", true);
        Livro livro3 = new Livro("03", autor3, "Codigo Da Vinci", true);

        biblioteca.add(livro1);
        biblioteca.add(livro2);
        biblioteca.add(livro3);


        System.out.println("Seja Bem Vindo! Deseja ver nosso catalogo de livros?");
        String input = new Scanner(System.in).nextLine();
        String inputFormatado = input.toUpperCase();

        if (inputFormatado.equals("NAO")){
            System.out.println("Até a próxima!");
        }
        else if (inputFormatado.equals("SIM")){
            while (true){
                System.out.println("Segue o nosso catalogo!");
                biblioteca.mostrar();

                System.out.println();
                System.out.print("Digite o ID do livro que deseja: ");
                String idLivro = new Scanner(System.in).nextLine();
                Livro livroescolhido = null;
                System.out.print("Digite seu nome: ");
                String nome = new Scanner(System.in).nextLine();

                for (Livro livro : biblioteca.getLivros()) {
                    if (livro.getId().equals(idLivro)) {
                        livroescolhido = livro;
                    }
                }
                if (livroescolhido != null && livroescolhido.isDisponivel()) {
                    System.out.println("Muito bem senhor(a) " + nome + "!\nLivro emprestado: " + livroescolhido.getTitulo());

                    livroescolhido.setDisponivel(false);

                    System.out.println("Deseja pegar outro livro tambem?");
                    String input2 = new Scanner(System.in).nextLine();

                    if (input2.toUpperCase().equals("NAO")){
                        break;
                    }
                }
                else {
                    System.out.println("Esse livro nao existe ou nao esta disponivel. Por favor escolha outro!");
                }

            }



        }










    }
}
