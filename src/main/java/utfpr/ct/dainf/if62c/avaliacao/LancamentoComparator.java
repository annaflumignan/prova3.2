package utfpr.ct.dainf.if62c.avaliacao;
import java.util.Comparator;
import utfpr.ct.dainf.if62c.avaliacao.Lancamento;

/**
 * IF62C Fundamentos de Programação 2
 * Avaliação parcial.
 * @author 
 */

public class LancamentoComparator implements Comparator<Lancamento> {

    @Override
    public int compare(Lancamento o1, Lancamento o2) {
        int comparador = o1.getConta().compareTo(o2.getConta());
        if (comparador == 0) {
            comparador = o1.getData().compareTo(o2.getData());
        }
        return comparador;
    }
}

