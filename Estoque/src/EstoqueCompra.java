public class EstoqueCompra implements Pedido{
    
    private Estoque jogos;

   public EstoqueCompra(Estoque jogo){
      this.jogos = jogo;
   }

   public void execute() {
      jogos.compra();
   }
}
