package cec.epn.negocio;

public class PrimeNumber {
    private int number_in;
    boolean result;
    public boolean isPrime(){
        double module;
        boolean result;
        int cont=0;
        if (number_in>1){
            // Say if it is prime

            for (int i = 2; i <=number_in ; i++) {
                module = number_in%i;
                if(module==0){
                    cont++;
                    System.out.println(i);
                }

            }
            result= cont <= 2;



        }
        else{
            result=false;
        }
        return result;
    }
    public PrimeNumber(int number_in) {
        this.number_in = number_in;
    }

    public int getNumber_in() {
        return number_in;
    }

    public void setNumber_in(int number_in) {
        this.number_in = number_in;
    }
}
