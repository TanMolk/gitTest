package service;

import java.util.Random;

public class TestService {

    Object obj;

    public void test() throws InterruptedException {
        Thread.sleep(1000);
        Object obj = getObj();
        if (obj == null) {
            synchronized (this) {
                System.out.println("_________"+ Thread.currentThread().getName()+"_________");
                if (obj != null){
                    System.err.println("obj被修改");
                }else {
                    obj = new Object();
                    System.out.println("注入Obj");
                }
            }
        }
    }

    private Object getObj() {
        Random random = new Random();
        int flag = random.nextInt(2);
        if (flag == 0) {
            obj = new Object();
        } else {
            obj = null;
        }
        return obj;
    }
}
