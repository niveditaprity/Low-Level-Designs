package SOLID_Principle.ISP.Without;

public class BasicPrinter implements Printer {
    @Override
    public void print(String content) {
        System.out.println("Printing: " + content);
    }

    @Override
    public void scan(String content) {
        throw new UnsupportedOperationException("Scan not supported");
    }

    @Override
    public void fax(String content) {
        throw new UnsupportedOperationException("Fax not supported");
    }
}
