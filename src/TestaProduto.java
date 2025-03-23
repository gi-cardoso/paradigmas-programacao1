import exe3.Produto;

public class TestaProduto {
    public static void main(String[] args) {
        Produto produto = new Produto(1, "Blusa", 10, 100.00f);
        Produto produto2 = new Produto();

        produto.mostrar();
        produto.comprar(5);
        produto.vender(3);
        produto.subir(20.0f);
        produto.descer(10.0f);
        produto.mostrar();

        produto2.mostrar();
        produto2.comprar(10);
        produto2.vender(5);
        produto2.subir(50.0f);
        produto2.descer(30.0f);
        produto2.mostrar();



    }
}
