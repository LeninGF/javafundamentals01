package cec.epn.negocio;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VowelCounterRegex {
    private String textIn;


    public int vowelCount() {
        System.out.println("original text: "+ textIn);
        String textIn2 = textIn.replaceAll("\\s+", "");
        System.out.println("new text "+textIn2);
        Pattern regex = Pattern.compile("[aeiou]");
        Matcher match = regex.matcher(textIn2);
        int cont = 0;
        while (match.find()) {
            cont++;
        }
        return cont;
    }

    public VowelCounterRegex(String textIn) {
        this.textIn = textIn;
    }

    public String getTextIn() {
        return textIn;
    }

    public void setTextIn(String textIn) {
        this.textIn = textIn;
    }
}
