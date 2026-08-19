public class Main {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro("Rex", 4, 15.5);
        Animal gato = new Gato("Felix", 2, 4.2);
        Animal passaro = new Passaro("Piu", 1, 0.3);

        System.out.println("====== DADOS E SONS DOS ANIMAIS ======\n");

        cachorro.apresentar();
        cachorro.emitirSom();

        System.out.println("------------------------------------");

        gato.apresentar();
        gato.emitirSom();

        System.out.println("------------------------------------");

        passaro.apresentar();
        passaro.emitirSom();
    }
}