import java.util.*;

public class Currency_Converter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Supported currencies and example rates (Base: USD)
        Map<String, Double> rates = new HashMap<>();
        rates.put("USD", 1.0);
        rates.put("INR", 83.25);
        rates.put("EUR", 0.92);
        rates.put("GBP", 0.78);
        rates.put("JPY", 151.55);

        System.out.println("----- Currency Converter -----");

        // Currency Selection
        System.out.print("Enter Base Currency (USD, INR, EUR, GBP, JPY): ");
        String base = sc.next().toUpperCase();

        System.out.print("Enter Target Currency (USD, INR, EUR, GBP, JPY): ");
        String target = sc.next().toUpperCase();

        // Check if currencies exist
        if (!rates.containsKey(base) || !rates.containsKey(target)) {
            System.out.println("Invalid currency!");
            return;
        }

        // Amount Input
        System.out.print("Enter amount to convert: ");
        double amount = sc.nextDouble();

        // Conversion Logic
        double amountInUSD = amount / rates.get(base);      // Convert base → USD
        double finalAmount = amountInUSD * rates.get(target); // USD → Target

        // Display Result
        System.out.println("\nConverted Amount: " + finalAmount + " " + target);
    }
}