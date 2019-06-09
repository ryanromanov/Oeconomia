import java.io.IOException;

class OEController implements Scriver, Leger {
    private OEModel Model;

    OEController(OEModel pModel) {
        Model = pModel;
    }

    public void startApplication() {
        while (!Model.getExitProgram()) {
            runProgram();
        }
    }

    public void runProgram() {
        printMenu();
    }


    public void printMenu() {
        print("************************************");
        print("************************************");
        print("*************Oeconomia**************");
        getValidPValue();
        getValidInterestRate();
        getValidTime();

    }

    private void getValidTime() {
        String tempTime;
        print("Enter a period of time in years.");
        print("(Use decimal notation for non-whole years)");
        print("t = ");
        tempTime = read();
        while(!checkForValidFloat(tempTime)) {
            print("Invalid period of time entered. Please enter a valid number.");
            print("(Use decimal notation for non-whole years)");
            print("t = ");
            tempTime = read();
        }
        Model.setTime(convertToFloat(tempTime));
    }


    private void getValidInterestRate() {
        String tempInterestRate;
        print("Enter interest rate in decimal format");
        print("(e.g., .02 for 2%)");
        print("r = ");
        tempInterestRate = read();
        while(!checkForValidFloat(tempInterestRate)) {
            print("Invalid interest rate entered. Please enter a valid number.");
            print("(e.g., .02 for 2%)");
            print("r = ");
            tempInterestRate = read();
        }
        Model.setInterestRate(convertToFloat(tempInterestRate));
    }

    private void getValidPValue() {
        String tempP;
        print("Enter principle amount: ");
        print("p = ");
        tempP = read();
        while (!checkForValidFloat(tempP)) {
            print("**Invalid number entered. Please enter a valid principle amount.");
            print("p = ");
            tempP = read();
        }
        Model.setPrinciple(convertToFloat(tempP));
    }

    private float convertToFloat(String stringToConvertToFloat) {
        return Float.parseFloat(stringToConvertToFloat);
    }

    private boolean checkForValidFloat(String p) {
        return p.matches("[+]?[0-9]*\\.?[0-9]+");
    }

    @Override
    public void print(Object line) {
        System.out.println(line.toString());
    }


    @Override
    public String read() {
        String InputString = "";
        try {
            InputString = bufferedInput.readLine();
        } catch (IOException e) {
            print("**Error in read() method in OEController's Leger");
            e.printStackTrace();
        }
        return InputString;
    }
}
