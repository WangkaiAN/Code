package Exception;

import java.util.Scanner;

public class Test {
    private static String userName="admin";
    private static String password="123456";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String sn=scanner.next();
        System.out.println("请输入密码：");
        String sp=scanner.next();
        try {
            login(sn,sp);
        } catch (UserError | PasswordError e) {
            e.printStackTrace();
        }
    }
    public static void login(String userName, String password) throws UserError,
            PasswordError {
        if (!Test.userName.equals(userName)) {
            throw new UserError("用户名错误");
        }
        if (!Test.password.equals(password)) {
            throw new PasswordError("密码错误");
        }
        System.out.println("登陆成功");
    }
}
