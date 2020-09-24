package com.epam.upskills.lesson24_9;

public class Converter {
    private static final int ABSOLUTE_ZERO = -273;
    public double convertCelsiusToFahrenheit(double celsius){
        if(celsius < ABSOLUTE_ZERO){
            throw new IllegalAccessException("error data "+ celsius)
        }
        double fahrenheit = celsius * 1.8 + 32;
        return fahrenheit;
    }
    public boolean checkCelsius(double celsius){

    }
}
