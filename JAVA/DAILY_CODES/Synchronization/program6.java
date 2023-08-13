import java.util.Vector;

class MultiThreadVectorExample {

    public static void main(String[] args) {
        Vector<String> synchronizedVector = new Vector<>();

        // Creating two threads to concurrently add elements to the vector
        Thread thread1 = new Thread(() -> {
            synchronizedVector.addElement("Element 1");
            synchronizedVector.addElement("Element 2");
        });

        Thread thread2 = new Thread(() -> {
            synchronizedVector.add("Element 3");
            synchronizedVector.add("Element 4");
        });

        // Starting the threads
        thread1.start();
        thread2.start();

        // Waiting for the threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Accessing and printing elements from the synchronized vector
        for (String element : synchronizedVector) {
            System.out.println(element);
        }
    }
}

