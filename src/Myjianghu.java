import java.util.Scanner;

public class Myjianghu {
    public static void main(String[] args){
        String info = null;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入角色内力值：");
        int power = input.nextInt();
        if(power <=1000) {
            info = "不堪一击";
        }else if(power < 3000){
            info = "毫不足虑";
        }
        System.out.println(info);
    }
}
