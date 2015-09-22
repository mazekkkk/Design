package cn.mazekkkk.designpatterns.abstractfactory.serviceAbstract;


import cn.mazekkkk.designpatterns.abstractfactory.service.Human;

/**
 * Created by maz on 2015/3/20.
 */
public abstract class AbstractBlackHuman implements Human{
    //获取颜色黑色人种
    public void getColor(){
        System.out.println("黑色人种皮肤是黑色");
    }
    //谈话方法
    @Override
    public void talk() {
        System.out.println("黑色人种说话听不懂");
    }




}
