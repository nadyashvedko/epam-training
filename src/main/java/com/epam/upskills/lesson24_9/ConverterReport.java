package com.epam.upskills.lesson24_9;

import javax.xml.crypto.Data;
import java.io.Console;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.GregorianCalendar;

public class ConverterReport {
    public void converterPrint(double celsius, double fahren){
        Console console = System.console();
        console.printf("_______________");
        console.printf("| %f C ->%5.1f F | %s %8s %n",celsius,fahren, LocalDate.now(), LocalTime.now());
        console.printf("_______________");
    }
}
