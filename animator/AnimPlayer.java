/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package animator;

import static java.lang.System.currentTimeMillis;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shayan
 */
public class AnimPlayer extends Thread implements Runnable {

    int frameduration;
    long frame;
    int lastframe;
    long time = 0;
    AnimatorJpanel animatorJpanel;
    boolean loop;
    long sleep =20;

    public void setTime() {
//        this.time = new Date().getTime();
        time = System.currentTimeMillis();
        frame = 0;

    }

    /**
     *
     * @param panel
     * @param sleeptime
     */
    public AnimPlayer(int sleeptime, AnimatorJpanel animatorJpanel) {
        this.animatorJpanel = animatorJpanel;
        this.frameduration = sleeptime;
        setTime();
        lastframe = 999999;
        loop = true;
    }

    public void resett() {
        frame = frame % 100000;
    }

    @Override
    public final synchronized void run() {
        long i = 0;
        long temp = 0;
        while (true) {

            i = System.currentTimeMillis();
            temp = ((i - time));
//            System.out.println("i="+i+"frame="+frame);
            if (temp >= frame + frameduration) {
                frame = temp;
                animatorJpanel.animate(frame / 20);
//                if (frame > lastframe) {
//                    if (loop) {
//                        frame = 0;
//                    } else {
//                        this.stop();
//                    }

//                }
            } else {
//                i += sleep - System.currentTimeMillis();
//                if (i > 0) {
                try {
//                    System.out.println("sleep"+(frameduration - (temp - frame)));
                    this.wait(frameduration - (temp - frame));
                } catch (Exception ex) {
                    Logger.getLogger(AnimPlayer.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public long getSleep() {
        return sleep;
    }

    public void setSleep(long sleep) {
        this.sleep = sleep;
    }

}
