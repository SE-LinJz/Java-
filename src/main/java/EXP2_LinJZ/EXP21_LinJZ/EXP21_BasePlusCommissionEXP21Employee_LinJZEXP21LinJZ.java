package EXP2_LinJZ.EXP21_LinJZ;

/**
 * @author linjz
 */
public class EXP21_BasePlusCommissionEXP21Employee_LinJZEXP21LinJZ extends EXP21_CommissonEXP21Employee_LinJZLinJZ {
    int salaryBaseMonth =1000;
    @Override
    public int salary() {
        return super.salary() + salaryBaseMonth;
    }
}
