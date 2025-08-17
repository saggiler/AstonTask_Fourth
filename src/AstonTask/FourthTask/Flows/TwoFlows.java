package AstonTask.FourthTask.Flows;

import java.util.concurrent.Semaphore;

public class TwoFlows {
    private static final Semaphore semaphore1 = new Semaphore(1);
    private static final Semaphore semaphore2 = new Semaphore(0);

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            while (true) {
                try {
                    semaphore1.acquire(); // Захватываем разрешение для 1го потока
                    System.out.println("1");
                    semaphore2.release(); // Разрешаем выводить 2й поток
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            while (true) {
                try {
                    semaphore2.acquire(); // Захватывает разрешение для 2го потока
                    System.out.println("2");
                    semaphore1.release(); // Разрешаем выводить 1й поток
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}