/**
 * 单例模式的应用--登录线程
 *
 * @author zhuhuix
 * @date 2020-06-01
 */
public class Login implements Runnable {
    // 登录名称
    private String loginName;

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    @Override
    public void run() {
        // 饿汉式单例
        Singleton simpleSingleton = Singleton.getInstance();
        simpleSingleton.setCounter();
        System.out.println(getLoginName() + "登录成功:" + simpleSingleton.toString());
    }

}
