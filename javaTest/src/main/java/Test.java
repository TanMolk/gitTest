import sun.net.www.http.HttpClient;
import thread.TestThread;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Test {
    public static void main(String[] args) {
        TestThread testThread = new TestThread();
        for (int i = 0; i < 100; i++) {
            new Thread(testThread).start();
        }
    }
}
