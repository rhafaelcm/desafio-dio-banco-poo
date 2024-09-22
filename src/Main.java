public class Main {
    public static void main(String[] args) throws Exception {
        Cliente Rhafael = new Cliente();
        Rhafael.setNome("Rhafael");

        Conta cc = new ContaCorrente(Rhafael);
        Conta cp = new ContaPoupanca(Rhafael);

        cc.depositar(100);
        cc.transferir(30, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
