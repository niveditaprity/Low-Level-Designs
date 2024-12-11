package Design_Pattern.Behavioural.ChainOfResponsibility;

public class Level2Handler extends  Handler{
    @Override
    public void processRequest(String request) {
        if (request.equals("technical")) {
            System.out.println("Level 2 handled the request.");
        }else {
            super.processRequest(request);
        }
    }
}
