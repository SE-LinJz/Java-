package EXP2_LinJZ.EXP21_LinJZ;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author linjz
 */
public class EXP21_Main_LinJZ {
    static int choice;

    static int choice() {
        try {
            choice = new Scanner(System.in).nextInt();
            if (choice < 0 || choice > 4) {
                System.out.println("请输入整数0-4！");
                return choice();
            } else if (choice == 0){
                System.exit(0);
            }
            else{
                return choice;
            }
        }
        catch (InputMismatchException e) {
            System.out.println("请输入整数！");
            return choice();
        }
        return -1;
    }


    public static void main(String[] arg) {
        EXP21_Employee_LinJZ[] data = new EXP21_Employee_LinJZ[4];
        data[0] = new EXP21_SalariedEXP21EmployeeLinJZ_LinJZ();
        data[1] = new EXP21_HourlyEXP21EmployeeLinJZ_LinJZ();
        data[2] = new EXP21_CommissonEXP21Employee_LinJZLinJZ();
        data[3] = new EXP21_BasePlusCommissionEXP21Employee_LinJZEXP21LinJZ();

        while (true) {
            System.out.println("======================工资支付系统员工类型==========================");
            System.out.println("1.领固定月薪 2.计时取酬 3.按销售额提成 4.带底薪并按销售额提成 0.退出");
            System.out.println("==================================================================");

            System.out.println("请输入员工类型：");
            choice = choice();
            Scanner x = new Scanner(System.in);
            System.out.println("请输入工号：");
            int number = x.nextInt();
            System.out.println("请输入姓名：");
            String name = x.next();
            System.out.println("请输入出生年份：");
            int birthyear = x.nextInt();
            System.out.println("请输入出生月份：");
            int birthmonth = x.nextInt();

            choice--;
            data[choice].num = number;
            data[choice].name = name;
            data[choice].birthyear = birthyear;
            data[choice].birthmonth = birthmonth;
            System.out.println("工资结算：");
            System.out.println("工号：" + data[choice].num);
            System.out.println("姓名：" + data[choice].name);
            System.out.println("出生年月：" + data[choice].birthyear + "年" + data[choice].birthmonth + "月");
            System.out.println("工资：" + data[choice].salary());


        }




        }


}
