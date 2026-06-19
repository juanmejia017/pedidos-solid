import com.empresa.pedido.model.Pedido;
import com.empresa.pedido.repository.PedidosRepository;
import com.empresa.pedido.repository.NotificadorPedido;
import com.empresa.pedido.service.ProcesarPedidoService;
import com.empresa.pedido.strategy.DescuentoClienteVip;
import com.empresa.pedido.strategy.PoliticaDescuento;

public class Main {
    public static void main(String[] args) {
        // 1. Creamos las implementaciones concretas (en un caso real, esto lo haría Spring)
        PedidosRepository repo = pedido -> System.out.println("Guardando pedido en DB...");
        NotificadorPedido notificador = pedido -> System.out.println("Enviando correo de confirmación...");
        PoliticaDescuento politica = new DescuentoClienteVip();

        // 2. Inyectamos las dependencias (Inversión de Dependencias)
        ProcesarPedidoService service = new ProcesarPedidoService(repo, notificador, politica);

        // 3. Probamos el servicio
        Pedido miPedido = new Pedido(100.0);
        service.procesar(miPedido);

        System.out.println("Total final del pedido: " + miPedido.getTotal());
    }
}