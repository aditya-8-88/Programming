 class A extends Thread{
    // @Override
    public void run(){
        System.out.println("Red");
    }
}
 class B extends Thread{
    // @Override
    public void run(){
        System.out.println("Blue");
    }
}
 class C extends Thread{
    // @Override
    public void run(){
        System.out.println("Green");
    }
}
public class Demo {
    public static void main(String[] args) {
        Thread red = new A();
        Thread Blue = new B();
        Thread Green = new C();

        red.start();
        Blue.start();
        Green.start();

    }
}


// public class Demo
// {
//     public static void main(String args[]) {
        
//     }
// }


// import java.util.concurrent.*;

// class SharedResource {
//     private boolean ready = false;

//     public synchronized void waitForReady() throws InterruptedException {
//         while (!ready) {
//             wait();
//         }
//     }

//     public synchronized void setReady() {
//         ready = true;
//         notifyAll();
//     }
// }

// class Worker implements Callable<String> {
//     private final SharedResource resource;

//     public Worker(SharedResource resource) {
//         this.resource = resource;
//     }

//     @Override
//     public String call() throws InterruptedException {
//         System.out.println(Thread.currentThread().getName() + ": Waiting for resource to be ready.");
//         resource.waitForReady();
//         System.out.println(Thread.currentThread().getName() + ": Resource is ready. Working...");
//         Thread.sleep(2000); 
//         return Thread.currentThread().getName() + ": Work done.";
//     }
// }

// public class ThreadingExample {
//     public static void main(String[] args) throws InterruptedException, ExecutionException {
//         ExecutorService executor = Executors.newFixedThreadPool(2);
//         SharedResource resource = new SharedResource();

//         Future<String> future1 = executor.submit(new Worker(resource));
//         Future<String> future2 = executor.submit(new Worker(resource));

//         Thread.sleep(3000); 
//         System.out.println("Main thread: Resource is ready now.");
//         resource.setReady();

//         System.out.println("Future1 result: " + future1.get());
//         System.out.println("Future2 result: " + future2.get());

//         executor.shutdown();
//     }
// }
