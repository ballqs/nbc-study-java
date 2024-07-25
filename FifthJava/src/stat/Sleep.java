package stat;

public class Sleep {
    public static void main(String[] args) {
        Runnable task = () -> {
            try {
                // 2초간 재웠기 때문에 아래가 먼저 실행되고 이부분이 진행댐
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("task : " + Thread.currentThread().getName());
        };

        Thread thread = new Thread(task, "Thread");
        thread.start();

        try {
            // 위 2초보다 더 빨리 깨어날수 있도록 1초만 재움
            thread.sleep(1000);
            System.out.println("sleep(1000) : " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}