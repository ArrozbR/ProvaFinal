
public class Cliente extends Pessoa{
    public int idCliente = 99;

    public Cliente(String CPF, String nome, String telefone, String dataNascimento, Endereco endereco) {
        super(CPF, nome, telefone, dataNascimento, endereco);
    }

    public Cliente(String CPF, String nome, String telefone, String dataNascimento){
        super(CPF, nome, telefone, dataNascimento);
    }
}
