package stat;

public class Interrupt {
    public static void main(String[] args) {
        Runnable task = () -> {
            // 쓰레드 상태가 인터럽트 상태가 아니면 실행
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    break;
                }
            }
            System.out.println("task : " + Thread.currentThread().getName());
        };

        Thread thread = new Thread(task, "Thread");
        thread.start();

        // start 하자마자 인터럽트를 걸기
        thread.interrupt();

        System.out.println("thread.isInterrupted() = " + thread.isInterrupted());

    }
}