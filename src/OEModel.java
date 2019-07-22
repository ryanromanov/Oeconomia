import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

class OEModel {
    // Here is where we declare the class variables

    private boolean exitProgram;

//    private double principle;
    private double interestRate;
    private double time;
//    private double amount;
    private int n; // number of times interest rate is compounded per year

    private BigDecimal amount;
//    private BigDecimal interestRate;
    private BigDecimal principle;

    private NumberFormat CurrencyFormat;

    OEModel() {
//        principle = 0;
        interestRate = 0;
        time = 0;
//        amount = 0;
        n = 0;

        amount = new BigDecimal("0");
//        bInterestRate = new BigDecimal("0");
        principle = new BigDecimal("0");

        //set currency format to US by default
        CurrencyFormat = NumberFormat.getCurrencyInstance(Locale.US);

        exitProgram = false;
    }


    BigDecimal calculateAmount() {

        BigDecimal tempAmount;
        BigDecimal RatePerUnitTime =  new BigDecimal(1 + (interestRate / n));
        int nt = (int) (n*time);

        tempAmount = principle.multiply(RatePerUnitTime.pow(nt));

        return tempAmount;
    }

    boolean getExitProgram() {
        return exitProgram;
    }
    public BigDecimal getPrinciple() {
        return principle;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public double getTime() {
        return time;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public int getN() {
        return n;
    }

    public NumberFormat getCurrencyFormat() {
        return CurrencyFormat;
    }

    public void setExitProgram(boolean e) {
        exitProgram = e;
    }
    void setPrinciple(double p){
        principle = BigDecimal.valueOf(p);
    }
    void setInterestRate(double i) {
        interestRate = i;
    }
    void setTime(double t) {
        time = t;
    }
    public void setAmount(double a) {
        amount = BigDecimal.valueOf(a);
    }
    void setN(int passedN) {
        n = passedN;
    }


    void setCurrencyFormat (Locale l) {
        CurrencyFormat = NumberFormat.getCurrencyInstance(l);
    }


}


