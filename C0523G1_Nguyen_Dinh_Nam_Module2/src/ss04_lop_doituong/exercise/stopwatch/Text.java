package ss04_lop_doituong.exercise.stopwatch;

import java.util.Date;

public class Text {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        System.out.println("Thời gian bắt đầu: " + stopWatch.getStartTime());
        long str = Math.round(Math.random() * 99900);
        for (long i = 0; i < 10000; i++) {
            for (long j = 0; j < 1000000; j++)
                if (i == 1000 && j == str) {
                    stopWatch.stop();
                    System.out.println("Thời gian kết thúc: " + stopWatch.getEndTime());
                    break;
                }
        }

        System.out.print("Thời gian đã trôi qua: " + stopWatch.getElapsedTime());

    }
}
