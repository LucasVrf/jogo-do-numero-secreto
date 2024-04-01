import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.filme;

public class Principal {
    public static void main(String[] args) {
        filme meuFilme = new filme();
        meuFilme.setNome("O Poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibeFichaTecnica();

        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        //System.out.println(meuFilme.totalAvaliacao);
        System.out.println(meuFilme.retornaMedia());


        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setMinutosPorEpisodio(10);
        lost.setEpisodiosPorTemporada(50);
       System.out.println(lost.getDuracaoEmMinutos());


        filme outroFilme = new filme();
        outroFilme.setNome("avatar");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        System.out.println(calculadora.getTempoTotal());
    }
}
