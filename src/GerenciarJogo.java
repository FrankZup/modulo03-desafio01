import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Classe responsavel pelo gerenciamento do jogo (Caça Niquel)
 */
public class GerenciarJogo {

    private static List<OpcoesJogo> listaFrutas = new ArrayList<>();

    private static int ponto = 0;
    private static int qtdadeSorteios;
    private static int bonus = 0;

    public void jogar() {
        if (qtdadeSorteios <= 3) {
            sortear();
            sortear();
            sortear();
        } else {
            for (int i = 0; i < qtdadeSorteios; i++) {
                sortear();
            }
        }
    }

    /**
     * Metodo responsavel por embaralhar as frutas de maneira randomica,
     * adiciona-las em uma lista e somar sua respectiva pontuacao
     */
    private void sortear() {

        Random random = new Random();

        OpcoesJogo[] opcoesJogos = OpcoesJogo.values();

        int tamanhoEnum = opcoesJogos.length;
        int frutaSorteada = random.nextInt(tamanhoEnum);

        listaFrutas.add(opcoesJogos[frutaSorteada]);

        this.ponto += opcoesJogos[frutaSorteada].getPontuacao();

    }

    /**
     * Metodo que contem a regra de bonificacao
     * caso sejam sorteadas frutas iguais
     */
    public static void verificarBonus() {

        OpcoesJogo primeiraFruta = listaFrutas.get(0);

        int quantidadeAcerto = 0;

        /* Laço que percorre a lista de frutas, a cada iteração igual
           gera um acerto */
        for (OpcoesJogo todasFrutas: listaFrutas) {
            if (primeiraFruta.equals(todasFrutas)) {
                quantidadeAcerto++;
            }
        }

        if (quantidadeAcerto == listaFrutas.size()) {

            bonus = 100;
            System.out.println("Pontuação bônus = "+GerenciarJogo.ponto * GerenciarJogo.bonus);
        } else {

            bonus = 1;
            System.out.println("Pontuação total = "+GerenciarJogo.ponto);
        }
    }

    public List<OpcoesJogo> getListaOpcoesJogo() { return listaFrutas; }
    public void setQuantidadeSorteios(int quantidadeSorteios) { this.qtdadeSorteios = quantidadeSorteios; }
}
