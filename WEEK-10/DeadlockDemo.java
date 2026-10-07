public class DeadlockDemo {

    static Object printer = new Object();
    static Object scanner = new Object();

    static void printDocument() {
        synchronized (printer) {
            System.out.println("Thread 1 locked Printer");

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (scanner) {
                System.out.println("Thread 1 locked Scanner");
            }
        }
    }

    static void scanDocument() {
        synchronized (scanner) {
            System.out.println("Thread 2 locked Scanner");

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (printer) {
                System.out.println("Thread 2 locked Printer");
            }
        }
    }

    public static void main(String[] args) {

        Thread printingThread = new Thread(() -> printDocument());
        Thread scanningThread = new Thread(() -> scanDocument());

        printingThread.start();
        scanningThread.start();
    }
}