/*
 * This Software is protected by copyright law and international treaties.
 * This Software is licensed (not sold), and its use is subject
 * to a valid WRITTEN AND SIGNED End User License Agreement (EULA).
 * The unauthorized use, copying or distribution of this Software
 * may result in severe criminal or civil penalties,
 * and will be prosecuted to the maximum extent allowed by law.
 */
package crossrd;

import javafx.scene.layout.Pane;

/**
 *
 * @author Kokes
 */
public class CrossRoad extends Pane {
    public final Semaphore sem1;
    private final Semaphore sem2;
    private final Semaphore sem3;
    private final Semaphore sem4;
    private int state = 0;
    
    public CrossRoad(){
        sem1 = new Semaphore(300,110); sem1.setRotate(180);
        sem2 = new Semaphore(440,340); sem2.setRotate(0);
        sem3 = new Semaphore(260,290); sem3.setRotate(90);
        sem4 = new Semaphore(485,155); sem4.setRotate(270);
        getChildren().add(sem1);
        getChildren().add(sem2);
        getChildren().add(sem3);
        getChildren().add(sem4);
        sem1.setOff();
        sem2.setOff();
        sem3.setOff();
        sem4.setOff();        
    }
    
    public void setState0(){
        sem1.setStop();
        sem2.setStop();
        sem3.setGo();
        sem4.setGo();
    }
    
    public void setState1(){
        sem1.setReady();
        sem2.setReady();
        sem3.setWarning();
        sem4.setWarning();
    }
    
    public void setState2(){
        sem1.setGo();
        sem2.setGo();
        sem3.setStop();
        sem4.setStop();                
    }
    
    public void setState3(){
        sem1.setWarning();
        sem2.setWarning();
        sem3.setReady();
        sem4.setReady();
    }
    
    public void switchState(){
        state = (state+1) % 4;
        if (state==0)
            setState0();
        else if(state==1)
            setState1();
        else if(state==2)
            setState2();
        else
            setState3();        
    }
    
}
