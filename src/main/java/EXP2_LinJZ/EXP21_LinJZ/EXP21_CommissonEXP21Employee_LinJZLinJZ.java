package EXP2_LinJZ.EXP21_LinJZ;

import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EXP21_CommissonEXP21Employee_LinJZLinJZ extends EXP21_Employee_LinJZ {
    int salaryPerSale =15;
    double redEnvelope = 100;
    @Override
    public int salary() {
        try {
            int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
            int amountOfSale;
            System.out.print("请输入销售额：");
            amountOfSale = new Scanner(System.in).nextInt();
            if (amountOfSale < 0) {
                System.out.println("请输入正整数！");
                return salary();
            } else {
                salary = amountOfSale * salaryPerSale;
                if (month == birthmonth)
                    salary += redEnvelope;
                return salary;
            }
        }
        catch (InputMismatchException e) {
            System.out.println("请输入整数！");
            return salary();
        }
    }
}