import java.util.concurrent.atomic.*;

public class AtomCounter {
	private AtomicInteger value = new AtomicInteger();
	 
    public void increment() {
        value.incrementAndGet();
    }
 
    public void decrement() {
        value.decrementAndGet();
    }
 
    public int get() {
        return value.get();
    }
}
