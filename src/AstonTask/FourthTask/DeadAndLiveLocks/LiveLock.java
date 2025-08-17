package AstonTask.FourthTask.DeadAndLiveLocks;

public class LiveLock {
    private static final Object lock1 = new Object();
    private static final Object lock2 = new Object();
    private static boolean thread1Try = true;
    private static boolean thread2Try = true;

    public static void main(String[] args) {
        //Поток 1
        Thread thread1 = new Thread(() -> {
            while (thread1Try) {
                synchronized (lock1) {
                    System.out.println("Thread 1: получен lock1, пытается получить lock2");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {}
                    if (!thread2Try) {
                        thread1Try = false;
                        continue;
                    }
                    synchronized (lock2) {
                        System.out.println("Thread 1: Есть оба замка!");
                        thread1Try = false;
                    }
                }
            }
        });
        // Поток2
        Thread thread2 = new Thread(() -> {
            while (thread2Try) {
                synchronized (lock2) {
                    System.out.println("Thread 2: получен lock2, пытается получить lock1");
                    try { Thread.sleep(100); } catch (InterruptedException e) {}
                    if (!thread1Try) {
                        thread2Try = false;
                        continue;
                    }
                    synchronized (lock1) {
                        System.out.println("Thread 2: есть оба замка!");
                        thread2Try = false;
                    }
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
