package com.epam.upskills.lesson24_9;

public class StringValidator {
    public boolean validatNumber(String data){
        boolean flag;
        flag = data.matches("[-]?[0-9]+");
        return flag;
    }
}
