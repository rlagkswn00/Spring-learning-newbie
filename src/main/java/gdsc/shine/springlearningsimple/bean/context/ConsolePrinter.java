package gdsc.shine.springlearningsimple.bean.context;

public class ConsolePrinter implements Printer {
    @Override
    public void print(String message) {
        System.out.println(message);
    }
}
