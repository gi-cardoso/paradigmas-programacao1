package exe4;

public class Rio {
    public String nome;
    public float nivel;
    public boolean poluido;

    public Rio(String nome, float nivel, boolean poluido) {
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
    }

    public Rio(){
        this.nivel = 0;
        this.poluido = false;
        this.nome = "sem nome";
    }

    public void chover(float x){
        this.nivel += x;
    }

    public void ensolarar(float x){
        if(this.nivel >= x){
            this.nivel -= x;
        }
        else{
            System.out.println("Nível do rio não foi alterado");
        }
    }

    public void limpar(){
        this.poluido = false;
    }

    public void sujar(){
        this.poluido = true;
    }

    public void mostrar(){
        System.out.println(" Nome " + this.nome + " Nível: " + this.nivel + " Poluido: " + (this.poluido? "Sim" : "Não"));
    }
}
