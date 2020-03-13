public class AtomUpdate extends Thread {
	private AtomCounter aCounter;
	 
    public AtomUpdate(AtomCounter aCounter) {
        this.aCounter = aCounter;
    }
    
    public void run() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) { ex.printStackTrace(); }
 
        aCounter.increment();
    }
}
