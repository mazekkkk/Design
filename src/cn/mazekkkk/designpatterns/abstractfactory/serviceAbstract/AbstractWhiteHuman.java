package cn.mazekkkk.designpatterns.abstractfactory.serviceAbstract;


import cn.mazekkkk.designpatterns.abstractfactory.service.Human;

/**
 * Created by maz on 2015/3/20.
 */
public abstract class AbstractWhiteHuman implements Human {
    //获取颜色白色人种
    public void getColor(){
        System.out.println("白色人种皮肤是白色");
    }
    //谈话方法
    @Override
    public void talk() {
        System.out.println("白色人种说话都是单字节");
    }





}
