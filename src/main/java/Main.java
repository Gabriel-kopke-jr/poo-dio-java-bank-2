import bootcamp.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Aluno dev = Aluno.builder().
                          matricula("teste").
                          nome("Gabriel").
                          build();

        Conteudo conteudo = Conteudo.builder()
                                     .titulo("Estrutura de dados em Java")
                                     .descricao("Estrutura de dados usando a linguagem Java")
                                     .build();
        Curso curso = Curso.builder()
                            .cargaHoraria(20)
                            .titulo("Java básico")
                            .descricao("Curso voltado para aprimoramento em Java")
                            .conteudoCurso(conteudo)
                            .build();

        Mentoria mentoria = Mentoria.builder()
                            .conteudoMentoria(conteudo)
                            .data(LocalDate.now())
                            .build();

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.addAluno(dev);
        bootcamp.addCurso(curso);
        bootcamp.addMentoria(mentoria);


    }
}
