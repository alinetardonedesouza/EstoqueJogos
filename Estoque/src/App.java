public class App {
    public static void main(String[] args) throws Exception {

        Estoque jogos = new Estoque();

        EstoqueCompra compra = new EstoqueCompra(jogos);
        EstoqueVenda venda = new EstoqueVenda(jogos);

        Gerenciar acoes = new Gerenciar();
        acoes.receberPedido(compra);
        acoes.receberPedido(venda);

        acoes.fazerPedido();
    }
}
