public class Oeconomia implements Scriver {



    public static void main(String[] args) {
        OEModel model = new OEModel();
        OEController controller = new OEController(model);
        controller.runProgram();

    }

    Oeconomia() {

    }


    @Override
    public void print(Object line) {
        System.out.println(line.toString());
    }
}
