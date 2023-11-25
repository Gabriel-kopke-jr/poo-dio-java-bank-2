package bootcamp;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class Bootcamp {
    private Set<Curso> cursosBotcamp = new HashSet<Curso>();
    private Set<Mentoria> mentoriasBootcamp = new HashSet<Mentoria>();
    private  Set<Aluno> devsInscritos = new HashSet<Aluno>();
    private LocalDate dtInicio = LocalDate.now();
    private LocalDate dtFim = dtInicio.plusDays(45);

    public void addCurso(Curso curso) {
        Set<Curso>  cursos = getCursosBotcamp();
        cursos.add(curso);
        setCursosBotcamp(cursos);
    }

    public void addMentoria(Mentoria mentoria) {
        Set<Mentoria>  mentorias = getMentoriasBootcamp();
        mentorias.add(mentoria);
        setMentoriasBootcamp(mentorias);
    }

    public void addAluno(Aluno aluno){
        Set<Aluno> alunos = getDevsInscritos();
        alunos.add(aluno);
        setDevsInscritos(alunos);
    }


 }


