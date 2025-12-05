public class Produto {
    public String nome;
    public String descricao;
    public double valor;
    public int quantidadeDisponivel;
    public Categoria categoria;
    public Fabricante fabricante;

    public Produto(String nome, String descricao, double valor, int quantidadeDisponivel, Categoria categoria, Fabricante fabricante) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.quantidadeDisponivel = quantidadeDisponivel;
        this.categoria = categoria;
        this.fabricante = fabricante;
    }
}
