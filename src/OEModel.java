class OEModel {
    // Here is where we declare the class variables

    private boolean exitProgram;

    private float principle;
    private float interestRate;
    private float time;
    private double amount;
    private float n; // number of times interest rate is compounded per year


    OEModel() {
        principle = 0;
        interestRate = 0;
        time = 0;
        amount = 0;
        n = 0;
        exitProgram = false;
    }


    public double calculateAmount() {
        double tempAmount;
        double rn = 1 + (interestRate / n);
        double nt = n*time;

        tempAmount = principle * Math.pow(rn, nt);

        return tempAmount;
    }

    public boolean getExitProgram() {
        return exitProgram;
    }
    public float getPrinciple() {
        return principle;
    }

    public float getInterestRate() {
        return interestRate;
    }

    public float getTime() {
        return time;
    }

    public double getAmount() {
        return amount;
    }

    public float getN() {
        return n;
    }
    public void setExitProgram(boolean e) {
        exitProgram = e;
    }
    public void setPrinciple(float p){
        principle = p;
    }
    public void setInterestRate(float i) {
        interestRate = i;
    }
    public void setTime(float t) {
        time = t;
    }
    public void setAmount(double a) {
        amount = a;
    }
    public void setN(float passedN) {
        n = passedN;
    }




}


