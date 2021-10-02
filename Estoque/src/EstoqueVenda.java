public class EstoqueVenda implements Pedido{

    private Estoque jogos;

   public EstoqueVenda(Estoque jogo){
      this.jogos = jogo;
   }

   public void execute() {
      jogos.venda();
   }
    
}
