package Java.Singleton;

public class ResouceManager {

    public static void main(String[] args) {
        PrintSpooler spooler = PrintSpooler.getInstance();
        PrintSpooler spooler2 = PrintSpooler.getInstance(); // returns same instance
    }

}
