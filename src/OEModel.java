import java.math.BigDecimal;

class OEModel {
    // Here is where we declare the class variables

    private boolean exitProgram;

    private double principle;
    private double interestRate;
    private double time;
    private double amount;
    private int n; // number of times interest rate is compounded per year

    private BigDecimal bAmount;
    private BigDecimal bInterestRate;
    private BigDecimal bprinciple;

    OEModel() {
        principle = 0;
        interestRate = 0;
        time = 0;
        amount = 0;
        n = 0;

        bAmount = new BigDecimal("0");
        bInterestRate = new BigDecimal("0");
        bprinciple = new BigDecimal("0");


        exitProgram = false;
    }


    public BigDecimal calculateAmount() {

        BigDecimal tempAmount;
        BigDecimal TempAmountBigDecimal;
        BigDecimal rn =  new BigDecimal(1 + (interestRate / n));
        int nt = (int) (n*time);
        bprinciple =  new BigDecimal(principle);

        tempAmount = new BigDecimal(bprinciple.multiply(rn.pow(nt));

        return tempAmount;
    }

    public boolean getExitProgram() {
        return exitProgram;
    }
    public double getPrinciple() {
        return principle;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public double getTime() {
        return time;
    }

    public double getAmount() {
        return amount;
    }

    public int getN() {
        return n;
    }
    public void setExitProgram(boolean e) {
        exitProgram = e;
    }
    public void setPrinciple(double p){
        principle = p;
    }
    public void setInterestRate(double i) {
        interestRate = i;
    }
    public void setTime(double t) {
        time = t;
    }
    public void setAmount(double a) {
        amount = a;
    }
    public void setN(int passedN) {
        n = passedN;
    }




}


