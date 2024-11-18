package SOLID_Principle.ISP.With;

public class Main {
    public static void main(String[] args) {
        Printable basicPrinter = new BasicPrinter();
        basicPrinter.print("Hello, world!");

        AdvancedPrinter advancedPrinter = new AdvancedPrinter();
        advancedPrinter.print("Report");
        advancedPrinter.scan("Document");
        advancedPrinter.fax("Invoice");
    }
}
