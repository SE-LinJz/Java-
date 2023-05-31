package EXP2_LinJZ.EXP21_LinJZ;

import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author linjz
 */
public class EXP21_HourlyEmployee_LinJZ extends EXP21_Employee_LinJZ {
    int salaryPerHour =25;
    int salaryMorePerHour =35;
    double redEnvelope = 100;
    int standardWorkTime = 160;
    @Override
    public int salary() {
        try { //规范输入
            int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
            int workHour;
            System.out.print("请输入工时：");
            workHour = new Scanner(System.in).nextInt();
            //规范输入
            if (workHour < 0) {
                System.out.println("请输入正整数！");
                return salary();
            }
            else { //计算工资
                if (workHour > standardWorkTime) {
                    salary = salaryPerHour * standardWorkTime + salaryMorePerHour * (workHour - 160);
                }else{
                    salary = salaryPerHour * workHour;
                }
                if (month == birthmonth) {
                    salary += redEnvelope;
                }
                return salary;
            }
        }
        catch (InputMismatchException e) {
            System.out.println("请输入整数！");
            return salary();
        }
    }
}
