
public class Estoque {

    private String jogo = "Stardew Valley";
    private int quantidade = 20;

    public void compra() {
        System.out.println("+-----------------------------------------+");
        System.out.println("\t\t| Estoque |\n");
        System.out.println("\t   Jogo: " + jogo + "\n\t   " + quantidade + " unidades compradas.\n");
    }

    public void venda() {
        System.out.println("\t   Jogo: " + jogo + "\n\t   " + quantidade +" unidades vendidas.");
        System.out.println("+-----------------------------------------+");

    }
}
