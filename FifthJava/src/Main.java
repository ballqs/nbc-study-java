public class Main {
    public static void main(String[] args) {
        // 1.쓰레드 자체를 상속받는것
        TestThread testThread = new TestThread();
        testThread.start();

        // 2.Runnable를 구현하는 것
        Runnable testRunnable = new TestRunnable();
        Thread thread = new Thread(testRunnable);
        thread.setName("test1");
        thread.setPriority(5);     // 우선순위
        thread.start();

        // 3.람다식으로 구현
        Runnable test = () -> {
            for (int i = 0; i < 100; i++){
                System.out.print("!");
            }
        };
        Thread thread2 = new Thread(test);
        thread2.setName("test2");   // 쓰레드이름 설정
        thread2.setPriority(1);     // 우선순위
        thread2.start();

        // 현재 운영중인 쓰레드가 무엇이 있는지
        System.out.println(Thread.currentThread().getName());
    }
}