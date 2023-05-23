package EXP2_LinJZ.EXP23_LinJZ;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * @author linjz
 */
public class EXP22_GuessNumber_LinJZ {
    public static int choice;
    public static int point = 0;

    public void judge() {
        try {
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            switch (choice) {
                case 1: break;
                case 2: System.exit(0);break;
                default: {
                    System.out.println("请输入选项：");
                    judge();
                }
            }
        }
        catch (InputMismatchException e) {//非整数(小数、字符)会被捕获
            System.out.println("请输入整数(1-2)!");
            judge();
        }
    }

    public int point(int count) {//计算得分
        if (count == 1) {
            point += 3;
            return point;
        } else if (count == 2) {
            point += 2;
            return point;
        } else if (count == 3) {
            point += 1;
            return point;
        } else {
            point -= 2;
            return point;
        }
    }

    public int start(int num, int count) {//猜数部分

        try {
            Scanner sc = new Scanner(System.in);
            int inputNumber;

            System.out.println("请输入你猜的数：");
            inputNumber = sc.nextInt();
            //控制输入数字的范围
            if (inputNumber < 0 || inputNumber > 99) {
                System.out.println("输入的整数范围：[0,99]");
                return start(num, count);
            } else {
                if (inputNumber < num) {
                    count++;
                    //count为3时结束猜数并公布正确数字
                    if (count == 3) {
                        System.out.println("三次都没有猜中，游戏结束！");
                        System.out.println("正确数字："+num);
                        count++;
                        return count;
                    }
                    System.out.println("太小了，请重新输入：");
                    return start(num, count);
                }
                else if (inputNumber > num) {
                    count++;
                    if (count == 3) {
                        System.out.println("三次都没有猜中，游戏结束！");
                        System.out.println("正确数字："+num);
                        count++;
                        return count;
                    }
                    System.out.println("太大了，请重新输入：");
                    return start(num, count);
                } else {
                    count++;
                    System.out.println("恭喜你，猜对了！");
                    return count;
                }
            }
        }
        catch (InputMismatchException e) {
            System.out.println("请输入整数!");
            count = start(num, count);
            return count;
        }
    }

    public void guess(int num) {//猜数
        int count = 0;
        count = start(num, count);
        point = point(count);
        System.out.println("当前得分: "+point);
    }

    public static void main(String[] args) {
        System.out.println("1.开始 2.退出");
        System.out.println("初始分数："+point);
        EXP22_GuessNumber_LinJZ begin = new EXP22_GuessNumber_LinJZ();
        begin.judge();
        int num;
        //创建0-99的随机数
        num = new Random().nextInt(99);
        //展示所创建的随机数，用于测试
        System.out.println("生成的随机数(测试)："+num);
        begin.guess(num);
        do {
            System.out.println("1.再来一次 2.退出");
            begin.judge();
            num = new Random().nextInt(99);
            //展示所创建的随机数，用于测试
            System.out.println("生成的随机数(测试)："+num);
            begin.guess(num);
        }while (choice != 2);
    }
}
