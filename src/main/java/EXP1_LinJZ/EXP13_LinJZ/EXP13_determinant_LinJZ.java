package EXP1_LinJZ.EXP13_LinJZ;

/**
 * @author linjz
 */
public class EXP13_determinant_LinJZ {
    public static void main(String[] args) {
        int[][] randarray = new int[5][5];
        int i,j;
        int sum=0,amax=0,t=0;

        //对数组每个数进行随机赋值
        for(i=0;i<5;i++) {
            for(j=0;j<5;j++) {
                randarray[i][j]=(int)(Math.random()*30);
            }
        }
        // 按行列输出该数组
        for(i=0;i<5;i++) {
            for(j=0;j<5;j++) {
                System.out.print(""+randarray[i][j]+"\t");
            }
            System.out.println();
        }

        //根据最外圈元素的行列规律计算外圈元素之和
        for(i=0;i<5;i++) {
            for(j=0;j<5;j++) {
                if((i!=0&&i!=4)&&(j!=0&&j!=4)) {
                    continue;}
                sum += randarray[i][j];
            }
        }
        System.out.println("最外一圈元素之和为"+sum);

        //根据主对角线规律找出最大元素及其位置
        for(i=0,j=0;i<5;i++,j++) {
            if(randarray[i][j]>amax) {
                amax = randarray[i][j];
                t=i;
            }
        }
        System.out.println("主对角线元素的最大值为"+amax+"\n所在位置:randarray["+t+"]["+t+"]");
    }
}
