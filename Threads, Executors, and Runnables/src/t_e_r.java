import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class t_e_r {

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
	}

}
