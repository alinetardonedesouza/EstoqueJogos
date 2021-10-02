import java.util.ArrayList;
import java.util.List;

public class Gerenciar {

    private List<Pedido> listaPedidos = new ArrayList<Pedido>();

    public void receberPedido(Pedido pedido) {
        listaPedidos.add(pedido);
    }

    public void fazerPedido() {

        for (Pedido pedido : listaPedidos) {
            pedido.execute();
        }
        listaPedidos.clear();
    }
}
