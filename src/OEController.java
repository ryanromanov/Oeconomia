class OEController implements Scriver {
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

    }

    @Override
    public void print(Object line) {
        System.out.println(line.toString());
    }
}
