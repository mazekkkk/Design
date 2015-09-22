package cn.mazekkkk.designpatterns.builder.serviceAbstract;

import java.util.ArrayList;

/**
 * Created by maz on 2015/3/21.
 */
public abstract class CarModel {

    //该属性为基本方法执行顺序
    private ArrayList<String> sequence = new ArrayList<String>();
    //启动
    protected abstract void start();
    //停下
    protected abstract void stop();
    //喇叭
    protected abstract void alarm();
    //引擎
    protected abstract void engineBoom();
    //模板方法
    final public void run(){
        //遍历sequence序列按照顺序执行
        for(int i=0;i<this.sequence.size();i++){
            //方法名字
            String actionName = this.sequence.get(i);

            if(actionName.equalsIgnoreCase("start")){
                this.start();
            }else if(actionName.equalsIgnoreCase("stop")){
                this.stop();
            }else if(actionName.equalsIgnoreCase("alarm")){
                this.alarm();
            }else if(actionName.equalsIgnoreCase("engine boom")){
                this.engineBoom();
            }

        }
    }
    //依赖注入

    final public void setSequence(ArrayList<String> sequence) {
        this.sequence = sequence;
    }
}
