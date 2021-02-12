/**
 * Classe de apresentacao do sistema
 */
public class Menu {

    private static GerenciarJogo gerenciarJogo = new GerenciarJogo();

    public static void executarSistema(){
        EntradaSaida.escreverDados("Premiação:\n" +
                                            "Banana = 10 pontos\n" +
                                            "Morango = 20 pontos\n" +
                                            "Estrela  = 50 pontos\n");
        EntradaSaida.escreverDados("Informe a quantidade de vezes que deseja jogar:");
        gerenciarJogo.setQuantidadeSorteios(EntradaSaida.lerDados().nextInt());

        gerenciarJogo.jogar();
        imprimirSorteio();
        gerenciarJogo.verificarBonus();
    }

    public static void imprimirSorteio(){

        System.out.println("Frutas sorteadas = "+gerenciarJogo.getListaOpcoesJogo());

    }


}
