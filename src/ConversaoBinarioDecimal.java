import java.util.Scanner;

public class ConversaoBinarioDecimal {
    /*
     * CÓDIGO PARA CONVERSÃO DE UM NUMERO BINARIO
     * PARA UM NUMERO BINARIO
     * Recebemos o numero binario como uma String, depois iteramos
     * por cada caractere dessa String, vindo da direita para esquerda.
     * Por fim pegamos o item na posição atual o i no loop, convertemos para uma String
     * e por fim somamos ao valor da variavel saida.
     * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String entrada = scanner.nextLine();
        if (entrada != null) {
            int j = 0;
            int valor = 0;
            int saida = 0;
            int tamanho = entrada.length() - 1;
            for (int i = tamanho; i >= 0; i--) {
                char item = entrada.charAt(i); // primeiro pegamos o caractere na primeira posição da direita
                valor = Integer.parseInt(Character.toString(item)) * (int) Math.pow(2,j); // convertemos o char para string e o string para int
                saida += valor;
                j++;
            }
            System.out.println("saida = " + saida);
        }
    }
}
