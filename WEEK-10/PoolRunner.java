import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class PoolRunner {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 10; i++) {
            final int taskId = i;

            executor.execute(new Runnable() {
                @Override
                public void run() {

                    System.out.println(
                            "Task " + taskId +
                                    " is running on " +
                                    Thread.currentThread().getName());

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println("Task interrupted");
                    }

                    System.out.println(
                            "Task " + taskId +
                                    " completed by " +
                                    Thread.currentThread().getName());
                }
            });
        }

        executor.shutdown();

        executor.awaitTermination(1, TimeUnit.MINUTES);

        System.out.println("All tasks completed.");
    }
}