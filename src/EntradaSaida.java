import java.util.Scanner;

/**
 * Classe responsavel por exibir e capturar os dados digitados via console
 */
public class EntradaSaida {

    public static Scanner lerDados(){
        return new Scanner(System.in);
    }

    public static void escreverDados(String mensagem){
        System.out.println(mensagem);
    }
}
