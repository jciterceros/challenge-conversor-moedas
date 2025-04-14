package org.example;

import io.github.cdimascio.dotenv.Dotenv;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static final Dotenv dotenv = Dotenv.load();
    private static final String apiKey = dotenv.get("API_KEY");
    private static final String baseUrl = dotenv.get("BASE_URL");

    public static void main(String[] args) {

        System.out.println("API Key: " + apiKey);
        System.out.println("Base URL: " + baseUrl);

    }
}