package EXP2_LinJZ.EXP24_LinJZ;

import java.util.Arrays;

/**
 * @author linjz
 */
public class EXP24_DelScore_LinJZ {
        EXP24_InputScore_LinJZ inputScore;
        public double[] processedScores() {
            double[] getProcessedScores= inputScore.enterScores();
            Arrays.sort(getProcessedScores);
            int highIndex=getProcessedScores.length-1;
            getProcessedScores[0]=0;
            getProcessedScores[highIndex]=0;
            return getProcessedScores;
        }




}
