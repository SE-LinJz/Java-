package EXP1_LinJZ.EXP14_LinJZ;

/**
 * @author linjz
 */
public class EXP14_BusWaitTime_LinJZ {

    public static void main(String[] args) {
    int allTime = 0;
    for (int i = 0; i < 100000; i++){
        allTime += waitTime();
    }
        System.out.println("平均等待时间为："+allTime/100000+"分钟");
    }

    public static int waitTime() {
        // 乘客到达时间
        int personArrTime = (int)(Math.random()*30);
        int waitTime = 0;
        // 10点发车的延迟时间
        int carDelayTime1 = (int)(Math.random()*30);
        // 9点发车的延迟时间
        int carDelayTime2 = (int)(Math.random()*30);

        if(carDelayTime2 + 40 - 60 >= personArrTime){
            waitTime = carDelayTime2 + 40 - 60 - personArrTime;
        }else {
            waitTime = carDelayTime1 + 40 - personArrTime;
        }
        return waitTime;
    }
}
