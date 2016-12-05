package hanoi;

import java.util.LinkedList;

/**
 *
 * @author Kokes
 */
public class Axes {
    private LinkedList<Integer>[] axes;
    
    public Axes(){
        axes = new LinkedList[3];
        for(int a=0; a<3; a++){
            axes[a] = new LinkedList<>();
        }        
    }
    
    public Integer add(int axe, Integer x){
        axes[axe].add(x);
        return axes[axe].size();
    }
    
    /**
     * destructive reading
     */
    public Integer poll(int axe){
        return axes[axe].pollLast();
    }
    
    /**
     * non-destructive reading
     */
    public Integer peek(int axe){
        if(axes[axe].size()<=0)
            return -1;
        return axes[axe].peekLast();
    }
    
    /**
     * 
     */
    public Axes clone(){
        Axes x = new Axes();
        x.axes = new LinkedList[3];
        for(int a=0; a<3; a++){
            x.axes[a] = (LinkedList)this.axes[a].clone();
        }
        return x;
    }
    
    public boolean isEmpty(int axe){
        return axes[axe].isEmpty();
    }
    
    /**
     * 
     */
    public boolean canMove(int fromAxis, int toAxis){
        if(isEmpty(fromAxis))
            return false;
        if( (! isEmpty(toAxis)) && 
            (peek(fromAxis)<=peek(toAxis)) 
          )
            return false;
        // can move
        return true;
    }
    
    /**
     * 
     */
    public boolean move(int fromAxis, int toAxis){
        // safety test
        if( ! canMove(fromAxis, toAxis) )
                return false;
        // move
        Integer disc = poll(fromAxis);
        add(toAxis, disc);
        return true;
    }
    
    /**
     * 
     */
    public int size(int axe){
        return axes[axe].size();
    }
    
    /**
     * 
     */
    public int getDisc(int axe, int pos){
        return axes[axe].get(pos);
    }
}