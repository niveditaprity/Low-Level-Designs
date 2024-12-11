package Design_Pattern.Behavioural.ChainOfResponsibility;

public class Level3Handler extends  Handler{
    @Override
    public void processRequest(String request) {
        if (request.equals("complex")) {
            System.out.println("Level 3 handled the request.");
        }else {
            super.processRequest(request);
        }
    }
}
