package notaAlunos;

import utils.Leitor;

public class Aluno {

    Leitor leitor = new Leitor();
//    Atributos
    private int quantidadeDeAlunos;
    private int quantidadeDeNotasPorAluno;
    private int quantidadeDeNotas = quantidadeDeAlunos*quantidadeDeNotasPorAluno;
    private int[] nota = new int[quantidadeDeNotas];
    private String[] nomeAluno = new String[quantidadeDeAlunos];

//    metodos
    public void informarQuantidades(){
        quantidadeDeAlunos = leitor.lerInteiro("Quantidade de alunos:");
        quantidadeDeNotasPorAluno = leitor.lerInteiro("Quantidade de notas por aluno:");
    }
    public void informarNomes(){
        for (int i = 0; i<quantidadeDeAlunos; i++){
            nomeAluno[i] = leitor.lerString("Digite o nome do aluno " + (i+1));

        }
    }
    public void informarNotas(){
        for (int i = 0; i<quantidadeDeAlunos; i++){
            for (int j = 0; j<quantidadeDeNotas; j++){
                nota[j] = leitor.lerInteiro("Digite as notas do aluno " + nomeAluno[i]);
            }
        }

    }


}
