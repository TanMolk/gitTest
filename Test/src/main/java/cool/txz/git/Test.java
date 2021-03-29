package cool.txz.git;

import cool.txz.git.init.Driver;
import cool.txz.git.init.TestDriver;

public class Test {
    public static void main(String[] args) {
        Driver driver = new TestDriver();
        driver.hello();
    }
}
