import exe2.Cliente;

public class TestaCliente {
    public static void main(String[] args) {

        Cliente obj1 = new Cliente();
        Cliente Fulano = new Cliente(1234, 567, "Fulano", 500.0f);
        Fulano.realizarDeposito(300);
        Fulano.dadosCliente();
        Fulano.realizarSaque(1000);
        Fulano.dadosCliente();

        Cliente Beltrano = new Cliente(4321, 765, "Beltrano", 1000);
        Beltrano.realizarDeposito(2500);
        Beltrano.dadosCliente();
        Beltrano.realizarSaque(700);
        Beltrano.dadosCliente();
    }
}
