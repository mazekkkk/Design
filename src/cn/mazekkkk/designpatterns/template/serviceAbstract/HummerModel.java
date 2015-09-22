package cn.mazekkkk.designpatterns.template.serviceAbstract;

/**
 * Created by maz on 2015/3/20.
 */
public abstract class HummerModel {

    /**
     * 首先，这个模型要能够被发动起来，别管是手摇发动，还是电力发动，反正是要能够发动起来，那这个实现要在实现类里
     */

    //启动
    public abstract void start();
    //停止
    public abstract void stop();
    //按喇叭
    public abstract void alarm();
    //引擎
    public abstract void engineBoom();
    //启动
    public void run(){
        this.start();

        this.engineBoom();

        this.alarm();

        this.stop();
    }

}
