package Cafeteria;

public class Main {
    public static void main(String[] args) {
        Pedido p = new Pedido("Iced Caramelo", 15.99f);
        System.out.println(p);
        p.setStatus(StatusPedido.EM_PREPARO);
        System.out.println(p);
        p.setStatus(StatusPedido.SAIU_PARA_ENTREGA);
        System.out.println(p);
        p.setStatus(StatusPedido.ENTREGUE);
        System.out.println(p);

        System.out.println();

        Pedido p2 = new Pedido("Tortinha de Limão", 14.99f);
        System.out.println(p2);
        p2.setStatus(StatusPedido.ENTREGUE);
        System.out.println(p2);
    }
}
