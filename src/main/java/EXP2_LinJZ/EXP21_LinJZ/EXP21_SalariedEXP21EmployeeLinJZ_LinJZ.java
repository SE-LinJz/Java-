package EXP2_LinJZ.EXP21_LinJZ;

import java.util.Calendar;

/**
 * @author linjz
 */
public class EXP21_SalariedEXP21EmployeeLinJZ_LinJZ extends EXP21_Employee_LinJZ {
    int salaryPerMonth = 5000;

    //生日红包
    public int redEnvelope = 100;
    @Override
    public int salary() {
        //获取当前月份
        int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
        if (month == birthmonth){
            salary = salaryPerMonth + redEnvelope;
        }
        else{
            salary = salaryPerMonth;
        }
        return salary;
    }
}
