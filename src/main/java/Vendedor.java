import java.util.ArrayList;

public class Vendedor extends Pessoa{
    public int idVendedor = 99;
    public ArrayList<Pedido> pedidos;

    public Vendedor(String CPF, String nome, String telefone, String dataNascimento, Endereco endereco) {
        super(CPF, nome, telefone, dataNascimento, endereco);
        this.pedidos = new ArrayList<>();
    }

    public void venda(Produto produto, int quantidadeVenda, TipoPagamento tipoPagamento,Cliente cliente, int idVendedor, Empresa empresa){
        Pedido pedido = new Pedido(produto, quantidadeVenda, produto.valor * quantidadeVenda, tipoPagamento, cliente, this.idVendedor, empresa);
        System.out.println("Pedido Gerado!\n[" + produto.categoria + "] " + produto.nome + " | R$" + produto.valor * quantidadeVenda + " (Pagamento via " + tipoPagamento + ")\nObrigado por comprar em " + empresa.nomeFantasia + "!");
    }
}
