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



    }

    private void getValidPValue() {
        String pTemp;
        print("Enter principle amount: ");
        print("p = ");
        pTemp = read();
        while (!pTemp.matches("[+]?[0-9]*\\.?[0-9]+")) {
            print("**Invalid number entered. Please enter a valid princple amount.");
            print("p = ");
            pTemp = read();
        }
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
