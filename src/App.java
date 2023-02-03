/**
 * 单例模式--主程序
 *
 * @author zhuhuix
 * @date 2020-06-01
 */
public class App {
    public final static int num = 10;

    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[num];
        for (int i = 0; i < num; i++) {
            Login login = new Login();
            login.setLoginName("" + String.format("%2s", (i + 1)) + "号用户");
            threads[i] = new Thread(login);
            threads[i].start();
            //threads[i].join();
        }

        for (Thread t : threads) {
            t.join();
        }

        System.out.println("网站共有" + Singleton.getInstance().getCounter() + "个用户登录");

    }
}

