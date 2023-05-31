package EXP1_LinJZ.EXP12_LinJZ;

import java.util.Random;

/**
 * @author linjz
 */
public class EXP12_unorder_LinJZ {
    public static void main(String[] args) {
        int[] oldarray = new int [20];
        int[] newarray = new int [20];

        // 生成存放20个不重复的整数的旧数组并打印
        for(int i=0;i<20;i++) {
            oldarray[i]=i+1;
            newarray[i]=oldarray[i];
            System.out.print(oldarray[i]+"\t");
        }
        System.out.println();

        // 对数组进行乱序操作
        Random random = new Random();
        for (int i = newarray.length - 1; i > 0; i--) {
            // 随机生成[0,i+1)的整数
            int j = random.nextInt(i + 1);
            int temp = newarray[i];
            newarray[i] = newarray[j];
            newarray[j] = temp;
        }

        for(int i=0;i<20;i++) {
            System.out.print(newarray[i]+"\t");
        }
    }
}
