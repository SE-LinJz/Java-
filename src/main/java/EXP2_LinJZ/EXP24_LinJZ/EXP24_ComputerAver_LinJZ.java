package EXP2_LinJZ.EXP24_LinJZ;

/**
 * @author linjz
 */
public class EXP24_ComputerAver_LinJZ {
    EXP24_DelScore_LinJZ delScore;
    public double getAverage() {
        double[] scores = delScore.processedScores();
        int count = 0;
        double sum = 0;
        for (double score : scores
        ) {
            if (score != 0) {
                sum += score;
                count++;
            }
        }
        if (count > 0) {
            return sum / count;
        } else {
            throw new IllegalArgumentException("没有有效的分数");
        }
    }
}



