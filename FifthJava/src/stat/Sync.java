package stat;

public class Sync {
    public static void main(String[] args) {
        AppleStore appleStore = new AppleStore();

        Runnable task = () -> {
            while (appleStore.getStoredApple() > 0) {
                appleStore.eatApple2();
                System.out.println("남은 사과의 수 = " + appleStore.getStoredApple());
            }

        };

        for (int i = 0; i < 3; i++) {
            new Thread(task).start();
        }
    }
}

class AppleStore {
    private int storedApple = 10;

    public int getStoredApple() {
        return storedApple;
    }

    // 메서드에 추가해서 사용하는 방법
    synchronized void eatApple() {
        if (storedApple > 0) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            storedApple -= 1;
        }
    }

    // 메서드 안에 사용하는 방법
    public void eatApple2() {
        synchronized(this) {
            if (storedApple > 0) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                storedApple -= 1;
            }
        }
    }
}