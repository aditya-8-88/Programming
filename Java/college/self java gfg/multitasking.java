// Java Program to illustrate Runnable Interface in threads 
// as multiple inheritance is not allowed 

// Importing basic packages 
import java.io.*; 
import java.util.*; 

// Class 1 
// Helper class implementing Runnable interface 
class MyThread1 implements Runnable { 

	// run() method inside this class 
	public void run() 
	{ 
		// Iterating to get more execution of threads 
		for (int i = 0; i < 5; i++) { 

			// Print statement whenever run() method 
			// of this class is called 
			System.out.println("Thread1"); 

			// Getting sleep method in try block to 
			// check for any exceptions 
			try { 
				// Making the thread pause for a certain 
				// time using sleep() method 
				Thread.sleep(1000); 
			} 

			// Catch block to handle the exceptions 
			catch (Exception e) { 
			} 
		} 
	} 
} 

// Class 2 
// Helper class implementing Runnable interface 
class MyThread2 implements Runnable { 

	// run() method inside this class 
	public void run() 
	{ 
		for (int i = 0; i < 5; i++) { 

			// Print statement whenever run() method 
			// of this class is called 
			System.out.println("Thread2"); 

			// Getting sleep method in try block to 
			// check for any exceptions 
			try { 

				// Making the thread pause for a certain 
				// time 
				// using sleep() method 
				Thread.sleep(1000); 
			} 

			// Catch block to handle the exceptions 
			catch (Exception e) { 
			} 
		} 
	} 
} 

// Class 3 
// Main class 
public class GFG { 

	// Main driver method 
	public static void main(String[] args) 
	{ 

		// Creating reference of Runnable to 
		// our classes above in main() method 
		Runnable obj1 = new MyThread1(); 
		Runnable obj2 = new MyThread2(); 

		// Creating reference of thread class 
		// by passing object of Runnable in constructor of 
		// Thread class 
		Thread t1 = new Thread(obj1); 
		Thread t2 = new Thread(obj2); 

		// Starting the execution of our own run() method 
		// in the classes above 
		t1.start(); 
		t2.start(); 
	} 
}
