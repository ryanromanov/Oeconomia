public class OEModel {
    // Here is where we declare the class variables

    float principle;
    float interestRate;
    float time;
    double amount;
    float n; // number of times interest rate is compounded per year


    public void OEModel() {
        principle = 0;
        interestRate = 0;
        time = 0;
        amount = 0;
        n = 0;
    }


    public double calculateAmount() {
        double tempAmount;
        double rn = 1 + (interestRate / n);
        double nt = n*time;

        tempAmount = principle * Math.pow(rn, nt);

        return tempAmount;
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


