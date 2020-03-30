package cec.epn.negocio;

public class VowelCounter {
    private String text;

    public int counter() {
        int cont = 0;
        for (int i = 0; i < text.length(); i++) {
            System.out.println(i + " " + text.charAt(i));
            if (text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i' || text.charAt(i) == 'o' || text.charAt(i) == 'u') {
                cont += 1;
            }
        }
        return cont;
    }

    public VowelCounter(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
