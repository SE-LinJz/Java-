package EXP2_LinJZ.EXP22_LinJZ;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * @author linjz
 */
public class EXP22_Main_LinJZ {
    public static void main(String[] args) throws Exception{
        try {
        Scanner x = new Scanner(System.in);
        System.out.println("输入格式为：交通工具 参数A 参数B 参数C");
        String vehicle = "EXP22_"+x.next()+"_LinJZ";
        double A = x.nextDouble();
        double B = x.nextDouble();
        double C = x.nextDouble();

        double v,t;
        EXP22_Common_LinJZ D = (EXP22_Common_LinJZ) Class.forName("EXP2_LinJZ.EXP22_LinJZ." + vehicle).getDeclaredConstructor().newInstance();
        // 设置输出格式，保留两位小数
        DecimalFormat df = new DecimalFormat("#.00");
        v = D.speed(A, B, C);
        t = 1000 / v;
        System.out.println("平均速度:" + df.format(v) + " km/h");
        System.out.println("运行时间:" + df.format(t) + " h ");
        }catch (InputMismatchException e) {
            System.out.println("参数输入错误");
        }catch (ClassNotFoundException e){
            System.out.println("class not found");
        }
    }
}
