package Controll;

import java.util.Date;

/**
 *
 * @author BMW
 */
public abstract class TimeCounter extends Thread {

    private int step;
    private int counter, counter24;
    private int stop;
    private final static int wait = 100;
    private boolean timer24;
    private long startTime,time24;
    long milsec24 = 0, milsec = 0;

    public TimeCounter(int fromMinute, int fromSecond, int untilMinute, int untilSecond, int sec24) {
        counter = fromMinute * 60 + fromSecond;
        counter24 = sec24;
        stop = untilMinute * 60 + untilSecond;
        if (counter24 == 0) {
            counter24 = 24;
        }
        if (counter > stop) {
            step = -1;
        } else {
            step = 1;
        }

    }

    @Override
    public synchronized void run() {
        long  diffrenceTime;

        startTime = new Date().getTime();
        boolean loop = true;
        while (loop) {
            if (counter == stop) {
                loop = false;
                rundisable();
            } else {

                diffrenceTime = new Date().getTime() - startTime;
//                if (diffrenceTime < milsec + 1000) {
                try {

                    wait(wait);

                } catch (Exception e) {
                }
//                } else {
//                    milsec += 1000;
//                }
                if (!timer24 || counter24==0) {
                    milsec24 += 100;
                } else if (counter24 > 0) {
                    if (diffrenceTime >= milsec24 + 1000) {
                        counter24 += step;
                        milsec24 += 1000;
                    }
                }
                

                if (diffrenceTime >= milsec + 1000) {
                    milsec += 1000;
                    counter += step;
                }
//                if (counter24 == 0) {
//                    timer24 = false;
//                }
                runable();
//                System.out.println("diffrenceTime= " + diffrenceTime + "  milsec24=" + milsec24 + "    milsec=" + milsec + "   timer=" + counter + "    counter24=" + counter24);
            }
        }

    }

    public int getSecond() {
        return (counter % 60);
    }

    public int getMinute() {
        return counter / 60;
    }

    public int getSecond24() {
        return (counter24);
    }

    public void changetimer(int x) {
        counter = counter + x;
        runable();
    }

    public void changetimertime(int fromMinute, int fromSecond) {
        counter = fromMinute * 60 + fromSecond;
        milsec = 0;
        timer24 = true;
        runable();
    }

    public void changetimertime24(int fromSecond) {
//        milsec24 = counter24;
        counter24 = fromSecond;
        
//        timer24 = true;
        runable();
    }

    public void timegetTotime(int untilMinute, int untilSecond) {

        int stop = untilMinute * 60 + untilSecond;
//        if (counter > this.stop &  this.stop>stop) {
//           this.stop=stop;
//        } else if(counter < this.stop &  this.stop<stop) {
        this.stop = stop;
//        }
    }

    public void start24Sec() {
        timer24 = true;
    }

    public void stop24Sec() {
        timer24 = false;
    }

    public abstract void runable();

    public abstract void rundisable();

}
