package exe1;

import javax.swing.*;

public class Aluno {
    public int numeroAluno, idade;
    public String nome;
    public float p1, p2;

    public Aluno(int numeroAluno, String nome, int idade, float p1, float p2) {
        this.numeroAluno = numeroAluno;
        this.nome = nome;
        this.idade = idade;
        this.p1 = p1;
        this.p2 = p2;
    }

    public Aluno(){
        this.nome = "sem nome";
    }


    public float notaFinal() {
        return (this.p1 + this.p2) / 2;
    }

    public String passou(){
        //return  (this.notaFinal() >= 6) ? "Aluno Passou" : "Aluno não passou";
        if(notaFinal() >= 6){
            return " Aluno Passou";
        }
        else{
            return " Aluno não passou";
        }
    }

    public void dadosAluno() {
        System.out.println(" Número do Aluno: " + this.numeroAluno
                + " nome: " + this.nome
                + " situação" + this.passou());
    }




}
