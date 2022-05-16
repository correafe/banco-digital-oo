package bancoo;

public class contaCorrente extends conta{

    public contaCorrente(Cliente cliente) {
        super(cliente);
    }


    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato conta corrente");
        super.imprimirInfos();
    }

}
