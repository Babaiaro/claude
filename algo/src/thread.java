public class thread {

        public static void main(String[] args) {
            // Create Thread 1
            Thread thread1 = new Thread(() -> {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Thread 1: " + i);
                }
            });

            // Create Thread 2
            Thread thread2 = new Thread(() -> {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Thread 2: " + i);
                }
            });

            // Start both threads
            thread1.start();
            thread2.start();
        }

}
