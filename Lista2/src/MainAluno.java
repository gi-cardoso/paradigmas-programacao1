import exe2.Aluno;

public class MainAluno {
    public static void main(String[] args) {
        Aluno obj1 = new Aluno();
        System.out.println(obj1.exibirAluno());

        Aluno obj2 = new Aluno(123456,"Geovana" , 19, 10, 5);
        System.out.println(obj2.notaFinal());
        System.out.println(obj2.exibirAluno());
    }
}
