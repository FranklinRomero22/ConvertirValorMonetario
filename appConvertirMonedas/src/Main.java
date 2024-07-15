import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CurrencyConverter converter = new CurrencyConverter();

        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Dolar =>> Lempiras hondureño");
            System.out.println("2. Lempiras hondureño =>> Dolar");
            System.out.println("3. Dolar =>> Peso argentino");
            System.out.println("4. Peso argentino =>> Dolar");
            System.out.println("5. Dolar =>> Real Brasileño");
            System.out.println("6. Real Brasileño =>> Dolar");
            System.out.println("7. Salir");
            int option = scanner.nextInt();

            if (option == 7) {
                break;
            }

            System.out.print("Ingrese la cantidad: ");
            double amount = scanner.nextDouble();

            String fromCurrency = "";
            String toCurrency = "";

            switch (option) {
                case 1:
                    fromCurrency = "USD";
                    toCurrency = "HNL";
                    break;
                case 2:
                    fromCurrency = "HNL";
                    toCurrency = "USD";
                    break;
                case 3:
                    fromCurrency = "USD";
                    toCurrency = "ARS";
                    break;
                case 4:
                    fromCurrency = "ARS";
                    toCurrency = "USD";
                    break;
                case 5:
                    fromCurrency = "USD";
                    toCurrency = "BRL";
                    break;
                case 6:
                    fromCurrency = "BRL";
                    toCurrency = "USD";
                    break;
                default:
                    System.out.println("Opción no válida.");
                    continue;
            }

            double result = converter.convert(fromCurrency, toCurrency, amount);
            System.out.println("Resultado: " + result + " " + toCurrency);
        }
        scanner.close();
    }
}