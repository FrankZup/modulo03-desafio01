/**
 * Classe ENUM com a devida pontuação de cada fruta
 */
public enum OpcoesJogo {

    BANANA(10),
    MORANGO(20),
    ESTRELA(40);

    private int pontuacao;

    OpcoesJogo(int pontuacao) { this.pontuacao = pontuacao; }

    public int getPontuacao() { return pontuacao; }

}
