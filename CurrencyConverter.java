import java.util.HashMap;
import java.util.Scanner;

public class CurrencyConverter {

    // Mock exchange rates (base: USD)
    private static final HashMap<String, Double> exchangeRates = new HashMap<>();

    static {
        exchangeRates.put("USD", 1.0);
        exchangeRates.put("EUR", 0.85);
        exchangeRates.put("INR", 74.5);
        exchangeRates.put("GBP", 0.75);
        exchangeRates.put("JPY", 110.0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Currency Selection
        System.out.println("Available currencies: " + exchangeRates.keySet());
        System.out.print("Enter base currency (e.g. USD): ");
        String baseCurrency = scanner.nextLine().toUpperCase();

        System.out.print("Enter target currency (e.g. EUR): ");
        String targetCurrency = scanner.nextLine().toUpperCase();

        // Validate currencies
        if (!exchangeRates.containsKey(baseCurrency) || !exchangeRates.containsKey(targetCurrency)) {
            System.out.println("Invalid currency selection.");
            return;
        }

        // Amount Input
        System.out.print("Enter amount in " + baseCurrency + ": ");
        double amount = scanner.nextDouble();

        // Currency Conversion
        double baseRate = exchangeRates.get(baseCurrency);
        double targetRate = exchangeRates.get(targetCurrency);
        double convertedAmount = (amount / baseRate) * targetRate;

        // Display Result
        System.out.printf("Converted amount: %.2f %s\n", convertedAmount, targetCurrency);

        scanner.close();
    }
}


OUTPUT:
 
Available currencies: [JPY, EUR, GBP, USD, INR]
Enter base currency (e.g. USD): USD
Enter target currency (e.g. EUR): INR
Enter amount in USD: 100
Converted amount: 7450.00 INR