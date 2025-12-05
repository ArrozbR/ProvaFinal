public class Main {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco("Rua Bobos", 0, "12387654","Nao tinha nada");
        Cliente cliente1 = new Cliente("777.777.777-77", "Pedro", "62912332144", "06/10/2005");
        Vendedor vendedor1 = new Vendedor("666.666.666-66", "Igor", "3355232134", "08/10/2004", endereco1);
        Supervisor supervisor1 = new Supervisor("555.555.555-55", "Thalles", "62913214129", "10/01/1823", endereco1);
        Empresa empresa1 = new Empresa("123.567.89/10", "Mercado Irado", "Mercado", endereco1);
        Produto produto1 = new Produto("Banana", "Banana Maca Deliciosa", 5, 12, Categoria.Alimento, Fabricante.FabricadorOficialDeBananas);

        vendedor1.venda(produto1, 10, TipoPagamento.Cartao, cliente1, 100, empresa1);
    }
}