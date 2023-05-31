package EXP2_LinJZ.EXP24_LinJZ;

import java.text.DecimalFormat;

/**
 * @author linjz
 */
public class EXP24_Main_LinJZ {
        public static void main(String[] args) {
            double score[]={70,50,95,94,100};
            EXP24_Line_LinJZ line = new EXP24_Line_LinJZ(new EXP24_ComputerAver_LinJZ(), new EXP24_DelScore_LinJZ(), new EXP24_InputScore_LinJZ(score));
            double finalScore = line.finalScore();
            // 设置输出格式，保留两位小数
            DecimalFormat df = new DecimalFormat("#.00");
            System.out.println("最终成绩是："+df.format(finalScore));
        }
    }


