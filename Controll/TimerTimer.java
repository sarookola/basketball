package Controll;


/**
 *
 * @author BMW
 */
public class TimerTimer extends TimeCounter {
    
    private Controll panel;

    public TimerTimer(Controll panel) {
        super(panel.getFromMinute(), panel.getFromSecond(), 0, 0,panel.getFromSecond24() );
        this.panel = panel;
    }

    @Override
    public void runable() {
          panel.updatetime(getMinute(), getSecond(),getSecond24());
    }
// public void runable24() {
//          panel.updatetime24(getSecond24());
//    }
    @Override
    public void rundisable() {
       panel.stopTime();
    }

  
}
