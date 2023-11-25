package bootcamp;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Conteudo {
    private String titulo;
    private String descricao;
    private final double XP = 10d;

}
