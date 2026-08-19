public class Gato extends Animal {

    public Gato(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    @Override
    public void emitirSom() {
        System.out.println("O gato " + getNome() + " faz: Miau!");
    }
}