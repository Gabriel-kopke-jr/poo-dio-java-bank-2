package bootcamp;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;


@Setter
@Getter
@Builder
public class Mentoria implements  AvancoXp{
    private LocalDate data;
    private Conteudo conteudoMentoria;

    @Override
    public double calculaXp() {
        return conteudoMentoria.getXP() + 20 ;
    }
}
