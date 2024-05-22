import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class CurrencyConverter
{
    public static void main(String[] args)
    {
        Map<String, Double> exchangeRates = new HashMap<>();
        exchangeRates.put("USD", 1.0);    // US Dollar
        exchangeRates.put("EUR", 0.85);   // Euro
        exchangeRates.put("GBP", 0.72);   // British Pound
        exchangeRates.put("JPY", 112.26); // Japanese Yen
        exchangeRates.put("AUD", 1.32);   // Australian Dollar
        exchangeRates.put("CAD", 1.28);   // Canadian Dollar
        exchangeRates.put("INR", 74.23);  // Indian Rupee
        exchangeRates.put("CNY", 6.38);   // Chinese Yuan
        exchangeRates.put("BRL", 5.30);   // Brazilian Real
        exchangeRates.put("MXN", 20.23);  // Mexican Peso
        exchangeRates.put("ZAR", 16.86);  // South African Rand
        exchangeRates.put("RUB", 74.86);  // Russian Ruble
        exchangeRates.put("KRW", 1142.60); // South Korean Won
        exchangeRates.put("TRY", 13.16);  // Turkish Lira
        exchangeRates.put("AED", 3.67);   // UAE Dirham
        exchangeRates.put("SGD", 1.35);   // Singapore Dollar
        exchangeRates.put("HKD", 7.78);   // Hong Kong Dollar
        exchangeRates.put("SEK", 8.42);   // Swedish Krona
        exchangeRates.put("NZD", 1.45);   // New Zealand Dollar
        exchangeRates.put("CHF", 0.92);   // Swiss Franc
        exchangeRates.put("NOK", 8.86);   // Norwegian Krone
        exchangeRates.put("DKK", 6.12);   // Danish Krone
        exchangeRates.put("THB", 31.22);  // Thai Baht
        exchangeRates.put("IDR", 14075.0);// Indonesian Rupiah
        exchangeRates.put("MYR", 4.18);   // Malaysian Ringgit
        exchangeRates.put("PHP", 49.72);  // Philippine Peso
        exchangeRates.put("PLN", 3.92);   // Polish Złoty
        exchangeRates.put("ARS", 114.60);  // Argentine Peso
        exchangeRates.put("EGP", 15.67);   // Egyptian Pound
        exchangeRates.put("ILS", 3.26);    // Israeli Shekel
        exchangeRates.put("KWD", 0.30);    // Kuwaiti Dinar
        exchangeRates.put("QAR", 3.64);    // Qatari Riyal
        exchangeRates.put("TWD", 27.87);   // New Taiwan Dollar
        exchangeRates.put("VND", 22861.50);// Vietnamese Dong
        exchangeRates.put("CZK", 21.92);   // Czech Koruna
        exchangeRates.put("HUF", 300.50);  // Hungarian Forint
        exchangeRates.put("RON", 4.93);    // Romanian Leu
        exchangeRates.put("UAH", 27.54);   // Ukrainian Hryvnia
        exchangeRates.put("ZMW", 23.93);   // Zambian Kwacha
        exchangeRates.put("BGN", 1.66);    // Bulgarian Lev
        exchangeRates.put("HRK", 6.36);    // Croatian Kuna
        exchangeRates.put("ISK", 132.22);  // Icelandic Króna
        exchangeRates.put("LKR", 204.50);  // Sri Lankan Rupee
        exchangeRates.put("NPR", 130.20);  // Nepalese Rupee
        exchangeRates.put("OMR", 0.39);    // Omani Rial
        exchangeRates.put("SAR", 3.75);    // Saudi Riyal
        exchangeRates.put("XAF", 556.39);  // Central African CFA Franc
        exchangeRates.put("XCD", 2.70);    // East Caribbean Dollar
        exchangeRates.put("XOF", 556.39);  // West African CFA Franc
        exchangeRates.put("XPF", 100.48);  // CFP Franc
        exchangeRates.put("AMD", 533.87);  // Armenian Dram
        exchangeRates.put("GEL", 3.07);    // Georgian Lari
        exchangeRates.put("KZT", 433.25);  // Kazakhstani Tenge
        exchangeRates.put("MAD", 9.12);    // Moroccan Dirham
        

        
        List<String> sourceCurrencies = new ArrayList<>(exchangeRates.keySet());
        List<String> targetCurrencies = new ArrayList<>(exchangeRates.keySet());
      
        Scanner scanner = new Scanner(System.in);

        System.out.println("-->Currency Converter-->");

        System.out.print("Enter the amount: ");
        double amount = scanner.nextDouble();

        System.out.println("Currency Codes:"+(exchangeRates.keySet()));

        System.out.print("Enter the Source Currency:");
        String sourceCurrency = scanner.next().toUpperCase();

        System.out.print("Enter the Target Currency:");
        String targetCurrency = scanner.next().toUpperCase();

        if(!sourceCurrencies.contains(sourceCurrency) || !targetCurrencies.contains(targetCurrency))
        {
            System.out.println("Invalid currency codes.");
            System.exit(1);
        }
        else
        {
        double convertedAmount = convertCurrency(amount, sourceCurrency, targetCurrency, exchangeRates);
        System.out.println(amount + " " + sourceCurrency + " is equal to " + convertedAmount + " " + targetCurrency);
        scanner.close();
        }
    }

    private static double convertCurrency(double amount, String sourceCurrency, String targetCurrency,Map<String, Double> exchangeRates) {
        double sourceRate = exchangeRates.get(sourceCurrency);
        double targetRate = exchangeRates.get(targetCurrency);

        return amount * (targetRate / sourceRate);
    }
}
