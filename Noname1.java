//----------------------------------------------------------
//Author    : THAI OPEN CODE
//Author URI: https://www.thaiopencode.com
//Facebook  : https://www.facebook.com/ThaiOpenCode
//----------------------------------------------------------
 
import java.util.Scanner;
 
public class CircleAreaCalculator {
 
    public static void main(String[] args) {
         
        Scanner scan = new Scanner(System.in);
         
        System.out.print("��سҡ�͡����Ţ�ͧ����� : ");
        double r = scan.nextDouble();
         
        scan.close();
         
        System.out.printf("\r\n��鹷��ͧǧ��� ��� %.2f", Math.PI * (r * r));
    }
}