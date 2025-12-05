import java.util.Scanner;

public class Supervisor extends Pessoa{
    public Supervisor(String CPF, String nome, String telefone, String dataNascimento, Endereco endereco) {
        super(CPF, nome, telefone, dataNascimento, endereco);
    }

    public boolean chamarSupervisor(){
        Scanner confirmarCompra = new Scanner(System.in);
        System.out.println(this.nome + " deseja confirmar a compra? (S/N) ");
        confirmarCompra.nextLine();
        if(confirmarCompra.equals("S") || confirmarCompra.equals("s")){
            System.out.println("Compra confirmada!");
            return true;
        }
        if(confirmarCompra.equals("N") || confirmarCompra.equals("n")){
            System.out.println("Compra confirmada!");
            return false;
        }
        System.out.println("Compra indeferida!");
        return false;
    }
}
