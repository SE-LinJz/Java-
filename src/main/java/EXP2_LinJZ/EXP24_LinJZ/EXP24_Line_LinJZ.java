package EXP2_LinJZ.EXP24_LinJZ;

/**
 * @author linjz
 */
public class EXP24_Line_LinJZ {
        EXP24_ComputerAver_LinJZ computeAver;
        EXP24_DelScore_LinJZ delScore;
        EXP24_InputScore_LinJZ inputScore;
        public EXP24_Line_LinJZ(EXP24_ComputerAver_LinJZ computeAver, EXP24_DelScore_LinJZ delScore, EXP24_InputScore_LinJZ inputScore) {
            this.computeAver = computeAver;
            this.delScore = delScore;
            this.inputScore = inputScore;
            computeAver.delScore=delScore;
            delScore.inputScore=inputScore;
        }
        public double finalScore(){
            return computeAver.getAverage();
        }
    }



