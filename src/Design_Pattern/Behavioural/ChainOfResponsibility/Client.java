package Design_Pattern.Behavioural.ChainOfResponsibility;

public class Client {
    public static void main(String[] args) {
        Level1Handler level1Handler = new Level1Handler();
        Level2Handler level2Handler = new Level2Handler();
        Level3Handler level3Handler = new Level3Handler();
        level1Handler.setNextHandler(level2Handler);
        level2Handler.setNextHandler(level3Handler);
        level1Handler.processRequest("complex");
    }
}
