public class DaemonThread {
    public static void main(String[] args) {
        Runnable test = () -> {
            for (int i = 0; i < 10000; i++){
                System.out.println(i+"번째 !");
            }
        };

        // 데몬 쓰레드는 우선순위가 낮다.
        Thread thread = new Thread(test);
        thread.setDaemon(true);
        thread.start();

        // ★JVM은 사용자 쓰레드의 작업이 끝나면 데몬 쓰레드도 자동으로 종료시킨다.
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }
    }
}
