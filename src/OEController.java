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

    private float convertToFloat(String stringToConvertToFloat) {
        return Float.parseFloat(stringToConvertToFloat);
    }

    private boolean checkForValidFloat(String p) {
        return p.matches("[+]?[0-9]*\\.?[0-9]+");
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
