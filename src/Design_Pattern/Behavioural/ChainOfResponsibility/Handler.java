package Design_Pattern.Behavioural.ChainOfResponsibility;

public abstract class Handler{
    public  Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
    public void processRequest(String request) {
        if(nextHandler !=null) {
            nextHandler.processRequest(request);
        }else {
            System.out.println("Process get Failed");
        }
    }
}
