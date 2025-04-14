package org.jciterceros;

import java.util.Scanner;

public class CurrencyConverterApp {
    private final CurrencyConverter converter;

    public CurrencyConverterApp(CurrencyConverter converter) {
        this.converter = converter;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Challenge Conversor de Moedas");
            System.out.println("");
            System.out.println("Escolha uma conversão:");
            System.out.println("1. USD para BRL");
            System.out.println("2. EUR para USD");
            System.out.println("3. GBP para EUR");
            System.out.println("4. JPY para USD");
            System.out.println("5. AUD para CAD");
            System.out.println("6. CAD para BRL");
            System.out.println("7. Sair");
            System.out.print("Opção: ");
            int option = scanner.nextInt();
            if (option == 7) {
                break;
            }
            System.out.print("Digite o valor a ser convertido: ");
            double amount = scanner.nextDouble();

            try {
                String fromCurrency = getFromCurrency(option);
                String toCurrency = getToCurrency(option);
                double convertedAmount = converter.convert(fromCurrency, toCurrency, amount);
                System.out.printf("%.2f %s = %.2f %s%n", amount, fromCurrency, convertedAmount, toCurrency);
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
        scanner.close();
    }

    private String getFromCurrency(int option) {
        return switch (option) {
            case 1 -> "USD";
            case 2 -> "EUR";
            case 3 -> "GBP";
            case 4 -> "JPY";
            case 5 -> "AUD";
            case 6 -> "CAD";
            default -> throw new IllegalArgumentException("Opção inválida.");
        };
    }

    private String getToCurrency(int option) {
        return switch (option) {
            case 1 -> "BRL";
            case 2 -> "USD";
            case 3 -> "EUR";
            case 4 -> "USD";
            case 5 -> "CAD";
            case 6 -> "BRL";
            default -> throw new IllegalArgumentException("Opção inválida.");
        };
    }
}
