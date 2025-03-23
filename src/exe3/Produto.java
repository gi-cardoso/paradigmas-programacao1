package exe3;

public class Produto {
    public int id;
    public String descricao;
    public int qtde;
    public float preco;

    public Produto(int id, String descricao, int qtde, float preco) {
        this.id = id;
        this.descricao = descricao;
        this.qtde = qtde;
        this.preco = preco;
    }

    public Produto(){
        this.id = 0;
        this.descricao = "sem descrição";
        this.qtde = 0;
        this.preco = 0;
    }

    public void comprar(int x){
        if(this.qtde >= x){
            this.qtde += x;
        }
        else{
            System.out.println("Estoque insuficiente");
        }

    }


    public void vender(int x){
        this.qtde -= x;
    }

    public void subir(float x){
        this.preco += x;
    }

    public void descer(float x){
        if(this.qtde >= x){
            this.preco -= x;
        }
        else{
            System.out.println("Preço não pode ser negativo");
        }
    }

    public void mostrar(){
        System.out.println("id: " + this.id
                + " descrição: " + this.descricao
                + " quantidade: " + this.qtde
                + " preco: " + this.preco);
    }
}
