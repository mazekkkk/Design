package cn.mazekkkk.designpatterns.abstractfactory.serviceAbstract;


import cn.mazekkkk.designpatterns.abstractfactory.service.Human;

/**
 * Created by maz on 2015/3/20.
 */
public abstract class AbstractYellowHuman implements Human {
    //获取颜色黄色人种
    public void getColor(){
        System.out.println("黄色人种皮肤是黄色");
    }
    //谈话方式
    @Override
    public void talk() {
        System.out.println("黄色人种说话都是双字节");
    }




}
