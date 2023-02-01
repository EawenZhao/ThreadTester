import java.util.concurrent.atomic.AtomicLong;

public class Singleton {
    private static Singleton instance;
    private AtomicLong counter = new AtomicLong(0);

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }

    public AtomicLong getCounter() {
        return counter;
    }

    public void setCounter() {
        counter.addAndGet(1);
    }
}
