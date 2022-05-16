package bancoo;

public class Main{
    
    public static void main(String[] args) {

        Cliente felipe = new Cliente();
        felipe.setNome("Felipe");

        conta cc = new contaCorrente(felipe);
        conta cp = new contaPoupanca(felipe);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
}

}