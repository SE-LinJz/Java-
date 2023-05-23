package EXP2_LinJZ.EXP22_LinJZ;

/**
 * @author linjz
 */
public class EXP22_Car007_LinJZ implements EXP22_Common_LinJZ {
    public double speed(double a,double b,double c) {
        if(c==0)
        {
            System.out.println("参数为0!");
            return 0;
        }
        else
            return a*b/c;
    }



}
