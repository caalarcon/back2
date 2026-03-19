

public class Main {
    public static void main(String[] args) {
        Mago mago = new Mago("Mago");
        System.out.println(mago.mostrarStatus());
        System.out.println(mago.getAtaque());
        System.out.println(mago.receberDano());
        System.out.println(mago.lancarMagia());

        Guerreiro guerreiro = new Guerreiro("Thor");
        System.out.println(guerreiro.mostrarStatus());
        System.out.println(guerreiro.getAtaque());
        System.out.println(guerreiro.receberDano());
        System.out.println(guerreiro.golpePesado());

        Arqueiro arqueiro = new Arqueiro("Arqueiro");
        System.out.println(arqueiro.mostrarStatus());
        System.out.println(arqueiro.getAtaque());
        System.out.println(arqueiro.receberDano());
        System.out.println(arqueiro.disparoPreciso());

    }
}