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
        String menuInput;
        printLine("************************************");
        printLine("************************************");
        printLine("*************Oeconomia**************");
        getValidPrincipleAmount();
        getValidInterestRate();
        getValidTime();
        getValidNValue();
        printLine("Do you want to calculate the amount?");
        printLine("(Please enter \"y\" or \"n\")");
        menuInput = read();
        while (!(menuInput.equals("y") || menuInput.equals("n"))) {
            printLine("Error: Please enter either \"y\" or \"n\".");
            menuInput = read();
        }
        if (menuInput.equals("y")) {
            printLine("Amount after calculation: " + Model.calculateAmount());
        }
        else {

        }
    }

    private void getValidNValue() {
        String tempNValue;
        printLine("Enter the number of times interest rate is calculated per Time value.");
        printLine("(Only integer values are allowed)");
        print("n = ");
        tempNValue = read();
        while(!checkForValidDouble(tempNValue)) {
            printLine("Invalid n value. Please enter a valid number.");
            printLine("(Only integer values are allowed)");
            print("n = ");
            tempNValue = read();
        }
        Model.setN(convertToInt(tempNValue));
    }



    private void getValidTime() {
        String tempTime;
        printLine("Enter a period of time in years.");
        printLine("(Use decimal notation for non-whole years)");
        print("t = ");
        tempTime = read();
        while(!checkForValidDouble(tempTime)) {
            printLine("Invalid period of time entered. Please enter a valid number.");
            printLine("(Use decimal notation for non-whole years)");
            print("t = ");
            tempTime = read();
        }
        Model.setTime(convertToDouble(tempTime));
    }


    private void getValidInterestRate() {
        String tempInterestRate;
        printLine("Enter interest rate in decimal format");
        printLine("(e.g., .02 for 2%)");
        print("r = ");
        tempInterestRate = read();
        while(!checkForValidDouble(tempInterestRate)) {
            printLine("Invalid interest rate entered. Please enter a valid number.");
            printLine("(e.g., .02 for 2%)");
            print("r = ");
            tempInterestRate = read();
        }
        Model.setInterestRate(convertToDouble(tempInterestRate));
    }

    private void getValidPrincipleAmount() {
        String tempP;
        printLine("Enter principle amount: ");
        printLine("p = ");
        tempP = read();
        while (!checkForValidDouble(tempP)) {
            printLine("**Invalid number entered. Please enter a valid principle amount.");
            print("p = ");
            tempP = read();
        }
        Model.setPrinciple(convertToDouble(tempP));
    }

    private double convertToDouble(String stringToConvertToDouble) {
        return Double.parseDouble(stringToConvertToDouble);
    }

    private int convertToInt(String tempNValue) {
        return Integer.parseInt(tempNValue);
    }

    private boolean checkForValidDouble(String p) {
        return p.matches("[+]?[0-9]*\\.?[0-9]+");
    }

    @Override
    public void printLine(Object line) {
        System.out.println(line.toString());
    }

    @Override
    public void print(Object line) {
        System.out.print(line.toString());
    }


    @Override
    public String read() {
        String InputString = "";
        try {
            InputString = bufferedInput.readLine();
        } catch (IOException e) {
            printLine("**Error in read() method in OEController's Leger");
            e.printStackTrace();
        }
        return InputString;
    }
}
