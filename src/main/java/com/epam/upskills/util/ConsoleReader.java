package com.epam.upskills.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader {
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static String readStringLine() throws IOException {
        return reader.readLine();
    }

    public static int readIntLine() throws IOException {
        return Integer.parseInt(reader.readLine());
    }

    public static double readDoubleLine() throws IOException {
        return Double.parseDouble(reader.readLine());
    }

    public static boolean readBooleanLine() throws IOException {
        return Boolean.parseBoolean(reader.readLine());
    }
}
