package cn.mazekkkk.designpatterns.templateEx.serviceAbstract;

/**
 * Created by maz on 2015/3/21.
 */
public abstract class HummerModel {

    /**
     * 定义模型方法
     */


    //启动
    protected abstract void start();
    //停止
    protected abstract  void stop();
    //按喇叭
    protected abstract void alarm();
    //引擎启动
    protected abstract void engineBoom();

    final public void run(){
        //先发动
        this.start();
        //引擎
        this.engineBoom();
        //按喇叭
        if(this.isAlarm()){
            this.alarm();
        }
        //停车
        this.stop();
    }

    //钩子方法，默认喇叭可以响
    protected boolean isAlarm(){
        return true;
    }


}
