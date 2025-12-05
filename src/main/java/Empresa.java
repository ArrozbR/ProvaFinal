public class Empresa {
    public String CNPJ;
    public String nomeFantasia;
    public String razaoSocial;
    public Endereco endereco;

    public Empresa(String CNPJ, String nomeFantasia, String razaoSocial, Endereco endereco) {
        this.CNPJ = CNPJ;
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.endereco = endereco;
    }
}
