package bootcamp;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Curso implements  AvancoXp{
    private int cargaHoraria;
    private String titulo;
    private String descricao;
    private Conteudo conteudoCurso;

    @Override
    public double calculaXp() {
        return conteudoCurso.getXP() * cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + getCargaHoraria() +
                '}';
    }
}

