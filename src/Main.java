import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
    }

    private static int converterBaseDecimal(String valorNaBase, int baseNumerica) {
        int tamanho = valorNaBase.length() - 1;
        int j = 0;
        int saida = 0;
        int valor = 0;
        for (int i = tamanho; i >= 0; i--) {
            char item = valorNaBase.charAt(i);
            valor = switch (item) {
                case 'A' -> 10;
                case 'B' -> 11;
                case 'C' -> 12;
                case 'D' -> 13;
                case 'E' -> 14;
                case 'F' -> 15;
                default -> Integer.parseInt(Character.toString(item));
            };
            saida += valor * (int) Math.pow(baseNumerica,j);
            j++;
        }
        return saida;
    }

    private static String converterBaseDecimalParaOutraBase(int valorNaBaseDecimal, int baseNumericaBuscada) {
        int resto = valorNaBaseDecimal;
        String saida = "";
        for (int i  = 0; resto / baseNumericaBuscada > 0 || resto > 0; i++) {
            saida = saida + resto % baseNumericaBuscada;
            resto = resto / baseNumericaBuscada;
        }
        int tamanho = saida.length() - 1;
        String saidaReal = "";
        for (int j = tamanho; j >= 0; j-- ) {
            saidaReal = saidaReal + Character.toString(saida.charAt(j));
        }
        return saidaReal;
    }

    private static void menu(){
        int base = 0;
        int opcao = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("CONVERSÃO DE BASES NUMÉRICAS");
        System.out.println("1. Converter para decimal");
        System.out.println("2. Converter decimal para outra base");
        System.out.println("3. Exit");

        opcao = Integer.parseInt(scanner.nextLine());

        switch (opcao) {
            case 1:
                System.out.print("Digite a base numérica: ");
                base = Integer.parseInt(scanner.nextLine());
                System.out.print("Digite o valor: ");
                String valorStr = scanner.nextLine().toUpperCase();

                System.out.println("===============");
                System.out.println("Resultado: " + converterBaseDecimal(valorStr,base));
                System.out.println("===============");
                menu();
                break;
            case 2:
                System.out.print("Digite a base númerica: ");
                base = Integer.parseInt(scanner.nextLine());
                System.out.print("Digite o valor em decimal: ");
                int valorInt = Integer.parseInt(scanner.nextLine());

                System.out.println("===============");
                System.out.println("Resultado: " + converterBaseDecimalParaOutraBase(valorInt,base));
                System.out.println("===============");
                menu();
                break;
            case 3:
                System.out.println("Finalizando");
                break;
            default:
                menu();
                break;
        }

    }
}
