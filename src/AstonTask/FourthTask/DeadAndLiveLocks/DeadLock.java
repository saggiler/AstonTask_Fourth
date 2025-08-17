package AstonTask.FourthTask.DeadAndLiveLocks;

public class DeadLock {
    private static final Object lock1 = new Object();
    private static final Object lock2 = new Object();

    public static void main(String[] args) {
        //поток 1
        Thread thread1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("thread1: удержание lock1");
                try {
                    Thread.sleep(100); //заддержка для захвата для захвата flow2 вторым потоком
                } catch (InterruptedException e) {}
                System.out.println("thread1: ожидание lock2");
                synchronized (lock2) {
                    System.out.println("thread1: захватывает lock2" );
                }
            }
        });

        //поток 2
        Thread thread2 = new Thread(() -> {
            synchronized (lock2) {
                System.out.println("Thread2: удержание lock2");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {}
                System.out.println("Thread2 ожидает lock1 ");
                synchronized (lock1) {
                    System.out.println("Thread2 захватывает lock1 ");
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
