import exe0.Carro;

public class MainCarro {
    public static void MainCarro(String[] args) {

        Carro obj1 = new Carro();
        //obj1.marca = "Fiat";
        obj1.setMarca("Fiat");
        //obj1.modelo = "Palio";
        obj1.setModelo("Palio");
        //obj1.ano = 2020;
        obj1.setAno(2020);
        //obj1.velocidade = 0
        obj1.setVelocidade(0);

        System.out.println("Modelo: " + obj1.getModelo() +
                "/ Marca: " + obj1.getMarca());


        Carro obj2 = new Carro("GM", "Onix", -2019, 60);
        System.out.println("Modelo: " + obj2.getModelo() +
                "/ Marca: " + obj2.getMarca() +
                "/ Ano: " + obj2.getAno() +
                "/ Velocidade: " + obj2.getVelocidade());

        obj2.acelerar(80);
        obj2.frear(30);
        System.out.println(obj2.exibirDetalhes());
    }
}