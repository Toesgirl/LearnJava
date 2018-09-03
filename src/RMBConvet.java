import java.util.Scanner;
public class RMBConvet {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("输入小钱钱的数量:");
        double money = input.nextDouble();
        int yuan = (int)money;
        int numOfShiYuan = yuan / 10;
        int numOfWuYuan = yuan % 10 / 5;
        int numOfYiYuan = yuan % 10 - 5;
        int jiao = ((int)(money * 10)) % 10;
        int numOfWuJiao = jiao / 5;
        int numOfYiJiao = jiao - 5;
        System.out.println("10元纸币的数量：" + numOfShiYuan);

    }
}
