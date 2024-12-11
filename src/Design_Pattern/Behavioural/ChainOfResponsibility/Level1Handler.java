package Design_Pattern.Behavioural.ChainOfResponsibility;

public class Level1Handler extends Handler{

    @Override
    public void processRequest(String request) {
        if (request.equalsIgnoreCase("Basic")) {
            System.out.println("Level1 requirement is fulfilled");

        } else {
            super.processRequest(request);
        }
    }
}
