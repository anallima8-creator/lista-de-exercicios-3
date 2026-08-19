public class Livro {
    private String titulo;
    private String autor;
    private int ano;
    private boolean disponibilidade;

    public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.disponibilidade = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAno() {
        return ano;
    }

    public boolean isDisponivel() {
        return disponibilidade;
    }

    public void emprestar(Pessoa pessoa) {
        if (disponibilidade) {
            disponibilidade = false;
            System.out.println("Livro '" + titulo + "' emprestado para " + pessoa.getNome());
        } else {
            System.out.println("Livro '" + titulo + "' Indisponivel");
        }
    }

    public void devolver() {
        if (!disponibilidade) {
            disponibilidade = true;
            System.out.println("Livro '" + titulo + "' devolvido");
        } else {
            System.out.println("Livro '" + titulo + "' ja disponivel");
        }
    }
}