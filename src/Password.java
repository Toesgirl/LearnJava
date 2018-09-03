import java.util.Scanner;

public class Password {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String password = null;
        int i = 0;
        while(i < 3){
            System.out.println("请输入密码");
            password = input.next();
            i++;
            if(!"123".equals(password)){
                if (i == 3){
                    System.out.println("密码输入错误已达三次，强制退出系统");
                    System.exit(0);
                }
            }else {
                i = Integer.MAX_VALUE;
            }

        }
        System.out.println("密码正确。成功登入");
    }
}
