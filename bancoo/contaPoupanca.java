package bancoo;

public class contaPoupanca extends conta{

    public contaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato conta poupança");
        super.imprimirInfos();
    }

}
