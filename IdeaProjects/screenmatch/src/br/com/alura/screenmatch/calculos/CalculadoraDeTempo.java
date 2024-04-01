package br.com.alura.screenmatch.calculos;
import br.com.alura.screenmatch.modelos.filme;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui(filme f){
        tempoTotal += f.getDuracaoEmMinutos();
    }

}
