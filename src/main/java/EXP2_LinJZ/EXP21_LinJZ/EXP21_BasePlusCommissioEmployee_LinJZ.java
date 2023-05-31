package EXP2_LinJZ.EXP21_LinJZ;

/**
 * @author linjz
 */
public class EXP21_BasePlusCommissioEmployee_LinJZ extends EXP21_CommissonEmployee_LinJZ {
    int salaryBaseMonth =1000;
    @Override
    public int salary() {
        return super.salary() + salaryBaseMonth;
    }
}
