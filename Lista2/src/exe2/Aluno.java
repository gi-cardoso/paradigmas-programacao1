package exe2;

public class Aluno {
    private int nroAluno;
    private String nome;
    private int idade;
    private float p1, p2;

    public Aluno() {
        this.nome = "sem nome";
        this.nroAluno = 111111;
    }

    public Aluno(int nroAluno, String nome, int idade, float p1, float p2) {
        this.setNroAluno(nroAluno);
        this.setNome(nome);
        this.setIdade(idade);
        this.setP1(p1);
        this.setP2(p2);
    }

    public int getNroAluno() {
        return nroAluno;
    }

    public void setNroAluno(int nroAluno) {
        //metodo de classe
        String auxiliar = String.valueOf(nroAluno);
        if (auxiliar.length() == 6) {
            this.nroAluno = nroAluno;
        }
        else {
            this.nroAluno = 111111;
            System.out.println("Problema de tamanho do número do aluno");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.length() <= 30){
            this.nome = nome;
        }
        else System.out.println("Problema de tamanho");
    }

    public float getP1() {
        return p1;
    }

    public void setP1(float p1) {
        if(p1 >= 0){
            this.p1 = p1;
        }
        else System.out.println("Valor negativo");
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade >= 0){
            this.idade = idade;
        }
        else System.out.println("Valor negativo");
    }

    public float getP2() {
        return p2;
    }

    public void setP2(float p2) {
        if(p2 >= 0){
            this.p2 = p2;
        }
        else System.out.println("Valor negativo");
    }

    public float notaFinal(){
        return (p1 + p2) / 2.0f;
    }

    public String exibirAluno() {
        return "Aluno{" +
                "nroAluno=" + nroAluno +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", p1=" + p1 +
                ", p2=" + p2 +
                '}';
    }
}

//metodo de objeto = método de instncia
//metodo de classe = método de classe
