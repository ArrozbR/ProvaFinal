import java.util.ArrayList;

public class Pedido {
    Produto produto;
    public int quantidade;
    public double valor;
    TipoPagamento tipoPagamento;
    Cliente cliente;
    public int idVendedor;
    public Empresa empresa;

    public Pedido(Produto produto, int quantidade, double valor, TipoPagamento tipoPagamento, Cliente cliente, int idVendedor, Empresa empresa) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.valor = valor;
        this.tipoPagamento = tipoPagamento;
        this.cliente = cliente;
        this.idVendedor = idVendedor;
        this.empresa = empresa;
    }
}
