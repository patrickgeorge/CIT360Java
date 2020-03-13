import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class t_e_r {
	static final int NUMBER_THREADS = 50;

	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		//This is a Runnable. It is the basic building block of asynchronous programming in Java.
		//Runnables are tasks that can be executed asynchronously, which means "at the same time as other tasks."
		//While similar to functions, Runnables cannot use parameters. They can, however, be placed in a 
		//function, and use any parameters passed to said function
		Runnable task = () -> {
			String threadname = Thread.currentThread().getName();
			System.out.println("Hello " + threadname);
		};
		
		Thread thread = new Thread(task);
		thread.start();
		
		//Here is a perfect example of asynchronicity. The thread above is set to execute,
		//but the thread below is currently executing as well. You can see that there is no set point
		//for the string "Hello Thread-0" to appear in the middle of the array output. You can run the
		//program multiple times and the string will appear at random places in the middle of the
		//output. This is asynchronicity.
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		
		//In the previous example, we created a runnable task and set up a thread manually 
		// to execute it. Now we will explore a concept called executors, which are interfaces
		// that execute these runnable automatically for us, and come with many more methods besides.
		Runnable runner1 = () -> {
			System.out.println("Which runner will win the race?");
		};
		
		Runnable runner2 = () -> {
			System.out.println("Will they execute in the same order?");
		};
	
		Runnable runner3 = () -> {
			System.out.println("How will this end?");
		};
		
		
		//This executor will run the tasks wee assign to it in whatever order we assign.
		//Obviously, this example is pretty simple, and is about the same as if we just called
		//the runnables directly. But executors are much more customizable, and include a lot of 
		//helpful commands, including the ability to shutdown instantly, cutting off unfinished
		//tasks, or delaying some tasks until others are completed. These kinds of functions
		// are very helpful for managing databases, as one example.
		ExecutorService executor = Executors.newFixedThreadPool(3);
		
		executor.submit(runner1);
		executor.submit(runner2);
		executor.submit(runner3);
	
	//This is an example of how to use Atomic variables, compared with regular variables.
	//Of these two counters, one uses regular ints, one uses Atomic ints
	Counter counter = new Counter();
	AtomCounter aCounter = new AtomCounter();
	
	System.out.println("\n");
	System.out.println("\n");
	
	//They both start at 0.
    System.out.println("Initial Counter = " + counter.get());
    System.out.println("Initial Atom Counter = " + aCounter.get());

    //One class increments the normal counter, the other increments the atomic counter.
    UpdateThread[] threads = new UpdateThread[NUMBER_THREADS];
    AtomUpdate[] atomThreads = new AtomUpdate[NUMBER_THREADS];

    //This is where the individual threads are started. Whenever you make a class that extends the Thread class,
    // you need to ensure you override the 'run' method. The run method is where the task to be implemented 
    //on the specific thread is created. Think of it as the 'main' method of the thread. 
    //This overriding is done in the implementation of the class that extends to Thread class.
    for (int i = 0; i < NUMBER_THREADS; i++) {
        threads[i] = new UpdateThread(counter);
        threads[i].start();
    }

    for (int i = 0; i < NUMBER_THREADS; i++) {
    	try {
        threads[i].join();
    	} catch (InterruptedException ex) { ex.printStackTrace(); }
    }
    
    for (int i = 0; i < NUMBER_THREADS; i++) {
        atomThreads[i] = new AtomUpdate(aCounter);
        atomThreads[i].start();
    }

    for (int i = 0; i < NUMBER_THREADS; i++) {
    	try {
        atomThreads[i].join();
    	} catch (InterruptedException ex) { ex.printStackTrace(); }
    }

    //From here, we can see that the Atomic integer kept its threads from overlapping and they were all able to access the counter.
    //The normal integer threads were often denied from accessing this communal variable, however, so it did not reach the full 50 counts.
    System.out.println("\n");
    System.out.println("Final Counter = " + counter.get());
    System.out.println("Final Counter = " + aCounter.get());
    
    //This code will likely never get called, as it is nearly impossible for all the threads to be able to access this variable
    // without accidentally overlapping.
    if (counter.get() >= 50) {
    	System.out.println("Non-Atomic launch!");
    }
    
    if (aCounter.get() >= 50) {
    	System.out.println("Atomic launch!");
    }
    
	}
}
