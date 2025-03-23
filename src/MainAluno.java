import exe1.Aluno;

import javax.swing.*;

public class MainAluno {
    public static void main(String[] args) {

        Aluno obj1 = new Aluno();
        System.out.println("Média do aluno: " + obj1.nome + " é " + obj1.notaFinal());

        Aluno obj2 = new Aluno(2, " Luana", 17, 10.0f,4.0f);
        System.out.println("Média do aluno: " + obj2.nome + " é " + obj2.notaFinal());
        Aluno obj3 = new Aluno(3, " Maria", 34, 3.0f,6.0f);

        obj1.dadosAluno();
        JOptionPane.showMessageDialog(null, "Nota Final: " + obj2.notaFinal());
        obj3.passou();


    }
}
