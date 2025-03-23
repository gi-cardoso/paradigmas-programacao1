import exe4.Rio;

public class TestaRio {
    public static void main(String[] args) {
        Rio rio = new Rio("Amazonas", 1.4f, false);
        Rio rio2 = new Rio();

        rio.mostrar();
        rio.chover(0.3f);
        rio.ensolarar(0.5f);
        rio.sujar();
        rio.mostrar();

        rio2.mostrar();
        rio2.chover(2.0f);
        rio2.ensolarar(1.4f);
        rio2.sujar();
        rio2.mostrar();
        rio2.toString();

    }
}
