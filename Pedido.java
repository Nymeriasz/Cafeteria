package Cafeteria;

public class Pedido {
    private StatusPedido status;
    private String pedido;
    private float valor;

    public Pedido(String pedido, float valor) {
        this.status = StatusPedido.RECEBIDO;
        this.pedido = pedido;
        this.valor = valor;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public String getPedido() {
        return pedido;
    }

    public void setPedido(String pedido) {
        this.pedido = pedido;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "status=" + status +
                ", pedido='" + pedido + '\'' +
                ", valor=" + valor +
                '}';
    }
}

