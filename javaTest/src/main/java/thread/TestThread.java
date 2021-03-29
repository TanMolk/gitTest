package thread;

import service.TestService;

public class TestThread implements Runnable {

    private final TestService service = new TestService();

    @Override
    public void run() {
        try {
            service.test();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
