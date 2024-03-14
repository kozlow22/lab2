package edu.canisius.cyb.cyb600.lab2;

public class Task2 {

    public String method1(String parameter1){
        String newstring="";
        char ch;
        if (parameter1 == null) {
            return ("");
        } else {
            for (int i=0; i<parameter1.length(); i++) {
                ch = parameter1.charAt(i);
                newstring = ch+newstring;
            }
        }
        return newstring.toUpperCase();
    }

    public String method2(String parameter2){
        String newstring=parameter2;
        char ch;
        if (parameter2 == null || parameter2 == "") {
            return ("");
        } else {
            ch = parameter2.charAt(0);
            for (int i=0; i<parameter2.length(); i++) {
                newstring = ch+newstring;
            }
        }
        return newstring;
    }

    public String method3(String parameter3){
        StringBuilder newstring = new StringBuilder();
        String temp = "";
        if (parameter3 == null || parameter3 == "") {
            return ("");
        }
        for (int i=0; i<parameter3.length(); i++) {
            char ch = parameter3.charAt(i);
            if (ch == ' ') {
                if (!temp.equals("")) {
                    newstring.insert(0, temp + " ");
                }
                temp = "";
            } else {
                temp += ch;
            }
        }
        if (!temp.equals("")) {
            newstring.insert(0, temp + " ");
        }
        return newstring.toString().substring(0, newstring.length()-1);
    }
}
