import java.util.Scanner;

public class CalcCircleArea {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("输入圆的半径: 3");
        double radius = input.nextDouble();
        double area = 3.14 * Math.pow(radius, 2);
        System.out.printf("圆的面积为：%.2f\n", area);
    }
}
