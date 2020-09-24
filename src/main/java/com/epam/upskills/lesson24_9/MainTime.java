package com.epam.upskills.lesson24_9;

public class MainTime {
    public static void main(String[] args) {
        DataReader reader = new DataReader(); //вводим температуру
        String value = reader.readConsole();
        StringValidator validator = new StringValidator(); //проверяем число ли это
        boolean check = validator.validatNumber(value);
        if(!check){
           throw new IllegalArgumentException("wrong data =" + value)
        }
        DataParser parser = new DataParser(); //
        double celsius = parser.parseNumber(value); //парсим стринг в число
        Converter converter = new Converter();
        double fahr = converter.convertCelsiusToFahrenheit(celsius);
        ConverterReport report = new ConverterReport();
        report.converterPrint(celsius,fahr);

    }
}
