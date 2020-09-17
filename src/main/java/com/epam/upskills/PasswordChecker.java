package com.epam.upskills;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PasswordChecker {
    private static final String AUTHENTIC_PASSWORD = "QWERTY123";

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please, enter password: ");
        while (true) {
            String enteredPassword = reader.readLine();
            if (enteredPassword.equals(AUTHENTIC_PASSWORD)) {
                System.out.println("Password is correct");
                break;
            } else {
                System.out.println("Password is incorrect! Try again.");
            }
        }
    }
}
