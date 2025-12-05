public class Endereco {
    public String rua;
    public int numero;
    public String CEP;
    public String logradouro;
    public String complemento;

    public Endereco(String rua, int numero, String CEP, String logradouro) {
        this.rua = rua;
        this.numero = numero;
        this.CEP = CEP;
        this.logradouro = logradouro;
    }

    public Endereco(String rua, int numero, String CEP, String logradouro, String complemento) {
        this.rua = rua;
        this.numero = numero;
        this.CEP = CEP;
        this.logradouro = logradouro;
        this.complemento = complemento;
    }
}
