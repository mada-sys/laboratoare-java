import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Thread csvThread = new Thread(new FileInputOutputService());
        csvThread.start();
        try {
            csvThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}